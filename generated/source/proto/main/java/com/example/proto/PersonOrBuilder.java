// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AddressBook.proto

package com.example.proto;

public interface PersonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Person)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string name = 1;</code>
   */
  boolean hasName();
  /**
   * <code>optional string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional int32 id = 2;</code>
   */
  boolean hasId();
  /**
   * <code>optional int32 id = 2;</code>
   */
  int getId();

  /**
   * <code>optional string email = 3;</code>
   */
  boolean hasEmail();
  /**
   * <code>optional string email = 3;</code>
   */
  java.lang.String getEmail();
  /**
   * <code>optional string email = 3;</code>
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>repeated .Person.PhoneNumber phones = 4;</code>
   */
  java.util.List<com.example.proto.Person.PhoneNumber> 
      getPhonesList();
  /**
   * <code>repeated .Person.PhoneNumber phones = 4;</code>
   */
  com.example.proto.Person.PhoneNumber getPhones(int index);
  /**
   * <code>repeated .Person.PhoneNumber phones = 4;</code>
   */
  int getPhonesCount();
  /**
   * <code>repeated .Person.PhoneNumber phones = 4;</code>
   */
  java.util.List<? extends com.example.proto.Person.PhoneNumberOrBuilder> 
      getPhonesOrBuilderList();
  /**
   * <code>repeated .Person.PhoneNumber phones = 4;</code>
   */
  com.example.proto.Person.PhoneNumberOrBuilder getPhonesOrBuilder(
      int index);
}
