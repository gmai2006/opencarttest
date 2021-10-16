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

/** embeddable class Id for OcProductRelated. generated on 10/16/2021 from a schema. */
public class OcProductRelatedId implements Serializable {
    private static final long serialVersionUID = 163436923164169123L;

    @Column(name = "related_id")
    private java.lang.Integer relatedId;

    @Column(name = "product_id")
    private java.lang.Integer productId;

    /** Constructor: OcProductRelatedId. */
    public OcProductRelatedId() {}

    /**
     * Constructor: OcProductRelatedId.
     *
     * @param relatedId - relatedId.
     * @param productId - productId.
     */
    public OcProductRelatedId(java.lang.Integer relatedId, java.lang.Integer productId) {
        this.relatedId = relatedId;
        this.productId = productId;
    }

    public java.lang.Integer getRelatedId() {
        return this.relatedId;
    }

    public java.lang.Integer getProductId() {
        return this.productId;
    }

    public void setRelatedId(java.lang.Integer relatedId) {
        this.relatedId = relatedId;
    }

    public void setProductId(java.lang.Integer productId) {
        this.productId = productId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((relatedId == null) ? 0 : relatedId.hashCode());
        result = prime * result + ((productId == null) ? 0 : productId.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        OcProductRelatedId other = (OcProductRelatedId) obj;

        if (relatedId == null) {
            if (other.relatedId != null) return false;
        } else if (!relatedId.equals(other.relatedId)) return false;

        if (productId == null) {
            if (other.productId != null) return false;
        } else if (!productId.equals(other.productId)) return false;

        return true;
    }
}
