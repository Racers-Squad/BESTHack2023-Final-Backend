// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Parameter.proto

package com.racerssquad.besthack2023.DTO.proto;

/**
 * <pre>
 **
 *Тип параметра для типа собственной команды
 *Поле alias - обязательно для заполнения.
 *Поля caption, hint - необходимы только для отображения инфо в GUI
 *Поле value - при отправке собственной команды с параметрами при приветствии используется для описания типа поля  и предоставления значения по умолчанию,
 *при запросе на исполнение собственной команды используется для передачи значения параметра.
 * </pre>
 *
 * Protobuf type {@code com.racerssquad.besthack2023.DTO.proto.Parameter}
 */
public final class Parameter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.racerssquad.besthack2023.DTO.proto.Parameter)
    ParameterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Parameter.newBuilder() to construct.
  private Parameter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Parameter() {
    alias_ = "";
    caption_ = "";
    hint_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Parameter();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Parameter(
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

            alias_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            caption_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000002;
            hint_ = s;
            break;
          }
          case 34: {
            com.racerssquad.besthack2023.DTO.proto.ValueRef.Builder subBuilder = null;
            if (((bitField0_ & 0x00000004) != 0)) {
              subBuilder = value_.toBuilder();
            }
            value_ = input.readMessage(com.racerssquad.besthack2023.DTO.proto.ValueRef.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(value_);
              value_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000004;
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
    return com.racerssquad.besthack2023.DTO.proto.ParameterProto.internal_static_com_racerssquad_besthack2023_DTO_proto_Parameter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.racerssquad.besthack2023.DTO.proto.ParameterProto.internal_static_com_racerssquad_besthack2023_DTO_proto_Parameter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.racerssquad.besthack2023.DTO.proto.Parameter.class, com.racerssquad.besthack2023.DTO.proto.Parameter.Builder.class);
  }

  private int bitField0_;
  public static final int ALIAS_FIELD_NUMBER = 1;
  private volatile java.lang.Object alias_;
  /**
   * <pre>
   * Идентификатор параметра
   * </pre>
   *
   * <code>string alias = 1;</code>
   * @return The alias.
   */
  @java.lang.Override
  public java.lang.String getAlias() {
    java.lang.Object ref = alias_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      alias_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Идентификатор параметра
   * </pre>
   *
   * <code>string alias = 1;</code>
   * @return The bytes for alias.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAliasBytes() {
    java.lang.Object ref = alias_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      alias_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CAPTION_FIELD_NUMBER = 2;
  private volatile java.lang.Object caption_;
  /**
   * <pre>
   * Заголовок параметра
   * </pre>
   *
   * <code>string caption = 2;</code>
   * @return Whether the caption field is set.
   */
  @java.lang.Override
  public boolean hasCaption() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Заголовок параметра
   * </pre>
   *
   * <code>string caption = 2;</code>
   * @return The caption.
   */
  @java.lang.Override
  public java.lang.String getCaption() {
    java.lang.Object ref = caption_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      caption_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Заголовок параметра
   * </pre>
   *
   * <code>string caption = 2;</code>
   * @return The bytes for caption.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCaptionBytes() {
    java.lang.Object ref = caption_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      caption_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HINT_FIELD_NUMBER = 3;
  private volatile java.lang.Object hint_;
  /**
   * <pre>
   * Подсказка
   * </pre>
   *
   * <code>string hint = 3;</code>
   * @return Whether the hint field is set.
   */
  @java.lang.Override
  public boolean hasHint() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Подсказка
   * </pre>
   *
   * <code>string hint = 3;</code>
   * @return The hint.
   */
  @java.lang.Override
  public java.lang.String getHint() {
    java.lang.Object ref = hint_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hint_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Подсказка
   * </pre>
   *
   * <code>string hint = 3;</code>
   * @return The bytes for hint.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHintBytes() {
    java.lang.Object ref = hint_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hint_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 4;
  private com.racerssquad.besthack2023.DTO.proto.ValueRef value_;
  /**
   * <pre>
   * Значение
   * </pre>
   *
   * <code>.com.racerssquad.besthack2023.DTO.proto.ValueRef value = 4;</code>
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Значение
   * </pre>
   *
   * <code>.com.racerssquad.besthack2023.DTO.proto.ValueRef value = 4;</code>
   * @return The value.
   */
  @java.lang.Override
  public com.racerssquad.besthack2023.DTO.proto.ValueRef getValue() {
    return value_ == null ? com.racerssquad.besthack2023.DTO.proto.ValueRef.getDefaultInstance() : value_;
  }
  /**
   * <pre>
   * Значение
   * </pre>
   *
   * <code>.com.racerssquad.besthack2023.DTO.proto.ValueRef value = 4;</code>
   */
  @java.lang.Override
  public com.racerssquad.besthack2023.DTO.proto.ValueRefOrBuilder getValueOrBuilder() {
    return value_ == null ? com.racerssquad.besthack2023.DTO.proto.ValueRef.getDefaultInstance() : value_;
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
    if (!getAliasBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, alias_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, caption_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, hint_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeMessage(4, getValue());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAliasBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, alias_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, caption_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, hint_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getValue());
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
    if (!(obj instanceof com.racerssquad.besthack2023.DTO.proto.Parameter)) {
      return super.equals(obj);
    }
    com.racerssquad.besthack2023.DTO.proto.Parameter other = (com.racerssquad.besthack2023.DTO.proto.Parameter) obj;

    if (!getAlias()
        .equals(other.getAlias())) return false;
    if (hasCaption() != other.hasCaption()) return false;
    if (hasCaption()) {
      if (!getCaption()
          .equals(other.getCaption())) return false;
    }
    if (hasHint() != other.hasHint()) return false;
    if (hasHint()) {
      if (!getHint()
          .equals(other.getHint())) return false;
    }
    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue()
          .equals(other.getValue())) return false;
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
    hash = (37 * hash) + ALIAS_FIELD_NUMBER;
    hash = (53 * hash) + getAlias().hashCode();
    if (hasCaption()) {
      hash = (37 * hash) + CAPTION_FIELD_NUMBER;
      hash = (53 * hash) + getCaption().hashCode();
    }
    if (hasHint()) {
      hash = (37 * hash) + HINT_FIELD_NUMBER;
      hash = (53 * hash) + getHint().hashCode();
    }
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.racerssquad.besthack2023.DTO.proto.Parameter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.racerssquad.besthack2023.DTO.proto.Parameter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.racerssquad.besthack2023.DTO.proto.Parameter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.racerssquad.besthack2023.DTO.proto.Parameter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.racerssquad.besthack2023.DTO.proto.Parameter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.racerssquad.besthack2023.DTO.proto.Parameter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.racerssquad.besthack2023.DTO.proto.Parameter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.racerssquad.besthack2023.DTO.proto.Parameter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.racerssquad.besthack2023.DTO.proto.Parameter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.racerssquad.besthack2023.DTO.proto.Parameter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.racerssquad.besthack2023.DTO.proto.Parameter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.racerssquad.besthack2023.DTO.proto.Parameter parseFrom(
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
  public static Builder newBuilder(com.racerssquad.besthack2023.DTO.proto.Parameter prototype) {
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
   * <pre>
   **
   *Тип параметра для типа собственной команды
   *Поле alias - обязательно для заполнения.
   *Поля caption, hint - необходимы только для отображения инфо в GUI
   *Поле value - при отправке собственной команды с параметрами при приветствии используется для описания типа поля  и предоставления значения по умолчанию,
   *при запросе на исполнение собственной команды используется для передачи значения параметра.
   * </pre>
   *
   * Protobuf type {@code com.racerssquad.besthack2023.DTO.proto.Parameter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.racerssquad.besthack2023.DTO.proto.Parameter)
      com.racerssquad.besthack2023.DTO.proto.ParameterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.racerssquad.besthack2023.DTO.proto.ParameterProto.internal_static_com_racerssquad_besthack2023_DTO_proto_Parameter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.racerssquad.besthack2023.DTO.proto.ParameterProto.internal_static_com_racerssquad_besthack2023_DTO_proto_Parameter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.racerssquad.besthack2023.DTO.proto.Parameter.class, com.racerssquad.besthack2023.DTO.proto.Parameter.Builder.class);
    }

    // Construct using com.racerssquad.besthack2023.DTO.proto.Parameter.newBuilder()
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
        getValueFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      alias_ = "";

      caption_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      hint_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      if (valueBuilder_ == null) {
        value_ = null;
      } else {
        valueBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.racerssquad.besthack2023.DTO.proto.ParameterProto.internal_static_com_racerssquad_besthack2023_DTO_proto_Parameter_descriptor;
    }

    @java.lang.Override
    public com.racerssquad.besthack2023.DTO.proto.Parameter getDefaultInstanceForType() {
      return com.racerssquad.besthack2023.DTO.proto.Parameter.getDefaultInstance();
    }

    @java.lang.Override
    public com.racerssquad.besthack2023.DTO.proto.Parameter build() {
      com.racerssquad.besthack2023.DTO.proto.Parameter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.racerssquad.besthack2023.DTO.proto.Parameter buildPartial() {
      com.racerssquad.besthack2023.DTO.proto.Parameter result = new com.racerssquad.besthack2023.DTO.proto.Parameter(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.alias_ = alias_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.caption_ = caption_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.hint_ = hint_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        if (valueBuilder_ == null) {
          result.value_ = value_;
        } else {
          result.value_ = valueBuilder_.build();
        }
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.racerssquad.besthack2023.DTO.proto.Parameter) {
        return mergeFrom((com.racerssquad.besthack2023.DTO.proto.Parameter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.racerssquad.besthack2023.DTO.proto.Parameter other) {
      if (other == com.racerssquad.besthack2023.DTO.proto.Parameter.getDefaultInstance()) return this;
      if (!other.getAlias().isEmpty()) {
        alias_ = other.alias_;
        onChanged();
      }
      if (other.hasCaption()) {
        bitField0_ |= 0x00000001;
        caption_ = other.caption_;
        onChanged();
      }
      if (other.hasHint()) {
        bitField0_ |= 0x00000002;
        hint_ = other.hint_;
        onChanged();
      }
      if (other.hasValue()) {
        mergeValue(other.getValue());
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
      com.racerssquad.besthack2023.DTO.proto.Parameter parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.racerssquad.besthack2023.DTO.proto.Parameter) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object alias_ = "";
    /**
     * <pre>
     * Идентификатор параметра
     * </pre>
     *
     * <code>string alias = 1;</code>
     * @return The alias.
     */
    public java.lang.String getAlias() {
      java.lang.Object ref = alias_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        alias_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Идентификатор параметра
     * </pre>
     *
     * <code>string alias = 1;</code>
     * @return The bytes for alias.
     */
    public com.google.protobuf.ByteString
        getAliasBytes() {
      java.lang.Object ref = alias_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        alias_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Идентификатор параметра
     * </pre>
     *
     * <code>string alias = 1;</code>
     * @param value The alias to set.
     * @return This builder for chaining.
     */
    public Builder setAlias(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      alias_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Идентификатор параметра
     * </pre>
     *
     * <code>string alias = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAlias() {
      
      alias_ = getDefaultInstance().getAlias();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Идентификатор параметра
     * </pre>
     *
     * <code>string alias = 1;</code>
     * @param value The bytes for alias to set.
     * @return This builder for chaining.
     */
    public Builder setAliasBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      alias_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object caption_ = "";
    /**
     * <pre>
     * Заголовок параметра
     * </pre>
     *
     * <code>string caption = 2;</code>
     * @return Whether the caption field is set.
     */
    public boolean hasCaption() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Заголовок параметра
     * </pre>
     *
     * <code>string caption = 2;</code>
     * @return The caption.
     */
    public java.lang.String getCaption() {
      java.lang.Object ref = caption_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        caption_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Заголовок параметра
     * </pre>
     *
     * <code>string caption = 2;</code>
     * @return The bytes for caption.
     */
    public com.google.protobuf.ByteString
        getCaptionBytes() {
      java.lang.Object ref = caption_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        caption_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Заголовок параметра
     * </pre>
     *
     * <code>string caption = 2;</code>
     * @param value The caption to set.
     * @return This builder for chaining.
     */
    public Builder setCaption(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      caption_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Заголовок параметра
     * </pre>
     *
     * <code>string caption = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCaption() {
      bitField0_ = (bitField0_ & ~0x00000001);
      caption_ = getDefaultInstance().getCaption();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Заголовок параметра
     * </pre>
     *
     * <code>string caption = 2;</code>
     * @param value The bytes for caption to set.
     * @return This builder for chaining.
     */
    public Builder setCaptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      caption_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object hint_ = "";
    /**
     * <pre>
     * Подсказка
     * </pre>
     *
     * <code>string hint = 3;</code>
     * @return Whether the hint field is set.
     */
    public boolean hasHint() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Подсказка
     * </pre>
     *
     * <code>string hint = 3;</code>
     * @return The hint.
     */
    public java.lang.String getHint() {
      java.lang.Object ref = hint_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hint_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Подсказка
     * </pre>
     *
     * <code>string hint = 3;</code>
     * @return The bytes for hint.
     */
    public com.google.protobuf.ByteString
        getHintBytes() {
      java.lang.Object ref = hint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Подсказка
     * </pre>
     *
     * <code>string hint = 3;</code>
     * @param value The hint to set.
     * @return This builder for chaining.
     */
    public Builder setHint(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      hint_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Подсказка
     * </pre>
     *
     * <code>string hint = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHint() {
      bitField0_ = (bitField0_ & ~0x00000002);
      hint_ = getDefaultInstance().getHint();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Подсказка
     * </pre>
     *
     * <code>string hint = 3;</code>
     * @param value The bytes for hint to set.
     * @return This builder for chaining.
     */
    public Builder setHintBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      hint_ = value;
      onChanged();
      return this;
    }

    private com.racerssquad.besthack2023.DTO.proto.ValueRef value_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.racerssquad.besthack2023.DTO.proto.ValueRef, com.racerssquad.besthack2023.DTO.proto.ValueRef.Builder, com.racerssquad.besthack2023.DTO.proto.ValueRefOrBuilder> valueBuilder_;
    /**
     * <pre>
     * Значение
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.ValueRef value = 4;</code>
     * @return Whether the value field is set.
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Значение
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.ValueRef value = 4;</code>
     * @return The value.
     */
    public com.racerssquad.besthack2023.DTO.proto.ValueRef getValue() {
      if (valueBuilder_ == null) {
        return value_ == null ? com.racerssquad.besthack2023.DTO.proto.ValueRef.getDefaultInstance() : value_;
      } else {
        return valueBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Значение
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.ValueRef value = 4;</code>
     */
    public Builder setValue(com.racerssquad.besthack2023.DTO.proto.ValueRef value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
        onChanged();
      } else {
        valueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <pre>
     * Значение
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.ValueRef value = 4;</code>
     */
    public Builder setValue(
        com.racerssquad.besthack2023.DTO.proto.ValueRef.Builder builderForValue) {
      if (valueBuilder_ == null) {
        value_ = builderForValue.build();
        onChanged();
      } else {
        valueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <pre>
     * Значение
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.ValueRef value = 4;</code>
     */
    public Builder mergeValue(com.racerssquad.besthack2023.DTO.proto.ValueRef value) {
      if (valueBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
            value_ != null &&
            value_ != com.racerssquad.besthack2023.DTO.proto.ValueRef.getDefaultInstance()) {
          value_ =
            com.racerssquad.besthack2023.DTO.proto.ValueRef.newBuilder(value_).mergeFrom(value).buildPartial();
        } else {
          value_ = value;
        }
        onChanged();
      } else {
        valueBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <pre>
     * Значение
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.ValueRef value = 4;</code>
     */
    public Builder clearValue() {
      if (valueBuilder_ == null) {
        value_ = null;
        onChanged();
      } else {
        valueBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }
    /**
     * <pre>
     * Значение
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.ValueRef value = 4;</code>
     */
    public com.racerssquad.besthack2023.DTO.proto.ValueRef.Builder getValueBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getValueFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Значение
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.ValueRef value = 4;</code>
     */
    public com.racerssquad.besthack2023.DTO.proto.ValueRefOrBuilder getValueOrBuilder() {
      if (valueBuilder_ != null) {
        return valueBuilder_.getMessageOrBuilder();
      } else {
        return value_ == null ?
            com.racerssquad.besthack2023.DTO.proto.ValueRef.getDefaultInstance() : value_;
      }
    }
    /**
     * <pre>
     * Значение
     * </pre>
     *
     * <code>.com.racerssquad.besthack2023.DTO.proto.ValueRef value = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.racerssquad.besthack2023.DTO.proto.ValueRef, com.racerssquad.besthack2023.DTO.proto.ValueRef.Builder, com.racerssquad.besthack2023.DTO.proto.ValueRefOrBuilder> 
        getValueFieldBuilder() {
      if (valueBuilder_ == null) {
        valueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.racerssquad.besthack2023.DTO.proto.ValueRef, com.racerssquad.besthack2023.DTO.proto.ValueRef.Builder, com.racerssquad.besthack2023.DTO.proto.ValueRefOrBuilder>(
                getValue(),
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      return valueBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.racerssquad.besthack2023.DTO.proto.Parameter)
  }

  // @@protoc_insertion_point(class_scope:com.racerssquad.besthack2023.DTO.proto.Parameter)
  private static final com.racerssquad.besthack2023.DTO.proto.Parameter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.racerssquad.besthack2023.DTO.proto.Parameter();
  }

  public static com.racerssquad.besthack2023.DTO.proto.Parameter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Parameter>
      PARSER = new com.google.protobuf.AbstractParser<Parameter>() {
    @java.lang.Override
    public Parameter parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Parameter(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Parameter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Parameter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.racerssquad.besthack2023.DTO.proto.Parameter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

