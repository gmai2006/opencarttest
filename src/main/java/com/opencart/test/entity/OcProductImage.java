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
@Table(name = "oc_product_image")
public class OcProductImage implements Serializable {
    private static final long serialVersionUID = 163436923160879105L;

    /** Description: product_image_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "product_image_id")
    private java.lang.Integer productImageId;

    /** Description: product_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "product_id")
    private java.lang.Integer productId;
    /** Description: image. */
    @Basic
    @Column(name = "image", length = 255)
    private java.lang.String image;
    /** Description: sort_order. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "sort_order")
    private java.lang.Integer sortOrder;

    public OcProductImage() {}

    public java.lang.Integer getProductImageId() {
        return this.productImageId;
    }

    public void setProductImageId(java.lang.Integer productImageId) {
        this.productImageId = productImageId;
    }

    public java.lang.Integer getProductId() {
        return this.productId;
    }

    public java.lang.String getImage() {
        return this.image;
    }

    public java.lang.Integer getSortOrder() {
        return this.sortOrder;
    }

    public void setProductId(java.lang.Integer productId) {
        this.productId = productId;
    }

    public void setImage(java.lang.String image) {
        this.image = image;
    }

    public void setSortOrder(java.lang.Integer sortOrder) {
        this.sortOrder = sortOrder;
    }
}
