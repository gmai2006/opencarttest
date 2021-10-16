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

import com.opencart.test.dao.OcOrderStatusDao;
import com.opencart.test.entity.OcOrderStatus;
import com.opencart.test.entity.OcOrderStatusId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcOrderStatusService")
public class DefaultOcOrderStatusService implements OcOrderStatusService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcOrderStatusDao dao;

    @Inject
    @Named("DefaultOcOrderStatusDao")
    public DefaultOcOrderStatusService(final OcOrderStatusDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcOrderStatus find(OcOrderStatusId id) {
        final OcOrderStatus result = dao.find(id);
        logger.info("find(OcOrderStatus) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcOrderStatus> select(int maxResult) {
        final List<OcOrderStatus> result = dao.select(maxResult);
        logger.info("select(OcOrderStatus) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcOrderStatus> selectAll() {
        final List<OcOrderStatus> results = dao.selectAll();
        logger.info("selectAll(OcOrderStatus) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcOrderStatus create(OcOrderStatus bean) {
        requireNonNull(bean);
        logger.info("create(OcOrderStatus={}) - entered bean ");

        final OcOrderStatus result = dao.create(bean);

        logger.info("create(OcOrderStatus) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcOrderStatus update(OcOrderStatus bean) {
        requireNonNull(bean);
        logger.info("update(OcOrderStatus={}) - entered bean ");

        final OcOrderStatus result = dao.update(bean);

        logger.info("update(OcOrderStatus) - exited - return value={} result ");
        return result;
    }
}
