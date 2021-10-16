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

import com.opencart.test.dao.OcLanguageDao;
import com.opencart.test.entity.OcLanguage;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcLanguageService")
public class DefaultOcLanguageService implements OcLanguageService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcLanguageDao dao;

    @Inject
    @Named("DefaultOcLanguageDao")
    public DefaultOcLanguageService(final OcLanguageDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcLanguage find(java.lang.Integer id) {

        final OcLanguage result = dao.find(id);
        logger.info("find(OcLanguage) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcLanguage> select(int maxResult) {
        final List<OcLanguage> result = dao.select(maxResult);
        logger.info("select(OcLanguage) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcLanguage> selectAll() {
        final List<OcLanguage> results = dao.selectAll();
        logger.info("selectAll(OcLanguage) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcLanguage create(OcLanguage bean) {
        requireNonNull(bean);
        logger.info("create(OcLanguage={}) - entered bean ");

        final OcLanguage result = dao.create(bean);

        logger.info("create(OcLanguage) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcLanguage update(OcLanguage bean) {
        requireNonNull(bean);
        logger.info("update(OcLanguage={}) - entered bean ");

        final OcLanguage result = dao.update(bean);

        logger.info("update(OcLanguage) - exited - return value={} result ");
        return result;
    }
}
