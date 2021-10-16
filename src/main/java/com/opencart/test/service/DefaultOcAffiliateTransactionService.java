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

import com.opencart.test.dao.OcAffiliateTransactionDao;
import com.opencart.test.entity.OcAffiliateTransaction;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcAffiliateTransactionService")
public class DefaultOcAffiliateTransactionService implements OcAffiliateTransactionService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcAffiliateTransactionDao dao;

    @Inject
    @Named("DefaultOcAffiliateTransactionDao")
    public DefaultOcAffiliateTransactionService(final OcAffiliateTransactionDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcAffiliateTransaction find(java.lang.Integer id) {

        final OcAffiliateTransaction result = dao.find(id);
        logger.info("find(OcAffiliateTransaction) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcAffiliateTransaction> select(int maxResult) {
        final List<OcAffiliateTransaction> result = dao.select(maxResult);
        logger.info("select(OcAffiliateTransaction) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcAffiliateTransaction> selectAll() {
        final List<OcAffiliateTransaction> results = dao.selectAll();
        logger.info("selectAll(OcAffiliateTransaction) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcAffiliateTransaction create(OcAffiliateTransaction bean) {
        requireNonNull(bean);
        logger.info("create(OcAffiliateTransaction={}) - entered bean ");

        final OcAffiliateTransaction result = dao.create(bean);

        logger.info("create(OcAffiliateTransaction) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcAffiliateTransaction update(OcAffiliateTransaction bean) {
        requireNonNull(bean);
        logger.info("update(OcAffiliateTransaction={}) - entered bean ");

        final OcAffiliateTransaction result = dao.update(bean);

        logger.info("update(OcAffiliateTransaction) - exited - return value={} result ");
        return result;
    }
}
