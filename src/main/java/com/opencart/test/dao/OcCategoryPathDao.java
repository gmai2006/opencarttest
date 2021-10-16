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

import com.opencart.test.entity.OcCategoryPath;
import com.opencart.test.entity.OcCategoryPathId;
import java.util.List;

public interface OcCategoryPathDao {
    /**
     * Retrieve all records OcCategoryPath.
     *
     * @param maxResult a maximum number of returned records.
     * @return A list of OcCategoryPath
     */
    public List<OcCategoryPath> select(int maxResult);

    /**
     * Retrieve all records OcCategoryPath.
     *
     * @return A list of OcCategoryPath
     */
    public List<OcCategoryPath> selectAll();

    /**
     * Find an entity.
     *
     * @param id An OcCategoryPath id.
     * @return The same OcCategoryPath.
     */
    public OcCategoryPath find(OcCategoryPathId id);
    /**
     * Create an OcCategoryPath.
     *
     * @param e the OcCategoryPath.
     * @return The same OcCategoryPath.
     */
    public OcCategoryPath create(OcCategoryPath e);

    /**
     * Update the OcCategoryPath.
     *
     * @param e the OcCategoryPath.
     * @return The same OcCategoryPath.
     */
    public OcCategoryPath update(OcCategoryPath e);
}
