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

import com.opencart.test.dao.OcThemeDao;
import com.opencart.test.entity.OcTheme;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcThemeService")
public class DefaultOcThemeService implements OcThemeService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcThemeDao dao;

    @Inject
    @Named("DefaultOcThemeDao")
    public DefaultOcThemeService(final OcThemeDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcTheme find(java.lang.Integer id) {

        final OcTheme result = dao.find(id);
        logger.info("find(OcTheme) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcTheme> select(int maxResult) {
        final List<OcTheme> result = dao.select(maxResult);
        logger.info("select(OcTheme) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcTheme> selectAll() {
        final List<OcTheme> results = dao.selectAll();
        logger.info("selectAll(OcTheme) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcTheme create(OcTheme bean) {
        requireNonNull(bean);
        logger.info("create(OcTheme={}) - entered bean ");

        final OcTheme result = dao.create(bean);

        logger.info("create(OcTheme) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcTheme update(OcTheme bean) {
        requireNonNull(bean);
        logger.info("update(OcTheme={}) - entered bean ");

        final OcTheme result = dao.update(bean);

        logger.info("update(OcTheme) - exited - return value={} result ");
        return result;
    }
}
