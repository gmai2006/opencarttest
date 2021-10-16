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
@Table(name = "oc_order_custom_field")
public class OcOrderCustomField implements Serializable {
    private static final long serialVersionUID = 163436923143365946L;

    /** Description: order_custom_field_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "order_custom_field_id")
    private java.lang.Integer orderCustomFieldId;

    /** Description: order_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "order_id")
    private java.lang.Integer orderId;
    /** Description: custom_field_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "custom_field_id")
    private java.lang.Integer customFieldId;
    /** Description: custom_field_value_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "custom_field_value_id")
    private java.lang.Integer customFieldValueId;
    /** Description: name. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "name", length = 255)
    private java.lang.String name;
    /** Description: value. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "value", length = 65535)
    private java.lang.String value;
    /** Description: type. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "type", length = 32)
    private java.lang.String type;
    /** Description: location. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "location", length = 16)
    private java.lang.String location;

    public OcOrderCustomField() {}

    public java.lang.Integer getOrderCustomFieldId() {
        return this.orderCustomFieldId;
    }

    public void setOrderCustomFieldId(java.lang.Integer orderCustomFieldId) {
        this.orderCustomFieldId = orderCustomFieldId;
    }

    public java.lang.Integer getOrderId() {
        return this.orderId;
    }

    public java.lang.Integer getCustomFieldId() {
        return this.customFieldId;
    }

    public java.lang.Integer getCustomFieldValueId() {
        return this.customFieldValueId;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getValue() {
        return this.value;
    }

    public java.lang.String getType() {
        return this.type;
    }

    public java.lang.String getLocation() {
        return this.location;
    }

    public void setOrderId(java.lang.Integer orderId) {
        this.orderId = orderId;
    }

    public void setCustomFieldId(java.lang.Integer customFieldId) {
        this.customFieldId = customFieldId;
    }

    public void setCustomFieldValueId(java.lang.Integer customFieldValueId) {
        this.customFieldValueId = customFieldValueId;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setValue(java.lang.String value) {
        this.value = value;
    }

    public void setType(java.lang.String type) {
        this.type = type;
    }

    public void setLocation(java.lang.String location) {
        this.location = location;
    }
}
