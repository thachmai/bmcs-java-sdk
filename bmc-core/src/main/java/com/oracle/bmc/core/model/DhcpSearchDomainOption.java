/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * DHCP option for specifying a search domain name for DNS queries. For more information, see
 * [DNS in Your Virtual Cloud Network](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/dns.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DhcpSearchDomainOption.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
public class DhcpSearchDomainOption extends DhcpOption {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("searchDomainNames")
        private java.util.List<String> searchDomainNames;

        public DhcpSearchDomainOption build() {
            return new DhcpSearchDomainOption(searchDomainNames);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DhcpSearchDomainOption o) {
            return searchDomainNames(o.getSearchDomainNames());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public DhcpSearchDomainOption(java.util.List<String> searchDomainNames) {
        super();
        this.searchDomainNames = searchDomainNames;
    }

    /**
     * A single search domain name according to [RFC 952](https://tools.ietf.org/html/rfc952)
     * and [RFC 1123](https://tools.ietf.org/html/rfc1123). During a DNS query,
     * the OS will append this search domain name to the value being queried.
     * <p>
     * If you set {@link DhcpDnsOption} to `VcnLocalPlusInternet`,
     * and you assign a DNS label to the VCN during creation, the search domain name in the
     * VCN's default set of DHCP options is automatically set to the VCN domain
     * (e.g., `vcn1.oraclevcn.com`).
     * <p>
     * If you don't want to use a search domain name, omit this option from the
     * set of DHCP options. Do not include this option with an empty list
     * of search domain names, or with an empty string as the value for any search
     * domain name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("searchDomainNames")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    java.util.List<String> searchDomainNames;
}
