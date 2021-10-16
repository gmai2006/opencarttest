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

import com.opencart.test.dao.OcEventDao;
import com.opencart.test.entity.OcEvent;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcEventService")
public class DefaultOcEventService implements OcEventService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcEventDao dao;

    @Inject
    @Named("DefaultOcEventDao")
    public DefaultOcEventService(final OcEventDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcEvent find(java.lang.Integer id) {

        final OcEvent result = dao.find(id);
        logger.info("find(OcEvent) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcEvent> select(int maxResult) {
        final List<OcEvent> result = dao.select(maxResult);
        logger.info("select(OcEvent) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcEvent> selectAll() {
        final List<OcEvent> results = dao.selectAll();
        logger.info("selectAll(OcEvent) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcEvent create(OcEvent bean) {
        requireNonNull(bean);
        logger.info("create(OcEvent={}) - entered bean ");

        final OcEvent result = dao.create(bean);

        logger.info("create(OcEvent) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcEvent update(OcEvent bean) {
        requireNonNull(bean);
        logger.info("update(OcEvent={}) - entered bean ");

        final OcEvent result = dao.update(bean);

        logger.info("update(OcEvent) - exited - return value={} result ");
        return result;
    }
}
