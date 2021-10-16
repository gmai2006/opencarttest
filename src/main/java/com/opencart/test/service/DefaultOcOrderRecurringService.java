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

import com.opencart.test.dao.OcOrderRecurringDao;
import com.opencart.test.entity.OcOrderRecurring;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcOrderRecurringService")
public class DefaultOcOrderRecurringService implements OcOrderRecurringService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcOrderRecurringDao dao;

    @Inject
    @Named("DefaultOcOrderRecurringDao")
    public DefaultOcOrderRecurringService(final OcOrderRecurringDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcOrderRecurring find(java.lang.Integer id) {

        final OcOrderRecurring result = dao.find(id);
        logger.info("find(OcOrderRecurring) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcOrderRecurring> select(int maxResult) {
        final List<OcOrderRecurring> result = dao.select(maxResult);
        logger.info("select(OcOrderRecurring) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcOrderRecurring> selectAll() {
        final List<OcOrderRecurring> results = dao.selectAll();
        logger.info("selectAll(OcOrderRecurring) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcOrderRecurring create(OcOrderRecurring bean) {
        requireNonNull(bean);
        logger.info("create(OcOrderRecurring={}) - entered bean ");

        final OcOrderRecurring result = dao.create(bean);

        logger.info("create(OcOrderRecurring) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcOrderRecurring update(OcOrderRecurring bean) {
        requireNonNull(bean);
        logger.info("update(OcOrderRecurring={}) - entered bean ");

        final OcOrderRecurring result = dao.update(bean);

        logger.info("update(OcOrderRecurring) - exited - return value={} result ");
        return result;
    }
}
