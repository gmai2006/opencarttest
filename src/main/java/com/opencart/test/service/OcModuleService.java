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

import com.opencart.test.entity.OcModule;
import java.util.List;

public interface OcModuleService {
    public OcModule find(java.lang.Integer id);

    /**
     * Select a list of OcModule based on a given maximum number of returning records.
     *
     * @param maxResult : a specified maximum number of returned records.
     * @return OcModule records.
     */
    public List<OcModule> select(int maxResult);

    /**
     * Select all OcModule.
     *
     * @return all OcModule records.
     */
    public List<OcModule> selectAll();

    /**
     * Create OcModule.
     *
     * @param bean The OcModule.
     * @return The OcModule.
     */
    public OcModule create(OcModule bean);

    /**
     * Update a OcModule.
     *
     * @param bean - The OcModule.
     * @return OcModule.
     */
    public OcModule update(OcModule bean);
}
