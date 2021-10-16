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

/** embeddable class Id for OcTaxRateToCustomerGroup. generated on 10/16/2021 from a schema. */
public class OcTaxRateToCustomerGroupId implements Serializable {
    private static final long serialVersionUID = 16343692318192559L;

    @Column(name = "tax_rate_id")
    private java.lang.Integer taxRateId;

    @Column(name = "customer_group_id")
    private java.lang.Integer customerGroupId;

    /** Constructor: OcTaxRateToCustomerGroupId. */
    public OcTaxRateToCustomerGroupId() {}

    /**
     * Constructor: OcTaxRateToCustomerGroupId.
     *
     * @param taxRateId - taxRateId.
     * @param customerGroupId - customerGroupId.
     */
    public OcTaxRateToCustomerGroupId(
            java.lang.Integer taxRateId, java.lang.Integer customerGroupId) {
        this.taxRateId = taxRateId;
        this.customerGroupId = customerGroupId;
    }

    public java.lang.Integer getTaxRateId() {
        return this.taxRateId;
    }

    public java.lang.Integer getCustomerGroupId() {
        return this.customerGroupId;
    }

    public void setTaxRateId(java.lang.Integer taxRateId) {
        this.taxRateId = taxRateId;
    }

    public void setCustomerGroupId(java.lang.Integer customerGroupId) {
        this.customerGroupId = customerGroupId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((taxRateId == null) ? 0 : taxRateId.hashCode());
        result = prime * result + ((customerGroupId == null) ? 0 : customerGroupId.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        OcTaxRateToCustomerGroupId other = (OcTaxRateToCustomerGroupId) obj;

        if (taxRateId == null) {
            if (other.taxRateId != null) return false;
        } else if (!taxRateId.equals(other.taxRateId)) return false;

        if (customerGroupId == null) {
            if (other.customerGroupId != null) return false;
        } else if (!customerGroupId.equals(other.customerGroupId)) return false;

        return true;
    }
}
