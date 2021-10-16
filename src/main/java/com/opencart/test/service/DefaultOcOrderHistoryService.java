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

import com.opencart.test.dao.OcOrderHistoryDao;
import com.opencart.test.entity.OcOrderHistory;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcOrderHistoryService")
public class DefaultOcOrderHistoryService implements OcOrderHistoryService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcOrderHistoryDao dao;

    @Inject
    @Named("DefaultOcOrderHistoryDao")
    public DefaultOcOrderHistoryService(final OcOrderHistoryDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcOrderHistory find(java.lang.Integer id) {

        final OcOrderHistory result = dao.find(id);
        logger.info("find(OcOrderHistory) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcOrderHistory> select(int maxResult) {
        final List<OcOrderHistory> result = dao.select(maxResult);
        logger.info("select(OcOrderHistory) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcOrderHistory> selectAll() {
        final List<OcOrderHistory> results = dao.selectAll();
        logger.info("selectAll(OcOrderHistory) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcOrderHistory create(OcOrderHistory bean) {
        requireNonNull(bean);
        logger.info("create(OcOrderHistory={}) - entered bean ");

        final OcOrderHistory result = dao.create(bean);

        logger.info("create(OcOrderHistory) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcOrderHistory update(OcOrderHistory bean) {
        requireNonNull(bean);
        logger.info("update(OcOrderHistory={}) - entered bean ");

        final OcOrderHistory result = dao.update(bean);

        logger.info("update(OcOrderHistory) - exited - return value={} result ");
        return result;
    }
}
