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

import com.opencart.test.dao.OcAffiliateDao;
import com.opencart.test.entity.OcAffiliate;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcAffiliateService")
public class DefaultOcAffiliateService implements OcAffiliateService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcAffiliateDao dao;

    @Inject
    @Named("DefaultOcAffiliateDao")
    public DefaultOcAffiliateService(final OcAffiliateDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcAffiliate find(java.lang.Integer id) {

        final OcAffiliate result = dao.find(id);
        logger.info("find(OcAffiliate) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcAffiliate> select(int maxResult) {
        final List<OcAffiliate> result = dao.select(maxResult);
        logger.info("select(OcAffiliate) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcAffiliate> selectAll() {
        final List<OcAffiliate> results = dao.selectAll();
        logger.info("selectAll(OcAffiliate) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcAffiliate create(OcAffiliate bean) {
        requireNonNull(bean);
        logger.info("create(OcAffiliate={}) - entered bean ");

        final OcAffiliate result = dao.create(bean);

        logger.info("create(OcAffiliate) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcAffiliate update(OcAffiliate bean) {
        requireNonNull(bean);
        logger.info("update(OcAffiliate={}) - entered bean ");

        final OcAffiliate result = dao.update(bean);

        logger.info("update(OcAffiliate) - exited - return value={} result ");
        return result;
    }
}
