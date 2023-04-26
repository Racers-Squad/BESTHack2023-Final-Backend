// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OwnCommand.proto

package com.racerssquad.besthack2023.DTO.proto;

public interface OwnCommandOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.racerssquad.besthack2023.DTO.proto.OwnCommand)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Идентификатор команды
   * </pre>
   *
   * <code>string alias = 1;</code>
   * @return The alias.
   */
  java.lang.String getAlias();
  /**
   * <pre>
   * Идентификатор команды
   * </pre>
   *
   * <code>string alias = 1;</code>
   * @return The bytes for alias.
   */
  com.google.protobuf.ByteString
      getAliasBytes();

  /**
   * <pre>
   * Заголовок команды
   * </pre>
   *
   * <code>string caption = 2;</code>
   * @return Whether the caption field is set.
   */
  boolean hasCaption();
  /**
   * <pre>
   * Заголовок команды
   * </pre>
   *
   * <code>string caption = 2;</code>
   * @return The caption.
   */
  java.lang.String getCaption();
  /**
   * <pre>
   * Заголовок команды
   * </pre>
   *
   * <code>string caption = 2;</code>
   * @return The bytes for caption.
   */
  com.google.protobuf.ByteString
      getCaptionBytes();

  /**
   * <pre>
   * Описание команды
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * Описание команды
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Описание команды
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Список параметров для команды
   * </pre>
   *
   * <code>repeated .com.racerssquad.besthack2023.DTO.proto.Parameter parameters = 4;</code>
   */
  java.util.List<com.racerssquad.besthack2023.DTO.proto.Parameter> 
      getParametersList();
  /**
   * <pre>
   * Список параметров для команды
   * </pre>
   *
   * <code>repeated .com.racerssquad.besthack2023.DTO.proto.Parameter parameters = 4;</code>
   */
  com.racerssquad.besthack2023.DTO.proto.Parameter getParameters(int index);
  /**
   * <pre>
   * Список параметров для команды
   * </pre>
   *
   * <code>repeated .com.racerssquad.besthack2023.DTO.proto.Parameter parameters = 4;</code>
   */
  int getParametersCount();
  /**
   * <pre>
   * Список параметров для команды
   * </pre>
   *
   * <code>repeated .com.racerssquad.besthack2023.DTO.proto.Parameter parameters = 4;</code>
   */
  java.util.List<? extends com.racerssquad.besthack2023.DTO.proto.ParameterOrBuilder> 
      getParametersOrBuilderList();
  /**
   * <pre>
   * Список параметров для команды
   * </pre>
   *
   * <code>repeated .com.racerssquad.besthack2023.DTO.proto.Parameter parameters = 4;</code>
   */
  com.racerssquad.besthack2023.DTO.proto.ParameterOrBuilder getParametersOrBuilder(
      int index);
}
