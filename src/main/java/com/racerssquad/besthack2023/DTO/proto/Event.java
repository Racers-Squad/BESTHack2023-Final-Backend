// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Event.proto

package com.racerssquad.besthack2023.DTO.proto;

/**
 * Protobuf type {@code com.racerssquad.besthack2023.DTO.proto.Event}
 */
public final class Event extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.racerssquad.besthack2023.DTO.proto.Event)
    EventOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Event.newBuilder() to construct.
  private Event(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Event() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Event();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Event(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            com.racerssquad.besthack2023.DTO.proto.Status.Builder subBuilder = null;
            if (status_ != null) {
              subBuilder = status_.toBuilder();
            }
            status_ = input.readMessage(com.racerssquad.besthack2023.DTO.proto.Status.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(status_);
              status_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
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
    return com.racerssquad.besthack2023.DTO.proto.EventProto.internal_static_com_racerssquad_besthack2023_DTO_proto_Event_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.racerssquad.besthack2023.DTO.proto.EventProto.internal_static_com_racerssquad_besthack2023_DTO_proto_Event_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.racerssquad.besthack2023.DTO.proto.Event.class, com.racerssquad.besthack2023.DTO.proto.Event.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private com.racerssquad.besthack2023.DTO.proto.Status status_;
  /**
   * <pre>
   * Статус
   * </pre>
   *
   * <code>.com.racerssquad.besthack2023.DTO.proto.Status status = 1;</code>
   * @return Whether the status field is set.
   */
  @java.lang.Override
  public boolean hasStatus() {
    return status_ != null;
  }
  /**
   * <pre>
   * Статус
   * </pre>
   *
   * <code>.com.racerssquad.besthack2023.DTO.proto.Status status = 1;</code>
   * @return The status.
   */
  @java.lang.Override
  public com.racerssquad.besthack2023.DTO.proto.Status getStatus() {
    return status_ == null ? com.racerssquad.besthack2023.DTO.proto.Status.getDefaultInstance() : status_;
  }
  /**
   * <pre>
   * Статус
   * </pre>
   *
   * <code>.com.racerssquad.besthack2023.DTO.proto.Status status = 1;</code>
   */
  @java.lang.Override
  public com.racerssquad.besthack2023.DTO.proto.StatusOrBuilder getStatusOrBuilder() {
    return getStatus();
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
    if (status_ != null) {
      output.writeMessage(1, getStatus());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStatus());
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
    if (!(obj instanceof com.racerssquad.besthack2023.DTO.proto.Event)) {
      return super.equals(obj);
    }
    com.racerssquad.besthack2023.DTO.proto.Event other = (com.racerssquad.besthack2023.DTO.proto.Event) obj;

    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.racerssquad.besthack2023.DTO.proto.Event parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.racerssquad.besthack2023.DTO.proto.Event parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.racerssquad.besthack2023.DTO.proto.Event parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.racerssquad.besthack2023.DTO.proto.Event parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.racerssquad.besthack2023.DTO.proto.Event parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.racerssquad.besthack2023.DTO.proto.Event parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.racerssquad.besthack2023.DTO.proto.Event parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.racerssquad.besthack2023.DTO.proto.Event parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.racerssquad.besthack2023.DTO.proto.Event parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.racerssquad.besthack2023.DTO.proto.Event parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.racerssquad.besthack2023.DTO.proto.Event parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.racerssquad.besthack2023.DTO.proto.Event parseFrom(
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
  public static Builder newBuilder(com.racerssquad.besthack2023.DTO.proto.Event prototype) {
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
   * Protobuf type {@code com.racerssquad.besthack2023.DTO.proto.Event}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.racerssquad.besthack2023.DTO.proto.Event)
      com.racerssquad.besthack2023.DTO.proto.EventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.racerssquad.besthack2023.DTO.proto.EventProto.internal_static_com_racerssquad_besthack2023_DTO_proto_Event_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.racerssquad.besthack2023.DTO.proto.EventProto.internal_static_com_racerssquad_besthack2023_DTO_proto_Event_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.racerssquad.besthack2023.DTO.proto.Event.class, com.racerssquad.besthack2023.DTO.proto.Event.Builder.class);
    }

    // Construct using com.racerssquad.besthack2023.DTO.proto.Event.newBuilder()
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
      if (statusBuilder_ == null) {
        status_ = null;
      } else {
        status_ = null;
        statusBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.racerssquad.besthack2023.DTO.proto.EventProto.internal_static_com_racerssquad_besthack2023_DTO_proto_Event_descriptor;
    }

    @java.lang.Override
    public com.racerssquad.besthack2023.DTO.proto.Event getDefaultInstanceForType() {
      return com.racerssquad.besthack2023.DTO.proto.Event.getDefaultInstance();
    }

    @java.lang.Override
    public com.racerssquad.besthack2023.DTO.proto.Event build() {
      com.racerssquad.besthack2023.DTO.proto.Event result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.racerssquad.besthack2023.DTO.proto.Event buildPartial() {
      com.racerssquad.besthack2023.DTO.proto.Event result = new com.racerssquad.besthack2023.DTO.proto.Event(this);
      if (statusBuilder_ == null) {
        result.status_ = status_;
      } else {
        result.status_ = statusBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.racerssquad.besthack2023.DTO.proto.Event) {
        return mergeFrom((com.racerssquad.besthack2023.DTO.proto.Event)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.racerssquad.besthack2023.DTO.proto.Event other) {
      if (other == com.racerssquad.besthack2023.DTO.proto.Event.getDefaultInstance()) return this;
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
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
      com.racerssquad.besthack2023.DTO.proto.Event parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.racerssquad.besthack2023.DTO.proto.Event) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.racerssquad.besthack2023.DTO.proto.Status status_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.racerssquad.besthack2023.DTO.proto.Status, com.racerssquad.besthack2023.DTO.proto.Status.Builder, com.racerssquad.besthack2023.DTO.proto.StatusOrBuilder> statusBuilder_;
    /**
     * <pre>
     * Статус
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.Status status = 1;</code>
     * @return Whether the status field is set.
     */
    public boolean hasStatus() {
      return statusBuilder_ != null || status_ != null;
    }
    /**
     * <pre>
     * Статус
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.Status status = 1;</code>
     * @return The status.
     */
    public com.racerssquad.besthack2023.DTO.proto.Status getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? com.racerssquad.besthack2023.DTO.proto.Status.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Статус
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.Status status = 1;</code>
     */
    public Builder setStatus(com.racerssquad.besthack2023.DTO.proto.Status value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
        onChanged();
      } else {
        statusBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Статус
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.Status status = 1;</code>
     */
    public Builder setStatus(
        com.racerssquad.besthack2023.DTO.proto.Status.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
        onChanged();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Статус
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.Status status = 1;</code>
     */
    public Builder mergeStatus(com.racerssquad.besthack2023.DTO.proto.Status value) {
      if (statusBuilder_ == null) {
        if (status_ != null) {
          status_ =
            com.racerssquad.besthack2023.DTO.proto.Status.newBuilder(status_).mergeFrom(value).buildPartial();
        } else {
          status_ = value;
        }
        onChanged();
      } else {
        statusBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Статус
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.Status status = 1;</code>
     */
    public Builder clearStatus() {
      if (statusBuilder_ == null) {
        status_ = null;
        onChanged();
      } else {
        status_ = null;
        statusBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Статус
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.Status status = 1;</code>
     */
    public com.racerssquad.besthack2023.DTO.proto.Status.Builder getStatusBuilder() {
      
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Статус
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.Status status = 1;</code>
     */
    public com.racerssquad.besthack2023.DTO.proto.StatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ?
            com.racerssquad.besthack2023.DTO.proto.Status.getDefaultInstance() : status_;
      }
    }
    /**
     * <pre>
     * Статус
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.Status status = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.racerssquad.besthack2023.DTO.proto.Status, com.racerssquad.besthack2023.DTO.proto.Status.Builder, com.racerssquad.besthack2023.DTO.proto.StatusOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.racerssquad.besthack2023.DTO.proto.Status, com.racerssquad.besthack2023.DTO.proto.Status.Builder, com.racerssquad.besthack2023.DTO.proto.StatusOrBuilder>(
                getStatus(),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.racerssquad.besthack2023.DTO.proto.Event)
  }

  // @@protoc_insertion_point(class_scope:com.racerssquad.besthack2023.DTO.proto.Event)
  private static final com.racerssquad.besthack2023.DTO.proto.Event DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.racerssquad.besthack2023.DTO.proto.Event();
  }

  public static com.racerssquad.besthack2023.DTO.proto.Event getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Event>
      PARSER = new com.google.protobuf.AbstractParser<Event>() {
    @java.lang.Override
    public Event parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Event(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Event> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Event> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.racerssquad.besthack2023.DTO.proto.Event getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

