// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DataRow.proto

package com.racerssquad.besthack2023.DTO.proto;

public final class DataRowProto {
  private DataRowProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_racerssquad_besthack2023_DTO_proto_DataRow_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_racerssquad_besthack2023_DTO_proto_DataRow_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rDataRow.proto\022&com.racerssquad.besthac" +
      "k2023.DTO.proto\032\024DataFieldValue.proto\"|\n" +
      "\007DataRow\022\020\n\010rowIdent\030\001 \001(\t\022\027\n\017incrementD" +
      "elete\030\002 \001(\010\022F\n\006values\030\003 \003(\01326.com.racers" +
      "squad.besthack2023.DTO.proto.DataFieldVa" +
      "lueB\022B\014DataRowProtoH\001P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.racerssquad.besthack2023.DTO.proto.DataFieldValueProto.getDescriptor(),
        });
    internal_static_com_racerssquad_besthack2023_DTO_proto_DataRow_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_racerssquad_besthack2023_DTO_proto_DataRow_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_racerssquad_besthack2023_DTO_proto_DataRow_descriptor,
        new java.lang.String[] { "RowIdent", "IncrementDelete", "Values", });
    com.racerssquad.besthack2023.DTO.proto.DataFieldValueProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
