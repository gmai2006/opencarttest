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

import com.opencart.test.dao.OcCategoryDescriptionDao;
import com.opencart.test.entity.OcCategoryDescription;
import com.opencart.test.entity.OcCategoryDescriptionId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcCategoryDescriptionService")
public class DefaultOcCategoryDescriptionService implements OcCategoryDescriptionService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcCategoryDescriptionDao dao;

    @Inject
    @Named("DefaultOcCategoryDescriptionDao")
    public DefaultOcCategoryDescriptionService(final OcCategoryDescriptionDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcCategoryDescription find(OcCategoryDescriptionId id) {
        final OcCategoryDescription result = dao.find(id);
        logger.info("find(OcCategoryDescription) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcCategoryDescription> select(int maxResult) {
        final List<OcCategoryDescription> result = dao.select(maxResult);
        logger.info("select(OcCategoryDescription) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcCategoryDescription> selectAll() {
        final List<OcCategoryDescription> results = dao.selectAll();
        logger.info("selectAll(OcCategoryDescription) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcCategoryDescription create(OcCategoryDescription bean) {
        requireNonNull(bean);
        logger.info("create(OcCategoryDescription={}) - entered bean ");

        final OcCategoryDescription result = dao.create(bean);

        logger.info("create(OcCategoryDescription) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcCategoryDescription update(OcCategoryDescription bean) {
        requireNonNull(bean);
        logger.info("update(OcCategoryDescription={}) - entered bean ");

        final OcCategoryDescription result = dao.update(bean);

        logger.info("update(OcCategoryDescription) - exited - return value={} result ");
        return result;
    }
}
