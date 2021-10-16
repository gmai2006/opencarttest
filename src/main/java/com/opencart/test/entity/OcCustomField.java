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
import javax.persistence.Table;

@Entity
@Table(name = "oc_custom_field")
public class OcCustomField implements Serializable {
    private static final long serialVersionUID = 163436923096919505L;

    /** Description: custom_field_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "custom_field_id")
    private java.lang.Integer customFieldId;

    /** Description: type. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "type", length = 32)
    private java.lang.String type;
    /** Description: value. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "value", length = 65535)
    private java.lang.String value;
    /** Description: validation. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "validation", length = 255)
    private java.lang.String validation;
    /** Description: location. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "location", length = 7)
    private java.lang.String location;
    /** Description: status. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "status")
    private java.lang.Boolean status;
    /** Description: sort_order. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "sort_order")
    private java.lang.Integer sortOrder;

    public OcCustomField() {}

    public java.lang.Integer getCustomFieldId() {
        return this.customFieldId;
    }

    public void setCustomFieldId(java.lang.Integer customFieldId) {
        this.customFieldId = customFieldId;
    }

    public java.lang.String getType() {
        return this.type;
    }

    public java.lang.String getValue() {
        return this.value;
    }

    public java.lang.String getValidation() {
        return this.validation;
    }

    public java.lang.String getLocation() {
        return this.location;
    }

    public java.lang.Boolean getStatus() {
        return this.status;
    }

    public java.lang.Integer getSortOrder() {
        return this.sortOrder;
    }

    public void setType(java.lang.String type) {
        this.type = type;
    }

    public void setValue(java.lang.String value) {
        this.value = value;
    }

    public void setValidation(java.lang.String validation) {
        this.validation = validation;
    }

    public void setLocation(java.lang.String location) {
        this.location = location;
    }

    public void setStatus(java.lang.Boolean status) {
        this.status = status;
    }

    public void setSortOrder(java.lang.Integer sortOrder) {
        this.sortOrder = sortOrder;
    }
}
