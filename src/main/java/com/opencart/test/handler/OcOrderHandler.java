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
import com.opencart.test.entity.OcOrder;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

// @Stateless
@Named("OcOrderHandler")
public class OcOrderHandler extends DelimiterFileHandler<OcOrder> {

    @Inject
    @Named("DefaultJpaDao")
    public OcOrderHandler(final JpaDao dao) {
        super(dao);
    }

    @Override
    protected OcOrder parseLine(List<String> headers, List<String> tokens) {
        OcOrder record = new OcOrder();
        for (int i = 0; i < tokens.size(); i++) {
            switch (headers.get(i)) {
                case "orderId":
                    record.setOrderId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "invoiceNo":
                    record.setInvoiceNo(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "invoicePrefix":
                    record.setInvoicePrefix(tokens.get(i));
                    break;

                case "storeId":
                    record.setStoreId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "storeName":
                    record.setStoreName(tokens.get(i));
                    break;

                case "storeUrl":
                    record.setStoreUrl(tokens.get(i));
                    break;

                case "customerId":
                    record.setCustomerId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "customerGroupId":
                    record.setCustomerGroupId(java.lang.Integer.valueOf((tokens.get(i))));
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

                case "customField":
                    record.setCustomField(tokens.get(i));
                    break;

                case "paymentFirstname":
                    record.setPaymentFirstname(tokens.get(i));
                    break;

                case "paymentLastname":
                    record.setPaymentLastname(tokens.get(i));
                    break;

                case "paymentCompany":
                    record.setPaymentCompany(tokens.get(i));
                    break;

                case "paymentAddress1":
                    record.setPaymentAddress1(tokens.get(i));
                    break;

                case "paymentAddress2":
                    record.setPaymentAddress2(tokens.get(i));
                    break;

                case "paymentCity":
                    record.setPaymentCity(tokens.get(i));
                    break;

                case "paymentPostcode":
                    record.setPaymentPostcode(tokens.get(i));
                    break;

                case "paymentCountry":
                    record.setPaymentCountry(tokens.get(i));
                    break;

                case "paymentCountryId":
                    record.setPaymentCountryId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "paymentZone":
                    record.setPaymentZone(tokens.get(i));
                    break;

                case "paymentZoneId":
                    record.setPaymentZoneId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "paymentAddressFormat":
                    record.setPaymentAddressFormat(tokens.get(i));
                    break;

                case "paymentCustomField":
                    record.setPaymentCustomField(tokens.get(i));
                    break;

                case "paymentMethod":
                    record.setPaymentMethod(tokens.get(i));
                    break;

                case "paymentCode":
                    record.setPaymentCode(tokens.get(i));
                    break;

                case "shippingFirstname":
                    record.setShippingFirstname(tokens.get(i));
                    break;

                case "shippingLastname":
                    record.setShippingLastname(tokens.get(i));
                    break;

                case "shippingCompany":
                    record.setShippingCompany(tokens.get(i));
                    break;

                case "shippingAddress1":
                    record.setShippingAddress1(tokens.get(i));
                    break;

                case "shippingAddress2":
                    record.setShippingAddress2(tokens.get(i));
                    break;

                case "shippingCity":
                    record.setShippingCity(tokens.get(i));
                    break;

                case "shippingPostcode":
                    record.setShippingPostcode(tokens.get(i));
                    break;

                case "shippingCountry":
                    record.setShippingCountry(tokens.get(i));
                    break;

                case "shippingCountryId":
                    record.setShippingCountryId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "shippingZone":
                    record.setShippingZone(tokens.get(i));
                    break;

                case "shippingZoneId":
                    record.setShippingZoneId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "shippingAddressFormat":
                    record.setShippingAddressFormat(tokens.get(i));
                    break;

                case "shippingCustomField":
                    record.setShippingCustomField(tokens.get(i));
                    break;

                case "shippingMethod":
                    record.setShippingMethod(tokens.get(i));
                    break;

                case "shippingCode":
                    record.setShippingCode(tokens.get(i));
                    break;

                case "comment":
                    record.setComment(tokens.get(i));
                    break;

                case "total":
                    record.setTotal(new java.math.BigDecimal(tokens.get(i)));
                    break;

                case "orderStatusId":
                    record.setOrderStatusId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "affiliateId":
                    record.setAffiliateId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "commission":
                    record.setCommission(new java.math.BigDecimal(tokens.get(i)));
                    break;

                case "marketingId":
                    record.setMarketingId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "tracking":
                    record.setTracking(tokens.get(i));
                    break;

                case "languageId":
                    record.setLanguageId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "currencyId":
                    record.setCurrencyId(java.lang.Integer.valueOf((tokens.get(i))));
                    break;
                case "currencyCode":
                    record.setCurrencyCode(tokens.get(i));
                    break;

                case "currencyValue":
                    record.setCurrencyValue(new java.math.BigDecimal(tokens.get(i)));
                    break;

                case "ip":
                    record.setIp(tokens.get(i));
                    break;

                case "forwardedIp":
                    record.setForwardedIp(tokens.get(i));
                    break;

                case "userAgent":
                    record.setUserAgent(tokens.get(i));
                    break;

                case "acceptLanguage":
                    record.setAcceptLanguage(tokens.get(i));
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
