/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class GetVolumeAttachmentRequest {

    /**
     * The OCID of the volume attachment.
     */
    private String volumeAttachmentId;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetVolumeAttachmentRequest o) {
            volumeAttachmentId(o.getVolumeAttachmentId());
            return this;
        }
    }
}
