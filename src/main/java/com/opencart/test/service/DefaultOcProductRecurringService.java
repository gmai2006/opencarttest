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

import com.opencart.test.dao.OcProductRecurringDao;
import com.opencart.test.entity.OcProductRecurring;
import com.opencart.test.entity.OcProductRecurringId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcProductRecurringService")
public class DefaultOcProductRecurringService implements OcProductRecurringService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcProductRecurringDao dao;

    @Inject
    @Named("DefaultOcProductRecurringDao")
    public DefaultOcProductRecurringService(final OcProductRecurringDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcProductRecurring find(OcProductRecurringId id) {
        final OcProductRecurring result = dao.find(id);
        logger.info("find(OcProductRecurring) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcProductRecurring> select(int maxResult) {
        final List<OcProductRecurring> result = dao.select(maxResult);
        logger.info("select(OcProductRecurring) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcProductRecurring> selectAll() {
        final List<OcProductRecurring> results = dao.selectAll();
        logger.info("selectAll(OcProductRecurring) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcProductRecurring create(OcProductRecurring bean) {
        requireNonNull(bean);
        logger.info("create(OcProductRecurring={}) - entered bean ");

        final OcProductRecurring result = dao.create(bean);

        logger.info("create(OcProductRecurring) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcProductRecurring update(OcProductRecurring bean) {
        requireNonNull(bean);
        logger.info("update(OcProductRecurring={}) - entered bean ");

        final OcProductRecurring result = dao.update(bean);

        logger.info("update(OcProductRecurring) - exited - return value={} result ");
        return result;
    }
}
