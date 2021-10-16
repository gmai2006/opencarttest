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

import com.opencart.test.entity.OcApiSession;
import java.util.List;

public interface OcApiSessionDao {
    /**
     * Retrieve all records OcApiSession.
     *
     * @param maxResult a maximum number of returned records.
     * @return A list of OcApiSession
     */
    public List<OcApiSession> select(int maxResult);

    /**
     * Retrieve all records OcApiSession.
     *
     * @return A list of OcApiSession
     */
    public List<OcApiSession> selectAll();

    /**
     * Find an entity.
     *
     * @param id An OcApiSession id.
     * @return The same OcApiSession.
     */
    public OcApiSession find(java.lang.Integer id);

    /**
     * Create an OcApiSession.
     *
     * @param e the OcApiSession.
     * @return The same OcApiSession.
     */
    public OcApiSession create(OcApiSession e);

    /**
     * Update the OcApiSession.
     *
     * @param e the OcApiSession.
     * @return The same OcApiSession.
     */
    public OcApiSession update(OcApiSession e);
}
