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

import com.opencart.test.dao.OcStockStatusDao;
import com.opencart.test.entity.OcStockStatus;
import com.opencart.test.entity.OcStockStatusId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcStockStatusService")
public class DefaultOcStockStatusService implements OcStockStatusService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcStockStatusDao dao;

    @Inject
    @Named("DefaultOcStockStatusDao")
    public DefaultOcStockStatusService(final OcStockStatusDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcStockStatus find(OcStockStatusId id) {
        final OcStockStatus result = dao.find(id);
        logger.info("find(OcStockStatus) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcStockStatus> select(int maxResult) {
        final List<OcStockStatus> result = dao.select(maxResult);
        logger.info("select(OcStockStatus) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcStockStatus> selectAll() {
        final List<OcStockStatus> results = dao.selectAll();
        logger.info("selectAll(OcStockStatus) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcStockStatus create(OcStockStatus bean) {
        requireNonNull(bean);
        logger.info("create(OcStockStatus={}) - entered bean ");

        final OcStockStatus result = dao.create(bean);

        logger.info("create(OcStockStatus) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcStockStatus update(OcStockStatus bean) {
        requireNonNull(bean);
        logger.info("update(OcStockStatus={}) - entered bean ");

        final OcStockStatus result = dao.update(bean);

        logger.info("update(OcStockStatus) - exited - return value={} result ");
        return result;
    }
}
