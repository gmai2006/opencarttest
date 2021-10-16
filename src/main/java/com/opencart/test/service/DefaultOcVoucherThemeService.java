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

import com.opencart.test.dao.OcVoucherThemeDao;
import com.opencart.test.entity.OcVoucherTheme;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcVoucherThemeService")
public class DefaultOcVoucherThemeService implements OcVoucherThemeService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcVoucherThemeDao dao;

    @Inject
    @Named("DefaultOcVoucherThemeDao")
    public DefaultOcVoucherThemeService(final OcVoucherThemeDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcVoucherTheme find(java.lang.Integer id) {

        final OcVoucherTheme result = dao.find(id);
        logger.info("find(OcVoucherTheme) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcVoucherTheme> select(int maxResult) {
        final List<OcVoucherTheme> result = dao.select(maxResult);
        logger.info("select(OcVoucherTheme) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcVoucherTheme> selectAll() {
        final List<OcVoucherTheme> results = dao.selectAll();
        logger.info("selectAll(OcVoucherTheme) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcVoucherTheme create(OcVoucherTheme bean) {
        requireNonNull(bean);
        logger.info("create(OcVoucherTheme={}) - entered bean ");

        final OcVoucherTheme result = dao.create(bean);

        logger.info("create(OcVoucherTheme) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcVoucherTheme update(OcVoucherTheme bean) {
        requireNonNull(bean);
        logger.info("update(OcVoucherTheme={}) - entered bean ");

        final OcVoucherTheme result = dao.update(bean);

        logger.info("update(OcVoucherTheme) - exited - return value={} result ");
        return result;
    }
}
