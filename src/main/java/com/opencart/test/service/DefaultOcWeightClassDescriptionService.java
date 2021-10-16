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

import com.opencart.test.dao.OcWeightClassDescriptionDao;
import com.opencart.test.entity.OcWeightClassDescription;
import com.opencart.test.entity.OcWeightClassDescriptionId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcWeightClassDescriptionService")
public class DefaultOcWeightClassDescriptionService implements OcWeightClassDescriptionService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcWeightClassDescriptionDao dao;

    @Inject
    @Named("DefaultOcWeightClassDescriptionDao")
    public DefaultOcWeightClassDescriptionService(final OcWeightClassDescriptionDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcWeightClassDescription find(OcWeightClassDescriptionId id) {
        final OcWeightClassDescription result = dao.find(id);
        logger.info("find(OcWeightClassDescription) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcWeightClassDescription> select(int maxResult) {
        final List<OcWeightClassDescription> result = dao.select(maxResult);
        logger.info("select(OcWeightClassDescription) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcWeightClassDescription> selectAll() {
        final List<OcWeightClassDescription> results = dao.selectAll();
        logger.info("selectAll(OcWeightClassDescription) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcWeightClassDescription create(OcWeightClassDescription bean) {
        requireNonNull(bean);
        logger.info("create(OcWeightClassDescription={}) - entered bean ");

        final OcWeightClassDescription result = dao.create(bean);

        logger.info("create(OcWeightClassDescription) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcWeightClassDescription update(OcWeightClassDescription bean) {
        requireNonNull(bean);
        logger.info("update(OcWeightClassDescription={}) - entered bean ");

        final OcWeightClassDescription result = dao.update(bean);

        logger.info("update(OcWeightClassDescription) - exited - return value={} result ");
        return result;
    }
}
