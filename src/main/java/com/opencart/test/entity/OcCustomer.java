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
@Table(name = "oc_customer")
public class OcCustomer implements Serializable {
    private static final long serialVersionUID = 163436923101712429L;

    /** Description: customer_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "customer_id")
    private java.lang.Integer customerId;

    /** Description: customer_group_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "customer_group_id")
    private java.lang.Integer customerGroupId;
    /** Description: store_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "store_id")
    private java.lang.Integer storeId;
    /** Description: language_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "language_id")
    private java.lang.Integer languageId;
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
    /** Description: fax. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "fax", length = 32)
    private java.lang.String fax;
    /** Description: password. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "password", length = 40)
    private java.lang.String password;
    /** Description: salt. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "salt", length = 9)
    private java.lang.String salt;
    /** Description: cart. */
    @Basic
    @Column(name = "cart", length = 65535)
    private java.lang.String cart;
    /** Description: wishlist. */
    @Basic
    @Column(name = "wishlist", length = 65535)
    private java.lang.String wishlist;
    /** Description: newsletter. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "newsletter")
    private java.lang.Boolean newsletter;
    /** Description: address_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "address_id")
    private java.lang.Integer addressId;
    /** Description: custom_field. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "custom_field", length = 65535)
    private java.lang.String customField;
    /** Description: ip. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "ip", length = 40)
    private java.lang.String ip;
    /** Description: status. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "status")
    private java.lang.Boolean status;
    /** Description: approved. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "approved")
    private java.lang.Boolean approved;
    /** Description: safe. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "safe")
    private java.lang.Boolean safe;
    /** Description: token. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "token", length = 65535)
    private java.lang.String token;
    /** Description: code. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "code", length = 40)
    private java.lang.String code;
    /** Description: date_added. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "date_added")
    private java.sql.Timestamp dateAdded;

    public OcCustomer() {}

    public java.lang.Integer getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(java.lang.Integer customerId) {
        this.customerId = customerId;
    }

    public java.lang.Integer getCustomerGroupId() {
        return this.customerGroupId;
    }

    public java.lang.Integer getStoreId() {
        return this.storeId;
    }

    public java.lang.Integer getLanguageId() {
        return this.languageId;
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

    public java.lang.String getFax() {
        return this.fax;
    }

    public java.lang.String getPassword() {
        return this.password;
    }

    public java.lang.String getSalt() {
        return this.salt;
    }

    public java.lang.String getCart() {
        return this.cart;
    }

    public java.lang.String getWishlist() {
        return this.wishlist;
    }

    public java.lang.Boolean getNewsletter() {
        return this.newsletter;
    }

    public java.lang.Integer getAddressId() {
        return this.addressId;
    }

    public java.lang.String getCustomField() {
        return this.customField;
    }

    public java.lang.String getIp() {
        return this.ip;
    }

    public java.lang.Boolean getStatus() {
        return this.status;
    }

    public java.lang.Boolean getApproved() {
        return this.approved;
    }

    public java.lang.Boolean getSafe() {
        return this.safe;
    }

    public java.lang.String getToken() {
        return this.token;
    }

    public java.lang.String getCode() {
        return this.code;
    }

    public java.sql.Timestamp getDateAdded() {
        return this.dateAdded;
    }

    public void setCustomerGroupId(java.lang.Integer customerGroupId) {
        this.customerGroupId = customerGroupId;
    }

    public void setStoreId(java.lang.Integer storeId) {
        this.storeId = storeId;
    }

    public void setLanguageId(java.lang.Integer languageId) {
        this.languageId = languageId;
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

    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }

    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    public void setSalt(java.lang.String salt) {
        this.salt = salt;
    }

    public void setCart(java.lang.String cart) {
        this.cart = cart;
    }

    public void setWishlist(java.lang.String wishlist) {
        this.wishlist = wishlist;
    }

    public void setNewsletter(java.lang.Boolean newsletter) {
        this.newsletter = newsletter;
    }

    public void setAddressId(java.lang.Integer addressId) {
        this.addressId = addressId;
    }

    public void setCustomField(java.lang.String customField) {
        this.customField = customField;
    }

    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }

    public void setStatus(java.lang.Boolean status) {
        this.status = status;
    }

    public void setApproved(java.lang.Boolean approved) {
        this.approved = approved;
    }

    public void setSafe(java.lang.Boolean safe) {
        this.safe = safe;
    }

    public void setToken(java.lang.String token) {
        this.token = token;
    }

    public void setCode(java.lang.String code) {
        this.code = code;
    }

    public void setDateAdded(java.sql.Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }
}
