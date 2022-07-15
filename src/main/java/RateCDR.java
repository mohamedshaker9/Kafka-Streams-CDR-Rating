import com.cdr.CDRMobileNumbersPlansServicesPrices;
import com.cdr.RatedCDR;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.nio.ByteBuffer;

public class RateCDR {

    public static RatedCDR rateCDR(CDRMobileNumbersPlansServicesPrices cdrMobileNumbersPlansServicesPrices) {
        return RatedCDR.newBuilder()
                .setCdrID(0)
                .setMSISDNA(cdrMobileNumbersPlansServicesPrices.getMSISDNA())
                .setMSISDNB(cdrMobileNumbersPlansServicesPrices.getMSISDNB())
                .setCallTime(cdrMobileNumbersPlansServicesPrices.getCallTime())
                .setDurationInSeconds(cdrMobileNumbersPlansServicesPrices.getDuration())
                .setServiceName(cdrMobileNumbersPlansServicesPrices.getServiceName())
                .setQuantityTypeID(cdrMobileNumbersPlansServicesPrices.getQuantityTypeID())
                .setIsBilled(0)
                .setRate(calculatingRate(cdrMobileNumbersPlansServicesPrices.getDuration(),
                        cdrMobileNumbersPlansServicesPrices.getPrice()))
                .build();
    }

    private static ByteBuffer calculatingRate(long durationInSeconds, ByteBuffer priceByteBuffer) {
        BigDecimal price = new BigDecimal(new BigInteger(priceByteBuffer.array()), 2);
        System.out.print(" price= " + price.toString());
        BigDecimal durationInMinutes = BigDecimal.valueOf(durationInSeconds).divide(BigDecimal.valueOf(60), RoundingMode.UP);
        BigDecimal rate = price.multiply(durationInMinutes);
        System.out.print(" | rate= " + rate.toString());
        return ByteBuffer.wrap(rate.unscaledValue().toByteArray());
    }
}
