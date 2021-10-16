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

import com.opencart.test.dao.OcSettingDao;
import com.opencart.test.entity.OcSetting;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultOcSettingService")
public class DefaultOcSettingService implements OcSettingService {
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private final OcSettingDao dao;

    @Inject
    @Named("DefaultOcSettingDao")
    public DefaultOcSettingService(final OcSettingDao dao) {
        requireNonNull(dao);
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public OcSetting find(java.lang.Integer id) {

        final OcSetting result = dao.find(id);
        logger.info("find(OcSetting) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    public List<OcSetting> select(int maxResult) {
        final List<OcSetting> result = dao.select(maxResult);
        logger.info("select(OcSetting) - exited - return value={} result ");

        return result;
    }

    /** {@inheritDoc} */
    public List<OcSetting> selectAll() {
        final List<OcSetting> results = dao.selectAll();
        logger.info("selectAll(OcSetting) - exited - return value={} result ");
        return results;
    }

    /** {@inheritDoc} */
    @Override
    public OcSetting create(OcSetting bean) {
        requireNonNull(bean);
        logger.info("create(OcSetting={}) - entered bean ");

        final OcSetting result = dao.create(bean);

        logger.info("create(OcSetting) - exited - return value={} result ");
        return result;
    }

    /** {@inheritDoc} */
    @Override
    public OcSetting update(OcSetting bean) {
        requireNonNull(bean);
        logger.info("update(OcSetting={}) - entered bean ");

        final OcSetting result = dao.update(bean);

        logger.info("update(OcSetting) - exited - return value={} result ");
        return result;
    }
}
