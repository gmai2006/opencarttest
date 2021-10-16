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

import com.opencart.test.dao.OcLocationDao;
import com.opencart.test.entity.OcLocation;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcLocationService")
public class DefaultOcLocationService implements OcLocationService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcLocationDao dao;

    @Inject
    @Named("DefaultOcLocationDao")
    public DefaultOcLocationService(final OcLocationDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcLocation find(java.lang.Integer id) {

        final OcLocation result = dao.find(id);
        logger.info("find(OcLocation) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcLocation> select(int maxResult) {
        final List<OcLocation> result = dao.select(maxResult);
        logger.info("select(OcLocation) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcLocation> selectAll() {
        final List<OcLocation> results = dao.selectAll();
        logger.info("selectAll(OcLocation) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcLocation create(OcLocation bean) {
        requireNonNull(bean);
        logger.info("create(OcLocation={}) - entered bean ");

        final OcLocation result = dao.create(bean);

        logger.info("create(OcLocation) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcLocation update(OcLocation bean) {
        requireNonNull(bean);
        logger.info("update(OcLocation={}) - entered bean ");

        final OcLocation result = dao.update(bean);

        logger.info("update(OcLocation) - exited - return value={} result ");
        return result;
    }
}
