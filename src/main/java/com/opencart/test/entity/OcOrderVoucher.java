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
@Table(name = "oc_order_voucher")
public class OcOrderVoucher implements Serializable {
    private static final long serialVersionUID = 163436923152770992L;

    /** Description: order_voucher_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "order_voucher_id")
    private java.lang.Integer orderVoucherId;

    /** Description: order_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "order_id")
    private java.lang.Integer orderId;
    /** Description: voucher_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "voucher_id")
    private java.lang.Integer voucherId;
    /** Description: description. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "description", length = 255)
    private java.lang.String description;
    /** Description: code. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "code", length = 10)
    private java.lang.String code;
    /** Description: from_name. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "from_name", length = 64)
    private java.lang.String fromName;
    /** Description: from_email. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "from_email", length = 96)
    private java.lang.String fromEmail;
    /** Description: to_name. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "to_name", length = 64)
    private java.lang.String toName;
    /** Description: to_email. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "to_email", length = 96)
    private java.lang.String toEmail;
    /** Description: voucher_theme_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "voucher_theme_id")
    private java.lang.Integer voucherThemeId;
    /** Description: message. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "message", length = 65535)
    private java.lang.String message;
    /** Description: amount. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "amount")
    private java.math.BigDecimal amount;

    public OcOrderVoucher() {}

    public java.lang.Integer getOrderVoucherId() {
        return this.orderVoucherId;
    }

    public void setOrderVoucherId(java.lang.Integer orderVoucherId) {
        this.orderVoucherId = orderVoucherId;
    }

    public java.lang.Integer getOrderId() {
        return this.orderId;
    }

    public java.lang.Integer getVoucherId() {
        return this.voucherId;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public java.lang.String getCode() {
        return this.code;
    }

    public java.lang.String getFromName() {
        return this.fromName;
    }

    public java.lang.String getFromEmail() {
        return this.fromEmail;
    }

    public java.lang.String getToName() {
        return this.toName;
    }

    public java.lang.String getToEmail() {
        return this.toEmail;
    }

    public java.lang.Integer getVoucherThemeId() {
        return this.voucherThemeId;
    }

    public java.lang.String getMessage() {
        return this.message;
    }

    public java.math.BigDecimal getAmount() {
        return this.amount;
    }

    public void setOrderId(java.lang.Integer orderId) {
        this.orderId = orderId;
    }

    public void setVoucherId(java.lang.Integer voucherId) {
        this.voucherId = voucherId;
    }

    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public void setCode(java.lang.String code) {
        this.code = code;
    }

    public void setFromName(java.lang.String fromName) {
        this.fromName = fromName;
    }

    public void setFromEmail(java.lang.String fromEmail) {
        this.fromEmail = fromEmail;
    }

    public void setToName(java.lang.String toName) {
        this.toName = toName;
    }

    public void setToEmail(java.lang.String toEmail) {
        this.toEmail = toEmail;
    }

    public void setVoucherThemeId(java.lang.Integer voucherThemeId) {
        this.voucherThemeId = voucherThemeId;
    }

    public void setMessage(java.lang.String message) {
        this.message = message;
    }

    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }
}
