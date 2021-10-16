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
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(OcCategoryDescriptionId.class)
@Table(name = "oc_category_description")
public class OcCategoryDescription implements Serializable {
    private static final long serialVersionUID = 163436923087083447L;

    /** Description: category_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "category_id")
    private java.lang.Integer categoryId;
    /** Description: language_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "language_id")
    private java.lang.Integer languageId;

    /** Description: name. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "name", length = 255)
    private java.lang.String name;
    /** Description: description. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "description", length = 65535)
    private java.lang.String description;
    /** Description: meta_title. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "meta_title", length = 255)
    private java.lang.String metaTitle;
    /** Description: meta_description. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "meta_description", length = 255)
    private java.lang.String metaDescription;
    /** Description: meta_keyword. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "meta_keyword", length = 255)
    private java.lang.String metaKeyword;

    public OcCategoryDescription() {}

    public java.lang.Integer getCategoryId() {
        return this.categoryId;
    }

    public java.lang.Integer getLanguageId() {
        return this.languageId;
    }

    public void setCategoryId(java.lang.Integer categoryId) {
        this.categoryId = categoryId;
    }

    public void setLanguageId(java.lang.Integer languageId) {
        this.languageId = languageId;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getDescription() {
        return this.description;
    }

    public java.lang.String getMetaTitle() {
        return this.metaTitle;
    }

    public java.lang.String getMetaDescription() {
        return this.metaDescription;
    }

    public java.lang.String getMetaKeyword() {
        return this.metaKeyword;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public void setMetaTitle(java.lang.String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public void setMetaDescription(java.lang.String metaDescription) {
        this.metaDescription = metaDescription;
    }

    public void setMetaKeyword(java.lang.String metaKeyword) {
        this.metaKeyword = metaKeyword;
    }
}
