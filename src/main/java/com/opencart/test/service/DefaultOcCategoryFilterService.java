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

import com.opencart.test.dao.OcCategoryFilterDao;
import com.opencart.test.entity.OcCategoryFilter;
import com.opencart.test.entity.OcCategoryFilterId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcCategoryFilterService")
public class DefaultOcCategoryFilterService implements OcCategoryFilterService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcCategoryFilterDao dao;

    @Inject
    @Named("DefaultOcCategoryFilterDao")
    public DefaultOcCategoryFilterService(final OcCategoryFilterDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcCategoryFilter find(OcCategoryFilterId id) {
        final OcCategoryFilter result = dao.find(id);
        logger.info("find(OcCategoryFilter) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcCategoryFilter> select(int maxResult) {
        final List<OcCategoryFilter> result = dao.select(maxResult);
        logger.info("select(OcCategoryFilter) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcCategoryFilter> selectAll() {
        final List<OcCategoryFilter> results = dao.selectAll();
        logger.info("selectAll(OcCategoryFilter) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcCategoryFilter create(OcCategoryFilter bean) {
        requireNonNull(bean);
        logger.info("create(OcCategoryFilter={}) - entered bean ");

        final OcCategoryFilter result = dao.create(bean);

        logger.info("create(OcCategoryFilter) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcCategoryFilter update(OcCategoryFilter bean) {
        requireNonNull(bean);
        logger.info("update(OcCategoryFilter={}) - entered bean ");

        final OcCategoryFilter result = dao.update(bean);

        logger.info("update(OcCategoryFilter) - exited - return value={} result ");
        return result;
    }
}
