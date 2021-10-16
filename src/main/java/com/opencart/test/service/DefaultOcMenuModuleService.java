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

import com.opencart.test.dao.OcMenuModuleDao;
import com.opencart.test.entity.OcMenuModule;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcMenuModuleService")
public class DefaultOcMenuModuleService implements OcMenuModuleService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcMenuModuleDao dao;

    @Inject
    @Named("DefaultOcMenuModuleDao")
    public DefaultOcMenuModuleService(final OcMenuModuleDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcMenuModule find(java.lang.Integer id) {

        final OcMenuModule result = dao.find(id);
        logger.info("find(OcMenuModule) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcMenuModule> select(int maxResult) {
        final List<OcMenuModule> result = dao.select(maxResult);
        logger.info("select(OcMenuModule) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcMenuModule> selectAll() {
        final List<OcMenuModule> results = dao.selectAll();
        logger.info("selectAll(OcMenuModule) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcMenuModule create(OcMenuModule bean) {
        requireNonNull(bean);
        logger.info("create(OcMenuModule={}) - entered bean ");

        final OcMenuModule result = dao.create(bean);

        logger.info("create(OcMenuModule) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcMenuModule update(OcMenuModule bean) {
        requireNonNull(bean);
        logger.info("update(OcMenuModule={}) - entered bean ");

        final OcMenuModule result = dao.update(bean);

        logger.info("update(OcMenuModule) - exited - return value={} result ");
        return result;
    }
}
