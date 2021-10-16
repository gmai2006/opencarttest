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
@Table(name = "oc_coupon_history")
public class OcCouponHistory implements Serializable {
    private static final long serialVersionUID = 16343692309485218L;

    /** Description: coupon_history_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "coupon_history_id")
    private java.lang.Integer couponHistoryId;

    /** Description: coupon_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "coupon_id")
    private java.lang.Integer couponId;
    /** Description: order_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "order_id")
    private java.lang.Integer orderId;
    /** Description: customer_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "customer_id")
    private java.lang.Integer customerId;
    /** Description: amount. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "amount")
    private java.math.BigDecimal amount;
    /** Description: date_added. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "date_added")
    private java.sql.Timestamp dateAdded;

    public OcCouponHistory() {}

    public java.lang.Integer getCouponHistoryId() {
        return this.couponHistoryId;
    }

    public void setCouponHistoryId(java.lang.Integer couponHistoryId) {
        this.couponHistoryId = couponHistoryId;
    }

    public java.lang.Integer getCouponId() {
        return this.couponId;
    }

    public java.lang.Integer getOrderId() {
        return this.orderId;
    }

    public java.lang.Integer getCustomerId() {
        return this.customerId;
    }

    public java.math.BigDecimal getAmount() {
        return this.amount;
    }

    public java.sql.Timestamp getDateAdded() {
        return this.dateAdded;
    }

    public void setCouponId(java.lang.Integer couponId) {
        this.couponId = couponId;
    }

    public void setOrderId(java.lang.Integer orderId) {
        this.orderId = orderId;
    }

    public void setCustomerId(java.lang.Integer customerId) {
        this.customerId = customerId;
    }

    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }

    public void setDateAdded(java.sql.Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }
}
