/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.audit.requests;

import com.oracle.bmc.audit.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListEventsRequest {

    /**
     * The OCID of the compartment.
     */
    private String compartmentId;

    /**
     * Returns events that were processed at or after this start date and time, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * For example, a start value of `2017-01-15T11:30:00Z` will retrieve a list of all events processed since 30 minutes after the 11th hour of January 15, 2017, in Coordinated Universal Time (UTC).
     * You can specify a value with granularity to the minute. Seconds (and milliseconds, if included) must be set to `0`.
     *
     */
    private java.util.Date startTime;

    /**
     * Returns events that were processed before this end date and time, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. For example, a start value of `2017-01-01T00:00:00Z` and an end value of `2017-01-02T00:00:00Z` will retrieve a list of all events processed on January 1, 2017.
     * Similarly, a start value of `2017-01-01T00:00:00Z` and an end value of `2017-02-01T00:00:00Z` will result in a list of all events processed between January 1, 2017 and January 31, 2017.
     * You can specify a value with granularity to the minute. Seconds (and milliseconds, if included) must be set to `0`.
     *
     */
    private java.util.Date endTime;

    /**
     * The value of the `opc-next-page` response header from the previous list query.
     */
    private String page;

    /**
     * Unique Oracle-assigned identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListEventsRequest o) {
            compartmentId(o.getCompartmentId());
            startTime(o.getStartTime());
            endTime(o.getEndTime());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            return this;
        }
    }
}
