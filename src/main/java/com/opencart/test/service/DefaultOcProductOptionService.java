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

import com.opencart.test.dao.OcProductOptionDao;
import com.opencart.test.entity.OcProductOption;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcProductOptionService")
public class DefaultOcProductOptionService implements OcProductOptionService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcProductOptionDao dao;

    @Inject
    @Named("DefaultOcProductOptionDao")
    public DefaultOcProductOptionService(final OcProductOptionDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcProductOption find(java.lang.Integer id) {

        final OcProductOption result = dao.find(id);
        logger.info("find(OcProductOption) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcProductOption> select(int maxResult) {
        final List<OcProductOption> result = dao.select(maxResult);
        logger.info("select(OcProductOption) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcProductOption> selectAll() {
        final List<OcProductOption> results = dao.selectAll();
        logger.info("selectAll(OcProductOption) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcProductOption create(OcProductOption bean) {
        requireNonNull(bean);
        logger.info("create(OcProductOption={}) - entered bean ");

        final OcProductOption result = dao.create(bean);

        logger.info("create(OcProductOption) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcProductOption update(OcProductOption bean) {
        requireNonNull(bean);
        logger.info("update(OcProductOption={}) - entered bean ");

        final OcProductOption result = dao.update(bean);

        logger.info("update(OcProductOption) - exited - return value={} result ");
        return result;
    }
}
