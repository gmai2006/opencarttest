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
@Table(name = "oc_menu")
public class OcMenu implements Serializable {
    private static final long serialVersionUID = 163436923129590235L;

    /** Description: menu_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "menu_id")
    private java.lang.Integer menuId;

    /** Description: store_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "store_id")
    private java.lang.Integer storeId;
    /** Description: type. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "type", length = 6)
    private java.lang.String type;
    /** Description: link. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "link", length = 255)
    private java.lang.String link;
    /** Description: sort_order. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "sort_order")
    private java.lang.Integer sortOrder;
    /** Description: status. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "status")
    private java.lang.Boolean status;

    public OcMenu() {}

    public java.lang.Integer getMenuId() {
        return this.menuId;
    }

    public void setMenuId(java.lang.Integer menuId) {
        this.menuId = menuId;
    }

    public java.lang.Integer getStoreId() {
        return this.storeId;
    }

    public java.lang.String getType() {
        return this.type;
    }

    public java.lang.String getLink() {
        return this.link;
    }

    public java.lang.Integer getSortOrder() {
        return this.sortOrder;
    }

    public java.lang.Boolean getStatus() {
        return this.status;
    }

    public void setStoreId(java.lang.Integer storeId) {
        this.storeId = storeId;
    }

    public void setType(java.lang.String type) {
        this.type = type;
    }

    public void setLink(java.lang.String link) {
        this.link = link;
    }

    public void setSortOrder(java.lang.Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public void setStatus(java.lang.Boolean status) {
        this.status = status;
    }
}
