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

import com.opencart.test.entity.OcOptionValueDescription;
import com.opencart.test.entity.OcOptionValueDescriptionId;
import java.util.List;

public interface OcOptionValueDescriptionDao {
    /**
     * Retrieve all records OcOptionValueDescription.
     *
     * @param maxResult a maximum number of returned records.
     * @return A list of OcOptionValueDescription
     */
    public List<OcOptionValueDescription> select(int maxResult);

    /**
     * Retrieve all records OcOptionValueDescription.
     *
     * @return A list of OcOptionValueDescription
     */
    public List<OcOptionValueDescription> selectAll();

    /**
     * Find an entity.
     *
     * @param id An OcOptionValueDescription id.
     * @return The same OcOptionValueDescription.
     */
    public OcOptionValueDescription find(OcOptionValueDescriptionId id);
    /**
     * Create an OcOptionValueDescription.
     *
     * @param e the OcOptionValueDescription.
     * @return The same OcOptionValueDescription.
     */
    public OcOptionValueDescription create(OcOptionValueDescription e);

    /**
     * Update the OcOptionValueDescription.
     *
     * @param e the OcOptionValueDescription.
     * @return The same OcOptionValueDescription.
     */
    public OcOptionValueDescription update(OcOptionValueDescription e);
}
