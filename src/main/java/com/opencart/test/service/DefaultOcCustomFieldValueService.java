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

import com.opencart.test.dao.OcCustomFieldValueDao;
import com.opencart.test.entity.OcCustomFieldValue;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcCustomFieldValueService")
public class DefaultOcCustomFieldValueService implements OcCustomFieldValueService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcCustomFieldValueDao dao;

    @Inject
    @Named("DefaultOcCustomFieldValueDao")
    public DefaultOcCustomFieldValueService(final OcCustomFieldValueDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomFieldValue find(java.lang.Integer id) {

        final OcCustomFieldValue result = dao.find(id);
        logger.info("find(OcCustomFieldValue) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcCustomFieldValue> select(int maxResult) {
        final List<OcCustomFieldValue> result = dao.select(maxResult);
        logger.info("select(OcCustomFieldValue) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcCustomFieldValue> selectAll() {
        final List<OcCustomFieldValue> results = dao.selectAll();
        logger.info("selectAll(OcCustomFieldValue) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomFieldValue create(OcCustomFieldValue bean) {
        requireNonNull(bean);
        logger.info("create(OcCustomFieldValue={}) - entered bean ");

        final OcCustomFieldValue result = dao.create(bean);

        logger.info("create(OcCustomFieldValue) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcCustomFieldValue update(OcCustomFieldValue bean) {
        requireNonNull(bean);
        logger.info("update(OcCustomFieldValue={}) - entered bean ");

        final OcCustomFieldValue result = dao.update(bean);

        logger.info("update(OcCustomFieldValue) - exited - return value={} result ");
        return result;
    }
}
