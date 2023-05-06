// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sirup_log.proto

package sirup.service.log.rpc.proto;

/**
 * Protobuf type {@code log.v2.LogListResponse}
 */
public  final class LogListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:log.v2.LogListResponse)
    LogListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LogListResponse.newBuilder() to construct.
  private LogListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LogListResponse() {
    logList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LogListResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              logList_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            logList_.add(s);
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        logList_ = logList_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return sirup.service.log.rpc.proto.Log.internal_static_log_v2_LogListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sirup.service.log.rpc.proto.Log.internal_static_log_v2_LogListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sirup.service.log.rpc.proto.LogListResponse.class, sirup.service.log.rpc.proto.LogListResponse.Builder.class);
  }

  public static final int LOG_LIST_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList logList_;
  /**
   * <code>repeated string log_list = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getLogListList() {
    return logList_;
  }
  /**
   * <code>repeated string log_list = 1;</code>
   */
  public int getLogListCount() {
    return logList_.size();
  }
  /**
   * <code>repeated string log_list = 1;</code>
   */
  public java.lang.String getLogList(int index) {
    return logList_.get(index);
  }
  /**
   * <code>repeated string log_list = 1;</code>
   */
  public com.google.protobuf.ByteString
      getLogListBytes(int index) {
    return logList_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < logList_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, logList_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < logList_.size(); i++) {
        dataSize += computeStringSizeNoTag(logList_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getLogListList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof sirup.service.log.rpc.proto.LogListResponse)) {
      return super.equals(obj);
    }
    sirup.service.log.rpc.proto.LogListResponse other = (sirup.service.log.rpc.proto.LogListResponse) obj;

    boolean result = true;
    result = result && getLogListList()
        .equals(other.getLogListList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getLogListCount() > 0) {
      hash = (37 * hash) + LOG_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getLogListList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sirup.service.log.rpc.proto.LogListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sirup.service.log.rpc.proto.LogListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sirup.service.log.rpc.proto.LogListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sirup.service.log.rpc.proto.LogListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sirup.service.log.rpc.proto.LogListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sirup.service.log.rpc.proto.LogListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sirup.service.log.rpc.proto.LogListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sirup.service.log.rpc.proto.LogListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sirup.service.log.rpc.proto.LogListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sirup.service.log.rpc.proto.LogListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sirup.service.log.rpc.proto.LogListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sirup.service.log.rpc.proto.LogListResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(sirup.service.log.rpc.proto.LogListResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code log.v2.LogListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:log.v2.LogListResponse)
      sirup.service.log.rpc.proto.LogListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sirup.service.log.rpc.proto.Log.internal_static_log_v2_LogListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sirup.service.log.rpc.proto.Log.internal_static_log_v2_LogListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sirup.service.log.rpc.proto.LogListResponse.class, sirup.service.log.rpc.proto.LogListResponse.Builder.class);
    }

    // Construct using sirup.service.log.rpc.proto.LogListResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      logList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sirup.service.log.rpc.proto.Log.internal_static_log_v2_LogListResponse_descriptor;
    }

    @java.lang.Override
    public sirup.service.log.rpc.proto.LogListResponse getDefaultInstanceForType() {
      return sirup.service.log.rpc.proto.LogListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public sirup.service.log.rpc.proto.LogListResponse build() {
      sirup.service.log.rpc.proto.LogListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public sirup.service.log.rpc.proto.LogListResponse buildPartial() {
      sirup.service.log.rpc.proto.LogListResponse result = new sirup.service.log.rpc.proto.LogListResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        logList_ = logList_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.logList_ = logList_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof sirup.service.log.rpc.proto.LogListResponse) {
        return mergeFrom((sirup.service.log.rpc.proto.LogListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sirup.service.log.rpc.proto.LogListResponse other) {
      if (other == sirup.service.log.rpc.proto.LogListResponse.getDefaultInstance()) return this;
      if (!other.logList_.isEmpty()) {
        if (logList_.isEmpty()) {
          logList_ = other.logList_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureLogListIsMutable();
          logList_.addAll(other.logList_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      sirup.service.log.rpc.proto.LogListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sirup.service.log.rpc.proto.LogListResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList logList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureLogListIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        logList_ = new com.google.protobuf.LazyStringArrayList(logList_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string log_list = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getLogListList() {
      return logList_.getUnmodifiableView();
    }
    /**
     * <code>repeated string log_list = 1;</code>
     */
    public int getLogListCount() {
      return logList_.size();
    }
    /**
     * <code>repeated string log_list = 1;</code>
     */
    public java.lang.String getLogList(int index) {
      return logList_.get(index);
    }
    /**
     * <code>repeated string log_list = 1;</code>
     */
    public com.google.protobuf.ByteString
        getLogListBytes(int index) {
      return logList_.getByteString(index);
    }
    /**
     * <code>repeated string log_list = 1;</code>
     */
    public Builder setLogList(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureLogListIsMutable();
      logList_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string log_list = 1;</code>
     */
    public Builder addLogList(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureLogListIsMutable();
      logList_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string log_list = 1;</code>
     */
    public Builder addAllLogList(
        java.lang.Iterable<java.lang.String> values) {
      ensureLogListIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, logList_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string log_list = 1;</code>
     */
    public Builder clearLogList() {
      logList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string log_list = 1;</code>
     */
    public Builder addLogListBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureLogListIsMutable();
      logList_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:log.v2.LogListResponse)
  }

  // @@protoc_insertion_point(class_scope:log.v2.LogListResponse)
  private static final sirup.service.log.rpc.proto.LogListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sirup.service.log.rpc.proto.LogListResponse();
  }

  public static sirup.service.log.rpc.proto.LogListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogListResponse>
      PARSER = new com.google.protobuf.AbstractParser<LogListResponse>() {
    @java.lang.Override
    public LogListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LogListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LogListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public sirup.service.log.rpc.proto.LogListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

