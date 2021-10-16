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

import com.opencart.test.dao.OcCustomFieldDescriptionDao;
import com.opencart.test.entity.OcCustomFieldDescription;
import com.opencart.test.entity.OcCustomFieldDescriptionId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcCustomFieldDescriptionService")
public class DefaultOcCustomFieldDescriptionService implements OcCustomFieldDescriptionService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcCustomFieldDescriptionDao dao;

    @Inject
    @Named("DefaultOcCustomFieldDescriptionDao")
    public DefaultOcCustomFieldDescriptionService(final OcCustomFieldDescriptionDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomFieldDescription find(OcCustomFieldDescriptionId id) {
        final OcCustomFieldDescription result = dao.find(id);
        logger.info("find(OcCustomFieldDescription) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcCustomFieldDescription> select(int maxResult) {
        final List<OcCustomFieldDescription> result = dao.select(maxResult);
        logger.info("select(OcCustomFieldDescription) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcCustomFieldDescription> selectAll() {
        final List<OcCustomFieldDescription> results = dao.selectAll();
        logger.info("selectAll(OcCustomFieldDescription) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomFieldDescription create(OcCustomFieldDescription bean) {
        requireNonNull(bean);
        logger.info("create(OcCustomFieldDescription={}) - entered bean ");

        final OcCustomFieldDescription result = dao.create(bean);

        logger.info("create(OcCustomFieldDescription) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomFieldDescription update(OcCustomFieldDescription bean) {
        requireNonNull(bean);
        logger.info("update(OcCustomFieldDescription={}) - entered bean ");

        final OcCustomFieldDescription result = dao.update(bean);

        logger.info("update(OcCustomFieldDescription) - exited - return value={} result ");
        return result;
    }
}
