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
package com.opencart.test.handler;

import com.opencart.test.dao.JpaDao;
import com.opencart.test.entity.OcCustomer;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

// @Stateless
@Named("OcCustomerHandler")
public class OcCustomerHandler extends DelimiterFileHandler<OcCustomer> {

    @Inject
    @Named("DefaultJpaDao")
    public OcCustomerHandler(final JpaDao dao) {
        super(dao);
    }

    @Override
    protected OcCustomer parseLine(List<String> headers, List<String> tokens) {
        OcCustomer record = new OcCustomer();
        for (int i = 0; i < tokens.size(); i++) {
            switch (headers.get(i)) {
                case "customerId":
                    record.setCustomerId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "customerGroupId":
                    record.setCustomerGroupId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "storeId":
                    record.setStoreId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "languageId":
                    record.setLanguageId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "firstname":
                    record.setFirstname(tokens.get(i));
                    break;

                case "lastname":
                    record.setLastname(tokens.get(i));
                    break;

                case "email":
                    record.setEmail(tokens.get(i));
                    break;

                case "telephone":
                    record.setTelephone(tokens.get(i));
                    break;

                case "fax":
                    record.setFax(tokens.get(i));
                    break;

                case "password":
                    record.setPassword(tokens.get(i));
                    break;

                case "salt":
                    record.setSalt(tokens.get(i));
                    break;

                case "cart":
                    record.setCart(tokens.get(i));
                    break;

                case "wishlist":
                    record.setWishlist(tokens.get(i));
                    break;

                case "newsletter":
                    record.setNewsletter(java.lang.Boolean.valueOf((tokens.get(i))));
                    break;
                case "addressId":
                    record.setAddressId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "customField":
                    record.setCustomField(tokens.get(i));
                    break;

                case "ip":
                    record.setIp(tokens.get(i));
                    break;

                case "status":
                    record.setStatus(java.lang.Boolean.valueOf((tokens.get(i))));
                    break;
                case "approved":
                    record.setApproved(java.lang.Boolean.valueOf((tokens.get(i))));
                    break;
                case "safe":
                    record.setSafe(java.lang.Boolean.valueOf((tokens.get(i))));
                    break;
                case "token":
                    record.setToken(tokens.get(i));
                    break;

                case "code":
                    record.setCode(tokens.get(i));
                    break;

                case "dateAdded":
                    record.setDateAdded(new java.sql.Timestamp(parseTime(tokens.get(i))));
                    break;

                default:
                    logger.severe("Unknown col " + headers.get(i));
            }
        }
        return record;
    }
}
