/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListSubnetsRequest {

    /**
     * The OCID of the compartment.
     */
    private String compartmentId;

    /**
     * The OCID of the VCN.
     */
    private String vcnId;

    /**
     * The maximum number of items to return in a paginated \"List\" call.
     * <p>
     * Example: `500`
     *
     */
    private Integer limit;

    /**
     * The value of the `opc-next-page` response header from the previous \"List\" call.
     *
     */
    private String page;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListSubnetsRequest o) {
            compartmentId(o.getCompartmentId());
            vcnId(o.getVcnId());
            limit(o.getLimit());
            page(o.getPage());
            return this;
        }
    }
}
