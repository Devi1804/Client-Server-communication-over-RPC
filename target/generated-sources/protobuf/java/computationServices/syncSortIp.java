// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SyncComputation.proto

package computationServices;

/**
 * Protobuf type {@code computationServices.syncSortIp}
 */
public final class syncSortIp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:computationServices.syncSortIp)
    syncSortIpOrBuilder {
private static final long serialVersionUID = 0L;
  // Use syncSortIp.newBuilder() to construct.
  private syncSortIp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private syncSortIp() {
    arr_ = emptyIntList();
    sortReqId_ = "";
    msg_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new syncSortIp();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private syncSortIp(
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
          case 8: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              arr_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            arr_.addInt(input.readInt32());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              arr_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              arr_.addInt(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            sortReqId_ = s;
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            msg_ = s;
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        arr_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return computationServices.part3Sync.internal_static_computationServices_syncSortIp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return computationServices.part3Sync.internal_static_computationServices_syncSortIp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            computationServices.syncSortIp.class, computationServices.syncSortIp.Builder.class);
  }

  public static final int ARR_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.IntList arr_;
  /**
   * <code>repeated int32 arr = 1;</code>
   * @return A list containing the arr.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getArrList() {
    return arr_;
  }
  /**
   * <code>repeated int32 arr = 1;</code>
   * @return The count of arr.
   */
  public int getArrCount() {
    return arr_.size();
  }
  /**
   * <code>repeated int32 arr = 1;</code>
   * @param index The index of the element to return.
   * @return The arr at the given index.
   */
  public int getArr(int index) {
    return arr_.getInt(index);
  }
  private int arrMemoizedSerializedSize = -1;

  public static final int SORTREQID_FIELD_NUMBER = 6;
  private volatile java.lang.Object sortReqId_;
  /**
   * <code>string sortReqId = 6;</code>
   * @return The sortReqId.
   */
  @java.lang.Override
  public java.lang.String getSortReqId() {
    java.lang.Object ref = sortReqId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sortReqId_ = s;
      return s;
    }
  }
  /**
   * <code>string sortReqId = 6;</code>
   * @return The bytes for sortReqId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSortReqIdBytes() {
    java.lang.Object ref = sortReqId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sortReqId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MSG_FIELD_NUMBER = 7;
  private volatile java.lang.Object msg_;
  /**
   * <code>string msg = 7;</code>
   * @return The msg.
   */
  @java.lang.Override
  public java.lang.String getMsg() {
    java.lang.Object ref = msg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      msg_ = s;
      return s;
    }
  }
  /**
   * <code>string msg = 7;</code>
   * @return The bytes for msg.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMsgBytes() {
    java.lang.Object ref = msg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      msg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    getSerializedSize();
    if (getArrList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(arrMemoizedSerializedSize);
    }
    for (int i = 0; i < arr_.size(); i++) {
      output.writeInt32NoTag(arr_.getInt(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sortReqId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, sortReqId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(msg_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, msg_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < arr_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(arr_.getInt(i));
      }
      size += dataSize;
      if (!getArrList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      arrMemoizedSerializedSize = dataSize;
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sortReqId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, sortReqId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(msg_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, msg_);
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
    if (!(obj instanceof computationServices.syncSortIp)) {
      return super.equals(obj);
    }
    computationServices.syncSortIp other = (computationServices.syncSortIp) obj;

    if (!getArrList()
        .equals(other.getArrList())) return false;
    if (!getSortReqId()
        .equals(other.getSortReqId())) return false;
    if (!getMsg()
        .equals(other.getMsg())) return false;
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
    if (getArrCount() > 0) {
      hash = (37 * hash) + ARR_FIELD_NUMBER;
      hash = (53 * hash) + getArrList().hashCode();
    }
    hash = (37 * hash) + SORTREQID_FIELD_NUMBER;
    hash = (53 * hash) + getSortReqId().hashCode();
    hash = (37 * hash) + MSG_FIELD_NUMBER;
    hash = (53 * hash) + getMsg().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static computationServices.syncSortIp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static computationServices.syncSortIp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static computationServices.syncSortIp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static computationServices.syncSortIp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static computationServices.syncSortIp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static computationServices.syncSortIp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static computationServices.syncSortIp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static computationServices.syncSortIp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static computationServices.syncSortIp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static computationServices.syncSortIp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static computationServices.syncSortIp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static computationServices.syncSortIp parseFrom(
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
  public static Builder newBuilder(computationServices.syncSortIp prototype) {
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
   * Protobuf type {@code computationServices.syncSortIp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:computationServices.syncSortIp)
      computationServices.syncSortIpOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return computationServices.part3Sync.internal_static_computationServices_syncSortIp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return computationServices.part3Sync.internal_static_computationServices_syncSortIp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              computationServices.syncSortIp.class, computationServices.syncSortIp.Builder.class);
    }

    // Construct using computationServices.syncSortIp.newBuilder()
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
      arr_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      sortReqId_ = "";

      msg_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return computationServices.part3Sync.internal_static_computationServices_syncSortIp_descriptor;
    }

    @java.lang.Override
    public computationServices.syncSortIp getDefaultInstanceForType() {
      return computationServices.syncSortIp.getDefaultInstance();
    }

    @java.lang.Override
    public computationServices.syncSortIp build() {
      computationServices.syncSortIp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public computationServices.syncSortIp buildPartial() {
      computationServices.syncSortIp result = new computationServices.syncSortIp(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        arr_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.arr_ = arr_;
      result.sortReqId_ = sortReqId_;
      result.msg_ = msg_;
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
      if (other instanceof computationServices.syncSortIp) {
        return mergeFrom((computationServices.syncSortIp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(computationServices.syncSortIp other) {
      if (other == computationServices.syncSortIp.getDefaultInstance()) return this;
      if (!other.arr_.isEmpty()) {
        if (arr_.isEmpty()) {
          arr_ = other.arr_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureArrIsMutable();
          arr_.addAll(other.arr_);
        }
        onChanged();
      }
      if (!other.getSortReqId().isEmpty()) {
        sortReqId_ = other.sortReqId_;
        onChanged();
      }
      if (!other.getMsg().isEmpty()) {
        msg_ = other.msg_;
        onChanged();
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
      computationServices.syncSortIp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (computationServices.syncSortIp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.IntList arr_ = emptyIntList();
    private void ensureArrIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        arr_ = mutableCopy(arr_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 arr = 1;</code>
     * @return A list containing the arr.
     */
    public java.util.List<java.lang.Integer>
        getArrList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(arr_) : arr_;
    }
    /**
     * <code>repeated int32 arr = 1;</code>
     * @return The count of arr.
     */
    public int getArrCount() {
      return arr_.size();
    }
    /**
     * <code>repeated int32 arr = 1;</code>
     * @param index The index of the element to return.
     * @return The arr at the given index.
     */
    public int getArr(int index) {
      return arr_.getInt(index);
    }
    /**
     * <code>repeated int32 arr = 1;</code>
     * @param index The index to set the value at.
     * @param value The arr to set.
     * @return This builder for chaining.
     */
    public Builder setArr(
        int index, int value) {
      ensureArrIsMutable();
      arr_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 arr = 1;</code>
     * @param value The arr to add.
     * @return This builder for chaining.
     */
    public Builder addArr(int value) {
      ensureArrIsMutable();
      arr_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 arr = 1;</code>
     * @param values The arr to add.
     * @return This builder for chaining.
     */
    public Builder addAllArr(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureArrIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, arr_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 arr = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearArr() {
      arr_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private java.lang.Object sortReqId_ = "";
    /**
     * <code>string sortReqId = 6;</code>
     * @return The sortReqId.
     */
    public java.lang.String getSortReqId() {
      java.lang.Object ref = sortReqId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sortReqId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sortReqId = 6;</code>
     * @return The bytes for sortReqId.
     */
    public com.google.protobuf.ByteString
        getSortReqIdBytes() {
      java.lang.Object ref = sortReqId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sortReqId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sortReqId = 6;</code>
     * @param value The sortReqId to set.
     * @return This builder for chaining.
     */
    public Builder setSortReqId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sortReqId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sortReqId = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearSortReqId() {
      
      sortReqId_ = getDefaultInstance().getSortReqId();
      onChanged();
      return this;
    }
    /**
     * <code>string sortReqId = 6;</code>
     * @param value The bytes for sortReqId to set.
     * @return This builder for chaining.
     */
    public Builder setSortReqIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sortReqId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object msg_ = "";
    /**
     * <code>string msg = 7;</code>
     * @return The msg.
     */
    public java.lang.String getMsg() {
      java.lang.Object ref = msg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msg_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string msg = 7;</code>
     * @return The bytes for msg.
     */
    public com.google.protobuf.ByteString
        getMsgBytes() {
      java.lang.Object ref = msg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string msg = 7;</code>
     * @param value The msg to set.
     * @return This builder for chaining.
     */
    public Builder setMsg(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      msg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string msg = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearMsg() {
      
      msg_ = getDefaultInstance().getMsg();
      onChanged();
      return this;
    }
    /**
     * <code>string msg = 7;</code>
     * @param value The bytes for msg to set.
     * @return This builder for chaining.
     */
    public Builder setMsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      msg_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:computationServices.syncSortIp)
  }

  // @@protoc_insertion_point(class_scope:computationServices.syncSortIp)
  private static final computationServices.syncSortIp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new computationServices.syncSortIp();
  }

  public static computationServices.syncSortIp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<syncSortIp>
      PARSER = new com.google.protobuf.AbstractParser<syncSortIp>() {
    @java.lang.Override
    public syncSortIp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new syncSortIp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<syncSortIp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<syncSortIp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public computationServices.syncSortIp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

