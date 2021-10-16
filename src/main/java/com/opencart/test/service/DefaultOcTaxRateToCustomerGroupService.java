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

import com.opencart.test.dao.OcTaxRateToCustomerGroupDao;
import com.opencart.test.entity.OcTaxRateToCustomerGroup;
import com.opencart.test.entity.OcTaxRateToCustomerGroupId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcTaxRateToCustomerGroupService")
public class DefaultOcTaxRateToCustomerGroupService implements OcTaxRateToCustomerGroupService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcTaxRateToCustomerGroupDao dao;

    @Inject
    @Named("DefaultOcTaxRateToCustomerGroupDao")
    public DefaultOcTaxRateToCustomerGroupService(final OcTaxRateToCustomerGroupDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcTaxRateToCustomerGroup find(OcTaxRateToCustomerGroupId id) {
        final OcTaxRateToCustomerGroup result = dao.find(id);
        logger.info("find(OcTaxRateToCustomerGroup) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcTaxRateToCustomerGroup> select(int maxResult) {
        final List<OcTaxRateToCustomerGroup> result = dao.select(maxResult);
        logger.info("select(OcTaxRateToCustomerGroup) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcTaxRateToCustomerGroup> selectAll() {
        final List<OcTaxRateToCustomerGroup> results = dao.selectAll();
        logger.info("selectAll(OcTaxRateToCustomerGroup) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcTaxRateToCustomerGroup create(OcTaxRateToCustomerGroup bean) {
        requireNonNull(bean);
        logger.info("create(OcTaxRateToCustomerGroup={}) - entered bean ");

        final OcTaxRateToCustomerGroup result = dao.create(bean);

        logger.info("create(OcTaxRateToCustomerGroup) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcTaxRateToCustomerGroup update(OcTaxRateToCustomerGroup bean) {
        requireNonNull(bean);
        logger.info("update(OcTaxRateToCustomerGroup={}) - entered bean ");

        final OcTaxRateToCustomerGroup result = dao.update(bean);

        logger.info("update(OcTaxRateToCustomerGroup) - exited - return value={} result ");
        return result;
    }
}
