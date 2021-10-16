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

import com.opencart.test.dao.OcAttributeGroupDao;
import com.opencart.test.entity.OcAttributeGroup;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcAttributeGroupService")
public class DefaultOcAttributeGroupService implements OcAttributeGroupService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcAttributeGroupDao dao;

    @Inject
    @Named("DefaultOcAttributeGroupDao")
    public DefaultOcAttributeGroupService(final OcAttributeGroupDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcAttributeGroup find(java.lang.Integer id) {

        final OcAttributeGroup result = dao.find(id);
        logger.info("find(OcAttributeGroup) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcAttributeGroup> select(int maxResult) {
        final List<OcAttributeGroup> result = dao.select(maxResult);
        logger.info("select(OcAttributeGroup) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcAttributeGroup> selectAll() {
        final List<OcAttributeGroup> results = dao.selectAll();
        logger.info("selectAll(OcAttributeGroup) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcAttributeGroup create(OcAttributeGroup bean) {
        requireNonNull(bean);
        logger.info("create(OcAttributeGroup={}) - entered bean ");

        final OcAttributeGroup result = dao.create(bean);

        logger.info("create(OcAttributeGroup) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcAttributeGroup update(OcAttributeGroup bean) {
        requireNonNull(bean);
        logger.info("update(OcAttributeGroup={}) - entered bean ");

        final OcAttributeGroup result = dao.update(bean);

        logger.info("update(OcAttributeGroup) - exited - return value={} result ");
        return result;
    }
}
