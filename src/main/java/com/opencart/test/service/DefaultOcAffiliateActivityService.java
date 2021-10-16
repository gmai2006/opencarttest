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

import com.opencart.test.dao.OcAffiliateActivityDao;
import com.opencart.test.entity.OcAffiliateActivity;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcAffiliateActivityService")
public class DefaultOcAffiliateActivityService implements OcAffiliateActivityService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcAffiliateActivityDao dao;

    @Inject
    @Named("DefaultOcAffiliateActivityDao")
    public DefaultOcAffiliateActivityService(final OcAffiliateActivityDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcAffiliateActivity find(java.lang.Integer id) {

        final OcAffiliateActivity result = dao.find(id);
        logger.info("find(OcAffiliateActivity) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcAffiliateActivity> select(int maxResult) {
        final List<OcAffiliateActivity> result = dao.select(maxResult);
        logger.info("select(OcAffiliateActivity) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcAffiliateActivity> selectAll() {
        final List<OcAffiliateActivity> results = dao.selectAll();
        logger.info("selectAll(OcAffiliateActivity) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcAffiliateActivity create(OcAffiliateActivity bean) {
        requireNonNull(bean);
        logger.info("create(OcAffiliateActivity={}) - entered bean ");

        final OcAffiliateActivity result = dao.create(bean);

        logger.info("create(OcAffiliateActivity) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcAffiliateActivity update(OcAffiliateActivity bean) {
        requireNonNull(bean);
        logger.info("update(OcAffiliateActivity={}) - entered bean ");

        final OcAffiliateActivity result = dao.update(bean);

        logger.info("update(OcAffiliateActivity) - exited - return value={} result ");
        return result;
    }
}
