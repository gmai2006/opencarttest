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
@Table(name = "oc_voucher")
public class OcVoucher implements Serializable {
    private static final long serialVersionUID = 163436923187262438L;

    /** Description: voucher_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "voucher_id")
    private java.lang.Integer voucherId;

    /** Description: order_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "order_id")
    private java.lang.Integer orderId;
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

    public OcVoucher() {}

    public java.lang.Integer getVoucherId() {
        return this.voucherId;
    }

    public void setVoucherId(java.lang.Integer voucherId) {
        this.voucherId = voucherId;
    }

    public java.lang.Integer getOrderId() {
        return this.orderId;
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

    public java.lang.Boolean getStatus() {
        return this.status;
    }

    public java.sql.Timestamp getDateAdded() {
        return this.dateAdded;
    }

    public void setOrderId(java.lang.Integer orderId) {
        this.orderId = orderId;
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

    public void setStatus(java.lang.Boolean status) {
        this.status = status;
    }

    public void setDateAdded(java.sql.Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }
}
