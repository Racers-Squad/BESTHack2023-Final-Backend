// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DataFieldValue.proto

package com.racerssquad.besthack2023.DTO.proto;

public final class DataFieldValueProto {
  private DataFieldValueProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_racerssquad_besthack2023_DTO_proto_DataFieldValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_racerssquad_besthack2023_DTO_proto_DataFieldValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024DataFieldValue.proto\022&com.racerssquad." +
      "besthack2023.DTO.proto\032\016ValueRef.proto\"`" +
      "\n\016DataFieldValue\022\r\n\005alias\030\001 \001(\t\022?\n\005value" +
      "\030\002 \001(\01320.com.racerssquad.besthack2023.DT" +
      "O.proto.ValueRefB\031B\023DataFieldValueProtoH" +
      "\001P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.racerssquad.besthack2023.DTO.proto.ValueRefProto.getDescriptor(),
        });
    internal_static_com_racerssquad_besthack2023_DTO_proto_DataFieldValue_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_racerssquad_besthack2023_DTO_proto_DataFieldValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_racerssquad_besthack2023_DTO_proto_DataFieldValue_descriptor,
        new java.lang.String[] { "Alias", "Value", });
    com.racerssquad.besthack2023.DTO.proto.ValueRefProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
