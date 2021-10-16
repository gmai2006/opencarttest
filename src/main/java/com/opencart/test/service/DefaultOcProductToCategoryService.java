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

import com.opencart.test.dao.OcProductToCategoryDao;
import com.opencart.test.entity.OcProductToCategory;
import com.opencart.test.entity.OcProductToCategoryId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcProductToCategoryService")
public class DefaultOcProductToCategoryService implements OcProductToCategoryService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcProductToCategoryDao dao;

    @Inject
    @Named("DefaultOcProductToCategoryDao")
    public DefaultOcProductToCategoryService(final OcProductToCategoryDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcProductToCategory find(OcProductToCategoryId id) {
        final OcProductToCategory result = dao.find(id);
        logger.info("find(OcProductToCategory) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcProductToCategory> select(int maxResult) {
        final List<OcProductToCategory> result = dao.select(maxResult);
        logger.info("select(OcProductToCategory) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcProductToCategory> selectAll() {
        final List<OcProductToCategory> results = dao.selectAll();
        logger.info("selectAll(OcProductToCategory) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcProductToCategory create(OcProductToCategory bean) {
        requireNonNull(bean);
        logger.info("create(OcProductToCategory={}) - entered bean ");

        final OcProductToCategory result = dao.create(bean);

        logger.info("create(OcProductToCategory) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcProductToCategory update(OcProductToCategory bean) {
        requireNonNull(bean);
        logger.info("update(OcProductToCategory={}) - entered bean ");

        final OcProductToCategory result = dao.update(bean);

        logger.info("update(OcProductToCategory) - exited - return value={} result ");
        return result;
    }
}
