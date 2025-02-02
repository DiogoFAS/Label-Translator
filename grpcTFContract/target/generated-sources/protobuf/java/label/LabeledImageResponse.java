// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FunctionalServiceContract.proto

package label;

/**
 * Protobuf type {@code label.LabeledImageResponse}
 */
public final class LabeledImageResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:label.LabeledImageResponse)
    LabeledImageResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LabeledImageResponse.newBuilder() to construct.
  private LabeledImageResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LabeledImageResponse() {
    labels_ = java.util.Collections.emptyList();
    processDate_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LabeledImageResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return label.FunctionalServiceContract.internal_static_label_LabeledImageResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return label.FunctionalServiceContract.internal_static_label_LabeledImageResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            label.LabeledImageResponse.class, label.LabeledImageResponse.Builder.class);
  }

  public static final int REQUEST_ID_FIELD_NUMBER = 1;
  private label.RequestId requestId_;
  /**
   * <code>.label.RequestId request_id = 1;</code>
   * @return Whether the requestId field is set.
   */
  @java.lang.Override
  public boolean hasRequestId() {
    return requestId_ != null;
  }
  /**
   * <code>.label.RequestId request_id = 1;</code>
   * @return The requestId.
   */
  @java.lang.Override
  public label.RequestId getRequestId() {
    return requestId_ == null ? label.RequestId.getDefaultInstance() : requestId_;
  }
  /**
   * <code>.label.RequestId request_id = 1;</code>
   */
  @java.lang.Override
  public label.RequestIdOrBuilder getRequestIdOrBuilder() {
    return getRequestId();
  }

  public static final int LABELS_FIELD_NUMBER = 2;
  private java.util.List<label.LabelResponse> labels_;
  /**
   * <code>repeated .label.LabelResponse labels = 2;</code>
   */
  @java.lang.Override
  public java.util.List<label.LabelResponse> getLabelsList() {
    return labels_;
  }
  /**
   * <code>repeated .label.LabelResponse labels = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends label.LabelResponseOrBuilder> 
      getLabelsOrBuilderList() {
    return labels_;
  }
  /**
   * <code>repeated .label.LabelResponse labels = 2;</code>
   */
  @java.lang.Override
  public int getLabelsCount() {
    return labels_.size();
  }
  /**
   * <code>repeated .label.LabelResponse labels = 2;</code>
   */
  @java.lang.Override
  public label.LabelResponse getLabels(int index) {
    return labels_.get(index);
  }
  /**
   * <code>repeated .label.LabelResponse labels = 2;</code>
   */
  @java.lang.Override
  public label.LabelResponseOrBuilder getLabelsOrBuilder(
      int index) {
    return labels_.get(index);
  }

  public static final int PROCESS_DATE_FIELD_NUMBER = 3;
  private volatile java.lang.Object processDate_;
  /**
   * <code>string process_date = 3;</code>
   * @return The processDate.
   */
  @java.lang.Override
  public java.lang.String getProcessDate() {
    java.lang.Object ref = processDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      processDate_ = s;
      return s;
    }
  }
  /**
   * <code>string process_date = 3;</code>
   * @return The bytes for processDate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProcessDateBytes() {
    java.lang.Object ref = processDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      processDate_ = b;
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
    if (requestId_ != null) {
      output.writeMessage(1, getRequestId());
    }
    for (int i = 0; i < labels_.size(); i++) {
      output.writeMessage(2, labels_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(processDate_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, processDate_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (requestId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRequestId());
    }
    for (int i = 0; i < labels_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, labels_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(processDate_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, processDate_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof label.LabeledImageResponse)) {
      return super.equals(obj);
    }
    label.LabeledImageResponse other = (label.LabeledImageResponse) obj;

    if (hasRequestId() != other.hasRequestId()) return false;
    if (hasRequestId()) {
      if (!getRequestId()
          .equals(other.getRequestId())) return false;
    }
    if (!getLabelsList()
        .equals(other.getLabelsList())) return false;
    if (!getProcessDate()
        .equals(other.getProcessDate())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasRequestId()) {
      hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getRequestId().hashCode();
    }
    if (getLabelsCount() > 0) {
      hash = (37 * hash) + LABELS_FIELD_NUMBER;
      hash = (53 * hash) + getLabelsList().hashCode();
    }
    hash = (37 * hash) + PROCESS_DATE_FIELD_NUMBER;
    hash = (53 * hash) + getProcessDate().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static label.LabeledImageResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static label.LabeledImageResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static label.LabeledImageResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static label.LabeledImageResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static label.LabeledImageResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static label.LabeledImageResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static label.LabeledImageResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static label.LabeledImageResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static label.LabeledImageResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static label.LabeledImageResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static label.LabeledImageResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static label.LabeledImageResponse parseFrom(
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
  public static Builder newBuilder(label.LabeledImageResponse prototype) {
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
   * Protobuf type {@code label.LabeledImageResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:label.LabeledImageResponse)
      label.LabeledImageResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return label.FunctionalServiceContract.internal_static_label_LabeledImageResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return label.FunctionalServiceContract.internal_static_label_LabeledImageResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              label.LabeledImageResponse.class, label.LabeledImageResponse.Builder.class);
    }

    // Construct using label.LabeledImageResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (requestIdBuilder_ == null) {
        requestId_ = null;
      } else {
        requestId_ = null;
        requestIdBuilder_ = null;
      }
      if (labelsBuilder_ == null) {
        labels_ = java.util.Collections.emptyList();
      } else {
        labels_ = null;
        labelsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      processDate_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return label.FunctionalServiceContract.internal_static_label_LabeledImageResponse_descriptor;
    }

    @java.lang.Override
    public label.LabeledImageResponse getDefaultInstanceForType() {
      return label.LabeledImageResponse.getDefaultInstance();
    }

    @java.lang.Override
    public label.LabeledImageResponse build() {
      label.LabeledImageResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public label.LabeledImageResponse buildPartial() {
      label.LabeledImageResponse result = new label.LabeledImageResponse(this);
      int from_bitField0_ = bitField0_;
      if (requestIdBuilder_ == null) {
        result.requestId_ = requestId_;
      } else {
        result.requestId_ = requestIdBuilder_.build();
      }
      if (labelsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          labels_ = java.util.Collections.unmodifiableList(labels_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.labels_ = labels_;
      } else {
        result.labels_ = labelsBuilder_.build();
      }
      result.processDate_ = processDate_;
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
      if (other instanceof label.LabeledImageResponse) {
        return mergeFrom((label.LabeledImageResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(label.LabeledImageResponse other) {
      if (other == label.LabeledImageResponse.getDefaultInstance()) return this;
      if (other.hasRequestId()) {
        mergeRequestId(other.getRequestId());
      }
      if (labelsBuilder_ == null) {
        if (!other.labels_.isEmpty()) {
          if (labels_.isEmpty()) {
            labels_ = other.labels_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLabelsIsMutable();
            labels_.addAll(other.labels_);
          }
          onChanged();
        }
      } else {
        if (!other.labels_.isEmpty()) {
          if (labelsBuilder_.isEmpty()) {
            labelsBuilder_.dispose();
            labelsBuilder_ = null;
            labels_ = other.labels_;
            bitField0_ = (bitField0_ & ~0x00000001);
            labelsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLabelsFieldBuilder() : null;
          } else {
            labelsBuilder_.addAllMessages(other.labels_);
          }
        }
      }
      if (!other.getProcessDate().isEmpty()) {
        processDate_ = other.processDate_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getRequestIdFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            case 18: {
              label.LabelResponse m =
                  input.readMessage(
                      label.LabelResponse.parser(),
                      extensionRegistry);
              if (labelsBuilder_ == null) {
                ensureLabelsIsMutable();
                labels_.add(m);
              } else {
                labelsBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 26: {
              processDate_ = input.readStringRequireUtf8();

              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private label.RequestId requestId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        label.RequestId, label.RequestId.Builder, label.RequestIdOrBuilder> requestIdBuilder_;
    /**
     * <code>.label.RequestId request_id = 1;</code>
     * @return Whether the requestId field is set.
     */
    public boolean hasRequestId() {
      return requestIdBuilder_ != null || requestId_ != null;
    }
    /**
     * <code>.label.RequestId request_id = 1;</code>
     * @return The requestId.
     */
    public label.RequestId getRequestId() {
      if (requestIdBuilder_ == null) {
        return requestId_ == null ? label.RequestId.getDefaultInstance() : requestId_;
      } else {
        return requestIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.label.RequestId request_id = 1;</code>
     */
    public Builder setRequestId(label.RequestId value) {
      if (requestIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        requestId_ = value;
        onChanged();
      } else {
        requestIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.label.RequestId request_id = 1;</code>
     */
    public Builder setRequestId(
        label.RequestId.Builder builderForValue) {
      if (requestIdBuilder_ == null) {
        requestId_ = builderForValue.build();
        onChanged();
      } else {
        requestIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.label.RequestId request_id = 1;</code>
     */
    public Builder mergeRequestId(label.RequestId value) {
      if (requestIdBuilder_ == null) {
        if (requestId_ != null) {
          requestId_ =
            label.RequestId.newBuilder(requestId_).mergeFrom(value).buildPartial();
        } else {
          requestId_ = value;
        }
        onChanged();
      } else {
        requestIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.label.RequestId request_id = 1;</code>
     */
    public Builder clearRequestId() {
      if (requestIdBuilder_ == null) {
        requestId_ = null;
        onChanged();
      } else {
        requestId_ = null;
        requestIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.label.RequestId request_id = 1;</code>
     */
    public label.RequestId.Builder getRequestIdBuilder() {
      
      onChanged();
      return getRequestIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.label.RequestId request_id = 1;</code>
     */
    public label.RequestIdOrBuilder getRequestIdOrBuilder() {
      if (requestIdBuilder_ != null) {
        return requestIdBuilder_.getMessageOrBuilder();
      } else {
        return requestId_ == null ?
            label.RequestId.getDefaultInstance() : requestId_;
      }
    }
    /**
     * <code>.label.RequestId request_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        label.RequestId, label.RequestId.Builder, label.RequestIdOrBuilder> 
        getRequestIdFieldBuilder() {
      if (requestIdBuilder_ == null) {
        requestIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            label.RequestId, label.RequestId.Builder, label.RequestIdOrBuilder>(
                getRequestId(),
                getParentForChildren(),
                isClean());
        requestId_ = null;
      }
      return requestIdBuilder_;
    }

    private java.util.List<label.LabelResponse> labels_ =
      java.util.Collections.emptyList();
    private void ensureLabelsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        labels_ = new java.util.ArrayList<label.LabelResponse>(labels_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        label.LabelResponse, label.LabelResponse.Builder, label.LabelResponseOrBuilder> labelsBuilder_;

    /**
     * <code>repeated .label.LabelResponse labels = 2;</code>
     */
    public java.util.List<label.LabelResponse> getLabelsList() {
      if (labelsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(labels_);
      } else {
        return labelsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .label.LabelResponse labels = 2;</code>
     */
    public int getLabelsCount() {
      if (labelsBuilder_ == null) {
        return labels_.size();
      } else {
        return labelsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .label.LabelResponse labels = 2;</code>
     */
    public label.LabelResponse getLabels(int index) {
      if (labelsBuilder_ == null) {
        return labels_.get(index);
      } else {
        return labelsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .label.LabelResponse labels = 2;</code>
     */
    public Builder setLabels(
        int index, label.LabelResponse value) {
      if (labelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLabelsIsMutable();
        labels_.set(index, value);
        onChanged();
      } else {
        labelsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .label.LabelResponse labels = 2;</code>
     */
    public Builder setLabels(
        int index, label.LabelResponse.Builder builderForValue) {
      if (labelsBuilder_ == null) {
        ensureLabelsIsMutable();
        labels_.set(index, builderForValue.build());
        onChanged();
      } else {
        labelsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .label.LabelResponse labels = 2;</code>
     */
    public Builder addLabels(label.LabelResponse value) {
      if (labelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLabelsIsMutable();
        labels_.add(value);
        onChanged();
      } else {
        labelsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .label.LabelResponse labels = 2;</code>
     */
    public Builder addLabels(
        int index, label.LabelResponse value) {
      if (labelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLabelsIsMutable();
        labels_.add(index, value);
        onChanged();
      } else {
        labelsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .label.LabelResponse labels = 2;</code>
     */
    public Builder addLabels(
        label.LabelResponse.Builder builderForValue) {
      if (labelsBuilder_ == null) {
        ensureLabelsIsMutable();
        labels_.add(builderForValue.build());
        onChanged();
      } else {
        labelsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .label.LabelResponse labels = 2;</code>
     */
    public Builder addLabels(
        int index, label.LabelResponse.Builder builderForValue) {
      if (labelsBuilder_ == null) {
        ensureLabelsIsMutable();
        labels_.add(index, builderForValue.build());
        onChanged();
      } else {
        labelsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .label.LabelResponse labels = 2;</code>
     */
    public Builder addAllLabels(
        java.lang.Iterable<? extends label.LabelResponse> values) {
      if (labelsBuilder_ == null) {
        ensureLabelsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, labels_);
        onChanged();
      } else {
        labelsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .label.LabelResponse labels = 2;</code>
     */
    public Builder clearLabels() {
      if (labelsBuilder_ == null) {
        labels_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        labelsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .label.LabelResponse labels = 2;</code>
     */
    public Builder removeLabels(int index) {
      if (labelsBuilder_ == null) {
        ensureLabelsIsMutable();
        labels_.remove(index);
        onChanged();
      } else {
        labelsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .label.LabelResponse labels = 2;</code>
     */
    public label.LabelResponse.Builder getLabelsBuilder(
        int index) {
      return getLabelsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .label.LabelResponse labels = 2;</code>
     */
    public label.LabelResponseOrBuilder getLabelsOrBuilder(
        int index) {
      if (labelsBuilder_ == null) {
        return labels_.get(index);  } else {
        return labelsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .label.LabelResponse labels = 2;</code>
     */
    public java.util.List<? extends label.LabelResponseOrBuilder> 
         getLabelsOrBuilderList() {
      if (labelsBuilder_ != null) {
        return labelsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(labels_);
      }
    }
    /**
     * <code>repeated .label.LabelResponse labels = 2;</code>
     */
    public label.LabelResponse.Builder addLabelsBuilder() {
      return getLabelsFieldBuilder().addBuilder(
          label.LabelResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .label.LabelResponse labels = 2;</code>
     */
    public label.LabelResponse.Builder addLabelsBuilder(
        int index) {
      return getLabelsFieldBuilder().addBuilder(
          index, label.LabelResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .label.LabelResponse labels = 2;</code>
     */
    public java.util.List<label.LabelResponse.Builder> 
         getLabelsBuilderList() {
      return getLabelsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        label.LabelResponse, label.LabelResponse.Builder, label.LabelResponseOrBuilder> 
        getLabelsFieldBuilder() {
      if (labelsBuilder_ == null) {
        labelsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            label.LabelResponse, label.LabelResponse.Builder, label.LabelResponseOrBuilder>(
                labels_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        labels_ = null;
      }
      return labelsBuilder_;
    }

    private java.lang.Object processDate_ = "";
    /**
     * <code>string process_date = 3;</code>
     * @return The processDate.
     */
    public java.lang.String getProcessDate() {
      java.lang.Object ref = processDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        processDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string process_date = 3;</code>
     * @return The bytes for processDate.
     */
    public com.google.protobuf.ByteString
        getProcessDateBytes() {
      java.lang.Object ref = processDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        processDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string process_date = 3;</code>
     * @param value The processDate to set.
     * @return This builder for chaining.
     */
    public Builder setProcessDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      processDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string process_date = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearProcessDate() {
      
      processDate_ = getDefaultInstance().getProcessDate();
      onChanged();
      return this;
    }
    /**
     * <code>string process_date = 3;</code>
     * @param value The bytes for processDate to set.
     * @return This builder for chaining.
     */
    public Builder setProcessDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      processDate_ = value;
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


    // @@protoc_insertion_point(builder_scope:label.LabeledImageResponse)
  }

  // @@protoc_insertion_point(class_scope:label.LabeledImageResponse)
  private static final label.LabeledImageResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new label.LabeledImageResponse();
  }

  public static label.LabeledImageResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LabeledImageResponse>
      PARSER = new com.google.protobuf.AbstractParser<LabeledImageResponse>() {
    @java.lang.Override
    public LabeledImageResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<LabeledImageResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LabeledImageResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public label.LabeledImageResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

