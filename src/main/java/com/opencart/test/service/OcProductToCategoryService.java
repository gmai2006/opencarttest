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

import com.opencart.test.entity.OcProductToCategory;
import com.opencart.test.entity.OcProductToCategoryId;
import java.util.List;

public interface OcProductToCategoryService {
    public OcProductToCategory find(OcProductToCategoryId id);
    /**
     * Select a list of OcProductToCategory based on a given maximum number of returning records.
     *
     * @param maxResult : a specified maximum number of returned records.
     * @return OcProductToCategory records.
     */
    public List<OcProductToCategory> select(int maxResult);

    /**
     * Select all OcProductToCategory.
     *
     * @return all OcProductToCategory records.
     */
    public List<OcProductToCategory> selectAll();

    /**
     * Create OcProductToCategory.
     *
     * @param bean The OcProductToCategory.
     * @return The OcProductToCategory.
     */
    public OcProductToCategory create(OcProductToCategory bean);

    /**
     * Update a OcProductToCategory.
     *
     * @param bean - The OcProductToCategory.
     * @return OcProductToCategory.
     */
    public OcProductToCategory update(OcProductToCategory bean);
}
