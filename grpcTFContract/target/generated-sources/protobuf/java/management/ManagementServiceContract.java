// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ManagementServiceContract.proto

package management;

public final class ManagementServiceContract {
  private ManagementServiceContract() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_management_InstanceCount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_management_InstanceCount_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037ManagementServiceContract.proto\022\nmanag" +
      "ement\032\033google/protobuf/empty.proto\"\036\n\rIn" +
      "stanceCount\022\r\n\005count\030\001 \001(\0052\363\001\n\021Managemen" +
      "tService\0229\n\007IsAlive\022\026.google.protobuf.Em" +
      "pty\032\026.google.protobuf.Empty\022N\n\031ChangeGRP" +
      "CServerInstances\022\031.management.InstanceCo" +
      "unt\032\026.google.protobuf.Empty\022S\n\036ChangeIma" +
      "geProcessingInstances\022\031.management.Insta" +
      "nceCount\032\026.google.protobuf.EmptyB\016\n\nmana" +
      "gementP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_management_InstanceCount_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_management_InstanceCount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_management_InstanceCount_descriptor,
        new java.lang.String[] { "Count", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
