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
package com.opencart.test.dao;

import com.opencart.test.entity.OcOptionValueDescription;
import com.opencart.test.entity.OcOptionValueDescriptionId;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

@Stateless
@Named("DefaultOcOptionValueDescriptionDao")
public class DefaultOcOptionValueDescriptionDao implements OcOptionValueDescriptionDao {
    private static final int BATCH_SIZE = 50;
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private JpaDao dao;

    @Inject
    @Named("DefaultJpaDao")
    public DefaultOcOptionValueDescriptionDao(JpaDao dao) {
        this.dao = dao;
    }

    public DefaultOcOptionValueDescriptionDao() {}

    /** {@inheritDoc} */
    @Override
    public OcOptionValueDescription find(OcOptionValueDescriptionId id) {
        final EntityManager em = dao.getEntityManager();
        return em.find(OcOptionValueDescription.class, id);
    }

    /** {@inheritDoc} */
    @Override
    public List<OcOptionValueDescription> select(int max) {
        return dao.select(
                "select a from OcOptionValueDescription a", OcOptionValueDescription.class, max);
    }

    /** {@inheritDoc} */
    @Override
    public List<OcOptionValueDescription> selectAll() {
        return dao.selectAll(
                "select a from OcOptionValueDescription a", OcOptionValueDescription.class);
    }

    /** {@inheritDoc} */
    @Override
    public OcOptionValueDescription create(OcOptionValueDescription e) {
        return dao.create(e);
    }

    /** {@inheritDoc} */
    @Override
    public OcOptionValueDescription update(OcOptionValueDescription e) {
        return dao.update(e);
    }
}
