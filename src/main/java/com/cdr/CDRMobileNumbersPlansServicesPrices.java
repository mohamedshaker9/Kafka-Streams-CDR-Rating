/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.cdr;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class CDRMobileNumbersPlansServicesPrices extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7037844884730579928L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CDRMobileNumbersPlansServicesPrices\",\"namespace\":\"com.cdr\",\"fields\":[{\"name\":\"MSISDN_A\",\"type\":\"string\"},{\"name\":\"MSISDN_B\",\"type\":\"string\"},{\"name\":\"callTime\",\"type\":\"long\"},{\"name\":\"duration\",\"type\":\"int\"},{\"name\":\"companyCode\",\"type\":\"string\"},{\"name\":\"customerID\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"planID\",\"type\":\"int\"},{\"name\":\"serviceName\",\"type\":\"string\",\"default\":\"sameOperatorCall\"},{\"name\":\"price\",\"type\":{\"type\":\"bytes\",\"scale\":2,\"precision\":6,\"logicalType\":\"decimal\"}},{\"name\":\"quantityTypeID\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();
  static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.DecimalConversion());
  }

  private static final BinaryMessageEncoder<CDRMobileNumbersPlansServicesPrices> ENCODER =
      new BinaryMessageEncoder<CDRMobileNumbersPlansServicesPrices>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CDRMobileNumbersPlansServicesPrices> DECODER =
      new BinaryMessageDecoder<CDRMobileNumbersPlansServicesPrices>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CDRMobileNumbersPlansServicesPrices> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CDRMobileNumbersPlansServicesPrices> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CDRMobileNumbersPlansServicesPrices> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CDRMobileNumbersPlansServicesPrices>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CDRMobileNumbersPlansServicesPrices to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CDRMobileNumbersPlansServicesPrices from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CDRMobileNumbersPlansServicesPrices instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CDRMobileNumbersPlansServicesPrices fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence MSISDN_A;
  private java.lang.CharSequence MSISDN_B;
  private long callTime;
  private int duration;
  private java.lang.CharSequence companyCode;
  private java.lang.Integer customerID;
  private int planID;
  private java.lang.CharSequence serviceName;
  private java.nio.ByteBuffer price;
  private int quantityTypeID;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CDRMobileNumbersPlansServicesPrices() {}

  /**
   * All-args constructor.
   * @param MSISDN_A The new value for MSISDN_A
   * @param MSISDN_B The new value for MSISDN_B
   * @param callTime The new value for callTime
   * @param duration The new value for duration
   * @param companyCode The new value for companyCode
   * @param customerID The new value for customerID
   * @param planID The new value for planID
   * @param serviceName The new value for serviceName
   * @param price The new value for price
   * @param quantityTypeID The new value for quantityTypeID
   */
  public CDRMobileNumbersPlansServicesPrices(java.lang.CharSequence MSISDN_A, java.lang.CharSequence MSISDN_B, java.lang.Long callTime, java.lang.Integer duration, java.lang.CharSequence companyCode, java.lang.Integer customerID, java.lang.Integer planID, java.lang.CharSequence serviceName, java.nio.ByteBuffer price, java.lang.Integer quantityTypeID) {
    this.MSISDN_A = MSISDN_A;
    this.MSISDN_B = MSISDN_B;
    this.callTime = callTime;
    this.duration = duration;
    this.companyCode = companyCode;
    this.customerID = customerID;
    this.planID = planID;
    this.serviceName = serviceName;
    this.price = price;
    this.quantityTypeID = quantityTypeID;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return MSISDN_A;
    case 1: return MSISDN_B;
    case 2: return callTime;
    case 3: return duration;
    case 4: return companyCode;
    case 5: return customerID;
    case 6: return planID;
    case 7: return serviceName;
    case 8: return price;
    case 9: return quantityTypeID;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: MSISDN_A = (java.lang.CharSequence)value$; break;
    case 1: MSISDN_B = (java.lang.CharSequence)value$; break;
    case 2: callTime = (java.lang.Long)value$; break;
    case 3: duration = (java.lang.Integer)value$; break;
    case 4: companyCode = (java.lang.CharSequence)value$; break;
    case 5: customerID = (java.lang.Integer)value$; break;
    case 6: planID = (java.lang.Integer)value$; break;
    case 7: serviceName = (java.lang.CharSequence)value$; break;
    case 8: price = (java.nio.ByteBuffer)value$; break;
    case 9: quantityTypeID = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'MSISDN_A' field.
   * @return The value of the 'MSISDN_A' field.
   */
  public java.lang.CharSequence getMSISDNA() {
    return MSISDN_A;
  }


  /**
   * Sets the value of the 'MSISDN_A' field.
   * @param value the value to set.
   */
  public void setMSISDNA(java.lang.CharSequence value) {
    this.MSISDN_A = value;
  }

  /**
   * Gets the value of the 'MSISDN_B' field.
   * @return The value of the 'MSISDN_B' field.
   */
  public java.lang.CharSequence getMSISDNB() {
    return MSISDN_B;
  }


  /**
   * Sets the value of the 'MSISDN_B' field.
   * @param value the value to set.
   */
  public void setMSISDNB(java.lang.CharSequence value) {
    this.MSISDN_B = value;
  }

  /**
   * Gets the value of the 'callTime' field.
   * @return The value of the 'callTime' field.
   */
  public long getCallTime() {
    return callTime;
  }


  /**
   * Sets the value of the 'callTime' field.
   * @param value the value to set.
   */
  public void setCallTime(long value) {
    this.callTime = value;
  }

  /**
   * Gets the value of the 'duration' field.
   * @return The value of the 'duration' field.
   */
  public int getDuration() {
    return duration;
  }


  /**
   * Sets the value of the 'duration' field.
   * @param value the value to set.
   */
  public void setDuration(int value) {
    this.duration = value;
  }

  /**
   * Gets the value of the 'companyCode' field.
   * @return The value of the 'companyCode' field.
   */
  public java.lang.CharSequence getCompanyCode() {
    return companyCode;
  }


  /**
   * Sets the value of the 'companyCode' field.
   * @param value the value to set.
   */
  public void setCompanyCode(java.lang.CharSequence value) {
    this.companyCode = value;
  }

  /**
   * Gets the value of the 'customerID' field.
   * @return The value of the 'customerID' field.
   */
  public java.lang.Integer getCustomerID() {
    return customerID;
  }


  /**
   * Sets the value of the 'customerID' field.
   * @param value the value to set.
   */
  public void setCustomerID(java.lang.Integer value) {
    this.customerID = value;
  }

  /**
   * Gets the value of the 'planID' field.
   * @return The value of the 'planID' field.
   */
  public int getPlanID() {
    return planID;
  }


  /**
   * Sets the value of the 'planID' field.
   * @param value the value to set.
   */
  public void setPlanID(int value) {
    this.planID = value;
  }

  /**
   * Gets the value of the 'serviceName' field.
   * @return The value of the 'serviceName' field.
   */
  public java.lang.CharSequence getServiceName() {
    return serviceName;
  }


  /**
   * Sets the value of the 'serviceName' field.
   * @param value the value to set.
   */
  public void setServiceName(java.lang.CharSequence value) {
    this.serviceName = value;
  }

  /**
   * Gets the value of the 'price' field.
   * @return The value of the 'price' field.
   */
  public java.nio.ByteBuffer getPrice() {
    return price;
  }


  /**
   * Sets the value of the 'price' field.
   * @param value the value to set.
   */
  public void setPrice(java.nio.ByteBuffer value) {
    this.price = value;
  }

  /**
   * Gets the value of the 'quantityTypeID' field.
   * @return The value of the 'quantityTypeID' field.
   */
  public int getQuantityTypeID() {
    return quantityTypeID;
  }


  /**
   * Sets the value of the 'quantityTypeID' field.
   * @param value the value to set.
   */
  public void setQuantityTypeID(int value) {
    this.quantityTypeID = value;
  }

  /**
   * Creates a new CDRMobileNumbersPlansServicesPrices RecordBuilder.
   * @return A new CDRMobileNumbersPlansServicesPrices RecordBuilder
   */
  public static com.cdr.CDRMobileNumbersPlansServicesPrices.Builder newBuilder() {
    return new com.cdr.CDRMobileNumbersPlansServicesPrices.Builder();
  }

  /**
   * Creates a new CDRMobileNumbersPlansServicesPrices RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CDRMobileNumbersPlansServicesPrices RecordBuilder
   */
  public static com.cdr.CDRMobileNumbersPlansServicesPrices.Builder newBuilder(com.cdr.CDRMobileNumbersPlansServicesPrices.Builder other) {
    if (other == null) {
      return new com.cdr.CDRMobileNumbersPlansServicesPrices.Builder();
    } else {
      return new com.cdr.CDRMobileNumbersPlansServicesPrices.Builder(other);
    }
  }

  /**
   * Creates a new CDRMobileNumbersPlansServicesPrices RecordBuilder by copying an existing CDRMobileNumbersPlansServicesPrices instance.
   * @param other The existing instance to copy.
   * @return A new CDRMobileNumbersPlansServicesPrices RecordBuilder
   */
  public static com.cdr.CDRMobileNumbersPlansServicesPrices.Builder newBuilder(com.cdr.CDRMobileNumbersPlansServicesPrices other) {
    if (other == null) {
      return new com.cdr.CDRMobileNumbersPlansServicesPrices.Builder();
    } else {
      return new com.cdr.CDRMobileNumbersPlansServicesPrices.Builder(other);
    }
  }

  /**
   * RecordBuilder for CDRMobileNumbersPlansServicesPrices instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CDRMobileNumbersPlansServicesPrices>
    implements org.apache.avro.data.RecordBuilder<CDRMobileNumbersPlansServicesPrices> {

    private java.lang.CharSequence MSISDN_A;
    private java.lang.CharSequence MSISDN_B;
    private long callTime;
    private int duration;
    private java.lang.CharSequence companyCode;
    private java.lang.Integer customerID;
    private int planID;
    private java.lang.CharSequence serviceName;
    private java.nio.ByteBuffer price;
    private int quantityTypeID;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.cdr.CDRMobileNumbersPlansServicesPrices.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.MSISDN_A)) {
        this.MSISDN_A = data().deepCopy(fields()[0].schema(), other.MSISDN_A);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.MSISDN_B)) {
        this.MSISDN_B = data().deepCopy(fields()[1].schema(), other.MSISDN_B);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.callTime)) {
        this.callTime = data().deepCopy(fields()[2].schema(), other.callTime);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.duration)) {
        this.duration = data().deepCopy(fields()[3].schema(), other.duration);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.companyCode)) {
        this.companyCode = data().deepCopy(fields()[4].schema(), other.companyCode);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.customerID)) {
        this.customerID = data().deepCopy(fields()[5].schema(), other.customerID);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.planID)) {
        this.planID = data().deepCopy(fields()[6].schema(), other.planID);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.serviceName)) {
        this.serviceName = data().deepCopy(fields()[7].schema(), other.serviceName);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.price)) {
        this.price = data().deepCopy(fields()[8].schema(), other.price);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
      if (isValidValue(fields()[9], other.quantityTypeID)) {
        this.quantityTypeID = data().deepCopy(fields()[9].schema(), other.quantityTypeID);
        fieldSetFlags()[9] = other.fieldSetFlags()[9];
      }
    }

    /**
     * Creates a Builder by copying an existing CDRMobileNumbersPlansServicesPrices instance
     * @param other The existing instance to copy.
     */
    private Builder(com.cdr.CDRMobileNumbersPlansServicesPrices other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.MSISDN_A)) {
        this.MSISDN_A = data().deepCopy(fields()[0].schema(), other.MSISDN_A);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.MSISDN_B)) {
        this.MSISDN_B = data().deepCopy(fields()[1].schema(), other.MSISDN_B);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.callTime)) {
        this.callTime = data().deepCopy(fields()[2].schema(), other.callTime);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.duration)) {
        this.duration = data().deepCopy(fields()[3].schema(), other.duration);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.companyCode)) {
        this.companyCode = data().deepCopy(fields()[4].schema(), other.companyCode);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.customerID)) {
        this.customerID = data().deepCopy(fields()[5].schema(), other.customerID);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.planID)) {
        this.planID = data().deepCopy(fields()[6].schema(), other.planID);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.serviceName)) {
        this.serviceName = data().deepCopy(fields()[7].schema(), other.serviceName);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.price)) {
        this.price = data().deepCopy(fields()[8].schema(), other.price);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.quantityTypeID)) {
        this.quantityTypeID = data().deepCopy(fields()[9].schema(), other.quantityTypeID);
        fieldSetFlags()[9] = true;
      }
    }

    /**
      * Gets the value of the 'MSISDN_A' field.
      * @return The value.
      */
    public java.lang.CharSequence getMSISDNA() {
      return MSISDN_A;
    }


    /**
      * Sets the value of the 'MSISDN_A' field.
      * @param value The value of 'MSISDN_A'.
      * @return This builder.
      */
    public com.cdr.CDRMobileNumbersPlansServicesPrices.Builder setMSISDNA(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.MSISDN_A = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'MSISDN_A' field has been set.
      * @return True if the 'MSISDN_A' field has been set, false otherwise.
      */
    public boolean hasMSISDNA() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'MSISDN_A' field.
      * @return This builder.
      */
    public com.cdr.CDRMobileNumbersPlansServicesPrices.Builder clearMSISDNA() {
      MSISDN_A = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'MSISDN_B' field.
      * @return The value.
      */
    public java.lang.CharSequence getMSISDNB() {
      return MSISDN_B;
    }


    /**
      * Sets the value of the 'MSISDN_B' field.
      * @param value The value of 'MSISDN_B'.
      * @return This builder.
      */
    public com.cdr.CDRMobileNumbersPlansServicesPrices.Builder setMSISDNB(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.MSISDN_B = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'MSISDN_B' field has been set.
      * @return True if the 'MSISDN_B' field has been set, false otherwise.
      */
    public boolean hasMSISDNB() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'MSISDN_B' field.
      * @return This builder.
      */
    public com.cdr.CDRMobileNumbersPlansServicesPrices.Builder clearMSISDNB() {
      MSISDN_B = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'callTime' field.
      * @return The value.
      */
    public long getCallTime() {
      return callTime;
    }


    /**
      * Sets the value of the 'callTime' field.
      * @param value The value of 'callTime'.
      * @return This builder.
      */
    public com.cdr.CDRMobileNumbersPlansServicesPrices.Builder setCallTime(long value) {
      validate(fields()[2], value);
      this.callTime = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'callTime' field has been set.
      * @return True if the 'callTime' field has been set, false otherwise.
      */
    public boolean hasCallTime() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'callTime' field.
      * @return This builder.
      */
    public com.cdr.CDRMobileNumbersPlansServicesPrices.Builder clearCallTime() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'duration' field.
      * @return The value.
      */
    public int getDuration() {
      return duration;
    }


    /**
      * Sets the value of the 'duration' field.
      * @param value The value of 'duration'.
      * @return This builder.
      */
    public com.cdr.CDRMobileNumbersPlansServicesPrices.Builder setDuration(int value) {
      validate(fields()[3], value);
      this.duration = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'duration' field has been set.
      * @return True if the 'duration' field has been set, false otherwise.
      */
    public boolean hasDuration() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'duration' field.
      * @return This builder.
      */
    public com.cdr.CDRMobileNumbersPlansServicesPrices.Builder clearDuration() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'companyCode' field.
      * @return The value.
      */
    public java.lang.CharSequence getCompanyCode() {
      return companyCode;
    }


    /**
      * Sets the value of the 'companyCode' field.
      * @param value The value of 'companyCode'.
      * @return This builder.
      */
    public com.cdr.CDRMobileNumbersPlansServicesPrices.Builder setCompanyCode(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.companyCode = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'companyCode' field has been set.
      * @return True if the 'companyCode' field has been set, false otherwise.
      */
    public boolean hasCompanyCode() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'companyCode' field.
      * @return This builder.
      */
    public com.cdr.CDRMobileNumbersPlansServicesPrices.Builder clearCompanyCode() {
      companyCode = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'customerID' field.
      * @return The value.
      */
    public java.lang.Integer getCustomerID() {
      return customerID;
    }


    /**
      * Sets the value of the 'customerID' field.
      * @param value The value of 'customerID'.
      * @return This builder.
      */
    public com.cdr.CDRMobileNumbersPlansServicesPrices.Builder setCustomerID(java.lang.Integer value) {
      validate(fields()[5], value);
      this.customerID = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'customerID' field has been set.
      * @return True if the 'customerID' field has been set, false otherwise.
      */
    public boolean hasCustomerID() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'customerID' field.
      * @return This builder.
      */
    public com.cdr.CDRMobileNumbersPlansServicesPrices.Builder clearCustomerID() {
      customerID = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'planID' field.
      * @return The value.
      */
    public int getPlanID() {
      return planID;
    }


    /**
      * Sets the value of the 'planID' field.
      * @param value The value of 'planID'.
      * @return This builder.
      */
    public com.cdr.CDRMobileNumbersPlansServicesPrices.Builder setPlanID(int value) {
      validate(fields()[6], value);
      this.planID = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'planID' field has been set.
      * @return True if the 'planID' field has been set, false otherwise.
      */
    public boolean hasPlanID() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'planID' field.
      * @return This builder.
      */
    public com.cdr.CDRMobileNumbersPlansServicesPrices.Builder clearPlanID() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'serviceName' field.
      * @return The value.
      */
    public java.lang.CharSequence getServiceName() {
      return serviceName;
    }


    /**
      * Sets the value of the 'serviceName' field.
      * @param value The value of 'serviceName'.
      * @return This builder.
      */
    public com.cdr.CDRMobileNumbersPlansServicesPrices.Builder setServiceName(java.lang.CharSequence value) {
      validate(fields()[7], value);
      this.serviceName = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'serviceName' field has been set.
      * @return True if the 'serviceName' field has been set, false otherwise.
      */
    public boolean hasServiceName() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'serviceName' field.
      * @return This builder.
      */
    public com.cdr.CDRMobileNumbersPlansServicesPrices.Builder clearServiceName() {
      serviceName = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'price' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getPrice() {
      return price;
    }


    /**
      * Sets the value of the 'price' field.
      * @param value The value of 'price'.
      * @return This builder.
      */
    public com.cdr.CDRMobileNumbersPlansServicesPrices.Builder setPrice(java.nio.ByteBuffer value) {
      validate(fields()[8], value);
      this.price = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'price' field has been set.
      * @return True if the 'price' field has been set, false otherwise.
      */
    public boolean hasPrice() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'price' field.
      * @return This builder.
      */
    public com.cdr.CDRMobileNumbersPlansServicesPrices.Builder clearPrice() {
      price = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'quantityTypeID' field.
      * @return The value.
      */
    public int getQuantityTypeID() {
      return quantityTypeID;
    }


    /**
      * Sets the value of the 'quantityTypeID' field.
      * @param value The value of 'quantityTypeID'.
      * @return This builder.
      */
    public com.cdr.CDRMobileNumbersPlansServicesPrices.Builder setQuantityTypeID(int value) {
      validate(fields()[9], value);
      this.quantityTypeID = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'quantityTypeID' field has been set.
      * @return True if the 'quantityTypeID' field has been set, false otherwise.
      */
    public boolean hasQuantityTypeID() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'quantityTypeID' field.
      * @return This builder.
      */
    public com.cdr.CDRMobileNumbersPlansServicesPrices.Builder clearQuantityTypeID() {
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CDRMobileNumbersPlansServicesPrices build() {
      try {
        CDRMobileNumbersPlansServicesPrices record = new CDRMobileNumbersPlansServicesPrices();
        record.MSISDN_A = fieldSetFlags()[0] ? this.MSISDN_A : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.MSISDN_B = fieldSetFlags()[1] ? this.MSISDN_B : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.callTime = fieldSetFlags()[2] ? this.callTime : (java.lang.Long) defaultValue(fields()[2]);
        record.duration = fieldSetFlags()[3] ? this.duration : (java.lang.Integer) defaultValue(fields()[3]);
        record.companyCode = fieldSetFlags()[4] ? this.companyCode : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.customerID = fieldSetFlags()[5] ? this.customerID : (java.lang.Integer) defaultValue(fields()[5]);
        record.planID = fieldSetFlags()[6] ? this.planID : (java.lang.Integer) defaultValue(fields()[6]);
        record.serviceName = fieldSetFlags()[7] ? this.serviceName : (java.lang.CharSequence) defaultValue(fields()[7]);
        record.price = fieldSetFlags()[8] ? this.price : (java.nio.ByteBuffer) defaultValue(fields()[8]);
        record.quantityTypeID = fieldSetFlags()[9] ? this.quantityTypeID : (java.lang.Integer) defaultValue(fields()[9]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CDRMobileNumbersPlansServicesPrices>
    WRITER$ = (org.apache.avro.io.DatumWriter<CDRMobileNumbersPlansServicesPrices>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CDRMobileNumbersPlansServicesPrices>
    READER$ = (org.apache.avro.io.DatumReader<CDRMobileNumbersPlansServicesPrices>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










