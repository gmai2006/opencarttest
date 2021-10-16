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
@IdClass(OcAttributeDescriptionId.class)
@Table(name = "oc_attribute_description")
public class OcAttributeDescription implements Serializable {
    private static final long serialVersionUID = 163436923081482054L;

    /** Description: attribute_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "attribute_id")
    private java.lang.Integer attributeId;
    /** Description: language_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "language_id")
    private java.lang.Integer languageId;

    /** Description: name. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "name", length = 64)
    private java.lang.String name;

    public OcAttributeDescription() {}

    public java.lang.Integer getAttributeId() {
        return this.attributeId;
    }

    public java.lang.Integer getLanguageId() {
        return this.languageId;
    }

    public void setAttributeId(java.lang.Integer attributeId) {
        this.attributeId = attributeId;
    }

    public void setLanguageId(java.lang.Integer languageId) {
        this.languageId = languageId;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }
}
