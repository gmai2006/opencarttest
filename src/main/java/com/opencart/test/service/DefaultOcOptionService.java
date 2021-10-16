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

import com.opencart.test.dao.OcOptionDao;
import com.opencart.test.entity.OcOption;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcOptionService")
public class DefaultOcOptionService implements OcOptionService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcOptionDao dao;

    @Inject
    @Named("DefaultOcOptionDao")
    public DefaultOcOptionService(final OcOptionDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcOption find(java.lang.Integer id) {

        final OcOption result = dao.find(id);
        logger.info("find(OcOption) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcOption> select(int maxResult) {
        final List<OcOption> result = dao.select(maxResult);
        logger.info("select(OcOption) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcOption> selectAll() {
        final List<OcOption> results = dao.selectAll();
        logger.info("selectAll(OcOption) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcOption create(OcOption bean) {
        requireNonNull(bean);
        logger.info("create(OcOption={}) - entered bean ");

        final OcOption result = dao.create(bean);

        logger.info("create(OcOption) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcOption update(OcOption bean) {
        requireNonNull(bean);
        logger.info("update(OcOption={}) - entered bean ");

        final OcOption result = dao.update(bean);

        logger.info("update(OcOption) - exited - return value={} result ");
        return result;
    }
}
