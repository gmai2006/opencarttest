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
@Table(name = "oc_order_recurring")
public class OcOrderRecurring implements Serializable {
    private static final long serialVersionUID = 163436923147316762L;

    /** Description: order_recurring_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "order_recurring_id")
    private java.lang.Integer orderRecurringId;

    /** Description: order_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "order_id")
    private java.lang.Integer orderId;
    /** Description: reference. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "reference", length = 255)
    private java.lang.String reference;
    /** Description: product_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "product_id")
    private java.lang.Integer productId;
    /** Description: product_name. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "product_name", length = 255)
    private java.lang.String productName;
    /** Description: product_quantity. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "product_quantity")
    private java.lang.Integer productQuantity;
    /** Description: recurring_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "recurring_id")
    private java.lang.Integer recurringId;
    /** Description: recurring_name. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "recurring_name", length = 255)
    private java.lang.String recurringName;
    /** Description: recurring_description. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "recurring_description", length = 255)
    private java.lang.String recurringDescription;
    /** Description: recurring_frequency. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "recurring_frequency", length = 25)
    private java.lang.String recurringFrequency;
    /** Description: recurring_cycle. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "recurring_cycle")
    private java.lang.Integer recurringCycle;
    /** Description: recurring_duration. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "recurring_duration")
    private java.lang.Integer recurringDuration;
    /** Description: recurring_price. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "recurring_price")
    private java.math.BigDecimal recurringPrice;
    /** Description: trial. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "trial")
    private java.lang.Boolean trial;
    /** Description: trial_frequency. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "trial_frequency", length = 25)
    private java.lang.String trialFrequency;
    /** Description: trial_cycle. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "trial_cycle")
    private java.lang.Integer trialCycle;
    /** Description: trial_duration. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "trial_duration")
    private java.lang.Integer trialDuration;
    /** Description: trial_price. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "trial_price")
    private java.math.BigDecimal trialPrice;
    /** Description: status. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "status")
    private java.lang.Integer status;
    /** Description: date_added. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "date_added")
    private java.sql.Timestamp dateAdded;

    public OcOrderRecurring() {}

    public java.lang.Integer getOrderRecurringId() {
        return this.orderRecurringId;
    }

    public void setOrderRecurringId(java.lang.Integer orderRecurringId) {
        this.orderRecurringId = orderRecurringId;
    }

    public java.lang.Integer getOrderId() {
        return this.orderId;
    }

    public java.lang.String getReference() {
        return this.reference;
    }

    public java.lang.Integer getProductId() {
        return this.productId;
    }

    public java.lang.String getProductName() {
        return this.productName;
    }

    public java.lang.Integer getProductQuantity() {
        return this.productQuantity;
    }

    public java.lang.Integer getRecurringId() {
        return this.recurringId;
    }

    public java.lang.String getRecurringName() {
        return this.recurringName;
    }

    public java.lang.String getRecurringDescription() {
        return this.recurringDescription;
    }

    public java.lang.String getRecurringFrequency() {
        return this.recurringFrequency;
    }

    public java.lang.Integer getRecurringCycle() {
        return this.recurringCycle;
    }

    public java.lang.Integer getRecurringDuration() {
        return this.recurringDuration;
    }

    public java.math.BigDecimal getRecurringPrice() {
        return this.recurringPrice;
    }

    public java.lang.Boolean getTrial() {
        return this.trial;
    }

    public java.lang.String getTrialFrequency() {
        return this.trialFrequency;
    }

    public java.lang.Integer getTrialCycle() {
        return this.trialCycle;
    }

    public java.lang.Integer getTrialDuration() {
        return this.trialDuration;
    }

    public java.math.BigDecimal getTrialPrice() {
        return this.trialPrice;
    }

    public java.lang.Integer getStatus() {
        return this.status;
    }

    public java.sql.Timestamp getDateAdded() {
        return this.dateAdded;
    }

    public void setOrderId(java.lang.Integer orderId) {
        this.orderId = orderId;
    }

    public void setReference(java.lang.String reference) {
        this.reference = reference;
    }

    public void setProductId(java.lang.Integer productId) {
        this.productId = productId;
    }

    public void setProductName(java.lang.String productName) {
        this.productName = productName;
    }

    public void setProductQuantity(java.lang.Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public void setRecurringId(java.lang.Integer recurringId) {
        this.recurringId = recurringId;
    }

    public void setRecurringName(java.lang.String recurringName) {
        this.recurringName = recurringName;
    }

    public void setRecurringDescription(java.lang.String recurringDescription) {
        this.recurringDescription = recurringDescription;
    }

    public void setRecurringFrequency(java.lang.String recurringFrequency) {
        this.recurringFrequency = recurringFrequency;
    }

    public void setRecurringCycle(java.lang.Integer recurringCycle) {
        this.recurringCycle = recurringCycle;
    }

    public void setRecurringDuration(java.lang.Integer recurringDuration) {
        this.recurringDuration = recurringDuration;
    }

    public void setRecurringPrice(java.math.BigDecimal recurringPrice) {
        this.recurringPrice = recurringPrice;
    }

    public void setTrial(java.lang.Boolean trial) {
        this.trial = trial;
    }

    public void setTrialFrequency(java.lang.String trialFrequency) {
        this.trialFrequency = trialFrequency;
    }

    public void setTrialCycle(java.lang.Integer trialCycle) {
        this.trialCycle = trialCycle;
    }

    public void setTrialDuration(java.lang.Integer trialDuration) {
        this.trialDuration = trialDuration;
    }

    public void setTrialPrice(java.math.BigDecimal trialPrice) {
        this.trialPrice = trialPrice;
    }

    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }

    public void setDateAdded(java.sql.Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }
}
