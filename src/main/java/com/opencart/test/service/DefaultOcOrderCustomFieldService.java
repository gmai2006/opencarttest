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

import com.opencart.test.dao.OcOrderCustomFieldDao;
import com.opencart.test.entity.OcOrderCustomField;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcOrderCustomFieldService")
public class DefaultOcOrderCustomFieldService implements OcOrderCustomFieldService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcOrderCustomFieldDao dao;

    @Inject
    @Named("DefaultOcOrderCustomFieldDao")
    public DefaultOcOrderCustomFieldService(final OcOrderCustomFieldDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcOrderCustomField find(java.lang.Integer id) {

        final OcOrderCustomField result = dao.find(id);
        logger.info("find(OcOrderCustomField) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcOrderCustomField> select(int maxResult) {
        final List<OcOrderCustomField> result = dao.select(maxResult);
        logger.info("select(OcOrderCustomField) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcOrderCustomField> selectAll() {
        final List<OcOrderCustomField> results = dao.selectAll();
        logger.info("selectAll(OcOrderCustomField) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcOrderCustomField create(OcOrderCustomField bean) {
        requireNonNull(bean);
        logger.info("create(OcOrderCustomField={}) - entered bean ");

        final OcOrderCustomField result = dao.create(bean);

        logger.info("create(OcOrderCustomField) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcOrderCustomField update(OcOrderCustomField bean) {
        requireNonNull(bean);
        logger.info("update(OcOrderCustomField={}) - entered bean ");

        final OcOrderCustomField result = dao.update(bean);

        logger.info("update(OcOrderCustomField) - exited - return value={} result ");
        return result;
    }
}
