/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

/**
 * Swift is the OpenStack object storage service. A `SwiftPassword` is an Oracle-provided password for using a
 * Swift client with the Oracle Bare Metal Cloud Services Object Storage Service. This password is associated with
 * the user's Console login. Swift passwords never expire. A user can have up to two Swift passwords at a time.
 * <p>
 **Note:** The password is always an Oracle-generated string; you can't change it to a string of your choice.
 * <p>
 * For more information, see [Managing User Credentials](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Tasks/managingcredentials.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SwiftPassword.Builder.class)
public class SwiftPassword {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        @com.fasterxml.jackson.annotation.JsonProperty("expiresOn")
        private java.util.Date expiresOn;

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @com.fasterxml.jackson.annotation.JsonProperty("inactiveStatus")
        private Long inactiveStatus;

        public SwiftPassword build() {
            return new SwiftPassword(
                    password,
                    id,
                    userId,
                    description,
                    timeCreated,
                    expiresOn,
                    lifecycleState,
                    inactiveStatus);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SwiftPassword o) {
            return password(o.getPassword())
                    .id(o.getId())
                    .userId(o.getUserId())
                    .description(o.getDescription())
                    .timeCreated(o.getTimeCreated())
                    .expiresOn(o.getExpiresOn())
                    .lifecycleState(o.getLifecycleState())
                    .inactiveStatus(o.getInactiveStatus());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The Swift password. The value is available only in the response for `CreateSwiftPassword`, and not
     * for `ListSwiftPasswords` or `UpdateSwiftPassword`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    String password;

    /**
     * The OCID of the Swift password.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The OCID of the user the password belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    String userId;

    /**
     * The description you assign to the Swift password. Does not have to be unique, and it's changeable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Date and time the `SwiftPassword` object was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * Date and time when this password will expire, in the format defined by RFC3339.
     * Null if it never expires.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expiresOn")
    java.util.Date expiresOn;
    /**
     * The password's current state. After creating a password, make sure its `lifecycleState` changes from
     * CREATING to ACTIVE before using it.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The password's current state. After creating a password, make sure its `lifecycleState` changes from
     * CREATING to ACTIVE before using it.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    @javax.validation.constraints.Size(min = 1, max = 64)
    LifecycleState lifecycleState;

    /**
     * The detailed status of INACTIVE lifecycleState.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inactiveStatus")
    Long inactiveStatus;
}
