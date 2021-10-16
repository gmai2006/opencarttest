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

import com.opencart.test.dao.OcCustomerLoginDao;
import com.opencart.test.entity.OcCustomerLogin;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcCustomerLoginService")
public class DefaultOcCustomerLoginService implements OcCustomerLoginService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcCustomerLoginDao dao;

    @Inject
    @Named("DefaultOcCustomerLoginDao")
    public DefaultOcCustomerLoginService(final OcCustomerLoginDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomerLogin find(java.lang.Integer id) {

        final OcCustomerLogin result = dao.find(id);
        logger.info("find(OcCustomerLogin) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcCustomerLogin> select(int maxResult) {
        final List<OcCustomerLogin> result = dao.select(maxResult);
        logger.info("select(OcCustomerLogin) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcCustomerLogin> selectAll() {
        final List<OcCustomerLogin> results = dao.selectAll();
        logger.info("selectAll(OcCustomerLogin) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomerLogin create(OcCustomerLogin bean) {
        requireNonNull(bean);
        logger.info("create(OcCustomerLogin={}) - entered bean ");

        final OcCustomerLogin result = dao.create(bean);

        logger.info("create(OcCustomerLogin) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomerLogin update(OcCustomerLogin bean) {
        requireNonNull(bean);
        logger.info("update(OcCustomerLogin={}) - entered bean ");

        final OcCustomerLogin result = dao.update(bean);

        logger.info("update(OcCustomerLogin) - exited - return value={} result ");
        return result;
    }
}
