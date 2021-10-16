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

import com.opencart.test.dao.OcProductToStoreDao;
import com.opencart.test.entity.OcProductToStore;
import com.opencart.test.entity.OcProductToStoreId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcProductToStoreService")
public class DefaultOcProductToStoreService implements OcProductToStoreService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcProductToStoreDao dao;

    @Inject
    @Named("DefaultOcProductToStoreDao")
    public DefaultOcProductToStoreService(final OcProductToStoreDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcProductToStore find(OcProductToStoreId id) {
        final OcProductToStore result = dao.find(id);
        logger.info("find(OcProductToStore) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcProductToStore> select(int maxResult) {
        final List<OcProductToStore> result = dao.select(maxResult);
        logger.info("select(OcProductToStore) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcProductToStore> selectAll() {
        final List<OcProductToStore> results = dao.selectAll();
        logger.info("selectAll(OcProductToStore) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcProductToStore create(OcProductToStore bean) {
        requireNonNull(bean);
        logger.info("create(OcProductToStore={}) - entered bean ");

        final OcProductToStore result = dao.create(bean);

        logger.info("create(OcProductToStore) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcProductToStore update(OcProductToStore bean) {
        requireNonNull(bean);
        logger.info("update(OcProductToStore={}) - entered bean ");

        final OcProductToStore result = dao.update(bean);

        logger.info("update(OcProductToStore) - exited - return value={} result ");
        return result;
    }
}
