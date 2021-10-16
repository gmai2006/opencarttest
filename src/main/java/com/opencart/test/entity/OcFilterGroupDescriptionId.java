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

/** embeddable class Id for OcFilterGroupDescription. generated on 10/16/2021 from a schema. */
public class OcFilterGroupDescriptionId implements Serializable {
    private static final long serialVersionUID = 163436923115852453L;

    @Column(name = "language_id")
    private java.lang.Integer languageId;

    @Column(name = "filter_group_id")
    private java.lang.Integer filterGroupId;

    /** Constructor: OcFilterGroupDescriptionId. */
    public OcFilterGroupDescriptionId() {}

    /**
     * Constructor: OcFilterGroupDescriptionId.
     *
     * @param languageId - languageId.
     * @param filterGroupId - filterGroupId.
     */
    public OcFilterGroupDescriptionId(
            java.lang.Integer languageId, java.lang.Integer filterGroupId) {
        this.languageId = languageId;
        this.filterGroupId = filterGroupId;
    }

    public java.lang.Integer getLanguageId() {
        return this.languageId;
    }

    public java.lang.Integer getFilterGroupId() {
        return this.filterGroupId;
    }

    public void setLanguageId(java.lang.Integer languageId) {
        this.languageId = languageId;
    }

    public void setFilterGroupId(java.lang.Integer filterGroupId) {
        this.filterGroupId = filterGroupId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((languageId == null) ? 0 : languageId.hashCode());
        result = prime * result + ((filterGroupId == null) ? 0 : filterGroupId.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        OcFilterGroupDescriptionId other = (OcFilterGroupDescriptionId) obj;

        if (languageId == null) {
            if (other.languageId != null) return false;
        } else if (!languageId.equals(other.languageId)) return false;

        if (filterGroupId == null) {
            if (other.filterGroupId != null) return false;
        } else if (!filterGroupId.equals(other.filterGroupId)) return false;

        return true;
    }
}
