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

import com.opencart.test.dao.OcTaxRateDao;
import com.opencart.test.entity.OcTaxRate;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcTaxRateService")
public class DefaultOcTaxRateService implements OcTaxRateService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcTaxRateDao dao;

    @Inject
    @Named("DefaultOcTaxRateDao")
    public DefaultOcTaxRateService(final OcTaxRateDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcTaxRate find(java.lang.Integer id) {

        final OcTaxRate result = dao.find(id);
        logger.info("find(OcTaxRate) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcTaxRate> select(int maxResult) {
        final List<OcTaxRate> result = dao.select(maxResult);
        logger.info("select(OcTaxRate) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcTaxRate> selectAll() {
        final List<OcTaxRate> results = dao.selectAll();
        logger.info("selectAll(OcTaxRate) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcTaxRate create(OcTaxRate bean) {
        requireNonNull(bean);
        logger.info("create(OcTaxRate={}) - entered bean ");

        final OcTaxRate result = dao.create(bean);

        logger.info("create(OcTaxRate) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcTaxRate update(OcTaxRate bean) {
        requireNonNull(bean);
        logger.info("update(OcTaxRate={}) - entered bean ");

        final OcTaxRate result = dao.update(bean);

        logger.info("update(OcTaxRate) - exited - return value={} result ");
        return result;
    }
}
