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
@Table(name = "oc_order_total")
public class OcOrderTotal implements Serializable {
    private static final long serialVersionUID = 163436923151637854L;

    /** Description: order_total_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "order_total_id")
    private java.lang.Integer orderTotalId;

    /** Description: order_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "order_id")
    private java.lang.Integer orderId;
    /** Description: code. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "code", length = 32)
    private java.lang.String code;
    /** Description: title. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "title", length = 255)
    private java.lang.String title;
    /** Description: value. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "value")
    private java.math.BigDecimal value;
    /** Description: sort_order. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "sort_order")
    private java.lang.Integer sortOrder;

    public OcOrderTotal() {}

    public java.lang.Integer getOrderTotalId() {
        return this.orderTotalId;
    }

    public void setOrderTotalId(java.lang.Integer orderTotalId) {
        this.orderTotalId = orderTotalId;
    }

    public java.lang.Integer getOrderId() {
        return this.orderId;
    }

    public java.lang.String getCode() {
        return this.code;
    }

    public java.lang.String getTitle() {
        return this.title;
    }

    public java.math.BigDecimal getValue() {
        return this.value;
    }

    public java.lang.Integer getSortOrder() {
        return this.sortOrder;
    }

    public void setOrderId(java.lang.Integer orderId) {
        this.orderId = orderId;
    }

    public void setCode(java.lang.String code) {
        this.code = code;
    }

    public void setTitle(java.lang.String title) {
        this.title = title;
    }

    public void setValue(java.math.BigDecimal value) {
        this.value = value;
    }

    public void setSortOrder(java.lang.Integer sortOrder) {
        this.sortOrder = sortOrder;
    }
}
