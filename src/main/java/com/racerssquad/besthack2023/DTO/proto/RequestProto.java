// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Request.proto

package com.racerssquad.besthack2023.DTO.proto;

public final class RequestProto {
  private RequestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_racerssquad_besthack2023_DTO_proto_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_racerssquad_besthack2023_DTO_proto_Request_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rRequest.proto\022&com.racerssquad.besthac" +
      "k2023.DTO.proto\032\022MessageEnums.proto\032\020Own" +
      "Command.proto\"\202\002\n\007Request\022D\n\007command\030\001 \001" +
      "(\01623.com.racerssquad.besthack2023.DTO.pr" +
      "oto.CommandType\022O\n\016commandForExec\030\002 \001(\0132" +
      "2.com.racerssquad.besthack2023.DTO.proto" +
      ".OwnCommandH\000\210\001\001\022M\n\021supportedCommands\030\003 " +
      "\003(\01322.com.racerssquad.besthack2023.DTO.p" +
      "roto.OwnCommandB\021\n\017_commandForExecB\022B\014Re" +
      "questProtoH\001P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.racerssquad.besthack2023.DTO.proto.MessageEnumsProto.getDescriptor(),
          com.racerssquad.besthack2023.DTO.proto.OwnCommandProto.getDescriptor(),
        });
    internal_static_com_racerssquad_besthack2023_DTO_proto_Request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_racerssquad_besthack2023_DTO_proto_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_racerssquad_besthack2023_DTO_proto_Request_descriptor,
        new java.lang.String[] { "Command", "CommandForExec", "SupportedCommands", "CommandForExec", });
    com.racerssquad.besthack2023.DTO.proto.MessageEnumsProto.getDescriptor();
    com.racerssquad.besthack2023.DTO.proto.OwnCommandProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
