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

import com.opencart.test.entity.OcCategoryDescription;
import com.opencart.test.entity.OcCategoryDescriptionId;
import java.util.List;

public interface OcCategoryDescriptionDao {
    /**
     * Retrieve all records OcCategoryDescription.
     *
     * @param maxResult a maximum number of returned records.
     * @return A list of OcCategoryDescription
     */
    public List<OcCategoryDescription> select(int maxResult);

    /**
     * Retrieve all records OcCategoryDescription.
     *
     * @return A list of OcCategoryDescription
     */
    public List<OcCategoryDescription> selectAll();

    /**
     * Find an entity.
     *
     * @param id An OcCategoryDescription id.
     * @return The same OcCategoryDescription.
     */
    public OcCategoryDescription find(OcCategoryDescriptionId id);
    /**
     * Create an OcCategoryDescription.
     *
     * @param e the OcCategoryDescription.
     * @return The same OcCategoryDescription.
     */
    public OcCategoryDescription create(OcCategoryDescription e);

    /**
     * Update the OcCategoryDescription.
     *
     * @param e the OcCategoryDescription.
     * @return The same OcCategoryDescription.
     */
    public OcCategoryDescription update(OcCategoryDescription e);
}
