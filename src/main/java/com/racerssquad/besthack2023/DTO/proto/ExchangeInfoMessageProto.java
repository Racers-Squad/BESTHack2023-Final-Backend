// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExchangeInfoMessage.proto

package com.racerssquad.besthack2023.DTO.proto;

public final class ExchangeInfoMessageProto {
  private ExchangeInfoMessageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_racerssquad_besthack2023_DTO_proto_ExchangeInfoMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_racerssquad_besthack2023_DTO_proto_ExchangeInfoMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031ExchangeInfoMessage.proto\022&com.racerss" +
      "quad.besthack2023.DTO.proto\032\014Header.prot" +
      "o\032\rRequest.proto\032\016Response.proto\032\013Event." +
      "proto\"\247\002\n\023ExchangeInfoMessage\022>\n\006header\030" +
      "\001 \001(\0132..com.racerssquad.besthack2023.DTO" +
      ".proto.Header\022B\n\007request\030\002 \001(\0132/.com.rac" +
      "erssquad.besthack2023.DTO.proto.RequestH" +
      "\000\022D\n\010response\030\003 \001(\01320.com.racerssquad.be" +
      "sthack2023.DTO.proto.ResponseH\000\022>\n\005event" +
      "\030\004 \001(\0132-.com.racerssquad.besthack2023.DT" +
      "O.proto.EventH\000B\006\n\004bodyB\036B\030ExchangeInfoM" +
      "essageProtoH\001P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.racerssquad.besthack2023.DTO.proto.HeaderProto.getDescriptor(),
          com.racerssquad.besthack2023.DTO.proto.RequestProto.getDescriptor(),
          com.racerssquad.besthack2023.DTO.proto.ResponseProto.getDescriptor(),
          com.racerssquad.besthack2023.DTO.proto.EventProto.getDescriptor(),
        });
    internal_static_com_racerssquad_besthack2023_DTO_proto_ExchangeInfoMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_racerssquad_besthack2023_DTO_proto_ExchangeInfoMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_racerssquad_besthack2023_DTO_proto_ExchangeInfoMessage_descriptor,
        new java.lang.String[] { "Header", "Request", "Response", "Event", "Body", });
    com.racerssquad.besthack2023.DTO.proto.HeaderProto.getDescriptor();
    com.racerssquad.besthack2023.DTO.proto.RequestProto.getDescriptor();
    com.racerssquad.besthack2023.DTO.proto.ResponseProto.getDescriptor();
    com.racerssquad.besthack2023.DTO.proto.EventProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
