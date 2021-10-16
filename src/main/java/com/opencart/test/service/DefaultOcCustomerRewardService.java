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

import com.opencart.test.dao.OcCustomerRewardDao;
import com.opencart.test.entity.OcCustomerReward;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcCustomerRewardService")
public class DefaultOcCustomerRewardService implements OcCustomerRewardService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcCustomerRewardDao dao;

    @Inject
    @Named("DefaultOcCustomerRewardDao")
    public DefaultOcCustomerRewardService(final OcCustomerRewardDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomerReward find(java.lang.Integer id) {

        final OcCustomerReward result = dao.find(id);
        logger.info("find(OcCustomerReward) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcCustomerReward> select(int maxResult) {
        final List<OcCustomerReward> result = dao.select(maxResult);
        logger.info("select(OcCustomerReward) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcCustomerReward> selectAll() {
        final List<OcCustomerReward> results = dao.selectAll();
        logger.info("selectAll(OcCustomerReward) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomerReward create(OcCustomerReward bean) {
        requireNonNull(bean);
        logger.info("create(OcCustomerReward={}) - entered bean ");

        final OcCustomerReward result = dao.create(bean);

        logger.info("create(OcCustomerReward) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomerReward update(OcCustomerReward bean) {
        requireNonNull(bean);
        logger.info("update(OcCustomerReward={}) - entered bean ");

        final OcCustomerReward result = dao.update(bean);

        logger.info("update(OcCustomerReward) - exited - return value={} result ");
        return result;
    }
}
