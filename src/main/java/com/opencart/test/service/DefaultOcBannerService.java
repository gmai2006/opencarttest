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

import com.opencart.test.dao.OcBannerDao;
import com.opencart.test.entity.OcBanner;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcBannerService")
public class DefaultOcBannerService implements OcBannerService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcBannerDao dao;

    @Inject
    @Named("DefaultOcBannerDao")
    public DefaultOcBannerService(final OcBannerDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcBanner find(java.lang.Integer id) {

        final OcBanner result = dao.find(id);
        logger.info("find(OcBanner) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcBanner> select(int maxResult) {
        final List<OcBanner> result = dao.select(maxResult);
        logger.info("select(OcBanner) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcBanner> selectAll() {
        final List<OcBanner> results = dao.selectAll();
        logger.info("selectAll(OcBanner) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcBanner create(OcBanner bean) {
        requireNonNull(bean);
        logger.info("create(OcBanner={}) - entered bean ");

        final OcBanner result = dao.create(bean);

        logger.info("create(OcBanner) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcBanner update(OcBanner bean) {
        requireNonNull(bean);
        logger.info("update(OcBanner={}) - entered bean ");

        final OcBanner result = dao.update(bean);

        logger.info("update(OcBanner) - exited - return value={} result ");
        return result;
    }
}
