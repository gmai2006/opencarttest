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

import com.opencart.test.dao.OcInformationDao;
import com.opencart.test.entity.OcInformation;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcInformationService")
public class DefaultOcInformationService implements OcInformationService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcInformationDao dao;

    @Inject
    @Named("DefaultOcInformationDao")
    public DefaultOcInformationService(final OcInformationDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcInformation find(java.lang.Integer id) {

        final OcInformation result = dao.find(id);
        logger.info("find(OcInformation) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcInformation> select(int maxResult) {
        final List<OcInformation> result = dao.select(maxResult);
        logger.info("select(OcInformation) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcInformation> selectAll() {
        final List<OcInformation> results = dao.selectAll();
        logger.info("selectAll(OcInformation) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcInformation create(OcInformation bean) {
        requireNonNull(bean);
        logger.info("create(OcInformation={}) - entered bean ");

        final OcInformation result = dao.create(bean);

        logger.info("create(OcInformation) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcInformation update(OcInformation bean) {
        requireNonNull(bean);
        logger.info("update(OcInformation={}) - entered bean ");

        final OcInformation result = dao.update(bean);

        logger.info("update(OcInformation) - exited - return value={} result ");
        return result;
    }
}
