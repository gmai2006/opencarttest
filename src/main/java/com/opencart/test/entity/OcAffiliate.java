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
@Table(name = "oc_affiliate")
public class OcAffiliate implements Serializable {
    private static final long serialVersionUID = 163436923072128976L;

    /** Description: affiliate_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "affiliate_id")
    private java.lang.Integer affiliateId;

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
    /** Description: company. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "company", length = 40)
    private java.lang.String company;
    /** Description: website. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "website", length = 255)
    private java.lang.String website;
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
    /** Description: code. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "code", length = 64)
    private java.lang.String code;
    /** Description: commission. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "commission")
    private java.math.BigDecimal commission;
    /** Description: tax. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "tax", length = 64)
    private java.lang.String tax;
    /** Description: payment. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "payment", length = 6)
    private java.lang.String payment;
    /** Description: cheque. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "cheque", length = 100)
    private java.lang.String cheque;
    /** Description: paypal. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "paypal", length = 64)
    private java.lang.String paypal;
    /** Description: bank_name. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "bank_name", length = 64)
    private java.lang.String bankName;
    /** Description: bank_branch_number. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "bank_branch_number", length = 64)
    private java.lang.String bankBranchNumber;
    /** Description: bank_swift_code. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "bank_swift_code", length = 64)
    private java.lang.String bankSwiftCode;
    /** Description: bank_account_name. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "bank_account_name", length = 64)
    private java.lang.String bankAccountName;
    /** Description: bank_account_number. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "bank_account_number", length = 64)
    private java.lang.String bankAccountNumber;
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
    /** Description: date_added. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "date_added")
    private java.sql.Timestamp dateAdded;

    public OcAffiliate() {}

    public java.lang.Integer getAffiliateId() {
        return this.affiliateId;
    }

    public void setAffiliateId(java.lang.Integer affiliateId) {
        this.affiliateId = affiliateId;
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

    public java.lang.String getCompany() {
        return this.company;
    }

    public java.lang.String getWebsite() {
        return this.website;
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

    public java.lang.String getCode() {
        return this.code;
    }

    public java.math.BigDecimal getCommission() {
        return this.commission;
    }

    public java.lang.String getTax() {
        return this.tax;
    }

    public java.lang.String getPayment() {
        return this.payment;
    }

    public java.lang.String getCheque() {
        return this.cheque;
    }

    public java.lang.String getPaypal() {
        return this.paypal;
    }

    public java.lang.String getBankName() {
        return this.bankName;
    }

    public java.lang.String getBankBranchNumber() {
        return this.bankBranchNumber;
    }

    public java.lang.String getBankSwiftCode() {
        return this.bankSwiftCode;
    }

    public java.lang.String getBankAccountName() {
        return this.bankAccountName;
    }

    public java.lang.String getBankAccountNumber() {
        return this.bankAccountNumber;
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

    public java.sql.Timestamp getDateAdded() {
        return this.dateAdded;
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

    public void setCompany(java.lang.String company) {
        this.company = company;
    }

    public void setWebsite(java.lang.String website) {
        this.website = website;
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

    public void setCode(java.lang.String code) {
        this.code = code;
    }

    public void setCommission(java.math.BigDecimal commission) {
        this.commission = commission;
    }

    public void setTax(java.lang.String tax) {
        this.tax = tax;
    }

    public void setPayment(java.lang.String payment) {
        this.payment = payment;
    }

    public void setCheque(java.lang.String cheque) {
        this.cheque = cheque;
    }

    public void setPaypal(java.lang.String paypal) {
        this.paypal = paypal;
    }

    public void setBankName(java.lang.String bankName) {
        this.bankName = bankName;
    }

    public void setBankBranchNumber(java.lang.String bankBranchNumber) {
        this.bankBranchNumber = bankBranchNumber;
    }

    public void setBankSwiftCode(java.lang.String bankSwiftCode) {
        this.bankSwiftCode = bankSwiftCode;
    }

    public void setBankAccountName(java.lang.String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public void setBankAccountNumber(java.lang.String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
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

    public void setDateAdded(java.sql.Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }
}
