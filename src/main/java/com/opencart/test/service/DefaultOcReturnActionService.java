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

import com.opencart.test.dao.OcReturnActionDao;
import com.opencart.test.entity.OcReturnAction;
import com.opencart.test.entity.OcReturnActionId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcReturnActionService")
public class DefaultOcReturnActionService implements OcReturnActionService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcReturnActionDao dao;

    @Inject
    @Named("DefaultOcReturnActionDao")
    public DefaultOcReturnActionService(final OcReturnActionDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcReturnAction find(OcReturnActionId id) {
        final OcReturnAction result = dao.find(id);
        logger.info("find(OcReturnAction) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcReturnAction> select(int maxResult) {
        final List<OcReturnAction> result = dao.select(maxResult);
        logger.info("select(OcReturnAction) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcReturnAction> selectAll() {
        final List<OcReturnAction> results = dao.selectAll();
        logger.info("selectAll(OcReturnAction) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcReturnAction create(OcReturnAction bean) {
        requireNonNull(bean);
        logger.info("create(OcReturnAction={}) - entered bean ");

        final OcReturnAction result = dao.create(bean);

        logger.info("create(OcReturnAction) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcReturnAction update(OcReturnAction bean) {
        requireNonNull(bean);
        logger.info("update(OcReturnAction={}) - entered bean ");

        final OcReturnAction result = dao.update(bean);

        logger.info("update(OcReturnAction) - exited - return value={} result ");
        return result;
    }
}
