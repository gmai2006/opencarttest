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

import com.opencart.test.dao.OcZoneToGeoZoneDao;
import com.opencart.test.entity.OcZoneToGeoZone;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcZoneToGeoZoneService")
public class DefaultOcZoneToGeoZoneService implements OcZoneToGeoZoneService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcZoneToGeoZoneDao dao;

    @Inject
    @Named("DefaultOcZoneToGeoZoneDao")
    public DefaultOcZoneToGeoZoneService(final OcZoneToGeoZoneDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcZoneToGeoZone find(java.lang.Integer id) {

        final OcZoneToGeoZone result = dao.find(id);
        logger.info("find(OcZoneToGeoZone) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcZoneToGeoZone> select(int maxResult) {
        final List<OcZoneToGeoZone> result = dao.select(maxResult);
        logger.info("select(OcZoneToGeoZone) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcZoneToGeoZone> selectAll() {
        final List<OcZoneToGeoZone> results = dao.selectAll();
        logger.info("selectAll(OcZoneToGeoZone) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcZoneToGeoZone create(OcZoneToGeoZone bean) {
        requireNonNull(bean);
        logger.info("create(OcZoneToGeoZone={}) - entered bean ");

        final OcZoneToGeoZone result = dao.create(bean);

        logger.info("create(OcZoneToGeoZone) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcZoneToGeoZone update(OcZoneToGeoZone bean) {
        requireNonNull(bean);
        logger.info("update(OcZoneToGeoZone={}) - entered bean ");

        final OcZoneToGeoZone result = dao.update(bean);

        logger.info("update(OcZoneToGeoZone) - exited - return value={} result ");
        return result;
    }
}
