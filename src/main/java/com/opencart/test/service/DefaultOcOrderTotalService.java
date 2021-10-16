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

import com.opencart.test.dao.OcOrderTotalDao;
import com.opencart.test.entity.OcOrderTotal;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcOrderTotalService")
public class DefaultOcOrderTotalService implements OcOrderTotalService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcOrderTotalDao dao;

    @Inject
    @Named("DefaultOcOrderTotalDao")
    public DefaultOcOrderTotalService(final OcOrderTotalDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcOrderTotal find(java.lang.Integer id) {

        final OcOrderTotal result = dao.find(id);
        logger.info("find(OcOrderTotal) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcOrderTotal> select(int maxResult) {
        final List<OcOrderTotal> result = dao.select(maxResult);
        logger.info("select(OcOrderTotal) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcOrderTotal> selectAll() {
        final List<OcOrderTotal> results = dao.selectAll();
        logger.info("selectAll(OcOrderTotal) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcOrderTotal create(OcOrderTotal bean) {
        requireNonNull(bean);
        logger.info("create(OcOrderTotal={}) - entered bean ");

        final OcOrderTotal result = dao.create(bean);

        logger.info("create(OcOrderTotal) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcOrderTotal update(OcOrderTotal bean) {
        requireNonNull(bean);
        logger.info("update(OcOrderTotal={}) - entered bean ");

        final OcOrderTotal result = dao.update(bean);

        logger.info("update(OcOrderTotal) - exited - return value={} result ");
        return result;
    }
}
