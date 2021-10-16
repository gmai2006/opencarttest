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
@Table(name = "oc_product_discount")
public class OcProductDiscount implements Serializable {
    private static final long serialVersionUID = 163436923159173154L;

    /** Description: product_discount_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "product_discount_id")
    private java.lang.Integer productDiscountId;

    /** Description: product_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "product_id")
    private java.lang.Integer productId;
    /** Description: customer_group_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "customer_group_id")
    private java.lang.Integer customerGroupId;
    /** Description: quantity. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "quantity")
    private java.lang.Integer quantity;
    /** Description: priority. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "priority")
    private java.lang.Integer priority;
    /** Description: price. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "price")
    private java.math.BigDecimal price;
    /** Description: date_start. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "date_start")
    private java.util.Date dateStart;
    /** Description: date_end. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "date_end")
    private java.util.Date dateEnd;

    public OcProductDiscount() {}

    public java.lang.Integer getProductDiscountId() {
        return this.productDiscountId;
    }

    public void setProductDiscountId(java.lang.Integer productDiscountId) {
        this.productDiscountId = productDiscountId;
    }

    public java.lang.Integer getProductId() {
        return this.productId;
    }

    public java.lang.Integer getCustomerGroupId() {
        return this.customerGroupId;
    }

    public java.lang.Integer getQuantity() {
        return this.quantity;
    }

    public java.lang.Integer getPriority() {
        return this.priority;
    }

    public java.math.BigDecimal getPrice() {
        return this.price;
    }

    public java.util.Date getDateStart() {
        return this.dateStart;
    }

    public java.util.Date getDateEnd() {
        return this.dateEnd;
    }

    public void setProductId(java.lang.Integer productId) {
        this.productId = productId;
    }

    public void setCustomerGroupId(java.lang.Integer customerGroupId) {
        this.customerGroupId = customerGroupId;
    }

    public void setQuantity(java.lang.Integer quantity) {
        this.quantity = quantity;
    }

    public void setPriority(java.lang.Integer priority) {
        this.priority = priority;
    }

    public void setPrice(java.math.BigDecimal price) {
        this.price = price;
    }

    public void setDateStart(java.util.Date dateStart) {
        this.dateStart = dateStart;
    }

    public void setDateEnd(java.util.Date dateEnd) {
        this.dateEnd = dateEnd;
    }
}
