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

import com.opencart.test.dao.OcApiDao;
import com.opencart.test.entity.OcApi;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcApiService")
public class DefaultOcApiService implements OcApiService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcApiDao dao;

    @Inject
    @Named("DefaultOcApiDao")
    public DefaultOcApiService(final OcApiDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcApi find(java.lang.Integer id) {

        final OcApi result = dao.find(id);
        logger.info("find(OcApi) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcApi> select(int maxResult) {
        final List<OcApi> result = dao.select(maxResult);
        logger.info("select(OcApi) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcApi> selectAll() {
        final List<OcApi> results = dao.selectAll();
        logger.info("selectAll(OcApi) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcApi create(OcApi bean) {
        requireNonNull(bean);
        logger.info("create(OcApi={}) - entered bean ");

        final OcApi result = dao.create(bean);

        logger.info("create(OcApi) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcApi update(OcApi bean) {
        requireNonNull(bean);
        logger.info("update(OcApi={}) - entered bean ");

        final OcApi result = dao.update(bean);

        logger.info("update(OcApi) - exited - return value={} result ");
        return result;
    }
}
