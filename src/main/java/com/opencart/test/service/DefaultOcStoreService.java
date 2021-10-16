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

import com.opencart.test.dao.OcStoreDao;
import com.opencart.test.entity.OcStore;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcStoreService")
public class DefaultOcStoreService implements OcStoreService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcStoreDao dao;

    @Inject
    @Named("DefaultOcStoreDao")
    public DefaultOcStoreService(final OcStoreDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcStore find(java.lang.Integer id) {

        final OcStore result = dao.find(id);
        logger.info("find(OcStore) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcStore> select(int maxResult) {
        final List<OcStore> result = dao.select(maxResult);
        logger.info("select(OcStore) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcStore> selectAll() {
        final List<OcStore> results = dao.selectAll();
        logger.info("selectAll(OcStore) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcStore create(OcStore bean) {
        requireNonNull(bean);
        logger.info("create(OcStore={}) - entered bean ");

        final OcStore result = dao.create(bean);

        logger.info("create(OcStore) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcStore update(OcStore bean) {
        requireNonNull(bean);
        logger.info("update(OcStore={}) - entered bean ");

        final OcStore result = dao.update(bean);

        logger.info("update(OcStore) - exited - return value={} result ");
        return result;
    }
}
