/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateBucketDetails.Builder.class
)
public class UpdateBucketDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        @com.fasterxml.jackson.annotation.JsonProperty("publicAccessType")
        private PublicAccessType publicAccessType;

        public UpdateBucketDetails build() {
            return new UpdateBucketDetails(namespace, name, metadata, publicAccessType);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateBucketDetails o) {
            return namespace(o.getNamespace())
                    .name(o.getName())
                    .metadata(o.getMetadata())
                    .publicAccessType(o.getPublicAccessType());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The namespace in which the bucket lives.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    String namespace;

    /**
     * The name of the bucket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * Arbitrary string, up to 4KB, of keys and values for user-defined metadata.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    java.util.Map<String, String> metadata;
    /**
     * The type of public access available on this bucket. Allows authenticated caller to access the bucket or
     * contents of this bucket. By default a bucket is set to NoPublicAccess. It is treated as NoPublicAccess
     * when this value is not specified. When the type is NoPublicAccess the bucket does not allow any public access.
     * When the type is ObjectRead the bucket allows public access to the GetObject, HeadObject, ListObjects.
     *
     **/
    public enum PublicAccessType {
        NoPublicAccess("NoPublicAccess"),
        ObjectRead("ObjectRead"),
        ;

        private final String value;
        private static java.util.Map<String, PublicAccessType> map;

        static {
            map = new java.util.HashMap<>();
            for (PublicAccessType v : PublicAccessType.values()) {
                map.put(v.getValue(), v);
            }
        }

        PublicAccessType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PublicAccessType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new RuntimeException("Invalid PublicAccessType: " + key);
        }
    };
    /**
     * The type of public access available on this bucket. Allows authenticated caller to access the bucket or
     * contents of this bucket. By default a bucket is set to NoPublicAccess. It is treated as NoPublicAccess
     * when this value is not specified. When the type is NoPublicAccess the bucket does not allow any public access.
     * When the type is ObjectRead the bucket allows public access to the GetObject, HeadObject, ListObjects.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicAccessType")
    PublicAccessType publicAccessType;
}
