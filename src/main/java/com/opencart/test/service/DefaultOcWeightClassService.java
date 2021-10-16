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

import com.opencart.test.dao.OcWeightClassDao;
import com.opencart.test.entity.OcWeightClass;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcWeightClassService")
public class DefaultOcWeightClassService implements OcWeightClassService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcWeightClassDao dao;

    @Inject
    @Named("DefaultOcWeightClassDao")
    public DefaultOcWeightClassService(final OcWeightClassDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcWeightClass find(java.lang.Integer id) {

        final OcWeightClass result = dao.find(id);
        logger.info("find(OcWeightClass) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcWeightClass> select(int maxResult) {
        final List<OcWeightClass> result = dao.select(maxResult);
        logger.info("select(OcWeightClass) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcWeightClass> selectAll() {
        final List<OcWeightClass> results = dao.selectAll();
        logger.info("selectAll(OcWeightClass) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcWeightClass create(OcWeightClass bean) {
        requireNonNull(bean);
        logger.info("create(OcWeightClass={}) - entered bean ");

        final OcWeightClass result = dao.create(bean);

        logger.info("create(OcWeightClass) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcWeightClass update(OcWeightClass bean) {
        requireNonNull(bean);
        logger.info("update(OcWeightClass={}) - entered bean ");

        final OcWeightClass result = dao.update(bean);

        logger.info("update(OcWeightClass) - exited - return value={} result ");
        return result;
    }
}
