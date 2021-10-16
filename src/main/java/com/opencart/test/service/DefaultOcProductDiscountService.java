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

import com.opencart.test.dao.OcProductDiscountDao;
import com.opencart.test.entity.OcProductDiscount;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcProductDiscountService")
public class DefaultOcProductDiscountService implements OcProductDiscountService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcProductDiscountDao dao;

    @Inject
    @Named("DefaultOcProductDiscountDao")
    public DefaultOcProductDiscountService(final OcProductDiscountDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcProductDiscount find(java.lang.Integer id) {

        final OcProductDiscount result = dao.find(id);
        logger.info("find(OcProductDiscount) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcProductDiscount> select(int maxResult) {
        final List<OcProductDiscount> result = dao.select(maxResult);
        logger.info("select(OcProductDiscount) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcProductDiscount> selectAll() {
        final List<OcProductDiscount> results = dao.selectAll();
        logger.info("selectAll(OcProductDiscount) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcProductDiscount create(OcProductDiscount bean) {
        requireNonNull(bean);
        logger.info("create(OcProductDiscount={}) - entered bean ");

        final OcProductDiscount result = dao.create(bean);

        logger.info("create(OcProductDiscount) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcProductDiscount update(OcProductDiscount bean) {
        requireNonNull(bean);
        logger.info("update(OcProductDiscount={}) - entered bean ");

        final OcProductDiscount result = dao.update(bean);

        logger.info("update(OcProductDiscount) - exited - return value={} result ");
        return result;
    }
}
