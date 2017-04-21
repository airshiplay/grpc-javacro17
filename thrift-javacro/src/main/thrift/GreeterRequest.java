/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-03-07")
public class GreeterRequest implements org.apache.thrift.TBase<GreeterRequest, GreeterRequest._Fields>, java.io.Serializable, Cloneable, Comparable<GreeterRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GreeterRequest");

  private static final org.apache.thrift.protocol.TField REQUEST_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("requestId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField SENDER_FIELD_DESC = new org.apache.thrift.protocol.TField("sender", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField GREETING_FIELD_DESC = new org.apache.thrift.protocol.TField("greeting", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GreeterRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GreeterRequestTupleSchemeFactory();

  public long requestId; // required
  public java.lang.String sender; // required
  public java.lang.String greeting; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REQUEST_ID((short)1, "requestId"),
    SENDER((short)2, "sender"),
    GREETING((short)3, "greeting");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // REQUEST_ID
          return REQUEST_ID;
        case 2: // SENDER
          return SENDER;
        case 3: // GREETING
          return GREETING;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __REQUESTID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REQUEST_ID, new org.apache.thrift.meta_data.FieldMetaData("requestId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SENDER, new org.apache.thrift.meta_data.FieldMetaData("sender", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GREETING, new org.apache.thrift.meta_data.FieldMetaData("greeting", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GreeterRequest.class, metaDataMap);
  }

  public GreeterRequest() {
  }

  public GreeterRequest(
    long requestId,
    java.lang.String sender,
    java.lang.String greeting)
  {
    this();
    this.requestId = requestId;
    setRequestIdIsSet(true);
    this.sender = sender;
    this.greeting = greeting;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GreeterRequest(GreeterRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.requestId = other.requestId;
    if (other.isSetSender()) {
      this.sender = other.sender;
    }
    if (other.isSetGreeting()) {
      this.greeting = other.greeting;
    }
  }

  public GreeterRequest deepCopy() {
    return new GreeterRequest(this);
  }

  @Override
  public void clear() {
    setRequestIdIsSet(false);
    this.requestId = 0;
    this.sender = null;
    this.greeting = null;
  }

  public long getRequestId() {
    return this.requestId;
  }

  public GreeterRequest setRequestId(long requestId) {
    this.requestId = requestId;
    setRequestIdIsSet(true);
    return this;
  }

  public void unsetRequestId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __REQUESTID_ISSET_ID);
  }

  /** Returns true if field requestId is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __REQUESTID_ISSET_ID);
  }

  public void setRequestIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __REQUESTID_ISSET_ID, value);
  }

  public java.lang.String getSender() {
    return this.sender;
  }

  public GreeterRequest setSender(java.lang.String sender) {
    this.sender = sender;
    return this;
  }

  public void unsetSender() {
    this.sender = null;
  }

  /** Returns true if field sender is set (has been assigned a value) and false otherwise */
  public boolean isSetSender() {
    return this.sender != null;
  }

  public void setSenderIsSet(boolean value) {
    if (!value) {
      this.sender = null;
    }
  }

  public java.lang.String getGreeting() {
    return this.greeting;
  }

  public GreeterRequest setGreeting(java.lang.String greeting) {
    this.greeting = greeting;
    return this;
  }

  public void unsetGreeting() {
    this.greeting = null;
  }

  /** Returns true if field greeting is set (has been assigned a value) and false otherwise */
  public boolean isSetGreeting() {
    return this.greeting != null;
  }

  public void setGreetingIsSet(boolean value) {
    if (!value) {
      this.greeting = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case REQUEST_ID:
      if (value == null) {
        unsetRequestId();
      } else {
        setRequestId((java.lang.Long)value);
      }
      break;

    case SENDER:
      if (value == null) {
        unsetSender();
      } else {
        setSender((java.lang.String)value);
      }
      break;

    case GREETING:
      if (value == null) {
        unsetGreeting();
      } else {
        setGreeting((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case REQUEST_ID:
      return getRequestId();

    case SENDER:
      return getSender();

    case GREETING:
      return getGreeting();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case REQUEST_ID:
      return isSetRequestId();
    case SENDER:
      return isSetSender();
    case GREETING:
      return isSetGreeting();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof GreeterRequest)
      return this.equals((GreeterRequest)that);
    return false;
  }

  public boolean equals(GreeterRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_requestId = true;
    boolean that_present_requestId = true;
    if (this_present_requestId || that_present_requestId) {
      if (!(this_present_requestId && that_present_requestId))
        return false;
      if (this.requestId != that.requestId)
        return false;
    }

    boolean this_present_sender = true && this.isSetSender();
    boolean that_present_sender = true && that.isSetSender();
    if (this_present_sender || that_present_sender) {
      if (!(this_present_sender && that_present_sender))
        return false;
      if (!this.sender.equals(that.sender))
        return false;
    }

    boolean this_present_greeting = true && this.isSetGreeting();
    boolean that_present_greeting = true && that.isSetGreeting();
    if (this_present_greeting || that_present_greeting) {
      if (!(this_present_greeting && that_present_greeting))
        return false;
      if (!this.greeting.equals(that.greeting))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(requestId);

    hashCode = hashCode * 8191 + ((isSetSender()) ? 131071 : 524287);
    if (isSetSender())
      hashCode = hashCode * 8191 + sender.hashCode();

    hashCode = hashCode * 8191 + ((isSetGreeting()) ? 131071 : 524287);
    if (isSetGreeting())
      hashCode = hashCode * 8191 + greeting.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(GreeterRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetRequestId()).compareTo(other.isSetRequestId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestId, other.requestId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSender()).compareTo(other.isSetSender());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSender()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sender, other.sender);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetGreeting()).compareTo(other.isSetGreeting());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGreeting()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.greeting, other.greeting);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GreeterRequest(");
    boolean first = true;

    sb.append("requestId:");
    sb.append(this.requestId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("sender:");
    if (this.sender == null) {
      sb.append("null");
    } else {
      sb.append(this.sender);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("greeting:");
    if (this.greeting == null) {
      sb.append("null");
    } else {
      sb.append(this.greeting);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GreeterRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GreeterRequestStandardScheme getScheme() {
      return new GreeterRequestStandardScheme();
    }
  }

  private static class GreeterRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<GreeterRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GreeterRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REQUEST_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.requestId = iprot.readI64();
              struct.setRequestIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SENDER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sender = iprot.readString();
              struct.setSenderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // GREETING
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.greeting = iprot.readString();
              struct.setGreetingIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GreeterRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(REQUEST_ID_FIELD_DESC);
      oprot.writeI64(struct.requestId);
      oprot.writeFieldEnd();
      if (struct.sender != null) {
        oprot.writeFieldBegin(SENDER_FIELD_DESC);
        oprot.writeString(struct.sender);
        oprot.writeFieldEnd();
      }
      if (struct.greeting != null) {
        oprot.writeFieldBegin(GREETING_FIELD_DESC);
        oprot.writeString(struct.greeting);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GreeterRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GreeterRequestTupleScheme getScheme() {
      return new GreeterRequestTupleScheme();
    }
  }

  private static class GreeterRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<GreeterRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GreeterRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetRequestId()) {
        optionals.set(0);
      }
      if (struct.isSetSender()) {
        optionals.set(1);
      }
      if (struct.isSetGreeting()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetRequestId()) {
        oprot.writeI64(struct.requestId);
      }
      if (struct.isSetSender()) {
        oprot.writeString(struct.sender);
      }
      if (struct.isSetGreeting()) {
        oprot.writeString(struct.greeting);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GreeterRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.requestId = iprot.readI64();
        struct.setRequestIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.sender = iprot.readString();
        struct.setSenderIsSet(true);
      }
      if (incoming.get(2)) {
        struct.greeting = iprot.readString();
        struct.setGreetingIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

