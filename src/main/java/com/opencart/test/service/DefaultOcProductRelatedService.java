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

import com.opencart.test.dao.OcProductRelatedDao;
import com.opencart.test.entity.OcProductRelated;
import com.opencart.test.entity.OcProductRelatedId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcProductRelatedService")
public class DefaultOcProductRelatedService implements OcProductRelatedService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcProductRelatedDao dao;

    @Inject
    @Named("DefaultOcProductRelatedDao")
    public DefaultOcProductRelatedService(final OcProductRelatedDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcProductRelated find(OcProductRelatedId id) {
        final OcProductRelated result = dao.find(id);
        logger.info("find(OcProductRelated) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcProductRelated> select(int maxResult) {
        final List<OcProductRelated> result = dao.select(maxResult);
        logger.info("select(OcProductRelated) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcProductRelated> selectAll() {
        final List<OcProductRelated> results = dao.selectAll();
        logger.info("selectAll(OcProductRelated) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcProductRelated create(OcProductRelated bean) {
        requireNonNull(bean);
        logger.info("create(OcProductRelated={}) - entered bean ");

        final OcProductRelated result = dao.create(bean);

        logger.info("create(OcProductRelated) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcProductRelated update(OcProductRelated bean) {
        requireNonNull(bean);
        logger.info("update(OcProductRelated={}) - entered bean ");

        final OcProductRelated result = dao.update(bean);

        logger.info("update(OcProductRelated) - exited - return value={} result ");
        return result;
    }
}
