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

import com.opencart.test.dao.OcLayoutModuleDao;
import com.opencart.test.entity.OcLayoutModule;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcLayoutModuleService")
public class DefaultOcLayoutModuleService implements OcLayoutModuleService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcLayoutModuleDao dao;

    @Inject
    @Named("DefaultOcLayoutModuleDao")
    public DefaultOcLayoutModuleService(final OcLayoutModuleDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcLayoutModule find(java.lang.Integer id) {

        final OcLayoutModule result = dao.find(id);
        logger.info("find(OcLayoutModule) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcLayoutModule> select(int maxResult) {
        final List<OcLayoutModule> result = dao.select(maxResult);
        logger.info("select(OcLayoutModule) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcLayoutModule> selectAll() {
        final List<OcLayoutModule> results = dao.selectAll();
        logger.info("selectAll(OcLayoutModule) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcLayoutModule create(OcLayoutModule bean) {
        requireNonNull(bean);
        logger.info("create(OcLayoutModule={}) - entered bean ");

        final OcLayoutModule result = dao.create(bean);

        logger.info("create(OcLayoutModule) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcLayoutModule update(OcLayoutModule bean) {
        requireNonNull(bean);
        logger.info("update(OcLayoutModule={}) - entered bean ");

        final OcLayoutModule result = dao.update(bean);

        logger.info("update(OcLayoutModule) - exited - return value={} result ");
        return result;
    }
}
