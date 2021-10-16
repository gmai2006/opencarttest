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

import static java.util.Objects.requireNonNull;

import com.opencart.test.dao.OcCustomFieldCustomerGroupDao;
import com.opencart.test.entity.OcCustomFieldCustomerGroup;
import com.opencart.test.entity.OcCustomFieldCustomerGroupId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcCustomFieldCustomerGroupService")
public class DefaultOcCustomFieldCustomerGroupService implements OcCustomFieldCustomerGroupService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcCustomFieldCustomerGroupDao dao;

    @Inject
    @Named("DefaultOcCustomFieldCustomerGroupDao")
    public DefaultOcCustomFieldCustomerGroupService(final OcCustomFieldCustomerGroupDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomFieldCustomerGroup find(OcCustomFieldCustomerGroupId id) {
        final OcCustomFieldCustomerGroup result = dao.find(id);
        logger.info("find(OcCustomFieldCustomerGroup) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcCustomFieldCustomerGroup> select(int maxResult) {
        final List<OcCustomFieldCustomerGroup> result = dao.select(maxResult);
        logger.info("select(OcCustomFieldCustomerGroup) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcCustomFieldCustomerGroup> selectAll() {
        final List<OcCustomFieldCustomerGroup> results = dao.selectAll();
        logger.info("selectAll(OcCustomFieldCustomerGroup) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomFieldCustomerGroup create(OcCustomFieldCustomerGroup bean) {
        requireNonNull(bean);
        logger.info("create(OcCustomFieldCustomerGroup={}) - entered bean ");

        final OcCustomFieldCustomerGroup result = dao.create(bean);

        logger.info("create(OcCustomFieldCustomerGroup) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomFieldCustomerGroup update(OcCustomFieldCustomerGroup bean) {
        requireNonNull(bean);
        logger.info("update(OcCustomFieldCustomerGroup={}) - entered bean ");

        final OcCustomFieldCustomerGroup result = dao.update(bean);

        logger.info("update(OcCustomFieldCustomerGroup) - exited - return value={} result ");
        return result;
    }
}
