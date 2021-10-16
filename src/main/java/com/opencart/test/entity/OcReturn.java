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
@Table(name = "oc_return")
public class OcReturn implements Serializable {
    private static final long serialVersionUID = 163436923172545936L;

    /** Description: return_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "return_id")
    private java.lang.Integer returnId;

    /** Description: order_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "order_id")
    private java.lang.Integer orderId;
    /** Description: product_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "product_id")
    private java.lang.Integer productId;
    /** Description: customer_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "customer_id")
    private java.lang.Integer customerId;
    /** Description: firstname. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "firstname", length = 32)
    private java.lang.String firstname;
    /** Description: lastname. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "lastname", length = 32)
    private java.lang.String lastname;
    /** Description: email. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "email", length = 96)
    private java.lang.String email;
    /** Description: telephone. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "telephone", length = 32)
    private java.lang.String telephone;
    /** Description: product. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "product", length = 255)
    private java.lang.String product;
    /** Description: model. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "model", length = 64)
    private java.lang.String model;
    /** Description: quantity. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "quantity")
    private java.lang.Integer quantity;
    /** Description: opened. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "opened")
    private java.lang.Boolean opened;
    /** Description: return_reason_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "return_reason_id")
    private java.lang.Integer returnReasonId;
    /** Description: return_action_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "return_action_id")
    private java.lang.Integer returnActionId;
    /** Description: return_status_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "return_status_id")
    private java.lang.Integer returnStatusId;
    /** Description: comment. */
    @Basic
    @Column(name = "comment", length = 65535)
    private java.lang.String comment;
    /** Description: date_ordered. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "date_ordered")
    private java.util.Date dateOrdered;
    /** Description: date_added. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "date_added")
    private java.sql.Timestamp dateAdded;
    /** Description: date_modified. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "date_modified")
    private java.sql.Timestamp dateModified;

    public OcReturn() {}

    public java.lang.Integer getReturnId() {
        return this.returnId;
    }

    public void setReturnId(java.lang.Integer returnId) {
        this.returnId = returnId;
    }

    public java.lang.Integer getOrderId() {
        return this.orderId;
    }

    public java.lang.Integer getProductId() {
        return this.productId;
    }

    public java.lang.Integer getCustomerId() {
        return this.customerId;
    }

    public java.lang.String getFirstname() {
        return this.firstname;
    }

    public java.lang.String getLastname() {
        return this.lastname;
    }

    public java.lang.String getEmail() {
        return this.email;
    }

    public java.lang.String getTelephone() {
        return this.telephone;
    }

    public java.lang.String getProduct() {
        return this.product;
    }

    public java.lang.String getModel() {
        return this.model;
    }

    public java.lang.Integer getQuantity() {
        return this.quantity;
    }

    public java.lang.Boolean getOpened() {
        return this.opened;
    }

    public java.lang.Integer getReturnReasonId() {
        return this.returnReasonId;
    }

    public java.lang.Integer getReturnActionId() {
        return this.returnActionId;
    }

    public java.lang.Integer getReturnStatusId() {
        return this.returnStatusId;
    }

    public java.lang.String getComment() {
        return this.comment;
    }

    public java.util.Date getDateOrdered() {
        return this.dateOrdered;
    }

    public java.sql.Timestamp getDateAdded() {
        return this.dateAdded;
    }

    public java.sql.Timestamp getDateModified() {
        return this.dateModified;
    }

    public void setOrderId(java.lang.Integer orderId) {
        this.orderId = orderId;
    }

    public void setProductId(java.lang.Integer productId) {
        this.productId = productId;
    }

    public void setCustomerId(java.lang.Integer customerId) {
        this.customerId = customerId;
    }

    public void setFirstname(java.lang.String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(java.lang.String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    public void setTelephone(java.lang.String telephone) {
        this.telephone = telephone;
    }

    public void setProduct(java.lang.String product) {
        this.product = product;
    }

    public void setModel(java.lang.String model) {
        this.model = model;
    }

    public void setQuantity(java.lang.Integer quantity) {
        this.quantity = quantity;
    }

    public void setOpened(java.lang.Boolean opened) {
        this.opened = opened;
    }

    public void setReturnReasonId(java.lang.Integer returnReasonId) {
        this.returnReasonId = returnReasonId;
    }

    public void setReturnActionId(java.lang.Integer returnActionId) {
        this.returnActionId = returnActionId;
    }

    public void setReturnStatusId(java.lang.Integer returnStatusId) {
        this.returnStatusId = returnStatusId;
    }

    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }

    public void setDateOrdered(java.util.Date dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public void setDateAdded(java.sql.Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }

    public void setDateModified(java.sql.Timestamp dateModified) {
        this.dateModified = dateModified;
    }
}
