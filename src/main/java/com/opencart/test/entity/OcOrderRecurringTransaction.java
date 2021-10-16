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
@Table(name = "oc_order_recurring_transaction")
public class OcOrderRecurringTransaction implements Serializable {
    private static final long serialVersionUID = 163436923149312722L;

    /** Description: order_recurring_transaction_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "order_recurring_transaction_id")
    private java.lang.Integer orderRecurringTransactionId;

    /** Description: order_recurring_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "order_recurring_id")
    private java.lang.Integer orderRecurringId;
    /** Description: reference. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "reference", length = 255)
    private java.lang.String reference;
    /** Description: type. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "type", length = 255)
    private java.lang.String type;
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

    public OcOrderRecurringTransaction() {}

    public java.lang.Integer getOrderRecurringTransactionId() {
        return this.orderRecurringTransactionId;
    }

    public void setOrderRecurringTransactionId(java.lang.Integer orderRecurringTransactionId) {
        this.orderRecurringTransactionId = orderRecurringTransactionId;
    }

    public java.lang.Integer getOrderRecurringId() {
        return this.orderRecurringId;
    }

    public java.lang.String getReference() {
        return this.reference;
    }

    public java.lang.String getType() {
        return this.type;
    }

    public java.math.BigDecimal getAmount() {
        return this.amount;
    }

    public java.sql.Timestamp getDateAdded() {
        return this.dateAdded;
    }

    public void setOrderRecurringId(java.lang.Integer orderRecurringId) {
        this.orderRecurringId = orderRecurringId;
    }

    public void setReference(java.lang.String reference) {
        this.reference = reference;
    }

    public void setType(java.lang.String type) {
        this.type = type;
    }

    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }

    public void setDateAdded(java.sql.Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }
}
