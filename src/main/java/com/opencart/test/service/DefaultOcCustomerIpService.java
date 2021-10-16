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

import com.opencart.test.dao.OcCustomerIpDao;
import com.opencart.test.entity.OcCustomerIp;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcCustomerIpService")
public class DefaultOcCustomerIpService implements OcCustomerIpService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcCustomerIpDao dao;

    @Inject
    @Named("DefaultOcCustomerIpDao")
    public DefaultOcCustomerIpService(final OcCustomerIpDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomerIp find(java.lang.Integer id) {

        final OcCustomerIp result = dao.find(id);
        logger.info("find(OcCustomerIp) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcCustomerIp> select(int maxResult) {
        final List<OcCustomerIp> result = dao.select(maxResult);
        logger.info("select(OcCustomerIp) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcCustomerIp> selectAll() {
        final List<OcCustomerIp> results = dao.selectAll();
        logger.info("selectAll(OcCustomerIp) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomerIp create(OcCustomerIp bean) {
        requireNonNull(bean);
        logger.info("create(OcCustomerIp={}) - entered bean ");

        final OcCustomerIp result = dao.create(bean);

        logger.info("create(OcCustomerIp) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomerIp update(OcCustomerIp bean) {
        requireNonNull(bean);
        logger.info("update(OcCustomerIp={}) - entered bean ");

        final OcCustomerIp result = dao.update(bean);

        logger.info("update(OcCustomerIp) - exited - return value={} result ");
        return result;
    }
}
