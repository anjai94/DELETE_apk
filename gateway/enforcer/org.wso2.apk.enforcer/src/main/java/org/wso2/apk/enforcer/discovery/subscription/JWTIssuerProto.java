// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/subscription/jwtIssuer.proto

package org.wso2.apk.enforcer.discovery.subscription;

public final class JWTIssuerProto {
  private JWTIssuerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wso2_discovery_subscription_JWTIssuer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wso2_discovery_subscription_JWTIssuer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wso2_discovery_subscription_JWTIssuer_ClaimMappingEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wso2_discovery_subscription_JWTIssuer_ClaimMappingEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wso2_discovery_subscription_Certificate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wso2_discovery_subscription_Certificate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wso2_discovery_subscription_JWKS_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wso2_discovery_subscription_JWKS_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+wso2/discovery/subscription/jwtIssuer." +
      "proto\022\033wso2.discovery.subscription\"\331\002\n\tJ" +
      "WTIssuer\022\017\n\007eventId\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022" +
      "\024\n\014organization\030\003 \001(\t\022\016\n\006issuer\030\004 \001(\t\022=\n" +
      "\013certificate\030\005 \001(\0132(.wso2.discovery.subs" +
      "cription.Certificate\022\030\n\020consumerKeyClaim" +
      "\030\006 \001(\t\022\023\n\013scopesClaim\030\007 \001(\t\022N\n\014claimMapp" +
      "ing\030\010 \003(\01328.wso2.discovery.subscription." +
      "JWTIssuer.ClaimMappingEntry\022\024\n\014environme" +
      "nts\030\t \003(\t\0323\n\021ClaimMappingEntry\022\013\n\003key\030\001 " +
      "\001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"S\n\013Certificate\022\023\n" +
      "\013certificate\030\001 \001(\t\022/\n\004jwks\030\002 \001(\0132!.wso2." +
      "discovery.subscription.JWKS\" \n\004JWKS\022\013\n\003u" +
      "rl\030\001 \001(\t\022\013\n\003tls\030\002 \001(\tB\221\001\n,org.wso2.apk.e" +
      "nforcer.discovery.subscriptionB\016JWTIssue" +
      "rProtoP\001ZOgithub.com/envoyproxy/go-contr" +
      "ol-plane/wso2/discovery/subscription;sub" +
      "scriptionb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_wso2_discovery_subscription_JWTIssuer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_wso2_discovery_subscription_JWTIssuer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wso2_discovery_subscription_JWTIssuer_descriptor,
        new java.lang.String[] { "EventId", "Name", "Organization", "Issuer", "Certificate", "ConsumerKeyClaim", "ScopesClaim", "ClaimMapping", "Environments", });
    internal_static_wso2_discovery_subscription_JWTIssuer_ClaimMappingEntry_descriptor =
      internal_static_wso2_discovery_subscription_JWTIssuer_descriptor.getNestedTypes().get(0);
    internal_static_wso2_discovery_subscription_JWTIssuer_ClaimMappingEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wso2_discovery_subscription_JWTIssuer_ClaimMappingEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_wso2_discovery_subscription_Certificate_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_wso2_discovery_subscription_Certificate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wso2_discovery_subscription_Certificate_descriptor,
        new java.lang.String[] { "Certificate", "Jwks", });
    internal_static_wso2_discovery_subscription_JWKS_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_wso2_discovery_subscription_JWKS_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wso2_discovery_subscription_JWKS_descriptor,
        new java.lang.String[] { "Url", "Tls", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}