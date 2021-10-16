/**
 * %% Copyright (C) 2021 DataScience 9 LLC %% Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License. #L%
 *
 * <p>This code is 100% AUTO generated. Please do not modify it DIRECTLY If you need new features or
 * function or changes please update the templates then submit the template through our web
 * interface.
 */
package com.opencart.test.entity;

import java.io.Serializable;
import javax.persistence.Column;

/** embeddable class Id for OcInformationToStore. generated on 10/16/2021 from a schema. */
public class OcInformationToStoreId implements Serializable {
    private static final long serialVersionUID = 163436923120645300L;

    @Column(name = "information_id")
    private java.lang.Integer informationId;

    @Column(name = "store_id")
    private java.lang.Integer storeId;

    /** Constructor: OcInformationToStoreId. */
    public OcInformationToStoreId() {}

    /**
     * Constructor: OcInformationToStoreId.
     *
     * @param informationId - informationId.
     * @param storeId - storeId.
     */
    public OcInformationToStoreId(java.lang.Integer informationId, java.lang.Integer storeId) {
        this.informationId = informationId;
        this.storeId = storeId;
    }

    public java.lang.Integer getInformationId() {
        return this.informationId;
    }

    public java.lang.Integer getStoreId() {
        return this.storeId;
    }

    public void setInformationId(java.lang.Integer informationId) {
        this.informationId = informationId;
    }

    public void setStoreId(java.lang.Integer storeId) {
        this.storeId = storeId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((informationId == null) ? 0 : informationId.hashCode());
        result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        OcInformationToStoreId other = (OcInformationToStoreId) obj;

        if (informationId == null) {
            if (other.informationId != null) return false;
        } else if (!informationId.equals(other.informationId)) return false;

        if (storeId == null) {
            if (other.storeId != null) return false;
        } else if (!storeId.equals(other.storeId)) return false;

        return true;
    }
}
