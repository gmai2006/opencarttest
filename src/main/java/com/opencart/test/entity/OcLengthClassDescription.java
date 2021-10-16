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
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(OcLengthClassDescriptionId.class)
@Table(name = "oc_length_class_description")
public class OcLengthClassDescription implements Serializable {
    private static final long serialVersionUID = 163436923125097658L;

    /** Description: length_class_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "length_class_id")
    private java.lang.Integer lengthClassId;
    /** Description: language_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "language_id")
    private java.lang.Integer languageId;

    /** Description: title. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "title", length = 32)
    private java.lang.String title;
    /** Description: unit. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "unit", length = 4)
    private java.lang.String unit;

    public OcLengthClassDescription() {}

    public java.lang.Integer getLengthClassId() {
        return this.lengthClassId;
    }

    public java.lang.Integer getLanguageId() {
        return this.languageId;
    }

    public void setLengthClassId(java.lang.Integer lengthClassId) {
        this.lengthClassId = lengthClassId;
    }

    public void setLanguageId(java.lang.Integer languageId) {
        this.languageId = languageId;
    }

    public java.lang.String getTitle() {
        return this.title;
    }

    public java.lang.String getUnit() {
        return this.unit;
    }

    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    public void setUnit(java.lang.String unit) {
        this.unit = unit;
    }
}
