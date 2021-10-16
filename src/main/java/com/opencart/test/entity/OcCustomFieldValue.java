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
@Table(name = "oc_custom_field_value")
public class OcCustomFieldValue implements Serializable {
    private static final long serialVersionUID = 163436923100081757L;

    /** Description: custom_field_value_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "custom_field_value_id")
    private java.lang.Integer customFieldValueId;

    /** Description: custom_field_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "custom_field_id")
    private java.lang.Integer customFieldId;
    /** Description: sort_order. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "sort_order")
    private java.lang.Integer sortOrder;

    public OcCustomFieldValue() {}

    public java.lang.Integer getCustomFieldValueId() {
        return this.customFieldValueId;
    }

    public void setCustomFieldValueId(java.lang.Integer customFieldValueId) {
        this.customFieldValueId = customFieldValueId;
    }

    public java.lang.Integer getCustomFieldId() {
        return this.customFieldId;
    }

    public java.lang.Integer getSortOrder() {
        return this.sortOrder;
    }

    public void setCustomFieldId(java.lang.Integer customFieldId) {
        this.customFieldId = customFieldId;
    }

    public void setSortOrder(java.lang.Integer sortOrder) {
        this.sortOrder = sortOrder;
    }
}
