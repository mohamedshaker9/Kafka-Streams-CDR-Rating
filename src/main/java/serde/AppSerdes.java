package serde;


import com.cdr.*;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;
import org.apache.kafka.common.serialization.Serdes;

import java.util.HashMap;
import java.util.Map;

public class AppSerdes extends Serdes {
//    private static final String  SCHEMA_REGISTRY_URL = "http://cdrsgp.eastus2.cloudapp.azure.com:8081";

      private static final String  SCHEMA_REGISTRY_URL = "http://localhost:8081";
//        private static final String  SCHEMA_REGISTRY_URL = "http://10.0.0.4:8081";

    public static SpecificAvroSerde<CurrentBillingCondition> CurrentBillingCondition() {
        SpecificAvroSerde<CurrentBillingCondition> serde = new SpecificAvroSerde<>();
        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put("schema.registry.url", SCHEMA_REGISTRY_URL);
        serde.configure(serdeConfigs, false);

        return serde;
    }

    public static SpecificAvroSerde<CurrentBillingConditionPrimaryKeyComposite> CurrentBillingConditionPrimaryKeyComposite() {
        SpecificAvroSerde<CurrentBillingConditionPrimaryKeyComposite> serde = new SpecificAvroSerde<>();
        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put("schema.registry.url", SCHEMA_REGISTRY_URL);
        serde.configure(serdeConfigs, true);

        return serde;
    }

    public static SpecificAvroSerde<MSISDNKey> MSISDNKey() {
        SpecificAvroSerde<MSISDNKey> serde = new SpecificAvroSerde<>();
        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put("schema.registry.url", SCHEMA_REGISTRY_URL);
        serde.configure(serdeConfigs, true);

        return serde;
    }

    public static SpecificAvroSerde<MobileNumbers> MobileNumbers() {
        SpecificAvroSerde<MobileNumbers> serde = new SpecificAvroSerde<>();
        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put("schema.registry.url", SCHEMA_REGISTRY_URL);
        serde.configure(serdeConfigs, false);

        return serde;
    }


    public static SpecificAvroSerde<PlansServicesPrices> PlansServicesPrices() {
        SpecificAvroSerde<PlansServicesPrices> serde = new SpecificAvroSerde<>();
        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put("schema.registry.url", SCHEMA_REGISTRY_URL);
        serde.configure(serdeConfigs, false);

        return serde;
    }

    public static SpecificAvroSerde<PlansServicesPricesPrimaryCompositeKey> PlansServicesPricesPrimaryCompositeKey() {
        SpecificAvroSerde<PlansServicesPricesPrimaryCompositeKey> serde = new SpecificAvroSerde<>();
        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put("schema.registry.url", SCHEMA_REGISTRY_URL);
        serde.configure(serdeConfigs, true);

        return serde;
    }

    public static SpecificAvroSerde<CDR> CDR() {
        SpecificAvroSerde<CDR> serde = new SpecificAvroSerde<>();
        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put("schema.registry.url", SCHEMA_REGISTRY_URL);
        serde.configure(serdeConfigs, false);

        return serde;
    }

    public static SpecificAvroSerde<RatedCDR> RatedCDR() {
        SpecificAvroSerde<RatedCDR> serde = new SpecificAvroSerde<>();
        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put("schema.registry.url", SCHEMA_REGISTRY_URL);
        serde.configure(serdeConfigs, false);

        return serde;
    }

    public static SpecificAvroSerde<RawCDRMobileNumbers> RawCDRMobileNumbers() {
        SpecificAvroSerde<RawCDRMobileNumbers> serde = new SpecificAvroSerde<>();
        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put("schema.registry.url", SCHEMA_REGISTRY_URL);
        serde.configure(serdeConfigs, false);

        return serde;
    }

    public static SpecificAvroSerde<CDRMobileCurrentBilling> CDRMobileCurrentBilling() {
        SpecificAvroSerde<CDRMobileCurrentBilling> serde = new SpecificAvroSerde<>();
        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put("schema.registry.url", SCHEMA_REGISTRY_URL);
        serde.configure(serdeConfigs, false);

        return serde;
    }

    public static SpecificAvroSerde<CurrentQuantityBalance> CurrentQuantityBalance() {
        SpecificAvroSerde<CurrentQuantityBalance> serde = new SpecificAvroSerde<>();
        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put("schema.registry.url", SCHEMA_REGISTRY_URL);
        serde.configure(serdeConfigs, false);

        return serde;
    }

    public static SpecificAvroSerde<CurrentQuantityBalanceCompositeKey> CurrentQuantityBalanceCompositeKey() {
        SpecificAvroSerde<CurrentQuantityBalanceCompositeKey> serde = new SpecificAvroSerde<>();
        Map<String, Object> serdeConfigs = new HashMap<>();
        serdeConfigs.put("schema.registry.url", SCHEMA_REGISTRY_URL);
        serde.configure(serdeConfigs, true);

        return serde;
    }

}
