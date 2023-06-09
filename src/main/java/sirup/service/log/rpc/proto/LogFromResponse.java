// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sirup_log.proto

package sirup.service.log.rpc.proto;

/**
 * Protobuf type {@code log.v2.LogFromResponse}
 */
public  final class LogFromResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:log.v2.LogFromResponse)
    LogFromResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LogFromResponse.newBuilder() to construct.
  private LogFromResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LogFromResponse() {
    found_ = false;
    logs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LogFromResponse(
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
          case 8: {

            found_ = input.readBool();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              logs_ = new java.util.ArrayList<sirup.service.log.rpc.proto.LogDTO>();
              mutable_bitField0_ |= 0x00000002;
            }
            logs_.add(
                input.readMessage(sirup.service.log.rpc.proto.LogDTO.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        logs_ = java.util.Collections.unmodifiableList(logs_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return sirup.service.log.rpc.proto.Log.internal_static_log_v2_LogFromResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sirup.service.log.rpc.proto.Log.internal_static_log_v2_LogFromResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sirup.service.log.rpc.proto.LogFromResponse.class, sirup.service.log.rpc.proto.LogFromResponse.Builder.class);
  }

  private int bitField0_;
  public static final int FOUND_FIELD_NUMBER = 1;
  private boolean found_;
  /**
   * <code>bool found = 1;</code>
   */
  public boolean getFound() {
    return found_;
  }

  public static final int LOGS_FIELD_NUMBER = 2;
  private java.util.List<sirup.service.log.rpc.proto.LogDTO> logs_;
  /**
   * <code>repeated .log.v2.LogDTO logs = 2;</code>
   */
  public java.util.List<sirup.service.log.rpc.proto.LogDTO> getLogsList() {
    return logs_;
  }
  /**
   * <code>repeated .log.v2.LogDTO logs = 2;</code>
   */
  public java.util.List<? extends sirup.service.log.rpc.proto.LogDTOOrBuilder> 
      getLogsOrBuilderList() {
    return logs_;
  }
  /**
   * <code>repeated .log.v2.LogDTO logs = 2;</code>
   */
  public int getLogsCount() {
    return logs_.size();
  }
  /**
   * <code>repeated .log.v2.LogDTO logs = 2;</code>
   */
  public sirup.service.log.rpc.proto.LogDTO getLogs(int index) {
    return logs_.get(index);
  }
  /**
   * <code>repeated .log.v2.LogDTO logs = 2;</code>
   */
  public sirup.service.log.rpc.proto.LogDTOOrBuilder getLogsOrBuilder(
      int index) {
    return logs_.get(index);
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
    if (found_ != false) {
      output.writeBool(1, found_);
    }
    for (int i = 0; i < logs_.size(); i++) {
      output.writeMessage(2, logs_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (found_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, found_);
    }
    for (int i = 0; i < logs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, logs_.get(i));
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
    if (!(obj instanceof sirup.service.log.rpc.proto.LogFromResponse)) {
      return super.equals(obj);
    }
    sirup.service.log.rpc.proto.LogFromResponse other = (sirup.service.log.rpc.proto.LogFromResponse) obj;

    boolean result = true;
    result = result && (getFound()
        == other.getFound());
    result = result && getLogsList()
        .equals(other.getLogsList());
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
    hash = (37 * hash) + FOUND_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFound());
    if (getLogsCount() > 0) {
      hash = (37 * hash) + LOGS_FIELD_NUMBER;
      hash = (53 * hash) + getLogsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sirup.service.log.rpc.proto.LogFromResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sirup.service.log.rpc.proto.LogFromResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sirup.service.log.rpc.proto.LogFromResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sirup.service.log.rpc.proto.LogFromResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sirup.service.log.rpc.proto.LogFromResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sirup.service.log.rpc.proto.LogFromResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sirup.service.log.rpc.proto.LogFromResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sirup.service.log.rpc.proto.LogFromResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sirup.service.log.rpc.proto.LogFromResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sirup.service.log.rpc.proto.LogFromResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sirup.service.log.rpc.proto.LogFromResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sirup.service.log.rpc.proto.LogFromResponse parseFrom(
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
  public static Builder newBuilder(sirup.service.log.rpc.proto.LogFromResponse prototype) {
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
   * Protobuf type {@code log.v2.LogFromResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:log.v2.LogFromResponse)
      sirup.service.log.rpc.proto.LogFromResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sirup.service.log.rpc.proto.Log.internal_static_log_v2_LogFromResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sirup.service.log.rpc.proto.Log.internal_static_log_v2_LogFromResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sirup.service.log.rpc.proto.LogFromResponse.class, sirup.service.log.rpc.proto.LogFromResponse.Builder.class);
    }

    // Construct using sirup.service.log.rpc.proto.LogFromResponse.newBuilder()
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
        getLogsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      found_ = false;

      if (logsBuilder_ == null) {
        logs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        logsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sirup.service.log.rpc.proto.Log.internal_static_log_v2_LogFromResponse_descriptor;
    }

    @java.lang.Override
    public sirup.service.log.rpc.proto.LogFromResponse getDefaultInstanceForType() {
      return sirup.service.log.rpc.proto.LogFromResponse.getDefaultInstance();
    }

    @java.lang.Override
    public sirup.service.log.rpc.proto.LogFromResponse build() {
      sirup.service.log.rpc.proto.LogFromResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public sirup.service.log.rpc.proto.LogFromResponse buildPartial() {
      sirup.service.log.rpc.proto.LogFromResponse result = new sirup.service.log.rpc.proto.LogFromResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.found_ = found_;
      if (logsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          logs_ = java.util.Collections.unmodifiableList(logs_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.logs_ = logs_;
      } else {
        result.logs_ = logsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof sirup.service.log.rpc.proto.LogFromResponse) {
        return mergeFrom((sirup.service.log.rpc.proto.LogFromResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sirup.service.log.rpc.proto.LogFromResponse other) {
      if (other == sirup.service.log.rpc.proto.LogFromResponse.getDefaultInstance()) return this;
      if (other.getFound() != false) {
        setFound(other.getFound());
      }
      if (logsBuilder_ == null) {
        if (!other.logs_.isEmpty()) {
          if (logs_.isEmpty()) {
            logs_ = other.logs_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureLogsIsMutable();
            logs_.addAll(other.logs_);
          }
          onChanged();
        }
      } else {
        if (!other.logs_.isEmpty()) {
          if (logsBuilder_.isEmpty()) {
            logsBuilder_.dispose();
            logsBuilder_ = null;
            logs_ = other.logs_;
            bitField0_ = (bitField0_ & ~0x00000002);
            logsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLogsFieldBuilder() : null;
          } else {
            logsBuilder_.addAllMessages(other.logs_);
          }
        }
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
      sirup.service.log.rpc.proto.LogFromResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sirup.service.log.rpc.proto.LogFromResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean found_ ;
    /**
     * <code>bool found = 1;</code>
     */
    public boolean getFound() {
      return found_;
    }
    /**
     * <code>bool found = 1;</code>
     */
    public Builder setFound(boolean value) {
      
      found_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool found = 1;</code>
     */
    public Builder clearFound() {
      
      found_ = false;
      onChanged();
      return this;
    }

    private java.util.List<sirup.service.log.rpc.proto.LogDTO> logs_ =
      java.util.Collections.emptyList();
    private void ensureLogsIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        logs_ = new java.util.ArrayList<sirup.service.log.rpc.proto.LogDTO>(logs_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        sirup.service.log.rpc.proto.LogDTO, sirup.service.log.rpc.proto.LogDTO.Builder, sirup.service.log.rpc.proto.LogDTOOrBuilder> logsBuilder_;

    /**
     * <code>repeated .log.v2.LogDTO logs = 2;</code>
     */
    public java.util.List<sirup.service.log.rpc.proto.LogDTO> getLogsList() {
      if (logsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(logs_);
      } else {
        return logsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .log.v2.LogDTO logs = 2;</code>
     */
    public int getLogsCount() {
      if (logsBuilder_ == null) {
        return logs_.size();
      } else {
        return logsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .log.v2.LogDTO logs = 2;</code>
     */
    public sirup.service.log.rpc.proto.LogDTO getLogs(int index) {
      if (logsBuilder_ == null) {
        return logs_.get(index);
      } else {
        return logsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .log.v2.LogDTO logs = 2;</code>
     */
    public Builder setLogs(
        int index, sirup.service.log.rpc.proto.LogDTO value) {
      if (logsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLogsIsMutable();
        logs_.set(index, value);
        onChanged();
      } else {
        logsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .log.v2.LogDTO logs = 2;</code>
     */
    public Builder setLogs(
        int index, sirup.service.log.rpc.proto.LogDTO.Builder builderForValue) {
      if (logsBuilder_ == null) {
        ensureLogsIsMutable();
        logs_.set(index, builderForValue.build());
        onChanged();
      } else {
        logsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .log.v2.LogDTO logs = 2;</code>
     */
    public Builder addLogs(sirup.service.log.rpc.proto.LogDTO value) {
      if (logsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLogsIsMutable();
        logs_.add(value);
        onChanged();
      } else {
        logsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .log.v2.LogDTO logs = 2;</code>
     */
    public Builder addLogs(
        int index, sirup.service.log.rpc.proto.LogDTO value) {
      if (logsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLogsIsMutable();
        logs_.add(index, value);
        onChanged();
      } else {
        logsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .log.v2.LogDTO logs = 2;</code>
     */
    public Builder addLogs(
        sirup.service.log.rpc.proto.LogDTO.Builder builderForValue) {
      if (logsBuilder_ == null) {
        ensureLogsIsMutable();
        logs_.add(builderForValue.build());
        onChanged();
      } else {
        logsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .log.v2.LogDTO logs = 2;</code>
     */
    public Builder addLogs(
        int index, sirup.service.log.rpc.proto.LogDTO.Builder builderForValue) {
      if (logsBuilder_ == null) {
        ensureLogsIsMutable();
        logs_.add(index, builderForValue.build());
        onChanged();
      } else {
        logsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .log.v2.LogDTO logs = 2;</code>
     */
    public Builder addAllLogs(
        java.lang.Iterable<? extends sirup.service.log.rpc.proto.LogDTO> values) {
      if (logsBuilder_ == null) {
        ensureLogsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, logs_);
        onChanged();
      } else {
        logsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .log.v2.LogDTO logs = 2;</code>
     */
    public Builder clearLogs() {
      if (logsBuilder_ == null) {
        logs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        logsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .log.v2.LogDTO logs = 2;</code>
     */
    public Builder removeLogs(int index) {
      if (logsBuilder_ == null) {
        ensureLogsIsMutable();
        logs_.remove(index);
        onChanged();
      } else {
        logsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .log.v2.LogDTO logs = 2;</code>
     */
    public sirup.service.log.rpc.proto.LogDTO.Builder getLogsBuilder(
        int index) {
      return getLogsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .log.v2.LogDTO logs = 2;</code>
     */
    public sirup.service.log.rpc.proto.LogDTOOrBuilder getLogsOrBuilder(
        int index) {
      if (logsBuilder_ == null) {
        return logs_.get(index);  } else {
        return logsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .log.v2.LogDTO logs = 2;</code>
     */
    public java.util.List<? extends sirup.service.log.rpc.proto.LogDTOOrBuilder> 
         getLogsOrBuilderList() {
      if (logsBuilder_ != null) {
        return logsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(logs_);
      }
    }
    /**
     * <code>repeated .log.v2.LogDTO logs = 2;</code>
     */
    public sirup.service.log.rpc.proto.LogDTO.Builder addLogsBuilder() {
      return getLogsFieldBuilder().addBuilder(
          sirup.service.log.rpc.proto.LogDTO.getDefaultInstance());
    }
    /**
     * <code>repeated .log.v2.LogDTO logs = 2;</code>
     */
    public sirup.service.log.rpc.proto.LogDTO.Builder addLogsBuilder(
        int index) {
      return getLogsFieldBuilder().addBuilder(
          index, sirup.service.log.rpc.proto.LogDTO.getDefaultInstance());
    }
    /**
     * <code>repeated .log.v2.LogDTO logs = 2;</code>
     */
    public java.util.List<sirup.service.log.rpc.proto.LogDTO.Builder> 
         getLogsBuilderList() {
      return getLogsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        sirup.service.log.rpc.proto.LogDTO, sirup.service.log.rpc.proto.LogDTO.Builder, sirup.service.log.rpc.proto.LogDTOOrBuilder> 
        getLogsFieldBuilder() {
      if (logsBuilder_ == null) {
        logsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            sirup.service.log.rpc.proto.LogDTO, sirup.service.log.rpc.proto.LogDTO.Builder, sirup.service.log.rpc.proto.LogDTOOrBuilder>(
                logs_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        logs_ = null;
      }
      return logsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:log.v2.LogFromResponse)
  }

  // @@protoc_insertion_point(class_scope:log.v2.LogFromResponse)
  private static final sirup.service.log.rpc.proto.LogFromResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sirup.service.log.rpc.proto.LogFromResponse();
  }

  public static sirup.service.log.rpc.proto.LogFromResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogFromResponse>
      PARSER = new com.google.protobuf.AbstractParser<LogFromResponse>() {
    @java.lang.Override
    public LogFromResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LogFromResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LogFromResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogFromResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public sirup.service.log.rpc.proto.LogFromResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

