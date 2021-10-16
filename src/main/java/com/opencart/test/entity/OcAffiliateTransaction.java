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
@Table(name = "oc_affiliate_transaction")
public class OcAffiliateTransaction implements Serializable {
    private static final long serialVersionUID = 163436923077457350L;

    /** Description: affiliate_transaction_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "affiliate_transaction_id")
    private java.lang.Integer affiliateTransactionId;

    /** Description: affiliate_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "affiliate_id")
    private java.lang.Integer affiliateId;
    /** Description: order_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "order_id")
    private java.lang.Integer orderId;
    /** Description: description. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "description", length = 65535)
    private java.lang.String description;
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

    public OcAffiliateTransaction() {}

    public java.lang.Integer getAffiliateTransactionId() {
        return this.affiliateTransactionId;
    }

    public void setAffiliateTransactionId(java.lang.Integer affiliateTransactionId) {
        this.affiliateTransactionId = affiliateTransactionId;
    }

    public java.lang.Integer getAffiliateId() {
        return this.affiliateId;
    }

    public java.lang.Integer getOrderId() {
        return this.orderId;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public java.math.BigDecimal getAmount() {
        return this.amount;
    }

    public java.sql.Timestamp getDateAdded() {
        return this.dateAdded;
    }

    public void setAffiliateId(java.lang.Integer affiliateId) {
        this.affiliateId = affiliateId;
    }

    public void setOrderId(java.lang.Integer orderId) {
        this.orderId = orderId;
    }

    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }

    public void setDateAdded(java.sql.Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }
}
