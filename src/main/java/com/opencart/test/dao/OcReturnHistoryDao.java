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

import com.opencart.test.entity.OcReturnHistory;
import java.util.List;

public interface OcReturnHistoryDao {
    /**
     * Retrieve all records OcReturnHistory.
     *
     * @param maxResult a maximum number of returned records.
     * @return A list of OcReturnHistory
     */
    public List<OcReturnHistory> select(int maxResult);

    /**
     * Retrieve all records OcReturnHistory.
     *
     * @return A list of OcReturnHistory
     */
    public List<OcReturnHistory> selectAll();

    /**
     * Find an entity.
     *
     * @param id An OcReturnHistory id.
     * @return The same OcReturnHistory.
     */
    public OcReturnHistory find(java.lang.Integer id);

    /**
     * Create an OcReturnHistory.
     *
     * @param e the OcReturnHistory.
     * @return The same OcReturnHistory.
     */
    public OcReturnHistory create(OcReturnHistory e);

    /**
     * Update the OcReturnHistory.
     *
     * @param e the OcReturnHistory.
     * @return The same OcReturnHistory.
     */
    public OcReturnHistory update(OcReturnHistory e);
}
