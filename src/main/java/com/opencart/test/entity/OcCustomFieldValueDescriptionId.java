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

/** embeddable class Id for OcCustomFieldValueDescription. generated on 10/16/2021 from a schema. */
public class OcCustomFieldValueDescriptionId implements Serializable {
    private static final long serialVersionUID = 163436923100583261L;

    @Column(name = "custom_field_value_id")
    private java.lang.Integer customFieldValueId;

    @Column(name = "language_id")
    private java.lang.Integer languageId;

    /** Constructor: OcCustomFieldValueDescriptionId. */
    public OcCustomFieldValueDescriptionId() {}

    /**
     * Constructor: OcCustomFieldValueDescriptionId.
     *
     * @param customFieldValueId - customFieldValueId.
     * @param languageId - languageId.
     */
    public OcCustomFieldValueDescriptionId(
            java.lang.Integer customFieldValueId, java.lang.Integer languageId) {
        this.customFieldValueId = customFieldValueId;
        this.languageId = languageId;
    }

    public java.lang.Integer getCustomFieldValueId() {
        return this.customFieldValueId;
    }

    public java.lang.Integer getLanguageId() {
        return this.languageId;
    }

    public void setCustomFieldValueId(java.lang.Integer customFieldValueId) {
        this.customFieldValueId = customFieldValueId;
    }

    public void setLanguageId(java.lang.Integer languageId) {
        this.languageId = languageId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result =
                prime * result + ((customFieldValueId == null) ? 0 : customFieldValueId.hashCode());
        result = prime * result + ((languageId == null) ? 0 : languageId.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        OcCustomFieldValueDescriptionId other = (OcCustomFieldValueDescriptionId) obj;

        if (customFieldValueId == null) {
            if (other.customFieldValueId != null) return false;
        } else if (!customFieldValueId.equals(other.customFieldValueId)) return false;

        if (languageId == null) {
            if (other.languageId != null) return false;
        } else if (!languageId.equals(other.languageId)) return false;

        return true;
    }
}
