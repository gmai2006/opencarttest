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

import com.opencart.test.dao.OcFilterGroupDao;
import com.opencart.test.entity.OcFilterGroup;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcFilterGroupService")
public class DefaultOcFilterGroupService implements OcFilterGroupService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcFilterGroupDao dao;

    @Inject
    @Named("DefaultOcFilterGroupDao")
    public DefaultOcFilterGroupService(final OcFilterGroupDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcFilterGroup find(java.lang.Integer id) {

        final OcFilterGroup result = dao.find(id);
        logger.info("find(OcFilterGroup) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcFilterGroup> select(int maxResult) {
        final List<OcFilterGroup> result = dao.select(maxResult);
        logger.info("select(OcFilterGroup) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcFilterGroup> selectAll() {
        final List<OcFilterGroup> results = dao.selectAll();
        logger.info("selectAll(OcFilterGroup) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcFilterGroup create(OcFilterGroup bean) {
        requireNonNull(bean);
        logger.info("create(OcFilterGroup={}) - entered bean ");

        final OcFilterGroup result = dao.create(bean);

        logger.info("create(OcFilterGroup) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcFilterGroup update(OcFilterGroup bean) {
        requireNonNull(bean);
        logger.info("update(OcFilterGroup={}) - entered bean ");

        final OcFilterGroup result = dao.update(bean);

        logger.info("update(OcFilterGroup) - exited - return value={} result ");
        return result;
    }
}
