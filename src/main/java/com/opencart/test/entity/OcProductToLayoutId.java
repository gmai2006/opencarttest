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

/** embeddable class Id for OcProductToLayout. generated on 10/16/2021 from a schema. */
public class OcProductToLayoutId implements Serializable {
    private static final long serialVersionUID = 163436923168413450L;

    @Column(name = "store_id")
    private java.lang.Integer storeId;

    @Column(name = "product_id")
    private java.lang.Integer productId;

    /** Constructor: OcProductToLayoutId. */
    public OcProductToLayoutId() {}

    /**
     * Constructor: OcProductToLayoutId.
     *
     * @param storeId - storeId.
     * @param productId - productId.
     */
    public OcProductToLayoutId(java.lang.Integer storeId, java.lang.Integer productId) {
        this.storeId = storeId;
        this.productId = productId;
    }

    public java.lang.Integer getStoreId() {
        return this.storeId;
    }

    public java.lang.Integer getProductId() {
        return this.productId;
    }

    public void setStoreId(java.lang.Integer storeId) {
        this.storeId = storeId;
    }

    public void setProductId(java.lang.Integer productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((storeId == null) ? 0 : storeId.hashCode());
        result = prime * result + ((productId == null) ? 0 : productId.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        OcProductToLayoutId other = (OcProductToLayoutId) obj;

        if (storeId == null) {
            if (other.storeId != null) return false;
        } else if (!storeId.equals(other.storeId)) return false;

        if (productId == null) {
            if (other.productId != null) return false;
        } else if (!productId.equals(other.productId)) return false;

        return true;
    }
}
