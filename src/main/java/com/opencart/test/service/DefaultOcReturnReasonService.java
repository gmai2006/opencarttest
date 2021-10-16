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

import com.opencart.test.dao.OcReturnReasonDao;
import com.opencart.test.entity.OcReturnReason;
import com.opencart.test.entity.OcReturnReasonId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcReturnReasonService")
public class DefaultOcReturnReasonService implements OcReturnReasonService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcReturnReasonDao dao;

    @Inject
    @Named("DefaultOcReturnReasonDao")
    public DefaultOcReturnReasonService(final OcReturnReasonDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcReturnReason find(OcReturnReasonId id) {
        final OcReturnReason result = dao.find(id);
        logger.info("find(OcReturnReason) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcReturnReason> select(int maxResult) {
        final List<OcReturnReason> result = dao.select(maxResult);
        logger.info("select(OcReturnReason) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcReturnReason> selectAll() {
        final List<OcReturnReason> results = dao.selectAll();
        logger.info("selectAll(OcReturnReason) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcReturnReason create(OcReturnReason bean) {
        requireNonNull(bean);
        logger.info("create(OcReturnReason={}) - entered bean ");

        final OcReturnReason result = dao.create(bean);

        logger.info("create(OcReturnReason) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcReturnReason update(OcReturnReason bean) {
        requireNonNull(bean);
        logger.info("update(OcReturnReason={}) - entered bean ");

        final OcReturnReason result = dao.update(bean);

        logger.info("update(OcReturnReason) - exited - return value={} result ");
        return result;
    }
}
