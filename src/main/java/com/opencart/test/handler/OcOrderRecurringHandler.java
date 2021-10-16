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
import com.opencart.test.entity.OcOrderRecurring;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

// @Stateless
@Named("OcOrderRecurringHandler")
public class OcOrderRecurringHandler extends DelimiterFileHandler<OcOrderRecurring> {

    @Inject
    @Named("DefaultJpaDao")
    public OcOrderRecurringHandler(final JpaDao dao) {
        super(dao);
    }

    @Override
    protected OcOrderRecurring parseLine(List<String> headers, List<String> tokens) {
        OcOrderRecurring record = new OcOrderRecurring();
        for (int i = 0; i < tokens.size(); i++) {
            switch (headers.get(i)) {
                case "orderRecurringId":
                    record.setOrderRecurringId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "orderId":
                    record.setOrderId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "reference":
                    record.setReference(tokens.get(i));
                    break;

                case "productId":
                    record.setProductId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "productName":
                    record.setProductName(tokens.get(i));
                    break;

                case "productQuantity":
                    record.setProductQuantity(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "recurringId":
                    record.setRecurringId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "recurringName":
                    record.setRecurringName(tokens.get(i));
                    break;

                case "recurringDescription":
                    record.setRecurringDescription(tokens.get(i));
                    break;

                case "recurringFrequency":
                    record.setRecurringFrequency(tokens.get(i));
                    break;

                case "recurringCycle":
                    record.setRecurringCycle(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "recurringDuration":
                    record.setRecurringDuration(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "recurringPrice":
                    record.setRecurringPrice(new java.math.BigDecimal(tokens.get(i)));
                    break;

                case "trial":
                    record.setTrial(java.lang.Boolean.valueOf((tokens.get(i))));
                    break;
                case "trialFrequency":
                    record.setTrialFrequency(tokens.get(i));
                    break;

                case "trialCycle":
                    record.setTrialCycle(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "trialDuration":
                    record.setTrialDuration(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "trialPrice":
                    record.setTrialPrice(new java.math.BigDecimal(tokens.get(i)));
                    break;

                case "status":
                    record.setStatus(java.lang.Integer.valueOf((tokens.get(i))));
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
