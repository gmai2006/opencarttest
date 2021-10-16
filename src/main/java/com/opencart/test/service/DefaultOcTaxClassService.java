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

import com.opencart.test.dao.OcTaxClassDao;
import com.opencart.test.entity.OcTaxClass;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcTaxClassService")
public class DefaultOcTaxClassService implements OcTaxClassService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcTaxClassDao dao;

    @Inject
    @Named("DefaultOcTaxClassDao")
    public DefaultOcTaxClassService(final OcTaxClassDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcTaxClass find(java.lang.Integer id) {

        final OcTaxClass result = dao.find(id);
        logger.info("find(OcTaxClass) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcTaxClass> select(int maxResult) {
        final List<OcTaxClass> result = dao.select(maxResult);
        logger.info("select(OcTaxClass) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcTaxClass> selectAll() {
        final List<OcTaxClass> results = dao.selectAll();
        logger.info("selectAll(OcTaxClass) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcTaxClass create(OcTaxClass bean) {
        requireNonNull(bean);
        logger.info("create(OcTaxClass={}) - entered bean ");

        final OcTaxClass result = dao.create(bean);

        logger.info("create(OcTaxClass) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcTaxClass update(OcTaxClass bean) {
        requireNonNull(bean);
        logger.info("update(OcTaxClass={}) - entered bean ");

        final OcTaxClass result = dao.update(bean);

        logger.info("update(OcTaxClass) - exited - return value={} result ");
        return result;
    }
}
