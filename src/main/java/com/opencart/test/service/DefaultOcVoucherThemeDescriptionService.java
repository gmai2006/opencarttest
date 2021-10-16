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

import com.opencart.test.dao.OcVoucherThemeDescriptionDao;
import com.opencart.test.entity.OcVoucherThemeDescription;
import com.opencart.test.entity.OcVoucherThemeDescriptionId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcVoucherThemeDescriptionService")
public class DefaultOcVoucherThemeDescriptionService implements OcVoucherThemeDescriptionService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcVoucherThemeDescriptionDao dao;

    @Inject
    @Named("DefaultOcVoucherThemeDescriptionDao")
    public DefaultOcVoucherThemeDescriptionService(final OcVoucherThemeDescriptionDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcVoucherThemeDescription find(OcVoucherThemeDescriptionId id) {
        final OcVoucherThemeDescription result = dao.find(id);
        logger.info("find(OcVoucherThemeDescription) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcVoucherThemeDescription> select(int maxResult) {
        final List<OcVoucherThemeDescription> result = dao.select(maxResult);
        logger.info("select(OcVoucherThemeDescription) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcVoucherThemeDescription> selectAll() {
        final List<OcVoucherThemeDescription> results = dao.selectAll();
        logger.info("selectAll(OcVoucherThemeDescription) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcVoucherThemeDescription create(OcVoucherThemeDescription bean) {
        requireNonNull(bean);
        logger.info("create(OcVoucherThemeDescription={}) - entered bean ");

        final OcVoucherThemeDescription result = dao.create(bean);

        logger.info("create(OcVoucherThemeDescription) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcVoucherThemeDescription update(OcVoucherThemeDescription bean) {
        requireNonNull(bean);
        logger.info("update(OcVoucherThemeDescription={}) - entered bean ");

        final OcVoucherThemeDescription result = dao.update(bean);

        logger.info("update(OcVoucherThemeDescription) - exited - return value={} result ");
        return result;
    }
}
