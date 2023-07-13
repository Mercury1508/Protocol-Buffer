// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AddressBook.proto

package com.example.proto;

/**
 * Protobuf type {@code AddressBook}
 */
public  final class AddressBook extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AddressBook)
    AddressBookOrBuilder {
  // Use AddressBook.newBuilder() to construct.
  private AddressBook(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddressBook() {
    people_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddressBook(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
          default: {
            if (!parseUnknownField(input, unknownFields,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              people_ = new java.util.ArrayList<com.example.proto.Person>();
              mutable_bitField0_ |= 0x00000001;
            }
            people_.add(
                input.readMessage(com.example.proto.Person.PARSER, extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        people_ = java.util.Collections.unmodifiableList(people_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.example.proto.AddressBookProtos.internal_static_AddressBook_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.example.proto.AddressBookProtos.internal_static_AddressBook_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.proto.AddressBook.class, com.example.proto.AddressBook.Builder.class);
  }

  public static final int PEOPLE_FIELD_NUMBER = 1;
  private java.util.List<com.example.proto.Person> people_;
  /**
   * <code>repeated .Person people = 1;</code>
   */
  public java.util.List<com.example.proto.Person> getPeopleList() {
    return people_;
  }
  /**
   * <code>repeated .Person people = 1;</code>
   */
  public java.util.List<? extends com.example.proto.PersonOrBuilder> 
      getPeopleOrBuilderList() {
    return people_;
  }
  /**
   * <code>repeated .Person people = 1;</code>
   */
  public int getPeopleCount() {
    return people_.size();
  }
  /**
   * <code>repeated .Person people = 1;</code>
   */
  public com.example.proto.Person getPeople(int index) {
    return people_.get(index);
  }
  /**
   * <code>repeated .Person people = 1;</code>
   */
  public com.example.proto.PersonOrBuilder getPeopleOrBuilder(
      int index) {
    return people_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < people_.size(); i++) {
      output.writeMessage(1, people_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < people_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, people_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.example.proto.AddressBook)) {
      return super.equals(obj);
    }
    com.example.proto.AddressBook other = (com.example.proto.AddressBook) obj;

    boolean result = true;
    result = result && getPeopleList()
        .equals(other.getPeopleList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getPeopleCount() > 0) {
      hash = (37 * hash) + PEOPLE_FIELD_NUMBER;
      hash = (53 * hash) + getPeopleList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.proto.AddressBook parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.proto.AddressBook parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.proto.AddressBook parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.proto.AddressBook parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.proto.AddressBook parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.proto.AddressBook parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.proto.AddressBook parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.proto.AddressBook parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.proto.AddressBook parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.proto.AddressBook parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.example.proto.AddressBook prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code AddressBook}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AddressBook)
      com.example.proto.AddressBookOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.example.proto.AddressBookProtos.internal_static_AddressBook_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.example.proto.AddressBookProtos.internal_static_AddressBook_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.proto.AddressBook.class, com.example.proto.AddressBook.Builder.class);
    }

    // Construct using com.example.proto.AddressBook.newBuilder()
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
        getPeopleFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (peopleBuilder_ == null) {
        people_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        peopleBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.example.proto.AddressBookProtos.internal_static_AddressBook_descriptor;
    }

    public com.example.proto.AddressBook getDefaultInstanceForType() {
      return com.example.proto.AddressBook.getDefaultInstance();
    }

    public com.example.proto.AddressBook build() {
      com.example.proto.AddressBook result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.example.proto.AddressBook buildPartial() {
      com.example.proto.AddressBook result = new com.example.proto.AddressBook(this);
      int from_bitField0_ = bitField0_;
      if (peopleBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          people_ = java.util.Collections.unmodifiableList(people_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.people_ = people_;
      } else {
        result.people_ = peopleBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.example.proto.AddressBook) {
        return mergeFrom((com.example.proto.AddressBook)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.proto.AddressBook other) {
      if (other == com.example.proto.AddressBook.getDefaultInstance()) return this;
      if (peopleBuilder_ == null) {
        if (!other.people_.isEmpty()) {
          if (people_.isEmpty()) {
            people_ = other.people_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePeopleIsMutable();
            people_.addAll(other.people_);
          }
          onChanged();
        }
      } else {
        if (!other.people_.isEmpty()) {
          if (peopleBuilder_.isEmpty()) {
            peopleBuilder_.dispose();
            peopleBuilder_ = null;
            people_ = other.people_;
            bitField0_ = (bitField0_ & ~0x00000001);
            peopleBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPeopleFieldBuilder() : null;
          } else {
            peopleBuilder_.addAllMessages(other.people_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.example.proto.AddressBook parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.proto.AddressBook) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.example.proto.Person> people_ =
      java.util.Collections.emptyList();
    private void ensurePeopleIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        people_ = new java.util.ArrayList<com.example.proto.Person>(people_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.proto.Person, com.example.proto.Person.Builder, com.example.proto.PersonOrBuilder> peopleBuilder_;

    /**
     * <code>repeated .Person people = 1;</code>
     */
    public java.util.List<com.example.proto.Person> getPeopleList() {
      if (peopleBuilder_ == null) {
        return java.util.Collections.unmodifiableList(people_);
      } else {
        return peopleBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Person people = 1;</code>
     */
    public int getPeopleCount() {
      if (peopleBuilder_ == null) {
        return people_.size();
      } else {
        return peopleBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Person people = 1;</code>
     */
    public com.example.proto.Person getPeople(int index) {
      if (peopleBuilder_ == null) {
        return people_.get(index);
      } else {
        return peopleBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Person people = 1;</code>
     */
    public Builder setPeople(
        int index, com.example.proto.Person value) {
      if (peopleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePeopleIsMutable();
        people_.set(index, value);
        onChanged();
      } else {
        peopleBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Person people = 1;</code>
     */
    public Builder setPeople(
        int index, com.example.proto.Person.Builder builderForValue) {
      if (peopleBuilder_ == null) {
        ensurePeopleIsMutable();
        people_.set(index, builderForValue.build());
        onChanged();
      } else {
        peopleBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Person people = 1;</code>
     */
    public Builder addPeople(com.example.proto.Person value) {
      if (peopleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePeopleIsMutable();
        people_.add(value);
        onChanged();
      } else {
        peopleBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Person people = 1;</code>
     */
    public Builder addPeople(
        int index, com.example.proto.Person value) {
      if (peopleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePeopleIsMutable();
        people_.add(index, value);
        onChanged();
      } else {
        peopleBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Person people = 1;</code>
     */
    public Builder addPeople(
        com.example.proto.Person.Builder builderForValue) {
      if (peopleBuilder_ == null) {
        ensurePeopleIsMutable();
        people_.add(builderForValue.build());
        onChanged();
      } else {
        peopleBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Person people = 1;</code>
     */
    public Builder addPeople(
        int index, com.example.proto.Person.Builder builderForValue) {
      if (peopleBuilder_ == null) {
        ensurePeopleIsMutable();
        people_.add(index, builderForValue.build());
        onChanged();
      } else {
        peopleBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Person people = 1;</code>
     */
    public Builder addAllPeople(
        java.lang.Iterable<? extends com.example.proto.Person> values) {
      if (peopleBuilder_ == null) {
        ensurePeopleIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, people_);
        onChanged();
      } else {
        peopleBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Person people = 1;</code>
     */
    public Builder clearPeople() {
      if (peopleBuilder_ == null) {
        people_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        peopleBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Person people = 1;</code>
     */
    public Builder removePeople(int index) {
      if (peopleBuilder_ == null) {
        ensurePeopleIsMutable();
        people_.remove(index);
        onChanged();
      } else {
        peopleBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Person people = 1;</code>
     */
    public com.example.proto.Person.Builder getPeopleBuilder(
        int index) {
      return getPeopleFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Person people = 1;</code>
     */
    public com.example.proto.PersonOrBuilder getPeopleOrBuilder(
        int index) {
      if (peopleBuilder_ == null) {
        return people_.get(index);  } else {
        return peopleBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Person people = 1;</code>
     */
    public java.util.List<? extends com.example.proto.PersonOrBuilder> 
         getPeopleOrBuilderList() {
      if (peopleBuilder_ != null) {
        return peopleBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(people_);
      }
    }
    /**
     * <code>repeated .Person people = 1;</code>
     */
    public com.example.proto.Person.Builder addPeopleBuilder() {
      return getPeopleFieldBuilder().addBuilder(
          com.example.proto.Person.getDefaultInstance());
    }
    /**
     * <code>repeated .Person people = 1;</code>
     */
    public com.example.proto.Person.Builder addPeopleBuilder(
        int index) {
      return getPeopleFieldBuilder().addBuilder(
          index, com.example.proto.Person.getDefaultInstance());
    }
    /**
     * <code>repeated .Person people = 1;</code>
     */
    public java.util.List<com.example.proto.Person.Builder> 
         getPeopleBuilderList() {
      return getPeopleFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.example.proto.Person, com.example.proto.Person.Builder, com.example.proto.PersonOrBuilder> 
        getPeopleFieldBuilder() {
      if (peopleBuilder_ == null) {
        peopleBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.example.proto.Person, com.example.proto.Person.Builder, com.example.proto.PersonOrBuilder>(
                people_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        people_ = null;
      }
      return peopleBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:AddressBook)
  }

  // @@protoc_insertion_point(class_scope:AddressBook)
  private static final com.example.proto.AddressBook DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.proto.AddressBook();
  }

  public static com.example.proto.AddressBook getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<AddressBook>
      PARSER = new com.google.protobuf.AbstractParser<AddressBook>() {
    public AddressBook parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AddressBook(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddressBook> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddressBook> getParserForType() {
    return PARSER;
  }

  public com.example.proto.AddressBook getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

