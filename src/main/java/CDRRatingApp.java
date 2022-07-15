import com.cdr.*;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KTable;
import org.apache.kafka.streams.kstream.Produced;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import serde.AppSerdes;

import java.awt.*;
import java.util.Properties;

public class CDRRatingApp {
    private static final Logger logger = LogManager.getLogger(CDRRatingApp.class);

    public static void main(String[] args) {
        Properties props = new Properties();
        props.put(StreamsConfig.APPLICATION_ID_CONFIG, AppConfigs.APP_NAME);
        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, AppConfigs.BROKERS);
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        props.put(StreamsConfig.COMMIT_INTERVAL_MS_CONFIG, 0);

        StreamsBuilder streamsBuilder = new StreamsBuilder();

        KTable<MSISDNKey, MobileNumbers> mobileNumbersKTable =
                streamsBuilder.table(AppConfigs.SOURCE_TOPIC_MOBILE_NUMBERS,
                        Consumed.with(AppSerdes.MSISDNKey(), AppSerdes.MobileNumbers()));
        mobileNumbersKTable.toStream()
                .peek((k, v) -> System.out.println("KTable Mobile - key: " + k + " value: " + v ));

        KTable<CurrentBillingConditionPrimaryKeyComposite, CurrentBillingCondition> currentBillingConditionKTable =
                streamsBuilder.table(AppConfigs.SOURCE_TOPIC_CURREN_BILLING_CONDITION,
                        Consumed.with(AppSerdes.CurrentBillingConditionPrimaryKeyComposite(), AppSerdes.CurrentBillingCondition()));
        currentBillingConditionKTable.toStream()
                .peek((k, v) -> System.out.println("KTable Current Billing - key: " + k + " value: " + v ));

        KTable<PlansServicesPricesPrimaryCompositeKey, PlansServicesPrices> plansServicesPricesKTable =
                streamsBuilder.table(AppConfigs.SOURCE_TOPIC_CURREN_PLANS_SERVICES_PRICES,
                        Consumed.with(AppSerdes.PlansServicesPricesPrimaryCompositeKey(), AppSerdes.PlansServicesPrices()));
        plansServicesPricesKTable.toStream().peek((k, v) -> System.out.println("KTable Plans - key: " + k + " value: " + v ));

        KStream<String, CDR> nifiRawCdrKStream =
                streamsBuilder.stream(AppConfigs.TOPIC_NIFI_READING_NAME,
                    Consumed.with(AppSerdes.String(), AppSerdes.CDR()));

        nifiRawCdrKStream.selectKey((k ,v) -> new MSISDNKey(v.getMSISDNA()))
                        .peek((k, v) -> System.out.println("CDR - key: " + k + " value: " + v ))
                        .to(AppConfigs.TOPIC_NIFI_READING_NAME_WITH_KEY_AVRO,
                        Produced.with(AppSerdes.MSISDNKey(), AppSerdes.CDR()));

        KStream<MSISDNKey, CDR> cdrkStream = streamsBuilder.stream(AppConfigs.TOPIC_NIFI_READING_NAME_WITH_KEY_AVRO,
                Consumed.with(AppSerdes.MSISDNKey(), AppSerdes.CDR()));

        //Join CDR and MobileNumbers
        KStream<MSISDNKey, RawCDRMobileNumbers> rawCDRMobileNumbersKStream =
                cdrkStream.join(mobileNumbersKTable,
                        (cdr, mobileNumber)->
                                RawCDRMobileNumbers.newBuilder()
                                        .setMSISDNA(cdr.getMSISDNA())
                                        .setMSISDNB(cdr.getMSISDNB())
                                        .setCallTime(cdr.getCallTime())
                                        .setDuration(cdr.getDuration())
                                        .setServiceName(cdr.getServiceName())
                                        .setPlanID(mobileNumber.getPlanID())
                                        .setCompanyCode(mobileNumber.getCompanyCode())
                                        .setCustomerID(mobileNumber.getCustomerID())
                                        .build()
                        );

        KStream<CurrentBillingConditionPrimaryKeyComposite, RawCDRMobileNumbers> cdrMobileNumbersKStreamWithCurrentBillingKey =
                rawCDRMobileNumbersKStream.selectKey((k, v) ->
                        new CurrentBillingConditionPrimaryKeyComposite(v.getMSISDNA(), v.getServiceName()));

        cdrMobileNumbersKStreamWithCurrentBillingKey.to(AppConfigs.TOPIC_REPARTIONING_CDR_MOBILE_WITH_KEY,
                        Produced.with(AppSerdes.CurrentBillingConditionPrimaryKeyComposite(), AppSerdes.RawCDRMobileNumbers()));

        KStream<CurrentBillingConditionPrimaryKeyComposite, RawCDRMobileNumbers> crdMobileWithKeyComposite =
                streamsBuilder.stream(AppConfigs.TOPIC_REPARTIONING_CDR_MOBILE_WITH_KEY,
                Consumed.with(AppSerdes.CurrentBillingConditionPrimaryKeyComposite(), AppSerdes.RawCDRMobileNumbers()))
                .peek((k, v)-> System.out.println("CDR AND Mobile - key: " + k + " value: " + v ));

            KStream<CurrentBillingConditionPrimaryKeyComposite, CDRMobileCurrentBilling> cdrMobileNumbersCurrentBillingsKStream =
                    crdMobileWithKeyComposite.join(currentBillingConditionKTable,
                            (cdrMobile, currentBilling) ->
                                    CDRMobileCurrentBilling.newBuilder()
                                            .setMSISDNA(cdrMobile.getMSISDNA())
                                            .setMSISDNB(cdrMobile.getMSISDNB())
                                            .setCallTime(cdrMobile.getCallTime())
                                            .setDuration(cdrMobile.getDuration())
                                            .setPlanID(cdrMobile.getPlanID())
                                            .setServiceName(cdrMobile.getServiceName())
                                            .setBillingConditionID(currentBilling.getBillingConditionID())
                                            .setCompanyCode(cdrMobile.getCompanyCode())
                                            .setCustomerID(cdrMobile.getCustomerID())
                                            .build()
                            );

                cdrMobileNumbersCurrentBillingsKStream.selectKey((k, v) -> new PlansServicesPricesPrimaryCompositeKey(
                        v.getPlanID(), v.getServiceName(), v.getBillingConditionID()
                )).to(AppConfigs.TOPIC_REPARTIONING_CDR_MOBILE_CURRENT_BILLING_WITH_KEY,
                        Produced.with(AppSerdes.PlansServicesPricesPrimaryCompositeKey(), AppSerdes.CDRMobileCurrentBilling()));
        KStream<PlansServicesPricesPrimaryCompositeKey, CDRMobileCurrentBilling> cdrMobileNumbersCurrentBillingsWithPlansKeyKStream =
                streamsBuilder.stream(AppConfigs.TOPIC_REPARTIONING_CDR_MOBILE_CURRENT_BILLING_WITH_KEY,
                Consumed.with(AppSerdes.PlansServicesPricesPrimaryCompositeKey(), AppSerdes.CDRMobileCurrentBilling()));
        cdrMobileNumbersCurrentBillingsWithPlansKeyKStream.peek((k, v)-> System.out.println("CDR AND Mobile AND Current Billing key: " + k + " value: " + v ));

        KStream<PlansServicesPricesPrimaryCompositeKey, CDRMobileNumbersPlansServicesPrices> cdrMobileNumbersPlansServicesPricesKStream =
                cdrMobileNumbersCurrentBillingsWithPlansKeyKStream.join(plansServicesPricesKTable,
                        (cdrMobileCurrentBilling, plansServices) ->
                            CDRMobileNumbersPlansServicesPrices.newBuilder()
                                    .setMSISDNA(cdrMobileCurrentBilling.getMSISDNA())
                                    .setMSISDNB(cdrMobileCurrentBilling.getMSISDNB())
                                    .setServiceName(cdrMobileCurrentBilling.getServiceName())
                                    .setCallTime(cdrMobileCurrentBilling.getCallTime())
                                    .setDuration(cdrMobileCurrentBilling.getDuration())
                                    .setPlanID(cdrMobileCurrentBilling.getPlanID())
                                    .setPrice(plansServices.getPrice())
                                    .setQuantityTypeID(plansServices.getQuantityTypeID())
                                    .setCompanyCode(cdrMobileCurrentBilling.getCompanyCode())
                                    .build()
                        );

        KStream<PlansServicesPricesPrimaryCompositeKey, RatedCDR> ratedCdrKStream =
                cdrMobileNumbersPlansServicesPricesKStream.mapValues(
                        (cdrPlansPrices) -> RateCDR.rateCDR(cdrPlansPrices)
                );

        ratedCdrKStream
                .peek((k, v)-> System.out.println("Rated CDR - key current quantity: " + k + " value: " + v ))
                .to(AppConfigs.SINK_TOPIC_RATED_CDR,
                        Produced.with(AppSerdes.PlansServicesPricesPrimaryCompositeKey(), AppSerdes.RatedCDR()));

        KafkaStreams streams = new KafkaStreams(streamsBuilder.build(), props);

        logger.info("******** Starting Streams*****");
        streams.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            logger.info("Stopping Streams");
            streams.close();
        }));

    }
}
