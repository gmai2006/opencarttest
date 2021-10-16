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

import com.opencart.test.dao.OcCountryDao;
import com.opencart.test.entity.OcCountry;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcCountryService")
public class DefaultOcCountryService implements OcCountryService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcCountryDao dao;

    @Inject
    @Named("DefaultOcCountryDao")
    public DefaultOcCountryService(final OcCountryDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcCountry find(java.lang.Integer id) {

        final OcCountry result = dao.find(id);
        logger.info("find(OcCountry) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcCountry> select(int maxResult) {
        final List<OcCountry> result = dao.select(maxResult);
        logger.info("select(OcCountry) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcCountry> selectAll() {
        final List<OcCountry> results = dao.selectAll();
        logger.info("selectAll(OcCountry) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcCountry create(OcCountry bean) {
        requireNonNull(bean);
        logger.info("create(OcCountry={}) - entered bean ");

        final OcCountry result = dao.create(bean);

        logger.info("create(OcCountry) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcCountry update(OcCountry bean) {
        requireNonNull(bean);
        logger.info("update(OcCountry={}) - entered bean ");

        final OcCountry result = dao.update(bean);

        logger.info("update(OcCountry) - exited - return value={} result ");
        return result;
    }
}
