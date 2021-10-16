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

import com.opencart.test.dao.OcCurrencyDao;
import com.opencart.test.entity.OcCurrency;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcCurrencyService")
public class DefaultOcCurrencyService implements OcCurrencyService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcCurrencyDao dao;

    @Inject
    @Named("DefaultOcCurrencyDao")
    public DefaultOcCurrencyService(final OcCurrencyDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcCurrency find(java.lang.Integer id) {

        final OcCurrency result = dao.find(id);
        logger.info("find(OcCurrency) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcCurrency> select(int maxResult) {
        final List<OcCurrency> result = dao.select(maxResult);
        logger.info("select(OcCurrency) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcCurrency> selectAll() {
        final List<OcCurrency> results = dao.selectAll();
        logger.info("selectAll(OcCurrency) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcCurrency create(OcCurrency bean) {
        requireNonNull(bean);
        logger.info("create(OcCurrency={}) - entered bean ");

        final OcCurrency result = dao.create(bean);

        logger.info("create(OcCurrency) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcCurrency update(OcCurrency bean) {
        requireNonNull(bean);
        logger.info("update(OcCurrency={}) - entered bean ");

        final OcCurrency result = dao.update(bean);

        logger.info("update(OcCurrency) - exited - return value={} result ");
        return result;
    }
}
