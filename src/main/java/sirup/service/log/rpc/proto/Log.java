// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sirup_log.proto

package sirup.service.log.rpc.proto;

public final class Log {
  private Log() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_log_proto_LogRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_log_proto_LogRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_log_proto_LogResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_log_proto_LogResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017sirup_log.proto\022\tlog.proto\"4\n\nLogReque" +
      "st\022\017\n\007message\030\001 \001(\t\022\025\n\rsenderService\030\002 \001" +
      "(\t\"\033\n\013LogResponse\022\014\n\004code\030\001 \001(\0052B\n\010Sirup" +
      "Log\0226\n\003log\022\025.log.proto.LogRequest\032\026.log." +
      "proto.LogResponse\"\000B*\n\033sirup.service.log" +
      ".rpc.protoB\003LogP\001\242\002\003SASb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_log_proto_LogRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_log_proto_LogRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_log_proto_LogRequest_descriptor,
        new java.lang.String[] { "Message", "SenderService", });
    internal_static_log_proto_LogResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_log_proto_LogResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_log_proto_LogResponse_descriptor,
        new java.lang.String[] { "Code", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
