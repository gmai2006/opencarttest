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

/** embeddable class Id for OcProductRecurring. generated on 10/16/2021 from a schema. */
public class OcProductRecurringId implements Serializable {
    private static final long serialVersionUID = 163436923162986620L;

    @Column(name = "recurring_id")
    private java.lang.Integer recurringId;

    @Column(name = "product_id")
    private java.lang.Integer productId;

    @Column(name = "customer_group_id")
    private java.lang.Integer customerGroupId;

    /** Constructor: OcProductRecurringId. */
    public OcProductRecurringId() {}

    /**
     * Constructor: OcProductRecurringId.
     *
     * @param recurringId - recurringId.
     * @param productId - productId.
     * @param customerGroupId - customerGroupId.
     */
    public OcProductRecurringId(
            java.lang.Integer recurringId,
            java.lang.Integer productId,
            java.lang.Integer customerGroupId) {
        this.recurringId = recurringId;
        this.productId = productId;
        this.customerGroupId = customerGroupId;
    }

    public java.lang.Integer getRecurringId() {
        return this.recurringId;
    }

    public java.lang.Integer getProductId() {
        return this.productId;
    }

    public java.lang.Integer getCustomerGroupId() {
        return this.customerGroupId;
    }

    public void setRecurringId(java.lang.Integer recurringId) {
        this.recurringId = recurringId;
    }

    public void setProductId(java.lang.Integer productId) {
        this.productId = productId;
    }

    public void setCustomerGroupId(java.lang.Integer customerGroupId) {
        this.customerGroupId = customerGroupId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((recurringId == null) ? 0 : recurringId.hashCode());
        result = prime * result + ((productId == null) ? 0 : productId.hashCode());
        result = prime * result + ((customerGroupId == null) ? 0 : customerGroupId.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        OcProductRecurringId other = (OcProductRecurringId) obj;

        if (recurringId == null) {
            if (other.recurringId != null) return false;
        } else if (!recurringId.equals(other.recurringId)) return false;

        if (productId == null) {
            if (other.productId != null) return false;
        } else if (!productId.equals(other.productId)) return false;

        if (customerGroupId == null) {
            if (other.customerGroupId != null) return false;
        } else if (!customerGroupId.equals(other.customerGroupId)) return false;

        return true;
    }
}
