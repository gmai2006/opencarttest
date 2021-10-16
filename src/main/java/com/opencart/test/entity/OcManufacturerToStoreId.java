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

/** embeddable class Id for OcManufacturerToStore. generated on 10/16/2021 from a schema. */
public class OcManufacturerToStoreId implements Serializable {
    private static final long serialVersionUID = 16343692312704389L;

    @Column(name = "store_id")
    private java.lang.Integer storeId;

    @Column(name = "manufacturer_id")
    private java.lang.Integer manufacturerId;

    /** Constructor: OcManufacturerToStoreId. */
    public OcManufacturerToStoreId() {}

    /**
     * Constructor: OcManufacturerToStoreId.
     *
     * @param storeId - storeId.
     * @param manufacturerId - manufacturerId.
     */
    public OcManufacturerToStoreId(java.lang.Integer storeId, java.lang.Integer manufacturerId) {
        this.storeId = storeId;
        this.manufacturerId = manufacturerId;
    }

    public java.lang.Integer getStoreId() {
        return this.storeId;
    }

    public java.lang.Integer getManufacturerId() {
        return this.manufacturerId;
    }

    public void setStoreId(java.lang.Integer storeId) {
        this.storeId = storeId;
    }

    public void setManufacturerId(java.lang.Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());
        result = prime * result + ((manufacturerId == null) ? 0 : manufacturerId.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        OcManufacturerToStoreId other = (OcManufacturerToStoreId) obj;

        if (storeId == null) {
            if (other.storeId != null) return false;
        } else if (!storeId.equals(other.storeId)) return false;

        if (manufacturerId == null) {
            if (other.manufacturerId != null) return false;
        } else if (!manufacturerId.equals(other.manufacturerId)) return false;

        return true;
    }
}
