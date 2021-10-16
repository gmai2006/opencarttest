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

import com.opencart.test.dao.OcFilterDescriptionDao;
import com.opencart.test.entity.OcFilterDescription;
import com.opencart.test.entity.OcFilterDescriptionId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcFilterDescriptionService")
public class DefaultOcFilterDescriptionService implements OcFilterDescriptionService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcFilterDescriptionDao dao;

    @Inject
    @Named("DefaultOcFilterDescriptionDao")
    public DefaultOcFilterDescriptionService(final OcFilterDescriptionDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcFilterDescription find(OcFilterDescriptionId id) {
        final OcFilterDescription result = dao.find(id);
        logger.info("find(OcFilterDescription) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcFilterDescription> select(int maxResult) {
        final List<OcFilterDescription> result = dao.select(maxResult);
        logger.info("select(OcFilterDescription) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcFilterDescription> selectAll() {
        final List<OcFilterDescription> results = dao.selectAll();
        logger.info("selectAll(OcFilterDescription) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcFilterDescription create(OcFilterDescription bean) {
        requireNonNull(bean);
        logger.info("create(OcFilterDescription={}) - entered bean ");

        final OcFilterDescription result = dao.create(bean);

        logger.info("create(OcFilterDescription) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcFilterDescription update(OcFilterDescription bean) {
        requireNonNull(bean);
        logger.info("update(OcFilterDescription={}) - entered bean ");

        final OcFilterDescription result = dao.update(bean);

        logger.info("update(OcFilterDescription) - exited - return value={} result ");
        return result;
    }
}
