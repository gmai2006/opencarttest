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
@Table(name = "oc_order_product")
public class OcOrderProduct implements Serializable {
    private static final long serialVersionUID = 163436923146168004L;

    /** Description: order_product_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "order_product_id")
    private java.lang.Integer orderProductId;

    /** Description: order_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "order_id")
    private java.lang.Integer orderId;
    /** Description: product_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "product_id")
    private java.lang.Integer productId;
    /** Description: name. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "name", length = 255)
    private java.lang.String name;
    /** Description: model. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "model", length = 64)
    private java.lang.String model;
    /** Description: quantity. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "quantity")
    private java.lang.Integer quantity;
    /** Description: price. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "price")
    private java.math.BigDecimal price;
    /** Description: total. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "total")
    private java.math.BigDecimal total;
    /** Description: tax. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "tax")
    private java.math.BigDecimal tax;
    /** Description: reward. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "reward")
    private java.lang.Integer reward;

    public OcOrderProduct() {}

    public java.lang.Integer getOrderProductId() {
        return this.orderProductId;
    }

    public void setOrderProductId(java.lang.Integer orderProductId) {
        this.orderProductId = orderProductId;
    }

    public java.lang.Integer getOrderId() {
        return this.orderId;
    }

    public java.lang.Integer getProductId() {
        return this.productId;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getModel() {
        return this.model;
    }

    public java.lang.Integer getQuantity() {
        return this.quantity;
    }

    public java.math.BigDecimal getPrice() {
        return this.price;
    }

    public java.math.BigDecimal getTotal() {
        return this.total;
    }

    public java.math.BigDecimal getTax() {
        return this.tax;
    }

    public java.lang.Integer getReward() {
        return this.reward;
    }

    public void setOrderId(java.lang.Integer orderId) {
        this.orderId = orderId;
    }

    public void setProductId(java.lang.Integer productId) {
        this.productId = productId;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setModel(java.lang.String model) {
        this.model = model;
    }

    public void setQuantity(java.lang.Integer quantity) {
        this.quantity = quantity;
    }

    public void setPrice(java.math.BigDecimal price) {
        this.price = price;
    }

    public void setTotal(java.math.BigDecimal total) {
        this.total = total;
    }

    public void setTax(java.math.BigDecimal tax) {
        this.tax = tax;
    }

    public void setReward(java.lang.Integer reward) {
        this.reward = reward;
    }
}
