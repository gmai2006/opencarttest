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

import com.opencart.test.dao.OcInformationToStoreDao;
import com.opencart.test.entity.OcInformationToStore;
import com.opencart.test.entity.OcInformationToStoreId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcInformationToStoreService")
public class DefaultOcInformationToStoreService implements OcInformationToStoreService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcInformationToStoreDao dao;

    @Inject
    @Named("DefaultOcInformationToStoreDao")
    public DefaultOcInformationToStoreService(final OcInformationToStoreDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcInformationToStore find(OcInformationToStoreId id) {
        final OcInformationToStore result = dao.find(id);
        logger.info("find(OcInformationToStore) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcInformationToStore> select(int maxResult) {
        final List<OcInformationToStore> result = dao.select(maxResult);
        logger.info("select(OcInformationToStore) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcInformationToStore> selectAll() {
        final List<OcInformationToStore> results = dao.selectAll();
        logger.info("selectAll(OcInformationToStore) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcInformationToStore create(OcInformationToStore bean) {
        requireNonNull(bean);
        logger.info("create(OcInformationToStore={}) - entered bean ");

        final OcInformationToStore result = dao.create(bean);

        logger.info("create(OcInformationToStore) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcInformationToStore update(OcInformationToStore bean) {
        requireNonNull(bean);
        logger.info("update(OcInformationToStore={}) - entered bean ");

        final OcInformationToStore result = dao.update(bean);

        logger.info("update(OcInformationToStore) - exited - return value={} result ");
        return result;
    }
}
