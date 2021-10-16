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

import com.opencart.test.dao.OcCategoryPathDao;
import com.opencart.test.entity.OcCategoryPath;
import com.opencart.test.entity.OcCategoryPathId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcCategoryPathService")
public class DefaultOcCategoryPathService implements OcCategoryPathService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcCategoryPathDao dao;

    @Inject
    @Named("DefaultOcCategoryPathDao")
    public DefaultOcCategoryPathService(final OcCategoryPathDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcCategoryPath find(OcCategoryPathId id) {
        final OcCategoryPath result = dao.find(id);
        logger.info("find(OcCategoryPath) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcCategoryPath> select(int maxResult) {
        final List<OcCategoryPath> result = dao.select(maxResult);
        logger.info("select(OcCategoryPath) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcCategoryPath> selectAll() {
        final List<OcCategoryPath> results = dao.selectAll();
        logger.info("selectAll(OcCategoryPath) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcCategoryPath create(OcCategoryPath bean) {
        requireNonNull(bean);
        logger.info("create(OcCategoryPath={}) - entered bean ");

        final OcCategoryPath result = dao.create(bean);

        logger.info("create(OcCategoryPath) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcCategoryPath update(OcCategoryPath bean) {
        requireNonNull(bean);
        logger.info("update(OcCategoryPath={}) - entered bean ");

        final OcCategoryPath result = dao.update(bean);

        logger.info("update(OcCategoryPath) - exited - return value={} result ");
        return result;
    }
}
