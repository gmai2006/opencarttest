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
@Table(name = "oc_coupon")
public class OcCoupon implements Serializable {
    private static final long serialVersionUID = 163436923092734081L;

    /** Description: coupon_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "coupon_id")
    private java.lang.Integer couponId;

    /** Description: name. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "name", length = 128)
    private java.lang.String name;
    /** Description: code. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "code", length = 20)
    private java.lang.String code;
    /** Description: type. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "type", length = 1)
    private java.lang.String type;
    /** Description: discount. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "discount")
    private java.math.BigDecimal discount;
    /** Description: logged. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "logged")
    private java.lang.Boolean logged;
    /** Description: shipping. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "shipping")
    private java.lang.Boolean shipping;
    /** Description: total. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "total")
    private java.math.BigDecimal total;
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
    /** Description: uses_total. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "uses_total")
    private java.lang.Integer usesTotal;
    /** Description: uses_customer. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "uses_customer", length = 11)
    private java.lang.String usesCustomer;
    /** Description: status. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "status")
    private java.lang.Boolean status;
    /** Description: date_added. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "date_added")
    private java.sql.Timestamp dateAdded;

    public OcCoupon() {}

    public java.lang.Integer getCouponId() {
        return this.couponId;
    }

    public void setCouponId(java.lang.Integer couponId) {
        this.couponId = couponId;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getCode() {
        return this.code;
    }

    public java.lang.String getType() {
        return this.type;
    }

    public java.math.BigDecimal getDiscount() {
        return this.discount;
    }

    public java.lang.Boolean getLogged() {
        return this.logged;
    }

    public java.lang.Boolean getShipping() {
        return this.shipping;
    }

    public java.math.BigDecimal getTotal() {
        return this.total;
    }

    public java.util.Date getDateStart() {
        return this.dateStart;
    }

    public java.util.Date getDateEnd() {
        return this.dateEnd;
    }

    public java.lang.Integer getUsesTotal() {
        return this.usesTotal;
    }

    public java.lang.String getUsesCustomer() {
        return this.usesCustomer;
    }

    public java.lang.Boolean getStatus() {
        return this.status;
    }

    public java.sql.Timestamp getDateAdded() {
        return this.dateAdded;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setCode(java.lang.String code) {
        this.code = code;
    }

    public void setType(java.lang.String type) {
        this.type = type;
    }

    public void setDiscount(java.math.BigDecimal discount) {
        this.discount = discount;
    }

    public void setLogged(java.lang.Boolean logged) {
        this.logged = logged;
    }

    public void setShipping(java.lang.Boolean shipping) {
        this.shipping = shipping;
    }

    public void setTotal(java.math.BigDecimal total) {
        this.total = total;
    }

    public void setDateStart(java.util.Date dateStart) {
        this.dateStart = dateStart;
    }

    public void setDateEnd(java.util.Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public void setUsesTotal(java.lang.Integer usesTotal) {
        this.usesTotal = usesTotal;
    }

    public void setUsesCustomer(java.lang.String usesCustomer) {
        this.usesCustomer = usesCustomer;
    }

    public void setStatus(java.lang.Boolean status) {
        this.status = status;
    }

    public void setDateAdded(java.sql.Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }
}
