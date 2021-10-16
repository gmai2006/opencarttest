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
@Table(name = "oc_order_option")
public class OcOrderOption implements Serializable {
    private static final long serialVersionUID = 163436923145168037L;

    /** Description: order_option_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "order_option_id")
    private java.lang.Integer orderOptionId;

    /** Description: order_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "order_id")
    private java.lang.Integer orderId;
    /** Description: order_product_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "order_product_id")
    private java.lang.Integer orderProductId;
    /** Description: product_option_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "product_option_id")
    private java.lang.Integer productOptionId;
    /** Description: product_option_value_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "product_option_value_id")
    private java.lang.Integer productOptionValueId;
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

    public OcOrderOption() {}

    public java.lang.Integer getOrderOptionId() {
        return this.orderOptionId;
    }

    public void setOrderOptionId(java.lang.Integer orderOptionId) {
        this.orderOptionId = orderOptionId;
    }

    public java.lang.Integer getOrderId() {
        return this.orderId;
    }

    public java.lang.Integer getOrderProductId() {
        return this.orderProductId;
    }

    public java.lang.Integer getProductOptionId() {
        return this.productOptionId;
    }

    public java.lang.Integer getProductOptionValueId() {
        return this.productOptionValueId;
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

    public void setOrderId(java.lang.Integer orderId) {
        this.orderId = orderId;
    }

    public void setOrderProductId(java.lang.Integer orderProductId) {
        this.orderProductId = orderProductId;
    }

    public void setProductOptionId(java.lang.Integer productOptionId) {
        this.productOptionId = productOptionId;
    }

    public void setProductOptionValueId(java.lang.Integer productOptionValueId) {
        this.productOptionValueId = productOptionValueId;
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
}
