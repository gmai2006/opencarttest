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

/** embeddable class Id for OcOptionDescription. generated on 10/16/2021 from a schema. */
public class OcOptionDescriptionId implements Serializable {
    private static final long serialVersionUID = 163436923135028023L;

    @Column(name = "option_id")
    private java.lang.Integer optionId;

    @Column(name = "language_id")
    private java.lang.Integer languageId;

    /** Constructor: OcOptionDescriptionId. */
    public OcOptionDescriptionId() {}

    /**
     * Constructor: OcOptionDescriptionId.
     *
     * @param optionId - optionId.
     * @param languageId - languageId.
     */
    public OcOptionDescriptionId(java.lang.Integer optionId, java.lang.Integer languageId) {
        this.optionId = optionId;
        this.languageId = languageId;
    }

    public java.lang.Integer getOptionId() {
        return this.optionId;
    }

    public java.lang.Integer getLanguageId() {
        return this.languageId;
    }

    public void setOptionId(java.lang.Integer optionId) {
        this.optionId = optionId;
    }

    public void setLanguageId(java.lang.Integer languageId) {
        this.languageId = languageId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((optionId == null) ? 0 : optionId.hashCode());
        result = prime * result + ((languageId == null) ? 0 : languageId.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        OcOptionDescriptionId other = (OcOptionDescriptionId) obj;

        if (optionId == null) {
            if (other.optionId != null) return false;
        } else if (!optionId.equals(other.optionId)) return false;

        if (languageId == null) {
            if (other.languageId != null) return false;
        } else if (!languageId.equals(other.languageId)) return false;

        return true;
    }
}
