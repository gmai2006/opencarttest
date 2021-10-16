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

import com.opencart.test.dao.OcUserDao;
import com.opencart.test.entity.OcUser;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcUserService")
public class DefaultOcUserService implements OcUserService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcUserDao dao;

    @Inject
    @Named("DefaultOcUserDao")
    public DefaultOcUserService(final OcUserDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcUser find(java.lang.Integer id) {

        final OcUser result = dao.find(id);
        logger.info("find(OcUser) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcUser> select(int maxResult) {
        final List<OcUser> result = dao.select(maxResult);
        logger.info("select(OcUser) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcUser> selectAll() {
        final List<OcUser> results = dao.selectAll();
        logger.info("selectAll(OcUser) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcUser create(OcUser bean) {
        requireNonNull(bean);
        logger.info("create(OcUser={}) - entered bean ");

        final OcUser result = dao.create(bean);

        logger.info("create(OcUser) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcUser update(OcUser bean) {
        requireNonNull(bean);
        logger.info("update(OcUser={}) - entered bean ");

        final OcUser result = dao.update(bean);

        logger.info("update(OcUser) - exited - return value={} result ");
        return result;
    }
}
