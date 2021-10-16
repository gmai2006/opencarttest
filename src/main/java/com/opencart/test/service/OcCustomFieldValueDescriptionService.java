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

import com.opencart.test.entity.OcCustomFieldValueDescription;
import com.opencart.test.entity.OcCustomFieldValueDescriptionId;
import java.util.List;

public interface OcCustomFieldValueDescriptionService {
    public OcCustomFieldValueDescription find(OcCustomFieldValueDescriptionId id);
    /**
     * Select a list of OcCustomFieldValueDescription based on a given maximum number of returning
     * records.
     *
     * @param maxResult : a specified maximum number of returned records.
     * @return OcCustomFieldValueDescription records.
     */
    public List<OcCustomFieldValueDescription> select(int maxResult);

    /**
     * Select all OcCustomFieldValueDescription.
     *
     * @return all OcCustomFieldValueDescription records.
     */
    public List<OcCustomFieldValueDescription> selectAll();

    /**
     * Create OcCustomFieldValueDescription.
     *
     * @param bean The OcCustomFieldValueDescription.
     * @return The OcCustomFieldValueDescription.
     */
    public OcCustomFieldValueDescription create(OcCustomFieldValueDescription bean);

    /**
     * Update a OcCustomFieldValueDescription.
     *
     * @param bean - The OcCustomFieldValueDescription.
     * @return OcCustomFieldValueDescription.
     */
    public OcCustomFieldValueDescription update(OcCustomFieldValueDescription bean);
}
