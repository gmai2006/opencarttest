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

import com.opencart.test.dao.OcCartDao;
import com.opencart.test.entity.OcCart;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcCartService")
public class DefaultOcCartService implements OcCartService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcCartDao dao;

    @Inject
    @Named("DefaultOcCartDao")
    public DefaultOcCartService(final OcCartDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcCart find(java.lang.Integer id) {

        final OcCart result = dao.find(id);
        logger.info("find(OcCart) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcCart> select(int maxResult) {
        final List<OcCart> result = dao.select(maxResult);
        logger.info("select(OcCart) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcCart> selectAll() {
        final List<OcCart> results = dao.selectAll();
        logger.info("selectAll(OcCart) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcCart create(OcCart bean) {
        requireNonNull(bean);
        logger.info("create(OcCart={}) - entered bean ");

        final OcCart result = dao.create(bean);

        logger.info("create(OcCart) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcCart update(OcCart bean) {
        requireNonNull(bean);
        logger.info("update(OcCart={}) - entered bean ");

        final OcCart result = dao.update(bean);

        logger.info("update(OcCart) - exited - return value={} result ");
        return result;
    }
}
