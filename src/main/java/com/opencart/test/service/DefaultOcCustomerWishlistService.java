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

import com.opencart.test.dao.OcCustomerWishlistDao;
import com.opencart.test.entity.OcCustomerWishlist;
import com.opencart.test.entity.OcCustomerWishlistId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcCustomerWishlistService")
public class DefaultOcCustomerWishlistService implements OcCustomerWishlistService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcCustomerWishlistDao dao;

    @Inject
    @Named("DefaultOcCustomerWishlistDao")
    public DefaultOcCustomerWishlistService(final OcCustomerWishlistDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomerWishlist find(OcCustomerWishlistId id) {
        final OcCustomerWishlist result = dao.find(id);
        logger.info("find(OcCustomerWishlist) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcCustomerWishlist> select(int maxResult) {
        final List<OcCustomerWishlist> result = dao.select(maxResult);
        logger.info("select(OcCustomerWishlist) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcCustomerWishlist> selectAll() {
        final List<OcCustomerWishlist> results = dao.selectAll();
        logger.info("selectAll(OcCustomerWishlist) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomerWishlist create(OcCustomerWishlist bean) {
        requireNonNull(bean);
        logger.info("create(OcCustomerWishlist={}) - entered bean ");

        final OcCustomerWishlist result = dao.create(bean);

        logger.info("create(OcCustomerWishlist) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomerWishlist update(OcCustomerWishlist bean) {
        requireNonNull(bean);
        logger.info("update(OcCustomerWishlist={}) - entered bean ");

        final OcCustomerWishlist result = dao.update(bean);

        logger.info("update(OcCustomerWishlist) - exited - return value={} result ");
        return result;
    }
}
