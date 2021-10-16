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

import com.opencart.test.dao.OcAffiliateLoginDao;
import com.opencart.test.entity.OcAffiliateLogin;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcAffiliateLoginService")
public class DefaultOcAffiliateLoginService implements OcAffiliateLoginService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcAffiliateLoginDao dao;

    @Inject
    @Named("DefaultOcAffiliateLoginDao")
    public DefaultOcAffiliateLoginService(final OcAffiliateLoginDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcAffiliateLogin find(java.lang.Integer id) {

        final OcAffiliateLogin result = dao.find(id);
        logger.info("find(OcAffiliateLogin) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcAffiliateLogin> select(int maxResult) {
        final List<OcAffiliateLogin> result = dao.select(maxResult);
        logger.info("select(OcAffiliateLogin) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcAffiliateLogin> selectAll() {
        final List<OcAffiliateLogin> results = dao.selectAll();
        logger.info("selectAll(OcAffiliateLogin) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcAffiliateLogin create(OcAffiliateLogin bean) {
        requireNonNull(bean);
        logger.info("create(OcAffiliateLogin={}) - entered bean ");

        final OcAffiliateLogin result = dao.create(bean);

        logger.info("create(OcAffiliateLogin) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcAffiliateLogin update(OcAffiliateLogin bean) {
        requireNonNull(bean);
        logger.info("update(OcAffiliateLogin={}) - entered bean ");

        final OcAffiliateLogin result = dao.update(bean);

        logger.info("update(OcAffiliateLogin) - exited - return value={} result ");
        return result;
    }
}
