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

import com.opencart.test.dao.OcVoucherHistoryDao;
import com.opencart.test.entity.OcVoucherHistory;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcVoucherHistoryService")
public class DefaultOcVoucherHistoryService implements OcVoucherHistoryService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcVoucherHistoryDao dao;

    @Inject
    @Named("DefaultOcVoucherHistoryDao")
    public DefaultOcVoucherHistoryService(final OcVoucherHistoryDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcVoucherHistory find(java.lang.Integer id) {

        final OcVoucherHistory result = dao.find(id);
        logger.info("find(OcVoucherHistory) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcVoucherHistory> select(int maxResult) {
        final List<OcVoucherHistory> result = dao.select(maxResult);
        logger.info("select(OcVoucherHistory) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcVoucherHistory> selectAll() {
        final List<OcVoucherHistory> results = dao.selectAll();
        logger.info("selectAll(OcVoucherHistory) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcVoucherHistory create(OcVoucherHistory bean) {
        requireNonNull(bean);
        logger.info("create(OcVoucherHistory={}) - entered bean ");

        final OcVoucherHistory result = dao.create(bean);

        logger.info("create(OcVoucherHistory) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcVoucherHistory update(OcVoucherHistory bean) {
        requireNonNull(bean);
        logger.info("update(OcVoucherHistory={}) - entered bean ");

        final OcVoucherHistory result = dao.update(bean);

        logger.info("update(OcVoucherHistory) - exited - return value={} result ");
        return result;
    }
}
