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

import com.opencart.test.entity.OcProductRecurring;
import com.opencart.test.entity.OcProductRecurringId;
import java.util.List;

public interface OcProductRecurringDao {
    /**
     * Retrieve all records OcProductRecurring.
     *
     * @param maxResult a maximum number of returned records.
     * @return A list of OcProductRecurring
     */
    public List<OcProductRecurring> select(int maxResult);

    /**
     * Retrieve all records OcProductRecurring.
     *
     * @return A list of OcProductRecurring
     */
    public List<OcProductRecurring> selectAll();

    /**
     * Find an entity.
     *
     * @param id An OcProductRecurring id.
     * @return The same OcProductRecurring.
     */
    public OcProductRecurring find(OcProductRecurringId id);
    /**
     * Create an OcProductRecurring.
     *
     * @param e the OcProductRecurring.
     * @return The same OcProductRecurring.
     */
    public OcProductRecurring create(OcProductRecurring e);

    /**
     * Update the OcProductRecurring.
     *
     * @param e the OcProductRecurring.
     * @return The same OcProductRecurring.
     */
    public OcProductRecurring update(OcProductRecurring e);
}
