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

import com.opencart.test.dao.OcCustomerDao;
import com.opencart.test.entity.OcCustomer;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcCustomerService")
public class DefaultOcCustomerService implements OcCustomerService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcCustomerDao dao;

    @Inject
    @Named("DefaultOcCustomerDao")
    public DefaultOcCustomerService(final OcCustomerDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomer find(java.lang.Integer id) {

        final OcCustomer result = dao.find(id);
        logger.info("find(OcCustomer) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcCustomer> select(int maxResult) {
        final List<OcCustomer> result = dao.select(maxResult);
        logger.info("select(OcCustomer) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcCustomer> selectAll() {
        final List<OcCustomer> results = dao.selectAll();
        logger.info("selectAll(OcCustomer) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomer create(OcCustomer bean) {
        requireNonNull(bean);
        logger.info("create(OcCustomer={}) - entered bean ");

        final OcCustomer result = dao.create(bean);

        logger.info("create(OcCustomer) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomer update(OcCustomer bean) {
        requireNonNull(bean);
        logger.info("update(OcCustomer={}) - entered bean ");

        final OcCustomer result = dao.update(bean);

        logger.info("update(OcCustomer) - exited - return value={} result ");
        return result;
    }
}
