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
@Table(name = "oc_address")
public class OcAddress implements Serializable {
    private static final long serialVersionUID = 163436923065473069L;

    /** Description: address_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "address_id")
    private java.lang.Integer addressId;

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
    /** Description: company. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "company", length = 40)
    private java.lang.String company;
    /** Description: address_1. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "address_1", length = 128)
    private java.lang.String address1;
    /** Description: address_2. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "address_2", length = 128)
    private java.lang.String address2;
    /** Description: city. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "city", length = 128)
    private java.lang.String city;
    /** Description: postcode. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "postcode", length = 10)
    private java.lang.String postcode;
    /** Description: country_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "country_id")
    private java.lang.Integer countryId;
    /** Description: zone_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "zone_id")
    private java.lang.Integer zoneId;
    /** Description: custom_field. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "custom_field", length = 65535)
    private java.lang.String customField;

    public OcAddress() {}

    public java.lang.Integer getAddressId() {
        return this.addressId;
    }

    public void setAddressId(java.lang.Integer addressId) {
        this.addressId = addressId;
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

    public java.lang.String getCompany() {
        return this.company;
    }

    public java.lang.String getAddress1() {
        return this.address1;
    }

    public java.lang.String getAddress2() {
        return this.address2;
    }

    public java.lang.String getCity() {
        return this.city;
    }

    public java.lang.String getPostcode() {
        return this.postcode;
    }

    public java.lang.Integer getCountryId() {
        return this.countryId;
    }

    public java.lang.Integer getZoneId() {
        return this.zoneId;
    }

    public java.lang.String getCustomField() {
        return this.customField;
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

    public void setCompany(java.lang.String company) {
        this.company = company;
    }

    public void setAddress1(java.lang.String address1) {
        this.address1 = address1;
    }

    public void setAddress2(java.lang.String address2) {
        this.address2 = address2;
    }

    public void setCity(java.lang.String city) {
        this.city = city;
    }

    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }

    public void setCountryId(java.lang.Integer countryId) {
        this.countryId = countryId;
    }

    public void setZoneId(java.lang.Integer zoneId) {
        this.zoneId = zoneId;
    }

    public void setCustomField(java.lang.String customField) {
        this.customField = customField;
    }
}
