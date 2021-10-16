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

import com.opencart.test.dao.OcCouponCategoryDao;
import com.opencart.test.entity.OcCouponCategory;
import com.opencart.test.entity.OcCouponCategoryId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcCouponCategoryService")
public class DefaultOcCouponCategoryService implements OcCouponCategoryService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcCouponCategoryDao dao;

    @Inject
    @Named("DefaultOcCouponCategoryDao")
    public DefaultOcCouponCategoryService(final OcCouponCategoryDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcCouponCategory find(OcCouponCategoryId id) {
        final OcCouponCategory result = dao.find(id);
        logger.info("find(OcCouponCategory) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcCouponCategory> select(int maxResult) {
        final List<OcCouponCategory> result = dao.select(maxResult);
        logger.info("select(OcCouponCategory) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcCouponCategory> selectAll() {
        final List<OcCouponCategory> results = dao.selectAll();
        logger.info("selectAll(OcCouponCategory) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcCouponCategory create(OcCouponCategory bean) {
        requireNonNull(bean);
        logger.info("create(OcCouponCategory={}) - entered bean ");

        final OcCouponCategory result = dao.create(bean);

        logger.info("create(OcCouponCategory) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcCouponCategory update(OcCouponCategory bean) {
        requireNonNull(bean);
        logger.info("update(OcCouponCategory={}) - entered bean ");

        final OcCouponCategory result = dao.update(bean);

        logger.info("update(OcCouponCategory) - exited - return value={} result ");
        return result;
    }
}
