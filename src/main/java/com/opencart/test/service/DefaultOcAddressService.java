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

import com.opencart.test.dao.OcAddressDao;
import com.opencart.test.entity.OcAddress;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcAddressService")
public class DefaultOcAddressService implements OcAddressService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcAddressDao dao;

    @Inject
    @Named("DefaultOcAddressDao")
    public DefaultOcAddressService(final OcAddressDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcAddress find(java.lang.Integer id) {

        final OcAddress result = dao.find(id);
        logger.info("find(OcAddress) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcAddress> select(int maxResult) {
        final List<OcAddress> result = dao.select(maxResult);
        logger.info("select(OcAddress) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcAddress> selectAll() {
        final List<OcAddress> results = dao.selectAll();
        logger.info("selectAll(OcAddress) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcAddress create(OcAddress bean) {
        requireNonNull(bean);
        logger.info("create(OcAddress={}) - entered bean ");

        final OcAddress result = dao.create(bean);

        logger.info("create(OcAddress) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcAddress update(OcAddress bean) {
        requireNonNull(bean);
        logger.info("update(OcAddress={}) - entered bean ");

        final OcAddress result = dao.update(bean);

        logger.info("update(OcAddress) - exited - return value={} result ");
        return result;
    }
}
