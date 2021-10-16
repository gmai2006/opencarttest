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

import com.opencart.test.dao.OcLayoutRouteDao;
import com.opencart.test.entity.OcLayoutRoute;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcLayoutRouteService")
public class DefaultOcLayoutRouteService implements OcLayoutRouteService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcLayoutRouteDao dao;

    @Inject
    @Named("DefaultOcLayoutRouteDao")
    public DefaultOcLayoutRouteService(final OcLayoutRouteDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcLayoutRoute find(java.lang.Integer id) {

        final OcLayoutRoute result = dao.find(id);
        logger.info("find(OcLayoutRoute) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcLayoutRoute> select(int maxResult) {
        final List<OcLayoutRoute> result = dao.select(maxResult);
        logger.info("select(OcLayoutRoute) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcLayoutRoute> selectAll() {
        final List<OcLayoutRoute> results = dao.selectAll();
        logger.info("selectAll(OcLayoutRoute) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcLayoutRoute create(OcLayoutRoute bean) {
        requireNonNull(bean);
        logger.info("create(OcLayoutRoute={}) - entered bean ");

        final OcLayoutRoute result = dao.create(bean);

        logger.info("create(OcLayoutRoute) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcLayoutRoute update(OcLayoutRoute bean) {
        requireNonNull(bean);
        logger.info("update(OcLayoutRoute={}) - entered bean ");

        final OcLayoutRoute result = dao.update(bean);

        logger.info("update(OcLayoutRoute) - exited - return value={} result ");
        return result;
    }
}
