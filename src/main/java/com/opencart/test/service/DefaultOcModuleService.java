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

import com.opencart.test.dao.OcModuleDao;
import com.opencart.test.entity.OcModule;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcModuleService")
public class DefaultOcModuleService implements OcModuleService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcModuleDao dao;

    @Inject
    @Named("DefaultOcModuleDao")
    public DefaultOcModuleService(final OcModuleDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcModule find(java.lang.Integer id) {

        final OcModule result = dao.find(id);
        logger.info("find(OcModule) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcModule> select(int maxResult) {
        final List<OcModule> result = dao.select(maxResult);
        logger.info("select(OcModule) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcModule> selectAll() {
        final List<OcModule> results = dao.selectAll();
        logger.info("selectAll(OcModule) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcModule create(OcModule bean) {
        requireNonNull(bean);
        logger.info("create(OcModule={}) - entered bean ");

        final OcModule result = dao.create(bean);

        logger.info("create(OcModule) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcModule update(OcModule bean) {
        requireNonNull(bean);
        logger.info("update(OcModule={}) - entered bean ");

        final OcModule result = dao.update(bean);

        logger.info("update(OcModule) - exited - return value={} result ");
        return result;
    }
}
