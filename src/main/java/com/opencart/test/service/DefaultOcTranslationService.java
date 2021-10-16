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

import com.opencart.test.dao.OcTranslationDao;
import com.opencart.test.entity.OcTranslation;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcTranslationService")
public class DefaultOcTranslationService implements OcTranslationService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcTranslationDao dao;

    @Inject
    @Named("DefaultOcTranslationDao")
    public DefaultOcTranslationService(final OcTranslationDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcTranslation find(java.lang.Integer id) {

        final OcTranslation result = dao.find(id);
        logger.info("find(OcTranslation) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcTranslation> select(int maxResult) {
        final List<OcTranslation> result = dao.select(maxResult);
        logger.info("select(OcTranslation) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcTranslation> selectAll() {
        final List<OcTranslation> results = dao.selectAll();
        logger.info("selectAll(OcTranslation) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcTranslation create(OcTranslation bean) {
        requireNonNull(bean);
        logger.info("create(OcTranslation={}) - entered bean ");

        final OcTranslation result = dao.create(bean);

        logger.info("create(OcTranslation) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcTranslation update(OcTranslation bean) {
        requireNonNull(bean);
        logger.info("update(OcTranslation={}) - entered bean ");

        final OcTranslation result = dao.update(bean);

        logger.info("update(OcTranslation) - exited - return value={} result ");
        return result;
    }
}
