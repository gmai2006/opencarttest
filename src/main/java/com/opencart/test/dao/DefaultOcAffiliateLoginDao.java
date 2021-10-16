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

import com.opencart.test.entity.OcAffiliateLogin;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

@Stateless
@Named("DefaultOcAffiliateLoginDao")
public class DefaultOcAffiliateLoginDao implements OcAffiliateLoginDao {
    private static final int BATCH_SIZE = 50;
    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private JpaDao dao;

    @Inject
    @Named("DefaultJpaDao")
    public DefaultOcAffiliateLoginDao(JpaDao dao) {
        this.dao = dao;
    }

    public DefaultOcAffiliateLoginDao() {}

    /** {@inheritDoc} */
    @Override
    public OcAffiliateLogin find(java.lang.Integer id) {
        final EntityManager em = dao.getEntityManager();
        return em.find(OcAffiliateLogin.class, id);
    }

    /** {@inheritDoc} */
    @Override
    public List<OcAffiliateLogin> select(int max) {
        return dao.select("select a from OcAffiliateLogin a", OcAffiliateLogin.class, max);
    }

    /** {@inheritDoc} */
    @Override
    public List<OcAffiliateLogin> selectAll() {
        return dao.selectAll("select a from OcAffiliateLogin a", OcAffiliateLogin.class);
    }

    /** {@inheritDoc} */
    @Override
    public OcAffiliateLogin create(OcAffiliateLogin e) {
        return dao.create(e);
    }

    /** {@inheritDoc} */
    @Override
    public OcAffiliateLogin update(OcAffiliateLogin e) {
        return dao.update(e);
    }
}
