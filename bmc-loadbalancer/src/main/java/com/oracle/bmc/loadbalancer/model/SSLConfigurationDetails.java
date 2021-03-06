/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The load balancer's SSL handling configuration details.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SSLConfigurationDetails.Builder.class
)
public class SSLConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("certificateName")
        private String certificateName;

        @com.fasterxml.jackson.annotation.JsonProperty("verifyDepth")
        private Integer verifyDepth;

        @com.fasterxml.jackson.annotation.JsonProperty("verifyPeerCertificate")
        private Boolean verifyPeerCertificate;

        public SSLConfigurationDetails build() {
            return new SSLConfigurationDetails(certificateName, verifyDepth, verifyPeerCertificate);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SSLConfigurationDetails o) {
            return certificateName(o.getCertificateName())
                    .verifyDepth(o.getVerifyDepth())
                    .verifyPeerCertificate(o.getVerifyPeerCertificate());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * A friendly name for the certificate bundle. It must be unique and it cannot be changed.
     * <p>
     * Example: `My certificate bundle`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateName")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String certificateName;

    /**
     * The maximum depth for peer certificate chain verification.
     * <p>
     * Example: `3`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("verifyDepth")
    Integer verifyDepth;

    /**
     * Whether the load balancer listener should verify peer certificates.
     * <p>
     * Example: `true`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("verifyPeerCertificate")
    Boolean verifyPeerCertificate;
}
