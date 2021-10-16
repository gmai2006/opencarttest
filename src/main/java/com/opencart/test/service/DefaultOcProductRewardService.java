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

import com.opencart.test.dao.OcProductRewardDao;
import com.opencart.test.entity.OcProductReward;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcProductRewardService")
public class DefaultOcProductRewardService implements OcProductRewardService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcProductRewardDao dao;

    @Inject
    @Named("DefaultOcProductRewardDao")
    public DefaultOcProductRewardService(final OcProductRewardDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcProductReward find(java.lang.Integer id) {

        final OcProductReward result = dao.find(id);
        logger.info("find(OcProductReward) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcProductReward> select(int maxResult) {
        final List<OcProductReward> result = dao.select(maxResult);
        logger.info("select(OcProductReward) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcProductReward> selectAll() {
        final List<OcProductReward> results = dao.selectAll();
        logger.info("selectAll(OcProductReward) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcProductReward create(OcProductReward bean) {
        requireNonNull(bean);
        logger.info("create(OcProductReward={}) - entered bean ");

        final OcProductReward result = dao.create(bean);

        logger.info("create(OcProductReward) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcProductReward update(OcProductReward bean) {
        requireNonNull(bean);
        logger.info("update(OcProductReward={}) - entered bean ");

        final OcProductReward result = dao.update(bean);

        logger.info("update(OcProductReward) - exited - return value={} result ");
        return result;
    }
}
