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

import static org.junit.Assert.assertNotNull;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opencart.test.entity.OcOrder;
import com.opencart.test.utils.ByteArrayToBase64TypeAdapter;
import com.opencart.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OcOrderDaoTestIt {
    static final String inputFile = "OcOrder.json";
    static OcOrderDao dao;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private OcOrder[] records;

    /** Run when the class is loaded. */
    @BeforeClass
    public static void beforeClass() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
        JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
        dao = new DefaultOcOrderDao(jpa);
    }

    /** Run before the test. */
    @Before
    public void before() {
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, OcOrder[].class);
            json = null;
            Arrays.stream(records).skip(1).forEach(o -> dao.create(o));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @After
    public void after() {
        records = null;
    }

    @Test
    public void testSelect() {
        OcOrder testResult = dao.find(records[1].getOrderId());
        assertNotNull("expect result", testResult);
        org.junit.Assert.assertTrue(
                "expect equals invoiceNo ",
                this.records[1].getInvoiceNo() == testResult.getInvoiceNo());
        org.junit.Assert.assertEquals(
                "expect equals invoicePrefix ",
                this.records[1].getInvoicePrefix(),
                testResult.getInvoicePrefix());
        org.junit.Assert.assertTrue(
                "expect equals storeId ", this.records[1].getStoreId() == testResult.getStoreId());
        org.junit.Assert.assertEquals(
                "expect equals storeName ",
                this.records[1].getStoreName(),
                testResult.getStoreName());
        org.junit.Assert.assertEquals(
                "expect equals storeUrl ", this.records[1].getStoreUrl(), testResult.getStoreUrl());
        org.junit.Assert.assertTrue(
                "expect equals customerId ",
                this.records[1].getCustomerId() == testResult.getCustomerId());
        org.junit.Assert.assertTrue(
                "expect equals customerGroupId ",
                this.records[1].getCustomerGroupId() == testResult.getCustomerGroupId());
        org.junit.Assert.assertEquals(
                "expect equals firstname ",
                this.records[1].getFirstname(),
                testResult.getFirstname());
        org.junit.Assert.assertEquals(
                "expect equals lastname ", this.records[1].getLastname(), testResult.getLastname());
        org.junit.Assert.assertEquals(
                "expect equals email ", this.records[1].getEmail(), testResult.getEmail());
        org.junit.Assert.assertEquals(
                "expect equals telephone ",
                this.records[1].getTelephone(),
                testResult.getTelephone());
        org.junit.Assert.assertEquals(
                "expect equals fax ", this.records[1].getFax(), testResult.getFax());
        org.junit.Assert.assertEquals(
                "expect equals customField ",
                this.records[1].getCustomField(),
                testResult.getCustomField());
        org.junit.Assert.assertEquals(
                "expect equals paymentFirstname ",
                this.records[1].getPaymentFirstname(),
                testResult.getPaymentFirstname());
        org.junit.Assert.assertEquals(
                "expect equals paymentLastname ",
                this.records[1].getPaymentLastname(),
                testResult.getPaymentLastname());
        org.junit.Assert.assertEquals(
                "expect equals paymentCompany ",
                this.records[1].getPaymentCompany(),
                testResult.getPaymentCompany());
        org.junit.Assert.assertEquals(
                "expect equals paymentAddress1 ",
                this.records[1].getPaymentAddress1(),
                testResult.getPaymentAddress1());
        org.junit.Assert.assertEquals(
                "expect equals paymentAddress2 ",
                this.records[1].getPaymentAddress2(),
                testResult.getPaymentAddress2());
        org.junit.Assert.assertEquals(
                "expect equals paymentCity ",
                this.records[1].getPaymentCity(),
                testResult.getPaymentCity());
        org.junit.Assert.assertEquals(
                "expect equals paymentPostcode ",
                this.records[1].getPaymentPostcode(),
                testResult.getPaymentPostcode());
        org.junit.Assert.assertEquals(
                "expect equals paymentCountry ",
                this.records[1].getPaymentCountry(),
                testResult.getPaymentCountry());
        org.junit.Assert.assertTrue(
                "expect equals paymentCountryId ",
                this.records[1].getPaymentCountryId() == testResult.getPaymentCountryId());
        org.junit.Assert.assertEquals(
                "expect equals paymentZone ",
                this.records[1].getPaymentZone(),
                testResult.getPaymentZone());
        org.junit.Assert.assertTrue(
                "expect equals paymentZoneId ",
                this.records[1].getPaymentZoneId() == testResult.getPaymentZoneId());
        org.junit.Assert.assertEquals(
                "expect equals paymentAddressFormat ",
                this.records[1].getPaymentAddressFormat(),
                testResult.getPaymentAddressFormat());
        org.junit.Assert.assertEquals(
                "expect equals paymentCustomField ",
                this.records[1].getPaymentCustomField(),
                testResult.getPaymentCustomField());
        org.junit.Assert.assertEquals(
                "expect equals paymentMethod ",
                this.records[1].getPaymentMethod(),
                testResult.getPaymentMethod());
        org.junit.Assert.assertEquals(
                "expect equals paymentCode ",
                this.records[1].getPaymentCode(),
                testResult.getPaymentCode());
        org.junit.Assert.assertEquals(
                "expect equals shippingFirstname ",
                this.records[1].getShippingFirstname(),
                testResult.getShippingFirstname());
        org.junit.Assert.assertEquals(
                "expect equals shippingLastname ",
                this.records[1].getShippingLastname(),
                testResult.getShippingLastname());
        org.junit.Assert.assertEquals(
                "expect equals shippingCompany ",
                this.records[1].getShippingCompany(),
                testResult.getShippingCompany());
        org.junit.Assert.assertEquals(
                "expect equals shippingAddress1 ",
                this.records[1].getShippingAddress1(),
                testResult.getShippingAddress1());
        org.junit.Assert.assertEquals(
                "expect equals shippingAddress2 ",
                this.records[1].getShippingAddress2(),
                testResult.getShippingAddress2());
        org.junit.Assert.assertEquals(
                "expect equals shippingCity ",
                this.records[1].getShippingCity(),
                testResult.getShippingCity());
        org.junit.Assert.assertEquals(
                "expect equals shippingPostcode ",
                this.records[1].getShippingPostcode(),
                testResult.getShippingPostcode());
        org.junit.Assert.assertEquals(
                "expect equals shippingCountry ",
                this.records[1].getShippingCountry(),
                testResult.getShippingCountry());
        org.junit.Assert.assertTrue(
                "expect equals shippingCountryId ",
                this.records[1].getShippingCountryId() == testResult.getShippingCountryId());
        org.junit.Assert.assertEquals(
                "expect equals shippingZone ",
                this.records[1].getShippingZone(),
                testResult.getShippingZone());
        org.junit.Assert.assertTrue(
                "expect equals shippingZoneId ",
                this.records[1].getShippingZoneId() == testResult.getShippingZoneId());
        org.junit.Assert.assertEquals(
                "expect equals shippingAddressFormat ",
                this.records[1].getShippingAddressFormat(),
                testResult.getShippingAddressFormat());
        org.junit.Assert.assertEquals(
                "expect equals shippingCustomField ",
                this.records[1].getShippingCustomField(),
                testResult.getShippingCustomField());
        org.junit.Assert.assertEquals(
                "expect equals shippingMethod ",
                this.records[1].getShippingMethod(),
                testResult.getShippingMethod());
        org.junit.Assert.assertEquals(
                "expect equals shippingCode ",
                this.records[1].getShippingCode(),
                testResult.getShippingCode());
        org.junit.Assert.assertEquals(
                "expect equals comment ", this.records[1].getComment(), testResult.getComment());
        org.junit.Assert.assertEquals(
                "expect equals total ", this.records[1].getTotal(), testResult.getTotal());
        org.junit.Assert.assertTrue(
                "expect equals orderStatusId ",
                this.records[1].getOrderStatusId() == testResult.getOrderStatusId());
        org.junit.Assert.assertTrue(
                "expect equals affiliateId ",
                this.records[1].getAffiliateId() == testResult.getAffiliateId());
        org.junit.Assert.assertEquals(
                "expect equals commission ",
                this.records[1].getCommission(),
                testResult.getCommission());
        org.junit.Assert.assertTrue(
                "expect equals marketingId ",
                this.records[1].getMarketingId() == testResult.getMarketingId());
        org.junit.Assert.assertEquals(
                "expect equals tracking ", this.records[1].getTracking(), testResult.getTracking());
        org.junit.Assert.assertTrue(
                "expect equals languageId ",
                this.records[1].getLanguageId() == testResult.getLanguageId());
        org.junit.Assert.assertTrue(
                "expect equals currencyId ",
                this.records[1].getCurrencyId() == testResult.getCurrencyId());
        org.junit.Assert.assertEquals(
                "expect equals currencyCode ",
                this.records[1].getCurrencyCode(),
                testResult.getCurrencyCode());
        org.junit.Assert.assertEquals(
                "expect equals currencyValue ",
                this.records[1].getCurrencyValue(),
                testResult.getCurrencyValue());
        org.junit.Assert.assertEquals(
                "expect equals ip ", this.records[1].getIp(), testResult.getIp());
        org.junit.Assert.assertEquals(
                "expect equals forwardedIp ",
                this.records[1].getForwardedIp(),
                testResult.getForwardedIp());
        org.junit.Assert.assertEquals(
                "expect equals userAgent ",
                this.records[1].getUserAgent(),
                testResult.getUserAgent());
        org.junit.Assert.assertEquals(
                "expect equals acceptLanguage ",
                this.records[1].getAcceptLanguage(),
                testResult.getAcceptLanguage());
    }
}
