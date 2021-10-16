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

import com.opencart.test.dao.OcProductFilterDao;
import com.opencart.test.entity.OcProductFilter;
import com.opencart.test.entity.OcProductFilterId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcProductFilterService")
public class DefaultOcProductFilterService implements OcProductFilterService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcProductFilterDao dao;

    @Inject
    @Named("DefaultOcProductFilterDao")
    public DefaultOcProductFilterService(final OcProductFilterDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcProductFilter find(OcProductFilterId id) {
        final OcProductFilter result = dao.find(id);
        logger.info("find(OcProductFilter) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcProductFilter> select(int maxResult) {
        final List<OcProductFilter> result = dao.select(maxResult);
        logger.info("select(OcProductFilter) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcProductFilter> selectAll() {
        final List<OcProductFilter> results = dao.selectAll();
        logger.info("selectAll(OcProductFilter) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcProductFilter create(OcProductFilter bean) {
        requireNonNull(bean);
        logger.info("create(OcProductFilter={}) - entered bean ");

        final OcProductFilter result = dao.create(bean);

        logger.info("create(OcProductFilter) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcProductFilter update(OcProductFilter bean) {
        requireNonNull(bean);
        logger.info("update(OcProductFilter={}) - entered bean ");

        final OcProductFilter result = dao.update(bean);

        logger.info("update(OcProductFilter) - exited - return value={} result ");
        return result;
    }
}
