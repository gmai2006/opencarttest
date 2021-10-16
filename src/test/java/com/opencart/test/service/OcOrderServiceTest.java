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
package com.opencart.test.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opencart.test.entity.OcOrder;
import com.opencart.test.utils.ByteArrayToBase64TypeAdapter;
import com.opencart.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class OcOrderServiceTest {
    private static DefaultOcOrderService serviceMock;
    private static OcOrder[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultOcOrderService.class);
        String inputFile = "OcOrder.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, OcOrder[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getOrderId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        OcOrder testResult = serviceMock.find(records[0].getOrderId());

        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertTrue(
                "expect equals invoiceNo ", records[0].getInvoiceNo() == testResult.getInvoiceNo());
        org.junit.Assert.assertEquals(
                "expect equals invoicePrefix ",
                records[0].getInvoicePrefix(),
                testResult.getInvoicePrefix());
        org.junit.Assert.assertTrue(
                "expect equals storeId ", records[0].getStoreId() == testResult.getStoreId());
        org.junit.Assert.assertEquals(
                "expect equals storeName ", records[0].getStoreName(), testResult.getStoreName());
        org.junit.Assert.assertEquals(
                "expect equals storeUrl ", records[0].getStoreUrl(), testResult.getStoreUrl());
        org.junit.Assert.assertTrue(
                "expect equals customerId ",
                records[0].getCustomerId() == testResult.getCustomerId());
        org.junit.Assert.assertTrue(
                "expect equals customerGroupId ",
                records[0].getCustomerGroupId() == testResult.getCustomerGroupId());
        org.junit.Assert.assertEquals(
                "expect equals firstname ", records[0].getFirstname(), testResult.getFirstname());
        org.junit.Assert.assertEquals(
                "expect equals lastname ", records[0].getLastname(), testResult.getLastname());
        org.junit.Assert.assertEquals(
                "expect equals email ", records[0].getEmail(), testResult.getEmail());
        org.junit.Assert.assertEquals(
                "expect equals telephone ", records[0].getTelephone(), testResult.getTelephone());
        org.junit.Assert.assertEquals(
                "expect equals fax ", records[0].getFax(), testResult.getFax());
        org.junit.Assert.assertEquals(
                "expect equals customField ",
                records[0].getCustomField(),
                testResult.getCustomField());
        org.junit.Assert.assertEquals(
                "expect equals paymentFirstname ",
                records[0].getPaymentFirstname(),
                testResult.getPaymentFirstname());
        org.junit.Assert.assertEquals(
                "expect equals paymentLastname ",
                records[0].getPaymentLastname(),
                testResult.getPaymentLastname());
        org.junit.Assert.assertEquals(
                "expect equals paymentCompany ",
                records[0].getPaymentCompany(),
                testResult.getPaymentCompany());
        org.junit.Assert.assertEquals(
                "expect equals paymentAddress1 ",
                records[0].getPaymentAddress1(),
                testResult.getPaymentAddress1());
        org.junit.Assert.assertEquals(
                "expect equals paymentAddress2 ",
                records[0].getPaymentAddress2(),
                testResult.getPaymentAddress2());
        org.junit.Assert.assertEquals(
                "expect equals paymentCity ",
                records[0].getPaymentCity(),
                testResult.getPaymentCity());
        org.junit.Assert.assertEquals(
                "expect equals paymentPostcode ",
                records[0].getPaymentPostcode(),
                testResult.getPaymentPostcode());
        org.junit.Assert.assertEquals(
                "expect equals paymentCountry ",
                records[0].getPaymentCountry(),
                testResult.getPaymentCountry());
        org.junit.Assert.assertTrue(
                "expect equals paymentCountryId ",
                records[0].getPaymentCountryId() == testResult.getPaymentCountryId());
        org.junit.Assert.assertEquals(
                "expect equals paymentZone ",
                records[0].getPaymentZone(),
                testResult.getPaymentZone());
        org.junit.Assert.assertTrue(
                "expect equals paymentZoneId ",
                records[0].getPaymentZoneId() == testResult.getPaymentZoneId());
        org.junit.Assert.assertEquals(
                "expect equals paymentAddressFormat ",
                records[0].getPaymentAddressFormat(),
                testResult.getPaymentAddressFormat());
        org.junit.Assert.assertEquals(
                "expect equals paymentCustomField ",
                records[0].getPaymentCustomField(),
                testResult.getPaymentCustomField());
        org.junit.Assert.assertEquals(
                "expect equals paymentMethod ",
                records[0].getPaymentMethod(),
                testResult.getPaymentMethod());
        org.junit.Assert.assertEquals(
                "expect equals paymentCode ",
                records[0].getPaymentCode(),
                testResult.getPaymentCode());
        org.junit.Assert.assertEquals(
                "expect equals shippingFirstname ",
                records[0].getShippingFirstname(),
                testResult.getShippingFirstname());
        org.junit.Assert.assertEquals(
                "expect equals shippingLastname ",
                records[0].getShippingLastname(),
                testResult.getShippingLastname());
        org.junit.Assert.assertEquals(
                "expect equals shippingCompany ",
                records[0].getShippingCompany(),
                testResult.getShippingCompany());
        org.junit.Assert.assertEquals(
                "expect equals shippingAddress1 ",
                records[0].getShippingAddress1(),
                testResult.getShippingAddress1());
        org.junit.Assert.assertEquals(
                "expect equals shippingAddress2 ",
                records[0].getShippingAddress2(),
                testResult.getShippingAddress2());
        org.junit.Assert.assertEquals(
                "expect equals shippingCity ",
                records[0].getShippingCity(),
                testResult.getShippingCity());
        org.junit.Assert.assertEquals(
                "expect equals shippingPostcode ",
                records[0].getShippingPostcode(),
                testResult.getShippingPostcode());
        org.junit.Assert.assertEquals(
                "expect equals shippingCountry ",
                records[0].getShippingCountry(),
                testResult.getShippingCountry());
        org.junit.Assert.assertTrue(
                "expect equals shippingCountryId ",
                records[0].getShippingCountryId() == testResult.getShippingCountryId());
        org.junit.Assert.assertEquals(
                "expect equals shippingZone ",
                records[0].getShippingZone(),
                testResult.getShippingZone());
        org.junit.Assert.assertTrue(
                "expect equals shippingZoneId ",
                records[0].getShippingZoneId() == testResult.getShippingZoneId());
        org.junit.Assert.assertEquals(
                "expect equals shippingAddressFormat ",
                records[0].getShippingAddressFormat(),
                testResult.getShippingAddressFormat());
        org.junit.Assert.assertEquals(
                "expect equals shippingCustomField ",
                records[0].getShippingCustomField(),
                testResult.getShippingCustomField());
        org.junit.Assert.assertEquals(
                "expect equals shippingMethod ",
                records[0].getShippingMethod(),
                testResult.getShippingMethod());
        org.junit.Assert.assertEquals(
                "expect equals shippingCode ",
                records[0].getShippingCode(),
                testResult.getShippingCode());
        org.junit.Assert.assertEquals(
                "expect equals comment ", records[0].getComment(), testResult.getComment());
        org.junit.Assert.assertEquals(
                "expect equals total ", records[0].getTotal(), testResult.getTotal());
        org.junit.Assert.assertTrue(
                "expect equals orderStatusId ",
                records[0].getOrderStatusId() == testResult.getOrderStatusId());
        org.junit.Assert.assertTrue(
                "expect equals affiliateId ",
                records[0].getAffiliateId() == testResult.getAffiliateId());
        org.junit.Assert.assertEquals(
                "expect equals commission ",
                records[0].getCommission(),
                testResult.getCommission());
        org.junit.Assert.assertTrue(
                "expect equals marketingId ",
                records[0].getMarketingId() == testResult.getMarketingId());
        org.junit.Assert.assertEquals(
                "expect equals tracking ", records[0].getTracking(), testResult.getTracking());
        org.junit.Assert.assertTrue(
                "expect equals languageId ",
                records[0].getLanguageId() == testResult.getLanguageId());
        org.junit.Assert.assertTrue(
                "expect equals currencyId ",
                records[0].getCurrencyId() == testResult.getCurrencyId());
        org.junit.Assert.assertEquals(
                "expect equals currencyCode ",
                records[0].getCurrencyCode(),
                testResult.getCurrencyCode());
        org.junit.Assert.assertEquals(
                "expect equals currencyValue ",
                records[0].getCurrencyValue(),
                testResult.getCurrencyValue());
        org.junit.Assert.assertEquals("expect equals ip ", records[0].getIp(), testResult.getIp());
        org.junit.Assert.assertEquals(
                "expect equals forwardedIp ",
                records[0].getForwardedIp(),
                testResult.getForwardedIp());
        org.junit.Assert.assertEquals(
                "expect equals userAgent ", records[0].getUserAgent(), testResult.getUserAgent());
        org.junit.Assert.assertEquals(
                "expect equals acceptLanguage ",
                records[0].getAcceptLanguage(),
                testResult.getAcceptLanguage());
    }
}
