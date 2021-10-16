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

import com.opencart.test.dao.OcBannerImageDao;
import com.opencart.test.entity.OcBannerImage;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcBannerImageService")
public class DefaultOcBannerImageService implements OcBannerImageService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcBannerImageDao dao;

    @Inject
    @Named("DefaultOcBannerImageDao")
    public DefaultOcBannerImageService(final OcBannerImageDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcBannerImage find(java.lang.Integer id) {

        final OcBannerImage result = dao.find(id);
        logger.info("find(OcBannerImage) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcBannerImage> select(int maxResult) {
        final List<OcBannerImage> result = dao.select(maxResult);
        logger.info("select(OcBannerImage) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcBannerImage> selectAll() {
        final List<OcBannerImage> results = dao.selectAll();
        logger.info("selectAll(OcBannerImage) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcBannerImage create(OcBannerImage bean) {
        requireNonNull(bean);
        logger.info("create(OcBannerImage={}) - entered bean ");

        final OcBannerImage result = dao.create(bean);

        logger.info("create(OcBannerImage) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcBannerImage update(OcBannerImage bean) {
        requireNonNull(bean);
        logger.info("update(OcBannerImage={}) - entered bean ");

        final OcBannerImage result = dao.update(bean);

        logger.info("update(OcBannerImage) - exited - return value={} result ");
        return result;
    }
}
