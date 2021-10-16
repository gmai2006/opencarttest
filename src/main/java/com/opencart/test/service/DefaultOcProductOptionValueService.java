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

import com.opencart.test.dao.OcProductOptionValueDao;
import com.opencart.test.entity.OcProductOptionValue;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcProductOptionValueService")
public class DefaultOcProductOptionValueService implements OcProductOptionValueService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcProductOptionValueDao dao;

    @Inject
    @Named("DefaultOcProductOptionValueDao")
    public DefaultOcProductOptionValueService(final OcProductOptionValueDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcProductOptionValue find(java.lang.Integer id) {

        final OcProductOptionValue result = dao.find(id);
        logger.info("find(OcProductOptionValue) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcProductOptionValue> select(int maxResult) {
        final List<OcProductOptionValue> result = dao.select(maxResult);
        logger.info("select(OcProductOptionValue) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcProductOptionValue> selectAll() {
        final List<OcProductOptionValue> results = dao.selectAll();
        logger.info("selectAll(OcProductOptionValue) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcProductOptionValue create(OcProductOptionValue bean) {
        requireNonNull(bean);
        logger.info("create(OcProductOptionValue={}) - entered bean ");

        final OcProductOptionValue result = dao.create(bean);

        logger.info("create(OcProductOptionValue) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcProductOptionValue update(OcProductOptionValue bean) {
        requireNonNull(bean);
        logger.info("update(OcProductOptionValue={}) - entered bean ");

        final OcProductOptionValue result = dao.update(bean);

        logger.info("update(OcProductOptionValue) - exited - return value={} result ");
        return result;
    }
}
