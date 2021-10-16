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

import com.opencart.test.dao.OcManufacturerDao;
import com.opencart.test.entity.OcManufacturer;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcManufacturerService")
public class DefaultOcManufacturerService implements OcManufacturerService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcManufacturerDao dao;

    @Inject
    @Named("DefaultOcManufacturerDao")
    public DefaultOcManufacturerService(final OcManufacturerDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcManufacturer find(java.lang.Integer id) {

        final OcManufacturer result = dao.find(id);
        logger.info("find(OcManufacturer) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcManufacturer> select(int maxResult) {
        final List<OcManufacturer> result = dao.select(maxResult);
        logger.info("select(OcManufacturer) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcManufacturer> selectAll() {
        final List<OcManufacturer> results = dao.selectAll();
        logger.info("selectAll(OcManufacturer) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcManufacturer create(OcManufacturer bean) {
        requireNonNull(bean);
        logger.info("create(OcManufacturer={}) - entered bean ");

        final OcManufacturer result = dao.create(bean);

        logger.info("create(OcManufacturer) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcManufacturer update(OcManufacturer bean) {
        requireNonNull(bean);
        logger.info("update(OcManufacturer={}) - entered bean ");

        final OcManufacturer result = dao.update(bean);

        logger.info("update(OcManufacturer) - exited - return value={} result ");
        return result;
    }
}
