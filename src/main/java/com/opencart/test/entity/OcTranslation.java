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
@Table(name = "oc_translation")
public class OcTranslation implements Serializable {
    private static final long serialVersionUID = 163436923184147751L;

    /** Description: translation_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "translation_id")
    private java.lang.Integer translationId;

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
    /** Description: route. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "route", length = 64)
    private java.lang.String route;
    /** Description: key. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "key", length = 64)
    private java.lang.String key;
    /** Description: value. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "value", length = 65535)
    private java.lang.String value;

    public OcTranslation() {}

    public java.lang.Integer getTranslationId() {
        return this.translationId;
    }

    public void setTranslationId(java.lang.Integer translationId) {
        this.translationId = translationId;
    }

    public java.lang.Integer getStoreId() {
        return this.storeId;
    }

    public java.lang.Integer getLanguageId() {
        return this.languageId;
    }

    public java.lang.String getRoute() {
        return this.route;
    }

    public java.lang.String getKey() {
        return this.key;
    }

    public java.lang.String getValue() {
        return this.value;
    }

    public void setStoreId(java.lang.Integer storeId) {
        this.storeId = storeId;
    }

    public void setLanguageId(java.lang.Integer languageId) {
        this.languageId = languageId;
    }

    public void setRoute(java.lang.String route) {
        this.route = route;
    }

    public void setKey(java.lang.String key) {
        this.key = key;
    }

    public void setValue(java.lang.String value) {
        this.value = value;
    }
}
