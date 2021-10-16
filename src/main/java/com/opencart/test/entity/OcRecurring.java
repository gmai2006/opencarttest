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
@Table(name = "oc_recurring")
public class OcRecurring implements Serializable {
    private static final long serialVersionUID = 163436923170464011L;

    /** Description: recurring_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "recurring_id")
    private java.lang.Integer recurringId;

    /** Description: price. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "price")
    private java.math.BigDecimal price;
    /** Description: frequency. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "frequency", length = 10)
    private java.lang.String frequency;
    /** Description: duration. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "duration")
    private java.lang.Integer duration;
    /** Description: cycle. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "cycle")
    private java.lang.Integer cycle;
    /** Description: trial_status. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "trial_status")
    private java.lang.Integer trialStatus;
    /** Description: trial_price. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "trial_price")
    private java.math.BigDecimal trialPrice;
    /** Description: trial_frequency. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "trial_frequency", length = 10)
    private java.lang.String trialFrequency;
    /** Description: trial_duration. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "trial_duration")
    private java.lang.Integer trialDuration;
    /** Description: trial_cycle. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "trial_cycle")
    private java.lang.Integer trialCycle;
    /** Description: status. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "status")
    private java.lang.Integer status;
    /** Description: sort_order. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "sort_order")
    private java.lang.Integer sortOrder;

    public OcRecurring() {}

    public java.lang.Integer getRecurringId() {
        return this.recurringId;
    }

    public void setRecurringId(java.lang.Integer recurringId) {
        this.recurringId = recurringId;
    }

    public java.math.BigDecimal getPrice() {
        return this.price;
    }

    public java.lang.String getFrequency() {
        return this.frequency;
    }

    public java.lang.Integer getDuration() {
        return this.duration;
    }

    public java.lang.Integer getCycle() {
        return this.cycle;
    }

    public java.lang.Integer getTrialStatus() {
        return this.trialStatus;
    }

    public java.math.BigDecimal getTrialPrice() {
        return this.trialPrice;
    }

    public java.lang.String getTrialFrequency() {
        return this.trialFrequency;
    }

    public java.lang.Integer getTrialDuration() {
        return this.trialDuration;
    }

    public java.lang.Integer getTrialCycle() {
        return this.trialCycle;
    }

    public java.lang.Integer getStatus() {
        return this.status;
    }

    public java.lang.Integer getSortOrder() {
        return this.sortOrder;
    }

    public void setPrice(java.math.BigDecimal price) {
        this.price = price;
    }

    public void setFrequency(java.lang.String frequency) {
        this.frequency = frequency;
    }

    public void setDuration(java.lang.Integer duration) {
        this.duration = duration;
    }

    public void setCycle(java.lang.Integer cycle) {
        this.cycle = cycle;
    }

    public void setTrialStatus(java.lang.Integer trialStatus) {
        this.trialStatus = trialStatus;
    }

    public void setTrialPrice(java.math.BigDecimal trialPrice) {
        this.trialPrice = trialPrice;
    }

    public void setTrialFrequency(java.lang.String trialFrequency) {
        this.trialFrequency = trialFrequency;
    }

    public void setTrialDuration(java.lang.Integer trialDuration) {
        this.trialDuration = trialDuration;
    }

    public void setTrialCycle(java.lang.Integer trialCycle) {
        this.trialCycle = trialCycle;
    }

    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }

    public void setSortOrder(java.lang.Integer sortOrder) {
        this.sortOrder = sortOrder;
    }
}
