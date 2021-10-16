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

import com.opencart.test.entity.OcFilterGroupDescription;
import com.opencart.test.entity.OcFilterGroupDescriptionId;
import java.util.List;

public interface OcFilterGroupDescriptionDao {
    /**
     * Retrieve all records OcFilterGroupDescription.
     *
     * @param maxResult a maximum number of returned records.
     * @return A list of OcFilterGroupDescription
     */
    public List<OcFilterGroupDescription> select(int maxResult);

    /**
     * Retrieve all records OcFilterGroupDescription.
     *
     * @return A list of OcFilterGroupDescription
     */
    public List<OcFilterGroupDescription> selectAll();

    /**
     * Find an entity.
     *
     * @param id An OcFilterGroupDescription id.
     * @return The same OcFilterGroupDescription.
     */
    public OcFilterGroupDescription find(OcFilterGroupDescriptionId id);
    /**
     * Create an OcFilterGroupDescription.
     *
     * @param e the OcFilterGroupDescription.
     * @return The same OcFilterGroupDescription.
     */
    public OcFilterGroupDescription create(OcFilterGroupDescription e);

    /**
     * Update the OcFilterGroupDescription.
     *
     * @param e the OcFilterGroupDescription.
     * @return The same OcFilterGroupDescription.
     */
    public OcFilterGroupDescription update(OcFilterGroupDescription e);
}
