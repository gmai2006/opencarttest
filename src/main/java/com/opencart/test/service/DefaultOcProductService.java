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

import com.opencart.test.dao.OcProductDao;
import com.opencart.test.entity.OcProduct;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcProductService")
public class DefaultOcProductService implements OcProductService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcProductDao dao;

    @Inject
    @Named("DefaultOcProductDao")
    public DefaultOcProductService(final OcProductDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcProduct find(java.lang.Integer id) {

        final OcProduct result = dao.find(id);
        logger.info("find(OcProduct) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcProduct> select(int maxResult) {
        final List<OcProduct> result = dao.select(maxResult);
        logger.info("select(OcProduct) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcProduct> selectAll() {
        final List<OcProduct> results = dao.selectAll();
        logger.info("selectAll(OcProduct) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcProduct create(OcProduct bean) {
        requireNonNull(bean);
        logger.info("create(OcProduct={}) - entered bean ");

        final OcProduct result = dao.create(bean);

        logger.info("create(OcProduct) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcProduct update(OcProduct bean) {
        requireNonNull(bean);
        logger.info("update(OcProduct={}) - entered bean ");

        final OcProduct result = dao.update(bean);

        logger.info("update(OcProduct) - exited - return value={} result ");
        return result;
    }
}
