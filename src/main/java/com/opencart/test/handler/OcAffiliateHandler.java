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
import com.opencart.test.entity.OcAffiliate;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

// @Stateless
@Named("OcAffiliateHandler")
public class OcAffiliateHandler extends DelimiterFileHandler<OcAffiliate> {

    @Inject
    @Named("DefaultJpaDao")
    public OcAffiliateHandler(final JpaDao dao) {
        super(dao);
    }

    @Override
    protected OcAffiliate parseLine(List<String> headers, List<String> tokens) {
        OcAffiliate record = new OcAffiliate();
        for (int i = 0; i < tokens.size(); i++) {
            switch (headers.get(i)) {
                case "affiliateId":
                    record.setAffiliateId(java.lang.Integer.valueOf((tokens.get(i))));
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

                case "company":
                    record.setCompany(tokens.get(i));
                    break;

                case "website":
                    record.setWebsite(tokens.get(i));
                    break;

                case "address1":
                    record.setAddress1(tokens.get(i));
                    break;

                case "address2":
                    record.setAddress2(tokens.get(i));
                    break;

                case "city":
                    record.setCity(tokens.get(i));
                    break;

                case "postcode":
                    record.setPostcode(tokens.get(i));
                    break;

                case "countryId":
                    record.setCountryId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "zoneId":
                    record.setZoneId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "code":
                    record.setCode(tokens.get(i));
                    break;

                case "commission":
                    record.setCommission(new java.math.BigDecimal(tokens.get(i)));
                    break;

                case "tax":
                    record.setTax(tokens.get(i));
                    break;

                case "payment":
                    record.setPayment(tokens.get(i));
                    break;

                case "cheque":
                    record.setCheque(tokens.get(i));
                    break;

                case "paypal":
                    record.setPaypal(tokens.get(i));
                    break;

                case "bankName":
                    record.setBankName(tokens.get(i));
                    break;

                case "bankBranchNumber":
                    record.setBankBranchNumber(tokens.get(i));
                    break;

                case "bankSwiftCode":
                    record.setBankSwiftCode(tokens.get(i));
                    break;

                case "bankAccountName":
                    record.setBankAccountName(tokens.get(i));
                    break;

                case "bankAccountNumber":
                    record.setBankAccountNumber(tokens.get(i));
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
