// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sirup_log.proto

package sirup.service.log.rpc.proto;

/**
 * Protobuf type {@code log.v2.LogListRequest}
 */
public  final class LogListRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:log.v2.LogListRequest)
    LogListRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LogListRequest.newBuilder() to construct.
  private LogListRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LogListRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LogListRequest(
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
            sirup.service.log.rpc.proto.Credentials.Builder subBuilder = null;
            if (adminCredentials_ != null) {
              subBuilder = adminCredentials_.toBuilder();
            }
            adminCredentials_ = input.readMessage(sirup.service.log.rpc.proto.Credentials.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(adminCredentials_);
              adminCredentials_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return sirup.service.log.rpc.proto.Log.internal_static_log_v2_LogListRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sirup.service.log.rpc.proto.Log.internal_static_log_v2_LogListRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            sirup.service.log.rpc.proto.LogListRequest.class, sirup.service.log.rpc.proto.LogListRequest.Builder.class);
  }

  public static final int ADMIN_CREDENTIALS_FIELD_NUMBER = 1;
  private sirup.service.log.rpc.proto.Credentials adminCredentials_;
  /**
   * <code>.log.v2.Credentials admin_credentials = 1;</code>
   */
  public boolean hasAdminCredentials() {
    return adminCredentials_ != null;
  }
  /**
   * <code>.log.v2.Credentials admin_credentials = 1;</code>
   */
  public sirup.service.log.rpc.proto.Credentials getAdminCredentials() {
    return adminCredentials_ == null ? sirup.service.log.rpc.proto.Credentials.getDefaultInstance() : adminCredentials_;
  }
  /**
   * <code>.log.v2.Credentials admin_credentials = 1;</code>
   */
  public sirup.service.log.rpc.proto.CredentialsOrBuilder getAdminCredentialsOrBuilder() {
    return getAdminCredentials();
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
    if (adminCredentials_ != null) {
      output.writeMessage(1, getAdminCredentials());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (adminCredentials_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAdminCredentials());
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
    if (!(obj instanceof sirup.service.log.rpc.proto.LogListRequest)) {
      return super.equals(obj);
    }
    sirup.service.log.rpc.proto.LogListRequest other = (sirup.service.log.rpc.proto.LogListRequest) obj;

    boolean result = true;
    result = result && (hasAdminCredentials() == other.hasAdminCredentials());
    if (hasAdminCredentials()) {
      result = result && getAdminCredentials()
          .equals(other.getAdminCredentials());
    }
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
    if (hasAdminCredentials()) {
      hash = (37 * hash) + ADMIN_CREDENTIALS_FIELD_NUMBER;
      hash = (53 * hash) + getAdminCredentials().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sirup.service.log.rpc.proto.LogListRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sirup.service.log.rpc.proto.LogListRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sirup.service.log.rpc.proto.LogListRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sirup.service.log.rpc.proto.LogListRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sirup.service.log.rpc.proto.LogListRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sirup.service.log.rpc.proto.LogListRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sirup.service.log.rpc.proto.LogListRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sirup.service.log.rpc.proto.LogListRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sirup.service.log.rpc.proto.LogListRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sirup.service.log.rpc.proto.LogListRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sirup.service.log.rpc.proto.LogListRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sirup.service.log.rpc.proto.LogListRequest parseFrom(
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
  public static Builder newBuilder(sirup.service.log.rpc.proto.LogListRequest prototype) {
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
   * Protobuf type {@code log.v2.LogListRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:log.v2.LogListRequest)
      sirup.service.log.rpc.proto.LogListRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sirup.service.log.rpc.proto.Log.internal_static_log_v2_LogListRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sirup.service.log.rpc.proto.Log.internal_static_log_v2_LogListRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sirup.service.log.rpc.proto.LogListRequest.class, sirup.service.log.rpc.proto.LogListRequest.Builder.class);
    }

    // Construct using sirup.service.log.rpc.proto.LogListRequest.newBuilder()
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
      if (adminCredentialsBuilder_ == null) {
        adminCredentials_ = null;
      } else {
        adminCredentials_ = null;
        adminCredentialsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sirup.service.log.rpc.proto.Log.internal_static_log_v2_LogListRequest_descriptor;
    }

    @java.lang.Override
    public sirup.service.log.rpc.proto.LogListRequest getDefaultInstanceForType() {
      return sirup.service.log.rpc.proto.LogListRequest.getDefaultInstance();
    }

    @java.lang.Override
    public sirup.service.log.rpc.proto.LogListRequest build() {
      sirup.service.log.rpc.proto.LogListRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public sirup.service.log.rpc.proto.LogListRequest buildPartial() {
      sirup.service.log.rpc.proto.LogListRequest result = new sirup.service.log.rpc.proto.LogListRequest(this);
      if (adminCredentialsBuilder_ == null) {
        result.adminCredentials_ = adminCredentials_;
      } else {
        result.adminCredentials_ = adminCredentialsBuilder_.build();
      }
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
      if (other instanceof sirup.service.log.rpc.proto.LogListRequest) {
        return mergeFrom((sirup.service.log.rpc.proto.LogListRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sirup.service.log.rpc.proto.LogListRequest other) {
      if (other == sirup.service.log.rpc.proto.LogListRequest.getDefaultInstance()) return this;
      if (other.hasAdminCredentials()) {
        mergeAdminCredentials(other.getAdminCredentials());
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
      sirup.service.log.rpc.proto.LogListRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sirup.service.log.rpc.proto.LogListRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private sirup.service.log.rpc.proto.Credentials adminCredentials_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        sirup.service.log.rpc.proto.Credentials, sirup.service.log.rpc.proto.Credentials.Builder, sirup.service.log.rpc.proto.CredentialsOrBuilder> adminCredentialsBuilder_;
    /**
     * <code>.log.v2.Credentials admin_credentials = 1;</code>
     */
    public boolean hasAdminCredentials() {
      return adminCredentialsBuilder_ != null || adminCredentials_ != null;
    }
    /**
     * <code>.log.v2.Credentials admin_credentials = 1;</code>
     */
    public sirup.service.log.rpc.proto.Credentials getAdminCredentials() {
      if (adminCredentialsBuilder_ == null) {
        return adminCredentials_ == null ? sirup.service.log.rpc.proto.Credentials.getDefaultInstance() : adminCredentials_;
      } else {
        return adminCredentialsBuilder_.getMessage();
      }
    }
    /**
     * <code>.log.v2.Credentials admin_credentials = 1;</code>
     */
    public Builder setAdminCredentials(sirup.service.log.rpc.proto.Credentials value) {
      if (adminCredentialsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        adminCredentials_ = value;
        onChanged();
      } else {
        adminCredentialsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.log.v2.Credentials admin_credentials = 1;</code>
     */
    public Builder setAdminCredentials(
        sirup.service.log.rpc.proto.Credentials.Builder builderForValue) {
      if (adminCredentialsBuilder_ == null) {
        adminCredentials_ = builderForValue.build();
        onChanged();
      } else {
        adminCredentialsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.log.v2.Credentials admin_credentials = 1;</code>
     */
    public Builder mergeAdminCredentials(sirup.service.log.rpc.proto.Credentials value) {
      if (adminCredentialsBuilder_ == null) {
        if (adminCredentials_ != null) {
          adminCredentials_ =
            sirup.service.log.rpc.proto.Credentials.newBuilder(adminCredentials_).mergeFrom(value).buildPartial();
        } else {
          adminCredentials_ = value;
        }
        onChanged();
      } else {
        adminCredentialsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.log.v2.Credentials admin_credentials = 1;</code>
     */
    public Builder clearAdminCredentials() {
      if (adminCredentialsBuilder_ == null) {
        adminCredentials_ = null;
        onChanged();
      } else {
        adminCredentials_ = null;
        adminCredentialsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.log.v2.Credentials admin_credentials = 1;</code>
     */
    public sirup.service.log.rpc.proto.Credentials.Builder getAdminCredentialsBuilder() {
      
      onChanged();
      return getAdminCredentialsFieldBuilder().getBuilder();
    }
    /**
     * <code>.log.v2.Credentials admin_credentials = 1;</code>
     */
    public sirup.service.log.rpc.proto.CredentialsOrBuilder getAdminCredentialsOrBuilder() {
      if (adminCredentialsBuilder_ != null) {
        return adminCredentialsBuilder_.getMessageOrBuilder();
      } else {
        return adminCredentials_ == null ?
            sirup.service.log.rpc.proto.Credentials.getDefaultInstance() : adminCredentials_;
      }
    }
    /**
     * <code>.log.v2.Credentials admin_credentials = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        sirup.service.log.rpc.proto.Credentials, sirup.service.log.rpc.proto.Credentials.Builder, sirup.service.log.rpc.proto.CredentialsOrBuilder> 
        getAdminCredentialsFieldBuilder() {
      if (adminCredentialsBuilder_ == null) {
        adminCredentialsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            sirup.service.log.rpc.proto.Credentials, sirup.service.log.rpc.proto.Credentials.Builder, sirup.service.log.rpc.proto.CredentialsOrBuilder>(
                getAdminCredentials(),
                getParentForChildren(),
                isClean());
        adminCredentials_ = null;
      }
      return adminCredentialsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:log.v2.LogListRequest)
  }

  // @@protoc_insertion_point(class_scope:log.v2.LogListRequest)
  private static final sirup.service.log.rpc.proto.LogListRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sirup.service.log.rpc.proto.LogListRequest();
  }

  public static sirup.service.log.rpc.proto.LogListRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogListRequest>
      PARSER = new com.google.protobuf.AbstractParser<LogListRequest>() {
    @java.lang.Override
    public LogListRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LogListRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LogListRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogListRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public sirup.service.log.rpc.proto.LogListRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
