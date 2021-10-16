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
@Table(name = "oc_cart")
public class OcCart implements Serializable {
    private static final long serialVersionUID = 163436923084749874L;

    /** Description: cart_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "cart_id")
    private java.lang.Integer cartId;

    /** Description: api_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "api_id")
    private java.lang.Integer apiId;
    /** Description: customer_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "customer_id")
    private java.lang.Integer customerId;
    /** Description: session_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "session_id", length = 32)
    private java.lang.String sessionId;
    /** Description: product_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "product_id")
    private java.lang.Integer productId;
    /** Description: recurring_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "recurring_id")
    private java.lang.Integer recurringId;
    /** Description: option. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "option", length = 65535)
    private java.lang.String option;
    /** Description: quantity. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "quantity")
    private java.lang.Integer quantity;
    /** Description: date_added. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "date_added")
    private java.sql.Timestamp dateAdded;

    public OcCart() {}

    public java.lang.Integer getCartId() {
        return this.cartId;
    }

    public void setCartId(java.lang.Integer cartId) {
        this.cartId = cartId;
    }

    public java.lang.Integer getApiId() {
        return this.apiId;
    }

    public java.lang.Integer getCustomerId() {
        return this.customerId;
    }

    public java.lang.String getSessionId() {
        return this.sessionId;
    }

    public java.lang.Integer getProductId() {
        return this.productId;
    }

    public java.lang.Integer getRecurringId() {
        return this.recurringId;
    }

    public java.lang.String getOption() {
        return this.option;
    }

    public java.lang.Integer getQuantity() {
        return this.quantity;
    }

    public java.sql.Timestamp getDateAdded() {
        return this.dateAdded;
    }

    public void setApiId(java.lang.Integer apiId) {
        this.apiId = apiId;
    }

    public void setCustomerId(java.lang.Integer customerId) {
        this.customerId = customerId;
    }

    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }

    public void setProductId(java.lang.Integer productId) {
        this.productId = productId;
    }

    public void setRecurringId(java.lang.Integer recurringId) {
        this.recurringId = recurringId;
    }

    public void setOption(java.lang.String option) {
        this.option = option;
    }

    public void setQuantity(java.lang.Integer quantity) {
        this.quantity = quantity;
    }

    public void setDateAdded(java.sql.Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }
}
