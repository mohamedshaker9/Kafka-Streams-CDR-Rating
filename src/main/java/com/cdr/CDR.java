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

/** Generated CDRs schema from simulation tool */
@org.apache.avro.specific.AvroGenerated
public class CDR extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6665805539567834533L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CDR\",\"namespace\":\"com.cdr\",\"doc\":\"Generated CDRs schema from simulation tool\",\"fields\":[{\"name\":\"MSISDN_A\",\"type\":\"string\",\"doc\":\"Calling number\"},{\"name\":\"MSISDN_B\",\"type\":\"string\",\"doc\":\"Called number\"},{\"name\":\"callTime\",\"type\":\"long\"},{\"name\":\"serviceName\",\"type\":\"string\",\"default\":\"sameOperatorCall\"},{\"name\":\"duration\",\"type\":\"int\",\"doc\":\"Call duration\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CDR> ENCODER =
      new BinaryMessageEncoder<CDR>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CDR> DECODER =
      new BinaryMessageDecoder<CDR>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CDR> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CDR> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CDR> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CDR>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CDR to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CDR from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CDR instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CDR fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Calling number */
  private java.lang.CharSequence MSISDN_A;
  /** Called number */
  private java.lang.CharSequence MSISDN_B;
  private long callTime;
  private java.lang.CharSequence serviceName;
  /** Call duration */
  private int duration;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CDR() {}

  /**
   * All-args constructor.
   * @param MSISDN_A Calling number
   * @param MSISDN_B Called number
   * @param callTime The new value for callTime
   * @param serviceName The new value for serviceName
   * @param duration Call duration
   */
  public CDR(java.lang.CharSequence MSISDN_A, java.lang.CharSequence MSISDN_B, java.lang.Long callTime, java.lang.CharSequence serviceName, java.lang.Integer duration) {
    this.MSISDN_A = MSISDN_A;
    this.MSISDN_B = MSISDN_B;
    this.callTime = callTime;
    this.serviceName = serviceName;
    this.duration = duration;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return MSISDN_A;
    case 1: return MSISDN_B;
    case 2: return callTime;
    case 3: return serviceName;
    case 4: return duration;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: MSISDN_A = (java.lang.CharSequence)value$; break;
    case 1: MSISDN_B = (java.lang.CharSequence)value$; break;
    case 2: callTime = (java.lang.Long)value$; break;
    case 3: serviceName = (java.lang.CharSequence)value$; break;
    case 4: duration = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'MSISDN_A' field.
   * @return Calling number
   */
  public java.lang.CharSequence getMSISDNA() {
    return MSISDN_A;
  }


  /**
   * Sets the value of the 'MSISDN_A' field.
   * Calling number
   * @param value the value to set.
   */
  public void setMSISDNA(java.lang.CharSequence value) {
    this.MSISDN_A = value;
  }

  /**
   * Gets the value of the 'MSISDN_B' field.
   * @return Called number
   */
  public java.lang.CharSequence getMSISDNB() {
    return MSISDN_B;
  }


  /**
   * Sets the value of the 'MSISDN_B' field.
   * Called number
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
   * Gets the value of the 'duration' field.
   * @return Call duration
   */
  public int getDuration() {
    return duration;
  }


  /**
   * Sets the value of the 'duration' field.
   * Call duration
   * @param value the value to set.
   */
  public void setDuration(int value) {
    this.duration = value;
  }

  /**
   * Creates a new CDR RecordBuilder.
   * @return A new CDR RecordBuilder
   */
  public static com.cdr.CDR.Builder newBuilder() {
    return new com.cdr.CDR.Builder();
  }

  /**
   * Creates a new CDR RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CDR RecordBuilder
   */
  public static com.cdr.CDR.Builder newBuilder(com.cdr.CDR.Builder other) {
    if (other == null) {
      return new com.cdr.CDR.Builder();
    } else {
      return new com.cdr.CDR.Builder(other);
    }
  }

  /**
   * Creates a new CDR RecordBuilder by copying an existing CDR instance.
   * @param other The existing instance to copy.
   * @return A new CDR RecordBuilder
   */
  public static com.cdr.CDR.Builder newBuilder(com.cdr.CDR other) {
    if (other == null) {
      return new com.cdr.CDR.Builder();
    } else {
      return new com.cdr.CDR.Builder(other);
    }
  }

  /**
   * RecordBuilder for CDR instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CDR>
    implements org.apache.avro.data.RecordBuilder<CDR> {

    /** Calling number */
    private java.lang.CharSequence MSISDN_A;
    /** Called number */
    private java.lang.CharSequence MSISDN_B;
    private long callTime;
    private java.lang.CharSequence serviceName;
    /** Call duration */
    private int duration;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.cdr.CDR.Builder other) {
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
      if (isValidValue(fields()[3], other.serviceName)) {
        this.serviceName = data().deepCopy(fields()[3].schema(), other.serviceName);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.duration)) {
        this.duration = data().deepCopy(fields()[4].schema(), other.duration);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing CDR instance
     * @param other The existing instance to copy.
     */
    private Builder(com.cdr.CDR other) {
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
      if (isValidValue(fields()[3], other.serviceName)) {
        this.serviceName = data().deepCopy(fields()[3].schema(), other.serviceName);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.duration)) {
        this.duration = data().deepCopy(fields()[4].schema(), other.duration);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'MSISDN_A' field.
      * Calling number
      * @return The value.
      */
    public java.lang.CharSequence getMSISDNA() {
      return MSISDN_A;
    }


    /**
      * Sets the value of the 'MSISDN_A' field.
      * Calling number
      * @param value The value of 'MSISDN_A'.
      * @return This builder.
      */
    public com.cdr.CDR.Builder setMSISDNA(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.MSISDN_A = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'MSISDN_A' field has been set.
      * Calling number
      * @return True if the 'MSISDN_A' field has been set, false otherwise.
      */
    public boolean hasMSISDNA() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'MSISDN_A' field.
      * Calling number
      * @return This builder.
      */
    public com.cdr.CDR.Builder clearMSISDNA() {
      MSISDN_A = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'MSISDN_B' field.
      * Called number
      * @return The value.
      */
    public java.lang.CharSequence getMSISDNB() {
      return MSISDN_B;
    }


    /**
      * Sets the value of the 'MSISDN_B' field.
      * Called number
      * @param value The value of 'MSISDN_B'.
      * @return This builder.
      */
    public com.cdr.CDR.Builder setMSISDNB(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.MSISDN_B = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'MSISDN_B' field has been set.
      * Called number
      * @return True if the 'MSISDN_B' field has been set, false otherwise.
      */
    public boolean hasMSISDNB() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'MSISDN_B' field.
      * Called number
      * @return This builder.
      */
    public com.cdr.CDR.Builder clearMSISDNB() {
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
    public com.cdr.CDR.Builder setCallTime(long value) {
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
    public com.cdr.CDR.Builder clearCallTime() {
      fieldSetFlags()[2] = false;
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
    public com.cdr.CDR.Builder setServiceName(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.serviceName = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'serviceName' field has been set.
      * @return True if the 'serviceName' field has been set, false otherwise.
      */
    public boolean hasServiceName() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'serviceName' field.
      * @return This builder.
      */
    public com.cdr.CDR.Builder clearServiceName() {
      serviceName = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'duration' field.
      * Call duration
      * @return The value.
      */
    public int getDuration() {
      return duration;
    }


    /**
      * Sets the value of the 'duration' field.
      * Call duration
      * @param value The value of 'duration'.
      * @return This builder.
      */
    public com.cdr.CDR.Builder setDuration(int value) {
      validate(fields()[4], value);
      this.duration = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'duration' field has been set.
      * Call duration
      * @return True if the 'duration' field has been set, false otherwise.
      */
    public boolean hasDuration() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'duration' field.
      * Call duration
      * @return This builder.
      */
    public com.cdr.CDR.Builder clearDuration() {
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CDR build() {
      try {
        CDR record = new CDR();
        record.MSISDN_A = fieldSetFlags()[0] ? this.MSISDN_A : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.MSISDN_B = fieldSetFlags()[1] ? this.MSISDN_B : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.callTime = fieldSetFlags()[2] ? this.callTime : (java.lang.Long) defaultValue(fields()[2]);
        record.serviceName = fieldSetFlags()[3] ? this.serviceName : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.duration = fieldSetFlags()[4] ? this.duration : (java.lang.Integer) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CDR>
    WRITER$ = (org.apache.avro.io.DatumWriter<CDR>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CDR>
    READER$ = (org.apache.avro.io.DatumReader<CDR>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.MSISDN_A);

    out.writeString(this.MSISDN_B);

    out.writeLong(this.callTime);

    out.writeString(this.serviceName);

    out.writeInt(this.duration);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.MSISDN_A = in.readString(this.MSISDN_A instanceof Utf8 ? (Utf8)this.MSISDN_A : null);

      this.MSISDN_B = in.readString(this.MSISDN_B instanceof Utf8 ? (Utf8)this.MSISDN_B : null);

      this.callTime = in.readLong();

      this.serviceName = in.readString(this.serviceName instanceof Utf8 ? (Utf8)this.serviceName : null);

      this.duration = in.readInt();

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.MSISDN_A = in.readString(this.MSISDN_A instanceof Utf8 ? (Utf8)this.MSISDN_A : null);
          break;

        case 1:
          this.MSISDN_B = in.readString(this.MSISDN_B instanceof Utf8 ? (Utf8)this.MSISDN_B : null);
          break;

        case 2:
          this.callTime = in.readLong();
          break;

        case 3:
          this.serviceName = in.readString(this.serviceName instanceof Utf8 ? (Utf8)this.serviceName : null);
          break;

        case 4:
          this.duration = in.readInt();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









