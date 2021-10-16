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
@Table(name = "oc_coupon_product")
public class OcCouponProduct implements Serializable {
    private static final long serialVersionUID = 163436923095510004L;

    /** Description: coupon_product_id. */
    @javax.validation.constraints.NotNull
    @javax.persistence.Id
    @Column(name = "coupon_product_id")
    private java.lang.Integer couponProductId;

    /** Description: coupon_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "coupon_id")
    private java.lang.Integer couponId;
    /** Description: product_id. */
    @javax.validation.constraints.NotNull
    @Basic
    @Column(name = "product_id")
    private java.lang.Integer productId;

    public OcCouponProduct() {}

    public java.lang.Integer getCouponProductId() {
        return this.couponProductId;
    }

    public void setCouponProductId(java.lang.Integer couponProductId) {
        this.couponProductId = couponProductId;
    }

    public java.lang.Integer getCouponId() {
        return this.couponId;
    }

    public java.lang.Integer getProductId() {
        return this.productId;
    }

    public void setCouponId(java.lang.Integer couponId) {
        this.couponId = couponId;
    }

    public void setProductId(java.lang.Integer productId) {
        this.productId = productId;
    }
}
