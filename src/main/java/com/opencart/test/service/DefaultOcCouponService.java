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

import com.opencart.test.dao.OcCouponDao;
import com.opencart.test.entity.OcCoupon;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcCouponService")
public class DefaultOcCouponService implements OcCouponService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcCouponDao dao;

    @Inject
    @Named("DefaultOcCouponDao")
    public DefaultOcCouponService(final OcCouponDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcCoupon find(java.lang.Integer id) {

        final OcCoupon result = dao.find(id);
        logger.info("find(OcCoupon) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcCoupon> select(int maxResult) {
        final List<OcCoupon> result = dao.select(maxResult);
        logger.info("select(OcCoupon) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcCoupon> selectAll() {
        final List<OcCoupon> results = dao.selectAll();
        logger.info("selectAll(OcCoupon) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcCoupon create(OcCoupon bean) {
        requireNonNull(bean);
        logger.info("create(OcCoupon={}) - entered bean ");

        final OcCoupon result = dao.create(bean);

        logger.info("create(OcCoupon) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcCoupon update(OcCoupon bean) {
        requireNonNull(bean);
        logger.info("update(OcCoupon={}) - entered bean ");

        final OcCoupon result = dao.update(bean);

        logger.info("update(OcCoupon) - exited - return value={} result ");
        return result;
    }
}
