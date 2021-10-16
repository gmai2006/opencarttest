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

import com.opencart.test.dao.OcCustomerOnlineDao;
import com.opencart.test.entity.OcCustomerOnline;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcCustomerOnlineService")
public class DefaultOcCustomerOnlineService implements OcCustomerOnlineService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcCustomerOnlineDao dao;

    @Inject
    @Named("DefaultOcCustomerOnlineDao")
    public DefaultOcCustomerOnlineService(final OcCustomerOnlineDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomerOnline find(java.lang.String id) {

        final OcCustomerOnline result = dao.find(id);
        logger.info("find(OcCustomerOnline) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcCustomerOnline> select(int maxResult) {
        final List<OcCustomerOnline> result = dao.select(maxResult);
        logger.info("select(OcCustomerOnline) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcCustomerOnline> selectAll() {
        final List<OcCustomerOnline> results = dao.selectAll();
        logger.info("selectAll(OcCustomerOnline) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomerOnline create(OcCustomerOnline bean) {
        requireNonNull(bean);
        logger.info("create(OcCustomerOnline={}) - entered bean ");

        final OcCustomerOnline result = dao.create(bean);

        logger.info("create(OcCustomerOnline) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomerOnline update(OcCustomerOnline bean) {
        requireNonNull(bean);
        logger.info("update(OcCustomerOnline={}) - entered bean ");

        final OcCustomerOnline result = dao.update(bean);

        logger.info("update(OcCustomerOnline) - exited - return value={} result ");
        return result;
    }
}
