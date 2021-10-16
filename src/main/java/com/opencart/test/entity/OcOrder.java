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
@Table(name = "oc_order")
public class OcOrder implements Serializable {
    private static final long serialVersionUID = 163436923138631131L;

    /** Description: order_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "order_id")
    private java.lang.Integer orderId;

    /** Description: invoice_no. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "invoice_no")
    private java.lang.Integer invoiceNo;
    /** Description: invoice_prefix. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "invoice_prefix", length = 26)
    private java.lang.String invoicePrefix;
    /** Description: store_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "store_id")
    private java.lang.Integer storeId;
    /** Description: store_name. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "store_name", length = 64)
    private java.lang.String storeName;
    /** Description: store_url. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "store_url", length = 255)
    private java.lang.String storeUrl;
    /** Description: customer_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "customer_id")
    private java.lang.Integer customerId;
    /** Description: customer_group_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "customer_group_id")
    private java.lang.Integer customerGroupId;
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
    /** Description: custom_field. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "custom_field", length = 65535)
    private java.lang.String customField;
    /** Description: payment_firstname. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "payment_firstname", length = 32)
    private java.lang.String paymentFirstname;
    /** Description: payment_lastname. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "payment_lastname", length = 32)
    private java.lang.String paymentLastname;
    /** Description: payment_company. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "payment_company", length = 60)
    private java.lang.String paymentCompany;
    /** Description: payment_address_1. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "payment_address_1", length = 128)
    private java.lang.String paymentAddress1;
    /** Description: payment_address_2. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "payment_address_2", length = 128)
    private java.lang.String paymentAddress2;
    /** Description: payment_city. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "payment_city", length = 128)
    private java.lang.String paymentCity;
    /** Description: payment_postcode. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "payment_postcode", length = 10)
    private java.lang.String paymentPostcode;
    /** Description: payment_country. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "payment_country", length = 128)
    private java.lang.String paymentCountry;
    /** Description: payment_country_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "payment_country_id")
    private java.lang.Integer paymentCountryId;
    /** Description: payment_zone. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "payment_zone", length = 128)
    private java.lang.String paymentZone;
    /** Description: payment_zone_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "payment_zone_id")
    private java.lang.Integer paymentZoneId;
    /** Description: payment_address_format. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "payment_address_format", length = 65535)
    private java.lang.String paymentAddressFormat;
    /** Description: payment_custom_field. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "payment_custom_field", length = 65535)
    private java.lang.String paymentCustomField;
    /** Description: payment_method. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "payment_method", length = 128)
    private java.lang.String paymentMethod;
    /** Description: payment_code. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "payment_code", length = 128)
    private java.lang.String paymentCode;
    /** Description: shipping_firstname. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "shipping_firstname", length = 32)
    private java.lang.String shippingFirstname;
    /** Description: shipping_lastname. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "shipping_lastname", length = 32)
    private java.lang.String shippingLastname;
    /** Description: shipping_company. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "shipping_company", length = 60)
    private java.lang.String shippingCompany;
    /** Description: shipping_address_1. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "shipping_address_1", length = 128)
    private java.lang.String shippingAddress1;
    /** Description: shipping_address_2. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "shipping_address_2", length = 128)
    private java.lang.String shippingAddress2;
    /** Description: shipping_city. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "shipping_city", length = 128)
    private java.lang.String shippingCity;
    /** Description: shipping_postcode. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "shipping_postcode", length = 10)
    private java.lang.String shippingPostcode;
    /** Description: shipping_country. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "shipping_country", length = 128)
    private java.lang.String shippingCountry;
    /** Description: shipping_country_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "shipping_country_id")
    private java.lang.Integer shippingCountryId;
    /** Description: shipping_zone. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "shipping_zone", length = 128)
    private java.lang.String shippingZone;
    /** Description: shipping_zone_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "shipping_zone_id")
    private java.lang.Integer shippingZoneId;
    /** Description: shipping_address_format. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "shipping_address_format", length = 65535)
    private java.lang.String shippingAddressFormat;
    /** Description: shipping_custom_field. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "shipping_custom_field", length = 65535)
    private java.lang.String shippingCustomField;
    /** Description: shipping_method. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "shipping_method", length = 128)
    private java.lang.String shippingMethod;
    /** Description: shipping_code. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "shipping_code", length = 128)
    private java.lang.String shippingCode;
    /** Description: comment. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "comment", length = 65535)
    private java.lang.String comment;
    /** Description: total. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "total")
    private java.math.BigDecimal total;
    /** Description: order_status_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "order_status_id")
    private java.lang.Integer orderStatusId;
    /** Description: affiliate_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "affiliate_id")
    private java.lang.Integer affiliateId;
    /** Description: commission. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "commission")
    private java.math.BigDecimal commission;
    /** Description: marketing_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "marketing_id")
    private java.lang.Integer marketingId;
    /** Description: tracking. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "tracking", length = 64)
    private java.lang.String tracking;
    /** Description: language_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "language_id")
    private java.lang.Integer languageId;
    /** Description: currency_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "currency_id")
    private java.lang.Integer currencyId;
    /** Description: currency_code. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "currency_code", length = 3)
    private java.lang.String currencyCode;
    /** Description: currency_value. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "currency_value")
    private java.math.BigDecimal currencyValue;
    /** Description: ip. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "ip", length = 40)
    private java.lang.String ip;
    /** Description: forwarded_ip. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "forwarded_ip", length = 40)
    private java.lang.String forwardedIp;
    /** Description: user_agent. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "user_agent", length = 255)
    private java.lang.String userAgent;
    /** Description: accept_language. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "accept_language", length = 255)
    private java.lang.String acceptLanguage;
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

    public OcOrder() {}

    public java.lang.Integer getOrderId() {
        return this.orderId;
    }

    public void setOrderId(java.lang.Integer orderId) {
        this.orderId = orderId;
    }

    public java.lang.Integer getInvoiceNo() {
        return this.invoiceNo;
    }

    public java.lang.String getInvoicePrefix() {
        return this.invoicePrefix;
    }

    public java.lang.Integer getStoreId() {
        return this.storeId;
    }

    public java.lang.String getStoreName() {
        return this.storeName;
    }

    public java.lang.String getStoreUrl() {
        return this.storeUrl;
    }

    public java.lang.Integer getCustomerId() {
        return this.customerId;
    }

    public java.lang.Integer getCustomerGroupId() {
        return this.customerGroupId;
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

    public java.lang.String getCustomField() {
        return this.customField;
    }

    public java.lang.String getPaymentFirstname() {
        return this.paymentFirstname;
    }

    public java.lang.String getPaymentLastname() {
        return this.paymentLastname;
    }

    public java.lang.String getPaymentCompany() {
        return this.paymentCompany;
    }

    public java.lang.String getPaymentAddress1() {
        return this.paymentAddress1;
    }

    public java.lang.String getPaymentAddress2() {
        return this.paymentAddress2;
    }

    public java.lang.String getPaymentCity() {
        return this.paymentCity;
    }

    public java.lang.String getPaymentPostcode() {
        return this.paymentPostcode;
    }

    public java.lang.String getPaymentCountry() {
        return this.paymentCountry;
    }

    public java.lang.Integer getPaymentCountryId() {
        return this.paymentCountryId;
    }

    public java.lang.String getPaymentZone() {
        return this.paymentZone;
    }

    public java.lang.Integer getPaymentZoneId() {
        return this.paymentZoneId;
    }

    public java.lang.String getPaymentAddressFormat() {
        return this.paymentAddressFormat;
    }

    public java.lang.String getPaymentCustomField() {
        return this.paymentCustomField;
    }

    public java.lang.String getPaymentMethod() {
        return this.paymentMethod;
    }

    public java.lang.String getPaymentCode() {
        return this.paymentCode;
    }

    public java.lang.String getShippingFirstname() {
        return this.shippingFirstname;
    }

    public java.lang.String getShippingLastname() {
        return this.shippingLastname;
    }

    public java.lang.String getShippingCompany() {
        return this.shippingCompany;
    }

    public java.lang.String getShippingAddress1() {
        return this.shippingAddress1;
    }

    public java.lang.String getShippingAddress2() {
        return this.shippingAddress2;
    }

    public java.lang.String getShippingCity() {
        return this.shippingCity;
    }

    public java.lang.String getShippingPostcode() {
        return this.shippingPostcode;
    }

    public java.lang.String getShippingCountry() {
        return this.shippingCountry;
    }

    public java.lang.Integer getShippingCountryId() {
        return this.shippingCountryId;
    }

    public java.lang.String getShippingZone() {
        return this.shippingZone;
    }

    public java.lang.Integer getShippingZoneId() {
        return this.shippingZoneId;
    }

    public java.lang.String getShippingAddressFormat() {
        return this.shippingAddressFormat;
    }

    public java.lang.String getShippingCustomField() {
        return this.shippingCustomField;
    }

    public java.lang.String getShippingMethod() {
        return this.shippingMethod;
    }

    public java.lang.String getShippingCode() {
        return this.shippingCode;
    }

    public java.lang.String getComment() {
        return this.comment;
    }

    public java.math.BigDecimal getTotal() {
        return this.total;
    }

    public java.lang.Integer getOrderStatusId() {
        return this.orderStatusId;
    }

    public java.lang.Integer getAffiliateId() {
        return this.affiliateId;
    }

    public java.math.BigDecimal getCommission() {
        return this.commission;
    }

    public java.lang.Integer getMarketingId() {
        return this.marketingId;
    }

    public java.lang.String getTracking() {
        return this.tracking;
    }

    public java.lang.Integer getLanguageId() {
        return this.languageId;
    }

    public java.lang.Integer getCurrencyId() {
        return this.currencyId;
    }

    public java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public java.math.BigDecimal getCurrencyValue() {
        return this.currencyValue;
    }

    public java.lang.String getIp() {
        return this.ip;
    }

    public java.lang.String getForwardedIp() {
        return this.forwardedIp;
    }

    public java.lang.String getUserAgent() {
        return this.userAgent;
    }

    public java.lang.String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public java.sql.Timestamp getDateAdded() {
        return this.dateAdded;
    }

    public java.sql.Timestamp getDateModified() {
        return this.dateModified;
    }

    public void setInvoiceNo(java.lang.Integer invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public void setInvoicePrefix(java.lang.String invoicePrefix) {
        this.invoicePrefix = invoicePrefix;
    }

    public void setStoreId(java.lang.Integer storeId) {
        this.storeId = storeId;
    }

    public void setStoreName(java.lang.String storeName) {
        this.storeName = storeName;
    }

    public void setStoreUrl(java.lang.String storeUrl) {
        this.storeUrl = storeUrl;
    }

    public void setCustomerId(java.lang.Integer customerId) {
        this.customerId = customerId;
    }

    public void setCustomerGroupId(java.lang.Integer customerGroupId) {
        this.customerGroupId = customerGroupId;
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

    public void setCustomField(java.lang.String customField) {
        this.customField = customField;
    }

    public void setPaymentFirstname(java.lang.String paymentFirstname) {
        this.paymentFirstname = paymentFirstname;
    }

    public void setPaymentLastname(java.lang.String paymentLastname) {
        this.paymentLastname = paymentLastname;
    }

    public void setPaymentCompany(java.lang.String paymentCompany) {
        this.paymentCompany = paymentCompany;
    }

    public void setPaymentAddress1(java.lang.String paymentAddress1) {
        this.paymentAddress1 = paymentAddress1;
    }

    public void setPaymentAddress2(java.lang.String paymentAddress2) {
        this.paymentAddress2 = paymentAddress2;
    }

    public void setPaymentCity(java.lang.String paymentCity) {
        this.paymentCity = paymentCity;
    }

    public void setPaymentPostcode(java.lang.String paymentPostcode) {
        this.paymentPostcode = paymentPostcode;
    }

    public void setPaymentCountry(java.lang.String paymentCountry) {
        this.paymentCountry = paymentCountry;
    }

    public void setPaymentCountryId(java.lang.Integer paymentCountryId) {
        this.paymentCountryId = paymentCountryId;
    }

    public void setPaymentZone(java.lang.String paymentZone) {
        this.paymentZone = paymentZone;
    }

    public void setPaymentZoneId(java.lang.Integer paymentZoneId) {
        this.paymentZoneId = paymentZoneId;
    }

    public void setPaymentAddressFormat(java.lang.String paymentAddressFormat) {
        this.paymentAddressFormat = paymentAddressFormat;
    }

    public void setPaymentCustomField(java.lang.String paymentCustomField) {
        this.paymentCustomField = paymentCustomField;
    }

    public void setPaymentMethod(java.lang.String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setPaymentCode(java.lang.String paymentCode) {
        this.paymentCode = paymentCode;
    }

    public void setShippingFirstname(java.lang.String shippingFirstname) {
        this.shippingFirstname = shippingFirstname;
    }

    public void setShippingLastname(java.lang.String shippingLastname) {
        this.shippingLastname = shippingLastname;
    }

    public void setShippingCompany(java.lang.String shippingCompany) {
        this.shippingCompany = shippingCompany;
    }

    public void setShippingAddress1(java.lang.String shippingAddress1) {
        this.shippingAddress1 = shippingAddress1;
    }

    public void setShippingAddress2(java.lang.String shippingAddress2) {
        this.shippingAddress2 = shippingAddress2;
    }

    public void setShippingCity(java.lang.String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public void setShippingPostcode(java.lang.String shippingPostcode) {
        this.shippingPostcode = shippingPostcode;
    }

    public void setShippingCountry(java.lang.String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public void setShippingCountryId(java.lang.Integer shippingCountryId) {
        this.shippingCountryId = shippingCountryId;
    }

    public void setShippingZone(java.lang.String shippingZone) {
        this.shippingZone = shippingZone;
    }

    public void setShippingZoneId(java.lang.Integer shippingZoneId) {
        this.shippingZoneId = shippingZoneId;
    }

    public void setShippingAddressFormat(java.lang.String shippingAddressFormat) {
        this.shippingAddressFormat = shippingAddressFormat;
    }

    public void setShippingCustomField(java.lang.String shippingCustomField) {
        this.shippingCustomField = shippingCustomField;
    }

    public void setShippingMethod(java.lang.String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public void setShippingCode(java.lang.String shippingCode) {
        this.shippingCode = shippingCode;
    }

    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }

    public void setTotal(java.math.BigDecimal total) {
        this.total = total;
    }

    public void setOrderStatusId(java.lang.Integer orderStatusId) {
        this.orderStatusId = orderStatusId;
    }

    public void setAffiliateId(java.lang.Integer affiliateId) {
        this.affiliateId = affiliateId;
    }

    public void setCommission(java.math.BigDecimal commission) {
        this.commission = commission;
    }

    public void setMarketingId(java.lang.Integer marketingId) {
        this.marketingId = marketingId;
    }

    public void setTracking(java.lang.String tracking) {
        this.tracking = tracking;
    }

    public void setLanguageId(java.lang.Integer languageId) {
        this.languageId = languageId;
    }

    public void setCurrencyId(java.lang.Integer currencyId) {
        this.currencyId = currencyId;
    }

    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setCurrencyValue(java.math.BigDecimal currencyValue) {
        this.currencyValue = currencyValue;
    }

    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }

    public void setForwardedIp(java.lang.String forwardedIp) {
        this.forwardedIp = forwardedIp;
    }

    public void setUserAgent(java.lang.String userAgent) {
        this.userAgent = userAgent;
    }

    public void setAcceptLanguage(java.lang.String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public void setDateAdded(java.sql.Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }

    public void setDateModified(java.sql.Timestamp dateModified) {
        this.dateModified = dateModified;
    }
}
