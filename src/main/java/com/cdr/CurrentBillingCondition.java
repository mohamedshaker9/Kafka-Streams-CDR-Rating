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
public class CurrentBillingCondition extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2691260056239280280L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CurrentBillingCondition\",\"namespace\":\"com.cdr\",\"fields\":[{\"name\":\"MSISDN\",\"type\":\"string\"},{\"name\":\"serviceName\",\"type\":\"string\"},{\"name\":\"billingConditionID\",\"type\":\"int\"},{\"name\":\"lastUpdate\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();
  static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimestampMillisConversion());
  }

  private static final BinaryMessageEncoder<CurrentBillingCondition> ENCODER =
      new BinaryMessageEncoder<CurrentBillingCondition>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CurrentBillingCondition> DECODER =
      new BinaryMessageDecoder<CurrentBillingCondition>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CurrentBillingCondition> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CurrentBillingCondition> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CurrentBillingCondition> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CurrentBillingCondition>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CurrentBillingCondition to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CurrentBillingCondition from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CurrentBillingCondition instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CurrentBillingCondition fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence MSISDN;
  private java.lang.CharSequence serviceName;
  private int billingConditionID;
  private java.time.Instant lastUpdate;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CurrentBillingCondition() {}

  /**
   * All-args constructor.
   * @param MSISDN The new value for MSISDN
   * @param serviceName The new value for serviceName
   * @param billingConditionID The new value for billingConditionID
   * @param lastUpdate The new value for lastUpdate
   */
  public CurrentBillingCondition(java.lang.CharSequence MSISDN, java.lang.CharSequence serviceName, java.lang.Integer billingConditionID, java.time.Instant lastUpdate) {
    this.MSISDN = MSISDN;
    this.serviceName = serviceName;
    this.billingConditionID = billingConditionID;
    this.lastUpdate = lastUpdate.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return MSISDN;
    case 1: return serviceName;
    case 2: return billingConditionID;
    case 3: return lastUpdate;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      null,
      null,
      null,
      new org.apache.avro.data.TimeConversions.TimestampMillisConversion(),
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
    case 0: MSISDN = (java.lang.CharSequence)value$; break;
    case 1: serviceName = (java.lang.CharSequence)value$; break;
    case 2: billingConditionID = (java.lang.Integer)value$; break;
    case 3: lastUpdate = (java.time.Instant)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'MSISDN' field.
   * @return The value of the 'MSISDN' field.
   */
  public java.lang.CharSequence getMSISDN() {
    return MSISDN;
  }


  /**
   * Sets the value of the 'MSISDN' field.
   * @param value the value to set.
   */
  public void setMSISDN(java.lang.CharSequence value) {
    this.MSISDN = value;
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
   * Gets the value of the 'billingConditionID' field.
   * @return The value of the 'billingConditionID' field.
   */
  public int getBillingConditionID() {
    return billingConditionID;
  }


  /**
   * Sets the value of the 'billingConditionID' field.
   * @param value the value to set.
   */
  public void setBillingConditionID(int value) {
    this.billingConditionID = value;
  }

  /**
   * Gets the value of the 'lastUpdate' field.
   * @return The value of the 'lastUpdate' field.
   */
  public java.time.Instant getLastUpdate() {
    return lastUpdate;
  }


  /**
   * Sets the value of the 'lastUpdate' field.
   * @param value the value to set.
   */
  public void setLastUpdate(java.time.Instant value) {
    this.lastUpdate = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
  }

  /**
   * Creates a new CurrentBillingCondition RecordBuilder.
   * @return A new CurrentBillingCondition RecordBuilder
   */
  public static com.cdr.CurrentBillingCondition.Builder newBuilder() {
    return new com.cdr.CurrentBillingCondition.Builder();
  }

  /**
   * Creates a new CurrentBillingCondition RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CurrentBillingCondition RecordBuilder
   */
  public static com.cdr.CurrentBillingCondition.Builder newBuilder(com.cdr.CurrentBillingCondition.Builder other) {
    if (other == null) {
      return new com.cdr.CurrentBillingCondition.Builder();
    } else {
      return new com.cdr.CurrentBillingCondition.Builder(other);
    }
  }

  /**
   * Creates a new CurrentBillingCondition RecordBuilder by copying an existing CurrentBillingCondition instance.
   * @param other The existing instance to copy.
   * @return A new CurrentBillingCondition RecordBuilder
   */
  public static com.cdr.CurrentBillingCondition.Builder newBuilder(com.cdr.CurrentBillingCondition other) {
    if (other == null) {
      return new com.cdr.CurrentBillingCondition.Builder();
    } else {
      return new com.cdr.CurrentBillingCondition.Builder(other);
    }
  }

  /**
   * RecordBuilder for CurrentBillingCondition instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CurrentBillingCondition>
    implements org.apache.avro.data.RecordBuilder<CurrentBillingCondition> {

    private java.lang.CharSequence MSISDN;
    private java.lang.CharSequence serviceName;
    private int billingConditionID;
    private java.time.Instant lastUpdate;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.cdr.CurrentBillingCondition.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.MSISDN)) {
        this.MSISDN = data().deepCopy(fields()[0].schema(), other.MSISDN);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.serviceName)) {
        this.serviceName = data().deepCopy(fields()[1].schema(), other.serviceName);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.billingConditionID)) {
        this.billingConditionID = data().deepCopy(fields()[2].schema(), other.billingConditionID);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.lastUpdate)) {
        this.lastUpdate = data().deepCopy(fields()[3].schema(), other.lastUpdate);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing CurrentBillingCondition instance
     * @param other The existing instance to copy.
     */
    private Builder(com.cdr.CurrentBillingCondition other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.MSISDN)) {
        this.MSISDN = data().deepCopy(fields()[0].schema(), other.MSISDN);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.serviceName)) {
        this.serviceName = data().deepCopy(fields()[1].schema(), other.serviceName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.billingConditionID)) {
        this.billingConditionID = data().deepCopy(fields()[2].schema(), other.billingConditionID);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.lastUpdate)) {
        this.lastUpdate = data().deepCopy(fields()[3].schema(), other.lastUpdate);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'MSISDN' field.
      * @return The value.
      */
    public java.lang.CharSequence getMSISDN() {
      return MSISDN;
    }


    /**
      * Sets the value of the 'MSISDN' field.
      * @param value The value of 'MSISDN'.
      * @return This builder.
      */
    public com.cdr.CurrentBillingCondition.Builder setMSISDN(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.MSISDN = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'MSISDN' field has been set.
      * @return True if the 'MSISDN' field has been set, false otherwise.
      */
    public boolean hasMSISDN() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'MSISDN' field.
      * @return This builder.
      */
    public com.cdr.CurrentBillingCondition.Builder clearMSISDN() {
      MSISDN = null;
      fieldSetFlags()[0] = false;
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
    public com.cdr.CurrentBillingCondition.Builder setServiceName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.serviceName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'serviceName' field has been set.
      * @return True if the 'serviceName' field has been set, false otherwise.
      */
    public boolean hasServiceName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'serviceName' field.
      * @return This builder.
      */
    public com.cdr.CurrentBillingCondition.Builder clearServiceName() {
      serviceName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'billingConditionID' field.
      * @return The value.
      */
    public int getBillingConditionID() {
      return billingConditionID;
    }


    /**
      * Sets the value of the 'billingConditionID' field.
      * @param value The value of 'billingConditionID'.
      * @return This builder.
      */
    public com.cdr.CurrentBillingCondition.Builder setBillingConditionID(int value) {
      validate(fields()[2], value);
      this.billingConditionID = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'billingConditionID' field has been set.
      * @return True if the 'billingConditionID' field has been set, false otherwise.
      */
    public boolean hasBillingConditionID() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'billingConditionID' field.
      * @return This builder.
      */
    public com.cdr.CurrentBillingCondition.Builder clearBillingConditionID() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastUpdate' field.
      * @return The value.
      */
    public java.time.Instant getLastUpdate() {
      return lastUpdate;
    }


    /**
      * Sets the value of the 'lastUpdate' field.
      * @param value The value of 'lastUpdate'.
      * @return This builder.
      */
    public com.cdr.CurrentBillingCondition.Builder setLastUpdate(java.time.Instant value) {
      validate(fields()[3], value);
      this.lastUpdate = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'lastUpdate' field has been set.
      * @return True if the 'lastUpdate' field has been set, false otherwise.
      */
    public boolean hasLastUpdate() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'lastUpdate' field.
      * @return This builder.
      */
    public com.cdr.CurrentBillingCondition.Builder clearLastUpdate() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CurrentBillingCondition build() {
      try {
        CurrentBillingCondition record = new CurrentBillingCondition();
        record.MSISDN = fieldSetFlags()[0] ? this.MSISDN : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.serviceName = fieldSetFlags()[1] ? this.serviceName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.billingConditionID = fieldSetFlags()[2] ? this.billingConditionID : (java.lang.Integer) defaultValue(fields()[2]);
        record.lastUpdate = fieldSetFlags()[3] ? this.lastUpdate : (java.time.Instant) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CurrentBillingCondition>
    WRITER$ = (org.apache.avro.io.DatumWriter<CurrentBillingCondition>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CurrentBillingCondition>
    READER$ = (org.apache.avro.io.DatumReader<CurrentBillingCondition>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










