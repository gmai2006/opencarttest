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

import com.opencart.test.dao.OcReviewDao;
import com.opencart.test.entity.OcReview;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcReviewService")
public class DefaultOcReviewService implements OcReviewService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcReviewDao dao;

    @Inject
    @Named("DefaultOcReviewDao")
    public DefaultOcReviewService(final OcReviewDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcReview find(java.lang.Integer id) {

        final OcReview result = dao.find(id);
        logger.info("find(OcReview) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcReview> select(int maxResult) {
        final List<OcReview> result = dao.select(maxResult);
        logger.info("select(OcReview) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcReview> selectAll() {
        final List<OcReview> results = dao.selectAll();
        logger.info("selectAll(OcReview) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcReview create(OcReview bean) {
        requireNonNull(bean);
        logger.info("create(OcReview={}) - entered bean ");

        final OcReview result = dao.create(bean);

        logger.info("create(OcReview) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcReview update(OcReview bean) {
        requireNonNull(bean);
        logger.info("update(OcReview={}) - entered bean ");

        final OcReview result = dao.update(bean);

        logger.info("update(OcReview) - exited - return value={} result ");
        return result;
    }
}
