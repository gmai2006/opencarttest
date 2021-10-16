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

import com.opencart.test.dao.OcOptionValueDao;
import com.opencart.test.entity.OcOptionValue;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcOptionValueService")
public class DefaultOcOptionValueService implements OcOptionValueService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcOptionValueDao dao;

    @Inject
    @Named("DefaultOcOptionValueDao")
    public DefaultOcOptionValueService(final OcOptionValueDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcOptionValue find(java.lang.Integer id) {

        final OcOptionValue result = dao.find(id);
        logger.info("find(OcOptionValue) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcOptionValue> select(int maxResult) {
        final List<OcOptionValue> result = dao.select(maxResult);
        logger.info("select(OcOptionValue) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcOptionValue> selectAll() {
        final List<OcOptionValue> results = dao.selectAll();
        logger.info("selectAll(OcOptionValue) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcOptionValue create(OcOptionValue bean) {
        requireNonNull(bean);
        logger.info("create(OcOptionValue={}) - entered bean ");

        final OcOptionValue result = dao.create(bean);

        logger.info("create(OcOptionValue) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcOptionValue update(OcOptionValue bean) {
        requireNonNull(bean);
        logger.info("update(OcOptionValue={}) - entered bean ");

        final OcOptionValue result = dao.update(bean);

        logger.info("update(OcOptionValue) - exited - return value={} result ");
        return result;
    }
}
