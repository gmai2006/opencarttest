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
@Table(name = "oc_layout_module")
public class OcLayoutModule implements Serializable {
    private static final long serialVersionUID = 163436923122887490L;

    /** Description: layout_module_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "layout_module_id")
    private java.lang.Integer layoutModuleId;

    /** Description: layout_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "layout_id")
    private java.lang.Integer layoutId;
    /** Description: code. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "code", length = 64)
    private java.lang.String code;
    /** Description: position. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "position", length = 14)
    private java.lang.String position;
    /** Description: sort_order. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "sort_order")
    private java.lang.Integer sortOrder;

    public OcLayoutModule() {}

    public java.lang.Integer getLayoutModuleId() {
        return this.layoutModuleId;
    }

    public void setLayoutModuleId(java.lang.Integer layoutModuleId) {
        this.layoutModuleId = layoutModuleId;
    }

    public java.lang.Integer getLayoutId() {
        return this.layoutId;
    }

    public java.lang.String getCode() {
        return this.code;
    }

    public java.lang.String getPosition() {
        return this.position;
    }

    public java.lang.Integer getSortOrder() {
        return this.sortOrder;
    }

    public void setLayoutId(java.lang.Integer layoutId) {
        this.layoutId = layoutId;
    }

    public void setCode(java.lang.String code) {
        this.code = code;
    }

    public void setPosition(java.lang.String position) {
        this.position = position;
    }

    public void setSortOrder(java.lang.Integer sortOrder) {
        this.sortOrder = sortOrder;
    }
}
