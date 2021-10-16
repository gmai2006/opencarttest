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
@Table(name = "oc_category")
public class OcCategory implements Serializable {
    private static final long serialVersionUID = 163436923085695788L;

    /** Description: category_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "category_id")
    private java.lang.Integer categoryId;

    /** Description: image. */
    @Basic
    @Column(name = "image", length = 255)
    private java.lang.String image;
    /** Description: parent_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "parent_id")
    private java.lang.Integer parentId;
    /** Description: top. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "top")
    private java.lang.Boolean top;
    /** Description: column. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "column")
    private java.lang.Integer column;
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

    public OcCategory() {}

    public java.lang.Integer getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(java.lang.Integer categoryId) {
        this.categoryId = categoryId;
    }

    public java.lang.String getImage() {
        return this.image;
    }

    public java.lang.Integer getParentId() {
        return this.parentId;
    }

    public java.lang.Boolean getTop() {
        return this.top;
    }

    public java.lang.Integer getColumn() {
        return this.column;
    }

    public java.lang.Integer getSortOrder() {
        return this.sortOrder;
    }

    public java.lang.Boolean getStatus() {
        return this.status;
    }

    public java.sql.Timestamp getDateAdded() {
        return this.dateAdded;
    }

    public java.sql.Timestamp getDateModified() {
        return this.dateModified;
    }

    public void setImage(java.lang.String image) {
        this.image = image;
    }

    public void setParentId(java.lang.Integer parentId) {
        this.parentId = parentId;
    }

    public void setTop(java.lang.Boolean top) {
        this.top = top;
    }

    public void setColumn(java.lang.Integer column) {
        this.column = column;
    }

    public void setSortOrder(java.lang.Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public void setStatus(java.lang.Boolean status) {
        this.status = status;
    }

    public void setDateAdded(java.sql.Timestamp dateAdded) {
        this.dateAdded = dateAdded;
    }

    public void setDateModified(java.sql.Timestamp dateModified) {
        this.dateModified = dateModified;
    }
}
