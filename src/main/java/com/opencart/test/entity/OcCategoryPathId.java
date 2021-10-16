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

/** embeddable class Id for OcCategoryPath. generated on 10/16/2021 from a schema. */
public class OcCategoryPathId implements Serializable {
    private static final long serialVersionUID = 163436923088818482L;

    @Column(name = "category_id")
    private java.lang.Integer categoryId;

    @Column(name = "path_id")
    private java.lang.Integer pathId;

    /** Constructor: OcCategoryPathId. */
    public OcCategoryPathId() {}

    /**
     * Constructor: OcCategoryPathId.
     *
     * @param categoryId - categoryId.
     * @param pathId - pathId.
     */
    public OcCategoryPathId(java.lang.Integer categoryId, java.lang.Integer pathId) {
        this.categoryId = categoryId;
        this.pathId = pathId;
    }

    public java.lang.Integer getCategoryId() {
        return this.categoryId;
    }

    public java.lang.Integer getPathId() {
        return this.pathId;
    }

    public void setCategoryId(java.lang.Integer categoryId) {
        this.categoryId = categoryId;
    }

    public void setPathId(java.lang.Integer pathId) {
        this.pathId = pathId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((categoryId == null) ? 0 : categoryId.hashCode());
        result = prime * result + ((pathId == null) ? 0 : pathId.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        OcCategoryPathId other = (OcCategoryPathId) obj;

        if (categoryId == null) {
            if (other.categoryId != null) return false;
        } else if (!categoryId.equals(other.categoryId)) return false;

        if (pathId == null) {
            if (other.pathId != null) return false;
        } else if (!pathId.equals(other.pathId)) return false;

        return true;
    }
}
