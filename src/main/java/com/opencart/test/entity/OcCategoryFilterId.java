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

/** embeddable class Id for OcCategoryFilter. generated on 10/16/2021 from a schema. */
public class OcCategoryFilterId implements Serializable {
    private static final long serialVersionUID = 163436923087896408L;

    @Column(name = "category_id")
    private java.lang.Integer categoryId;

    @Column(name = "filter_id")
    private java.lang.Integer filterId;

    /** Constructor: OcCategoryFilterId. */
    public OcCategoryFilterId() {}

    /**
     * Constructor: OcCategoryFilterId.
     *
     * @param categoryId - categoryId.
     * @param filterId - filterId.
     */
    public OcCategoryFilterId(java.lang.Integer categoryId, java.lang.Integer filterId) {
        this.categoryId = categoryId;
        this.filterId = filterId;
    }

    public java.lang.Integer getCategoryId() {
        return this.categoryId;
    }

    public java.lang.Integer getFilterId() {
        return this.filterId;
    }

    public void setCategoryId(java.lang.Integer categoryId) {
        this.categoryId = categoryId;
    }

    public void setFilterId(java.lang.Integer filterId) {
        this.filterId = filterId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((categoryId == null) ? 0 : categoryId.hashCode());
        result = prime * result + ((filterId == null) ? 0 : filterId.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        OcCategoryFilterId other = (OcCategoryFilterId) obj;

        if (categoryId == null) {
            if (other.categoryId != null) return false;
        } else if (!categoryId.equals(other.categoryId)) return false;

        if (filterId == null) {
            if (other.filterId != null) return false;
        } else if (!filterId.equals(other.filterId)) return false;

        return true;
    }
}
