public abstract class AppConfigs {
    public static final String  APP_NAME = "CDRRatingApp6";
    public static final String  BROKERS = "localhost:9092,localhost:9093,localhost:9094";
//    public static final String  BROKERS = "10.0.0.4:19092,10.0.0.4:19093,10.0.0.4:19094";
//        public static final String BROKERS = "cdrsgp.eastus2.cloudapp.azure.com:9092,cdrsgp.eastus2.cloudapp.azure.com:9093,cdrsgp.eastus2.cloudapp.azure.com:9094";

    public static final String  TOPIC_NIFI_READING_NAME = "nifi-cdr";
    public static final String  TOPIC_NIFI_READING_NAME_WITH_KEY_AVRO =  "nifi-cdr-with-key-avro";
    public static final String  SINK_TOPIC_RATED_CDR = "sink-topic-rated-cdr";
    public static final String  TOPIC_REPARTIONING_CDR_MOBILE_WITH_KEY = "cdr-mobile-with-key";
    public static final String  TOPIC_REPARTIONING_CDR_MOBILE_CURRENT_BILLING_WITH_KEY = "cdr-mobile-current-billing-with-key";
    //Created By Default By KafkaConnect Source
    public static final String  SOURCE_TOPIC_MOBILE_NUMBERS =  "source-topic-mobilenumbers";
    public static final String  SOURCE_TOPIC_CURREN_BILLING_CONDITION = "source-topic-current_billing_condition";
    public static final String  SOURCE_TOPIC_CURREN_PLANS_SERVICES_PRICES = "source-topic-plans_services_prices";

}
