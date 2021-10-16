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
import com.opencart.test.entity.OcCurrency;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

// @Stateless
@Named("OcCurrencyHandler")
public class OcCurrencyHandler extends DelimiterFileHandler<OcCurrency> {

    @Inject
    @Named("DefaultJpaDao")
    public OcCurrencyHandler(final JpaDao dao) {
        super(dao);
    }

    @Override
    protected OcCurrency parseLine(List<String> headers, List<String> tokens) {
        OcCurrency record = new OcCurrency();
        for (int i = 0; i < tokens.size(); i++) {
            switch (headers.get(i)) {
                case "currencyId":
                    record.setCurrencyId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "title":
                    record.setTitle(tokens.get(i));
                    break;

                case "code":
                    record.setCode(tokens.get(i));
                    break;

                case "symbolLeft":
                    record.setSymbolLeft(tokens.get(i));
                    break;

                case "symbolRight":
                    record.setSymbolRight(tokens.get(i));
                    break;

                case "decimalPlace":
                    record.setDecimalPlace(tokens.get(i));
                    break;

                case "value":
                    record.setValue(java.lang.Float.valueOf((tokens.get(i))));
                    break;
                case "status":
                    record.setStatus(java.lang.Boolean.valueOf((tokens.get(i))));
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
