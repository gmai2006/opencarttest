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
@Table(name = "oc_order_history")
public class OcOrderHistory implements Serializable {
    private static final long serialVersionUID = 163436923144282865L;

    /** Description: order_history_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "order_history_id")
    private java.lang.Integer orderHistoryId;

    /** Description: order_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "order_id")
    private java.lang.Integer orderId;
    /** Description: order_status_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "order_status_id")
    private java.lang.Integer orderStatusId;
    /** Description: notify. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "notify")
    private java.lang.Boolean notify;
    /** Description: comment. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "comment", length = 65535)
    private java.lang.String comment;
    /** Description: date_added. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "date_added")
    private java.sql.Timestamp dateAdded;

    public OcOrderHistory() {}

    public java.lang.Integer getOrderHistoryId() {
        return this.orderHistoryId;
    }

    public void setOrderHistoryId(java.lang.Integer orderHistoryId) {
        this.orderHistoryId = orderHistoryId;
    }

    public java.lang.Integer getOrderId() {
        return this.orderId;
    }

    public java.lang.Integer getOrderStatusId() {
        return this.orderStatusId;
    }

    public java.lang.Boolean getNotify() {
        return this.notify;
    }

    public java.lang.String getComment() {
        return this.comment;
    }

    public java.sql.Timestamp getDateAdded() {
        return this.dateAdded;
    }

    public void setOrderId(java.lang.Integer orderId) {
        this.orderId = orderId;
    }

    public void setOrderStatusId(java.lang.Integer orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public void setNotify(java.lang.Boolean notify) {
        this.notify = notify;
    }

    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }

    public void setDateAdded(java.sql.Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }
}
