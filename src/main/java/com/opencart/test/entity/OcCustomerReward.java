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
@Table(name = "oc_customer_reward")
public class OcCustomerReward implements Serializable {
    private static final long serialVersionUID = 163436923107868118L;

    /** Description: customer_reward_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "customer_reward_id")
    private java.lang.Integer customerRewardId;

    /** Description: customer_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "customer_id")
    private java.lang.Integer customerId;
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
    /** Description: points. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "points")
    private java.lang.Integer points;
    /** Description: date_added. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "date_added")
    private java.sql.Timestamp dateAdded;

    public OcCustomerReward() {}

    public java.lang.Integer getCustomerRewardId() {
        return this.customerRewardId;
    }

    public void setCustomerRewardId(java.lang.Integer customerRewardId) {
        this.customerRewardId = customerRewardId;
    }

    public java.lang.Integer getCustomerId() {
        return this.customerId;
    }

    public java.lang.Integer getOrderId() {
        return this.orderId;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public java.lang.Integer getPoints() {
        return this.points;
    }

    public java.sql.Timestamp getDateAdded() {
        return this.dateAdded;
    }

    public void setCustomerId(java.lang.Integer customerId) {
        this.customerId = customerId;
    }

    public void setOrderId(java.lang.Integer orderId) {
        this.orderId = orderId;
    }

    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public void setPoints(java.lang.Integer points) {
        this.points = points;
    }

    public void setDateAdded(java.sql.Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }
}
