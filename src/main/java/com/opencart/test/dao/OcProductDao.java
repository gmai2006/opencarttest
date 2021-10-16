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

import com.opencart.test.entity.OcProduct;
import java.util.List;

public interface OcProductDao {
    /**
     * Retrieve all records OcProduct.
     *
     * @param maxResult a maximum number of returned records.
     * @return A list of OcProduct
     */
    public List<OcProduct> select(int maxResult);

    /**
     * Retrieve all records OcProduct.
     *
     * @return A list of OcProduct
     */
    public List<OcProduct> selectAll();

    /**
     * Find an entity.
     *
     * @param id An OcProduct id.
     * @return The same OcProduct.
     */
    public OcProduct find(java.lang.Integer id);

    /**
     * Create an OcProduct.
     *
     * @param e the OcProduct.
     * @return The same OcProduct.
     */
    public OcProduct create(OcProduct e);

    /**
     * Update the OcProduct.
     *
     * @param e the OcProduct.
     * @return The same OcProduct.
     */
    public OcProduct update(OcProduct e);
}
