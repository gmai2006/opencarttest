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
@Table(name = "oc_theme")
public class OcTheme implements Serializable {
    private static final long serialVersionUID = 163436923183535333L;

    /** Description: theme_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "theme_id")
    private java.lang.Integer themeId;

    /** Description: store_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "store_id")
    private java.lang.Integer storeId;
    /** Description: theme. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "theme", length = 64)
    private java.lang.String theme;
    /** Description: route. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "route", length = 64)
    private java.lang.String route;
    /** Description: code. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "code", length = 65535)
    private java.lang.String code;

    public OcTheme() {}

    public java.lang.Integer getThemeId() {
        return this.themeId;
    }

    public void setThemeId(java.lang.Integer themeId) {
        this.themeId = themeId;
    }

    public java.lang.Integer getStoreId() {
        return this.storeId;
    }

    public java.lang.String getTheme() {
        return this.theme;
    }

    public java.lang.String getRoute() {
        return this.route;
    }

    public java.lang.String getCode() {
        return this.code;
    }

    public void setStoreId(java.lang.Integer storeId) {
        this.storeId = storeId;
    }

    public void setTheme(java.lang.String theme) {
        this.theme = theme;
    }

    public void setRoute(java.lang.String route) {
        this.route = route;
    }

    public void setCode(java.lang.String code) {
        this.code = code;
    }
}
