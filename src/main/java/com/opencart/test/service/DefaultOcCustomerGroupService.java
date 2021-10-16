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

import com.opencart.test.dao.OcCustomerGroupDao;
import com.opencart.test.entity.OcCustomerGroup;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcCustomerGroupService")
public class DefaultOcCustomerGroupService implements OcCustomerGroupService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcCustomerGroupDao dao;

    @Inject
    @Named("DefaultOcCustomerGroupDao")
    public DefaultOcCustomerGroupService(final OcCustomerGroupDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomerGroup find(java.lang.Integer id) {

        final OcCustomerGroup result = dao.find(id);
        logger.info("find(OcCustomerGroup) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcCustomerGroup> select(int maxResult) {
        final List<OcCustomerGroup> result = dao.select(maxResult);
        logger.info("select(OcCustomerGroup) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcCustomerGroup> selectAll() {
        final List<OcCustomerGroup> results = dao.selectAll();
        logger.info("selectAll(OcCustomerGroup) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomerGroup create(OcCustomerGroup bean) {
        requireNonNull(bean);
        logger.info("create(OcCustomerGroup={}) - entered bean ");

        final OcCustomerGroup result = dao.create(bean);

        logger.info("create(OcCustomerGroup) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomerGroup update(OcCustomerGroup bean) {
        requireNonNull(bean);
        logger.info("update(OcCustomerGroup={}) - entered bean ");

        final OcCustomerGroup result = dao.update(bean);

        logger.info("update(OcCustomerGroup) - exited - return value={} result ");
        return result;
    }
}
