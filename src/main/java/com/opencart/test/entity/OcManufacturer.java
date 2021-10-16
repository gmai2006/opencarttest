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
@Table(name = "oc_manufacturer")
public class OcManufacturer implements Serializable {
    private static final long serialVersionUID = 163436923126553906L;

    /** Description: manufacturer_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "manufacturer_id")
    private java.lang.Integer manufacturerId;

    /** Description: name. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "name", length = 64)
    private java.lang.String name;
    /** Description: image. */
    @Basic
    @Column(name = "image", length = 255)
    private java.lang.String image;
    /** Description: sort_order. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "sort_order")
    private java.lang.Integer sortOrder;

    public OcManufacturer() {}

    public java.lang.Integer getManufacturerId() {
        return this.manufacturerId;
    }

    public void setManufacturerId(java.lang.Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.lang.String getImage() {
        return this.image;
    }

    public java.lang.Integer getSortOrder() {
        return this.sortOrder;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setImage(java.lang.String image) {
        this.image = image;
    }

    public void setSortOrder(java.lang.Integer sortOrder) {
        this.sortOrder = sortOrder;
    }
}
