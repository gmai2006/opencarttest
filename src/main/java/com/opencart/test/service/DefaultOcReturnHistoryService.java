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

import com.opencart.test.dao.OcReturnHistoryDao;
import com.opencart.test.entity.OcReturnHistory;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcReturnHistoryService")
public class DefaultOcReturnHistoryService implements OcReturnHistoryService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcReturnHistoryDao dao;

    @Inject
    @Named("DefaultOcReturnHistoryDao")
    public DefaultOcReturnHistoryService(final OcReturnHistoryDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcReturnHistory find(java.lang.Integer id) {

        final OcReturnHistory result = dao.find(id);
        logger.info("find(OcReturnHistory) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcReturnHistory> select(int maxResult) {
        final List<OcReturnHistory> result = dao.select(maxResult);
        logger.info("select(OcReturnHistory) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcReturnHistory> selectAll() {
        final List<OcReturnHistory> results = dao.selectAll();
        logger.info("selectAll(OcReturnHistory) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcReturnHistory create(OcReturnHistory bean) {
        requireNonNull(bean);
        logger.info("create(OcReturnHistory={}) - entered bean ");

        final OcReturnHistory result = dao.create(bean);

        logger.info("create(OcReturnHistory) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcReturnHistory update(OcReturnHistory bean) {
        requireNonNull(bean);
        logger.info("update(OcReturnHistory={}) - entered bean ");

        final OcReturnHistory result = dao.update(bean);

        logger.info("update(OcReturnHistory) - exited - return value={} result ");
        return result;
    }
}
