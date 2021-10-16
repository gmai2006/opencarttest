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
package com.opencart.test.dao;

import com.opencart.test.entity.OcCouponProduct;
import java.util.List;

public interface OcCouponProductDao {
    /**
     * Retrieve all records OcCouponProduct.
     *
     * @param maxResult a maximum number of returned records.
     * @return A list of OcCouponProduct
     */
    public List<OcCouponProduct> select(int maxResult);

    /**
     * Retrieve all records OcCouponProduct.
     *
     * @return A list of OcCouponProduct
     */
    public List<OcCouponProduct> selectAll();

    /**
     * Find an entity.
     *
     * @param id An OcCouponProduct id.
     * @return The same OcCouponProduct.
     */
    public OcCouponProduct find(java.lang.Integer id);

    /**
     * Create an OcCouponProduct.
     *
     * @param e the OcCouponProduct.
     * @return The same OcCouponProduct.
     */
    public OcCouponProduct create(OcCouponProduct e);

    /**
     * Update the OcCouponProduct.
     *
     * @param e the OcCouponProduct.
     * @return The same OcCouponProduct.
     */
    public OcCouponProduct update(OcCouponProduct e);
}
