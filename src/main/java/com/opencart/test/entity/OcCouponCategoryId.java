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
import javax.persistence.Column;

/** embeddable class Id for OcCouponCategory. generated on 10/16/2021 from a schema. */
public class OcCouponCategoryId implements Serializable {
    private static final long serialVersionUID = 163436923093883606L;

    @Column(name = "category_id")
    private java.lang.Integer categoryId;

    @Column(name = "coupon_id")
    private java.lang.Integer couponId;

    /** Constructor: OcCouponCategoryId. */
    public OcCouponCategoryId() {}

    /**
     * Constructor: OcCouponCategoryId.
     *
     * @param categoryId - categoryId.
     * @param couponId - couponId.
     */
    public OcCouponCategoryId(java.lang.Integer categoryId, java.lang.Integer couponId) {
        this.categoryId = categoryId;
        this.couponId = couponId;
    }

    public java.lang.Integer getCategoryId() {
        return this.categoryId;
    }

    public java.lang.Integer getCouponId() {
        return this.couponId;
    }

    public void setCategoryId(java.lang.Integer categoryId) {
        this.categoryId = categoryId;
    }

    public void setCouponId(java.lang.Integer couponId) {
        this.couponId = couponId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((categoryId == null) ? 0 : categoryId.hashCode());
        result = prime * result + ((couponId == null) ? 0 : couponId.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        OcCouponCategoryId other = (OcCouponCategoryId) obj;

        if (categoryId == null) {
            if (other.categoryId != null) return false;
        } else if (!categoryId.equals(other.categoryId)) return false;

        if (couponId == null) {
            if (other.couponId != null) return false;
        } else if (!couponId.equals(other.couponId)) return false;

        return true;
    }
}
