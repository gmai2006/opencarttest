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
import com.opencart.test.entity.OcReturn;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

// @Stateless
@Named("OcReturnHandler")
public class OcReturnHandler extends DelimiterFileHandler<OcReturn> {

    @Inject
    @Named("DefaultJpaDao")
    public OcReturnHandler(final JpaDao dao) {
        super(dao);
    }

    @Override
    protected OcReturn parseLine(List<String> headers, List<String> tokens) {
        OcReturn record = new OcReturn();
        for (int i = 0; i < tokens.size(); i++) {
            switch (headers.get(i)) {
                case "returnId":
                    record.setReturnId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "orderId":
                    record.setOrderId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "productId":
                    record.setProductId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "customerId":
                    record.setCustomerId(java.lang.Integer.valueOf((tokens.get(i))));
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

                case "product":
                    record.setProduct(tokens.get(i));
                    break;

                case "model":
                    record.setModel(tokens.get(i));
                    break;

                case "quantity":
                    record.setQuantity(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "opened":
                    record.setOpened(java.lang.Boolean.valueOf((tokens.get(i))));
                    break;
                case "returnReasonId":
                    record.setReturnReasonId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "returnActionId":
                    record.setReturnActionId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "returnStatusId":
                    record.setReturnStatusId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "comment":
                    record.setComment(tokens.get(i));
                    break;

                case "dateOrdered":
                    record.setDateOrdered(new java.util.Date(parseDate(tokens.get(i))));
                    break;

                case "dateAdded":
                    record.setDateAdded(new java.sql.Timestamp(parseTime(tokens.get(i))));
                    break;

                case "dateModified":
                    record.setDateModified(new java.sql.Timestamp(parseTime(tokens.get(i))));
                    break;

                default:
                    logger.severe("Unknown col " + headers.get(i));
            }
        }
        return record;
    }
}
