// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AdvInfoData.proto

package com.racerssquad.besthack2023.DTO.proto;

public final class AdvInfoDataProto {
  private AdvInfoDataProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_racerssquad_besthack2023_DTO_proto_AdvInfoData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_racerssquad_besthack2023_DTO_proto_AdvInfoData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021AdvInfoData.proto\022&com.racerssquad.bes" +
      "thack2023.DTO.proto\032\rDataRow.proto\"e\n\013Ad" +
      "vInfoData\022\027\n\017fullOrIncrement\030\001 \001(\010\022=\n\004ro" +
      "ws\030\002 \003(\0132/.com.racerssquad.besthack2023." +
      "DTO.proto.DataRowB\026B\020AdvInfoDataProtoH\001P" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.racerssquad.besthack2023.DTO.proto.DataRowProto.getDescriptor(),
        });
    internal_static_com_racerssquad_besthack2023_DTO_proto_AdvInfoData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_racerssquad_besthack2023_DTO_proto_AdvInfoData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_racerssquad_besthack2023_DTO_proto_AdvInfoData_descriptor,
        new java.lang.String[] { "FullOrIncrement", "Rows", });
    com.racerssquad.besthack2023.DTO.proto.DataRowProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
