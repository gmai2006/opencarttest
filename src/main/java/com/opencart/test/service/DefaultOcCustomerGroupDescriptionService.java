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

import com.opencart.test.dao.OcCustomerGroupDescriptionDao;
import com.opencart.test.entity.OcCustomerGroupDescription;
import com.opencart.test.entity.OcCustomerGroupDescriptionId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcCustomerGroupDescriptionService")
public class DefaultOcCustomerGroupDescriptionService implements OcCustomerGroupDescriptionService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcCustomerGroupDescriptionDao dao;

    @Inject
    @Named("DefaultOcCustomerGroupDescriptionDao")
    public DefaultOcCustomerGroupDescriptionService(final OcCustomerGroupDescriptionDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomerGroupDescription find(OcCustomerGroupDescriptionId id) {
        final OcCustomerGroupDescription result = dao.find(id);
        logger.info("find(OcCustomerGroupDescription) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcCustomerGroupDescription> select(int maxResult) {
        final List<OcCustomerGroupDescription> result = dao.select(maxResult);
        logger.info("select(OcCustomerGroupDescription) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcCustomerGroupDescription> selectAll() {
        final List<OcCustomerGroupDescription> results = dao.selectAll();
        logger.info("selectAll(OcCustomerGroupDescription) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomerGroupDescription create(OcCustomerGroupDescription bean) {
        requireNonNull(bean);
        logger.info("create(OcCustomerGroupDescription={}) - entered bean ");

        final OcCustomerGroupDescription result = dao.create(bean);

        logger.info("create(OcCustomerGroupDescription) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomerGroupDescription update(OcCustomerGroupDescription bean) {
        requireNonNull(bean);
        logger.info("update(OcCustomerGroupDescription={}) - entered bean ");

        final OcCustomerGroupDescription result = dao.update(bean);

        logger.info("update(OcCustomerGroupDescription) - exited - return value={} result ");
        return result;
    }
}
