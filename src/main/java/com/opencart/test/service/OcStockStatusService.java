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
package com.opencart.test.service;

import com.opencart.test.entity.OcStockStatus;
import com.opencart.test.entity.OcStockStatusId;
import java.util.List;

public interface OcStockStatusService {
    public OcStockStatus find(OcStockStatusId id);
    /**
     * Select a list of OcStockStatus based on a given maximum number of returning records.
     *
     * @param maxResult : a specified maximum number of returned records.
     * @return OcStockStatus records.
     */
    public List<OcStockStatus> select(int maxResult);

    /**
     * Select all OcStockStatus.
     *
     * @return all OcStockStatus records.
     */
    public List<OcStockStatus> selectAll();

    /**
     * Create OcStockStatus.
     *
     * @param bean The OcStockStatus.
     * @return The OcStockStatus.
     */
    public OcStockStatus create(OcStockStatus bean);

    /**
     * Update a OcStockStatus.
     *
     * @param bean - The OcStockStatus.
     * @return OcStockStatus.
     */
    public OcStockStatus update(OcStockStatus bean);
}
