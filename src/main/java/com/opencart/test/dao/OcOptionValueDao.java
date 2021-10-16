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

import com.opencart.test.entity.OcOptionValue;
import java.util.List;

public interface OcOptionValueDao {
    /**
     * Retrieve all records OcOptionValue.
     *
     * @param maxResult a maximum number of returned records.
     * @return A list of OcOptionValue
     */
    public List<OcOptionValue> select(int maxResult);

    /**
     * Retrieve all records OcOptionValue.
     *
     * @return A list of OcOptionValue
     */
    public List<OcOptionValue> selectAll();

    /**
     * Find an entity.
     *
     * @param id An OcOptionValue id.
     * @return The same OcOptionValue.
     */
    public OcOptionValue find(java.lang.Integer id);

    /**
     * Create an OcOptionValue.
     *
     * @param e the OcOptionValue.
     * @return The same OcOptionValue.
     */
    public OcOptionValue create(OcOptionValue e);

    /**
     * Update the OcOptionValue.
     *
     * @param e the OcOptionValue.
     * @return The same OcOptionValue.
     */
    public OcOptionValue update(OcOptionValue e);
}
