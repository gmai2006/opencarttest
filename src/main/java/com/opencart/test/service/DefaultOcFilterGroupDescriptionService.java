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

import com.opencart.test.dao.OcFilterGroupDescriptionDao;
import com.opencart.test.entity.OcFilterGroupDescription;
import com.opencart.test.entity.OcFilterGroupDescriptionId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcFilterGroupDescriptionService")
public class DefaultOcFilterGroupDescriptionService implements OcFilterGroupDescriptionService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcFilterGroupDescriptionDao dao;

    @Inject
    @Named("DefaultOcFilterGroupDescriptionDao")
    public DefaultOcFilterGroupDescriptionService(final OcFilterGroupDescriptionDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcFilterGroupDescription find(OcFilterGroupDescriptionId id) {
        final OcFilterGroupDescription result = dao.find(id);
        logger.info("find(OcFilterGroupDescription) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcFilterGroupDescription> select(int maxResult) {
        final List<OcFilterGroupDescription> result = dao.select(maxResult);
        logger.info("select(OcFilterGroupDescription) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcFilterGroupDescription> selectAll() {
        final List<OcFilterGroupDescription> results = dao.selectAll();
        logger.info("selectAll(OcFilterGroupDescription) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcFilterGroupDescription create(OcFilterGroupDescription bean) {
        requireNonNull(bean);
        logger.info("create(OcFilterGroupDescription={}) - entered bean ");

        final OcFilterGroupDescription result = dao.create(bean);

        logger.info("create(OcFilterGroupDescription) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcFilterGroupDescription update(OcFilterGroupDescription bean) {
        requireNonNull(bean);
        logger.info("update(OcFilterGroupDescription={}) - entered bean ");

        final OcFilterGroupDescription result = dao.update(bean);

        logger.info("update(OcFilterGroupDescription) - exited - return value={} result ");
        return result;
    }
}