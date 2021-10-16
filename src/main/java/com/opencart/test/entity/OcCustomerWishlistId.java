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

/** embeddable class Id for OcCustomerWishlist. generated on 10/16/2021 from a schema. */
public class OcCustomerWishlistId implements Serializable {
    private static final long serialVersionUID = 163436923110060572L;

    @Column(name = "product_id")
    private java.lang.Integer productId;

    @Column(name = "customer_id")
    private java.lang.Integer customerId;

    /** Constructor: OcCustomerWishlistId. */
    public OcCustomerWishlistId() {}

    /**
     * Constructor: OcCustomerWishlistId.
     *
     * @param productId - productId.
     * @param customerId - customerId.
     */
    public OcCustomerWishlistId(java.lang.Integer productId, java.lang.Integer customerId) {
        this.productId = productId;
        this.customerId = customerId;
    }

    public java.lang.Integer getProductId() {
        return this.productId;
    }

    public java.lang.Integer getCustomerId() {
        return this.customerId;
    }

    public void setProductId(java.lang.Integer productId) {
        this.productId = productId;
    }

    public void setCustomerId(java.lang.Integer customerId) {
        this.customerId = customerId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((productId == null) ? 0 : productId.hashCode());
        result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        OcCustomerWishlistId other = (OcCustomerWishlistId) obj;

        if (productId == null) {
            if (other.productId != null) return false;
        } else if (!productId.equals(other.productId)) return false;

        if (customerId == null) {
            if (other.customerId != null) return false;
        } else if (!customerId.equals(other.customerId)) return false;

        return true;
    }
}
