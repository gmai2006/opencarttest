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

import com.opencart.test.dao.OcCategoryToLayoutDao;
import com.opencart.test.entity.OcCategoryToLayout;
import com.opencart.test.entity.OcCategoryToLayoutId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcCategoryToLayoutService")
public class DefaultOcCategoryToLayoutService implements OcCategoryToLayoutService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcCategoryToLayoutDao dao;

    @Inject
    @Named("DefaultOcCategoryToLayoutDao")
    public DefaultOcCategoryToLayoutService(final OcCategoryToLayoutDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcCategoryToLayout find(OcCategoryToLayoutId id) {
        final OcCategoryToLayout result = dao.find(id);
        logger.info("find(OcCategoryToLayout) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcCategoryToLayout> select(int maxResult) {
        final List<OcCategoryToLayout> result = dao.select(maxResult);
        logger.info("select(OcCategoryToLayout) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcCategoryToLayout> selectAll() {
        final List<OcCategoryToLayout> results = dao.selectAll();
        logger.info("selectAll(OcCategoryToLayout) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcCategoryToLayout create(OcCategoryToLayout bean) {
        requireNonNull(bean);
        logger.info("create(OcCategoryToLayout={}) - entered bean ");

        final OcCategoryToLayout result = dao.create(bean);

        logger.info("create(OcCategoryToLayout) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcCategoryToLayout update(OcCategoryToLayout bean) {
        requireNonNull(bean);
        logger.info("update(OcCategoryToLayout={}) - entered bean ");

        final OcCategoryToLayout result = dao.update(bean);

        logger.info("update(OcCategoryToLayout) - exited - return value={} result ");
        return result;
    }
}
