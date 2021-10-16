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
import com.opencart.test.entity.OcVoucher;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

// @Stateless
@Named("OcVoucherHandler")
public class OcVoucherHandler extends DelimiterFileHandler<OcVoucher> {

    @Inject
    @Named("DefaultJpaDao")
    public OcVoucherHandler(final JpaDao dao) {
        super(dao);
    }

    @Override
    protected OcVoucher parseLine(List<String> headers, List<String> tokens) {
        OcVoucher record = new OcVoucher();
        for (int i = 0; i < tokens.size(); i++) {
            switch (headers.get(i)) {
                case "voucherId":
                    record.setVoucherId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "orderId":
                    record.setOrderId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "code":
                    record.setCode(tokens.get(i));
                    break;

                case "fromName":
                    record.setFromName(tokens.get(i));
                    break;

                case "fromEmail":
                    record.setFromEmail(tokens.get(i));
                    break;

                case "toName":
                    record.setToName(tokens.get(i));
                    break;

                case "toEmail":
                    record.setToEmail(tokens.get(i));
                    break;

                case "voucherThemeId":
                    record.setVoucherThemeId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "message":
                    record.setMessage(tokens.get(i));
                    break;

                case "amount":
                    record.setAmount(new java.math.BigDecimal(tokens.get(i)));
                    break;

                case "status":
                    record.setStatus(java.lang.Boolean.valueOf((tokens.get(i))));
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
