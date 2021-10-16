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

/** embeddable class Id for OcOrderStatus. generated on 10/16/2021 from a schema. */
public class OcOrderStatusId implements Serializable {
    private static final long serialVersionUID = 16343692315019628L;

    @Column(name = "order_status_id")
    private java.lang.Integer orderStatusId;

    @Column(name = "language_id")
    private java.lang.Integer languageId;

    /** Constructor: OcOrderStatusId. */
    public OcOrderStatusId() {}

    /**
     * Constructor: OcOrderStatusId.
     *
     * @param orderStatusId - orderStatusId.
     * @param languageId - languageId.
     */
    public OcOrderStatusId(java.lang.Integer orderStatusId, java.lang.Integer languageId) {
        this.orderStatusId = orderStatusId;
        this.languageId = languageId;
    }

    public java.lang.Integer getOrderStatusId() {
        return this.orderStatusId;
    }

    public java.lang.Integer getLanguageId() {
        return this.languageId;
    }

    public void setOrderStatusId(java.lang.Integer orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public void setLanguageId(java.lang.Integer languageId) {
        this.languageId = languageId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((orderStatusId == null) ? 0 : orderStatusId.hashCode());
        result = prime * result + ((languageId == null) ? 0 : languageId.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        OcOrderStatusId other = (OcOrderStatusId) obj;

        if (orderStatusId == null) {
            if (other.orderStatusId != null) return false;
        } else if (!orderStatusId.equals(other.orderStatusId)) return false;

        if (languageId == null) {
            if (other.languageId != null) return false;
        } else if (!languageId.equals(other.languageId)) return false;

        return true;
    }
}
