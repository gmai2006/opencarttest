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

import com.opencart.test.dao.OcCustomerSearchDao;
import com.opencart.test.entity.OcCustomerSearch;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcCustomerSearchService")
public class DefaultOcCustomerSearchService implements OcCustomerSearchService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcCustomerSearchDao dao;

    @Inject
    @Named("DefaultOcCustomerSearchDao")
    public DefaultOcCustomerSearchService(final OcCustomerSearchDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomerSearch find(java.lang.Integer id) {

        final OcCustomerSearch result = dao.find(id);
        logger.info("find(OcCustomerSearch) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcCustomerSearch> select(int maxResult) {
        final List<OcCustomerSearch> result = dao.select(maxResult);
        logger.info("select(OcCustomerSearch) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcCustomerSearch> selectAll() {
        final List<OcCustomerSearch> results = dao.selectAll();
        logger.info("selectAll(OcCustomerSearch) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomerSearch create(OcCustomerSearch bean) {
        requireNonNull(bean);
        logger.info("create(OcCustomerSearch={}) - entered bean ");

        final OcCustomerSearch result = dao.create(bean);

        logger.info("create(OcCustomerSearch) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomerSearch update(OcCustomerSearch bean) {
        requireNonNull(bean);
        logger.info("update(OcCustomerSearch={}) - entered bean ");

        final OcCustomerSearch result = dao.update(bean);

        logger.info("update(OcCustomerSearch) - exited - return value={} result ");
        return result;
    }
}
