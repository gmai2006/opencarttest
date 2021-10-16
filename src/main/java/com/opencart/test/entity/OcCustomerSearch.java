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
@Table(name = "oc_customer_search")
public class OcCustomerSearch implements Serializable {
    private static final long serialVersionUID = 163436923108464558L;

    /** Description: customer_search_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "customer_search_id")
    private java.lang.Integer customerSearchId;

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
    /** Description: customer_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "customer_id")
    private java.lang.Integer customerId;
    /** Description: keyword. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "keyword", length = 255)
    private java.lang.String keyword;
    /** Description: category_id. */
    @Basic
    @Column(name = "category_id")
    private java.lang.Integer categoryId;
    /** Description: sub_category. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "sub_category")
    private java.lang.Boolean subCategory;
    /** Description: description. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "description")
    private java.lang.Boolean description;
    /** Description: products. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "products")
    private java.lang.Integer products;
    /** Description: ip. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "ip", length = 40)
    private java.lang.String ip;
    /** Description: date_added. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "date_added")
    private java.sql.Timestamp dateAdded;

    public OcCustomerSearch() {}

    public java.lang.Integer getCustomerSearchId() {
        return this.customerSearchId;
    }

    public void setCustomerSearchId(java.lang.Integer customerSearchId) {
        this.customerSearchId = customerSearchId;
    }

    public java.lang.Integer getStoreId() {
        return this.storeId;
    }

    public java.lang.Integer getLanguageId() {
        return this.languageId;
    }

    public java.lang.Integer getCustomerId() {
        return this.customerId;
    }

    public java.lang.String getKeyword() {
        return this.keyword;
    }

    public java.lang.Integer getCategoryId() {
        return this.categoryId;
    }

    public java.lang.Boolean getSubCategory() {
        return this.subCategory;
    }

    public java.lang.Boolean getDescription() {
        return this.description;
    }

    public java.lang.Integer getProducts() {
        return this.products;
    }

    public java.lang.String getIp() {
        return this.ip;
    }

    public java.sql.Timestamp getDateAdded() {
        return this.dateAdded;
    }

    public void setStoreId(java.lang.Integer storeId) {
        this.storeId = storeId;
    }

    public void setLanguageId(java.lang.Integer languageId) {
        this.languageId = languageId;
    }

    public void setCustomerId(java.lang.Integer customerId) {
        this.customerId = customerId;
    }

    public void setKeyword(java.lang.String keyword) {
        this.keyword = keyword;
    }

    public void setCategoryId(java.lang.Integer categoryId) {
        this.categoryId = categoryId;
    }

    public void setSubCategory(java.lang.Boolean subCategory) {
        this.subCategory = subCategory;
    }

    public void setDescription(java.lang.Boolean description) {
        this.description = description;
    }

    public void setProducts(java.lang.Integer products) {
        this.products = products;
    }

    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }

    public void setDateAdded(java.sql.Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }
}
