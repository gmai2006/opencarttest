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

import com.opencart.test.dao.OcOrderOptionDao;
import com.opencart.test.entity.OcOrderOption;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcOrderOptionService")
public class DefaultOcOrderOptionService implements OcOrderOptionService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcOrderOptionDao dao;

    @Inject
    @Named("DefaultOcOrderOptionDao")
    public DefaultOcOrderOptionService(final OcOrderOptionDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcOrderOption find(java.lang.Integer id) {

        final OcOrderOption result = dao.find(id);
        logger.info("find(OcOrderOption) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcOrderOption> select(int maxResult) {
        final List<OcOrderOption> result = dao.select(maxResult);
        logger.info("select(OcOrderOption) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcOrderOption> selectAll() {
        final List<OcOrderOption> results = dao.selectAll();
        logger.info("selectAll(OcOrderOption) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcOrderOption create(OcOrderOption bean) {
        requireNonNull(bean);
        logger.info("create(OcOrderOption={}) - entered bean ");

        final OcOrderOption result = dao.create(bean);

        logger.info("create(OcOrderOption) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcOrderOption update(OcOrderOption bean) {
        requireNonNull(bean);
        logger.info("update(OcOrderOption={}) - entered bean ");

        final OcOrderOption result = dao.update(bean);

        logger.info("update(OcOrderOption) - exited - return value={} result ");
        return result;
    }
}
