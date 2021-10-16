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
import com.opencart.test.entity.OcProduct;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

// @Stateless
@Named("OcProductHandler")
public class OcProductHandler extends DelimiterFileHandler<OcProduct> {

    @Inject
    @Named("DefaultJpaDao")
    public OcProductHandler(final JpaDao dao) {
        super(dao);
    }

    @Override
    protected OcProduct parseLine(List<String> headers, List<String> tokens) {
        OcProduct record = new OcProduct();
        for (int i = 0; i < tokens.size(); i++) {
            switch (headers.get(i)) {
                case "productId":
                    record.setProductId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "model":
                    record.setModel(tokens.get(i));
                    break;

                case "sku":
                    record.setSku(tokens.get(i));
                    break;

                case "upc":
                    record.setUpc(tokens.get(i));
                    break;

                case "ean":
                    record.setEan(tokens.get(i));
                    break;

                case "jan":
                    record.setJan(tokens.get(i));
                    break;

                case "isbn":
                    record.setIsbn(tokens.get(i));
                    break;

                case "mpn":
                    record.setMpn(tokens.get(i));
                    break;

                case "location":
                    record.setLocation(tokens.get(i));
                    break;

                case "quantity":
                    record.setQuantity(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "stockStatusId":
                    record.setStockStatusId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "image":
                    record.setImage(tokens.get(i));
                    break;

                case "manufacturerId":
                    record.setManufacturerId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "shipping":
                    record.setShipping(java.lang.Boolean.valueOf((tokens.get(i))));
                    break;
                case "price":
                    record.setPrice(new java.math.BigDecimal(tokens.get(i)));
                    break;

                case "points":
                    record.setPoints(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "taxClassId":
                    record.setTaxClassId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "dateAvailable":
                    record.setDateAvailable(new java.util.Date(parseDate(tokens.get(i))));
                    break;

                case "weight":
                    record.setWeight(new java.math.BigDecimal(tokens.get(i)));
                    break;

                case "weightClassId":
                    record.setWeightClassId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "length":
                    record.setLength(new java.math.BigDecimal(tokens.get(i)));
                    break;

                case "width":
                    record.setWidth(new java.math.BigDecimal(tokens.get(i)));
                    break;

                case "height":
                    record.setHeight(new java.math.BigDecimal(tokens.get(i)));
                    break;

                case "lengthClassId":
                    record.setLengthClassId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "subtract":
                    record.setSubtract(java.lang.Boolean.valueOf((tokens.get(i))));
                    break;
                case "minimum":
                    record.setMinimum(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "sortOrder":
                    record.setSortOrder(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "status":
                    record.setStatus(java.lang.Boolean.valueOf((tokens.get(i))));
                    break;
                case "viewed":
                    record.setViewed(java.lang.Integer.valueOf((tokens.get(i))));
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
