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

import com.opencart.test.dao.OcDownloadDao;
import com.opencart.test.entity.OcDownload;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcDownloadService")
public class DefaultOcDownloadService implements OcDownloadService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcDownloadDao dao;

    @Inject
    @Named("DefaultOcDownloadDao")
    public DefaultOcDownloadService(final OcDownloadDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcDownload find(java.lang.Integer id) {

        final OcDownload result = dao.find(id);
        logger.info("find(OcDownload) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcDownload> select(int maxResult) {
        final List<OcDownload> result = dao.select(maxResult);
        logger.info("select(OcDownload) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcDownload> selectAll() {
        final List<OcDownload> results = dao.selectAll();
        logger.info("selectAll(OcDownload) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcDownload create(OcDownload bean) {
        requireNonNull(bean);
        logger.info("create(OcDownload={}) - entered bean ");

        final OcDownload result = dao.create(bean);

        logger.info("create(OcDownload) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcDownload update(OcDownload bean) {
        requireNonNull(bean);
        logger.info("update(OcDownload={}) - entered bean ");

        final OcDownload result = dao.update(bean);

        logger.info("update(OcDownload) - exited - return value={} result ");
        return result;
    }
}
