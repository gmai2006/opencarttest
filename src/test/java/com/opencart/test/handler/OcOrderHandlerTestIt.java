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

import static org.junit.Assert.assertEquals;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opencart.test.dao.JpaDao;
import com.opencart.test.dao.StandaloneJpaDao;
import com.opencart.test.entity.OcOrder;
import com.opencart.test.utils.ByteArrayToBase64TypeAdapter;
import com.opencart.test.utils.FileUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.json.CDL;
import org.json.JSONArray;
import org.junit.BeforeClass;
import org.junit.Test;

public class OcOrderHandlerTestIt {
    static final String inputFile = "OcOrder.json";
    static OcOrderHandler handler;
    private static JpaDao jpa;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private OcOrder[] records;

    /** Run before the test. */
    @BeforeClass
    public static void before() {
        final EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("testpersistence");
        jpa = new StandaloneJpaDao(factory.createEntityManager());
        handler = new OcOrderHandler(jpa);
    }

    @Test
    public void testSelect() throws IOException {
        final File tempFile =
                createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
        final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
        int count = handler.process(inputStream);
        String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        records = gson.fromJson(json, OcOrder[].class);
        assertEquals("match count", count, records.length);
        OcOrder testResult = jpa.find(OcOrder.class, records[0].getOrderId());
        org.junit.Assert.assertEquals(
                "expect equals invoiceNo ",
                this.records[0].getInvoiceNo(),
                testResult.getInvoiceNo());
        assertEquals(
                "expect equals invoicePrefix ",
                this.records[0].getInvoicePrefix(),
                testResult.getInvoicePrefix());
        org.junit.Assert.assertEquals(
                "expect equals storeId ", this.records[0].getStoreId(), testResult.getStoreId());
        assertEquals(
                "expect equals storeName ",
                this.records[0].getStoreName(),
                testResult.getStoreName());
        assertEquals(
                "expect equals storeUrl ", this.records[0].getStoreUrl(), testResult.getStoreUrl());
        org.junit.Assert.assertEquals(
                "expect equals customerId ",
                this.records[0].getCustomerId(),
                testResult.getCustomerId());
        org.junit.Assert.assertEquals(
                "expect equals customerGroupId ",
                this.records[0].getCustomerGroupId(),
                testResult.getCustomerGroupId());
        assertEquals(
                "expect equals firstname ",
                this.records[0].getFirstname(),
                testResult.getFirstname());
        assertEquals(
                "expect equals lastname ", this.records[0].getLastname(), testResult.getLastname());
        assertEquals("expect equals email ", this.records[0].getEmail(), testResult.getEmail());
        assertEquals(
                "expect equals telephone ",
                this.records[0].getTelephone(),
                testResult.getTelephone());
        assertEquals("expect equals fax ", this.records[0].getFax(), testResult.getFax());
        assertEquals(
                "expect equals customField ",
                this.records[0].getCustomField(),
                testResult.getCustomField());
        assertEquals(
                "expect equals paymentFirstname ",
                this.records[0].getPaymentFirstname(),
                testResult.getPaymentFirstname());
        assertEquals(
                "expect equals paymentLastname ",
                this.records[0].getPaymentLastname(),
                testResult.getPaymentLastname());
        assertEquals(
                "expect equals paymentCompany ",
                this.records[0].getPaymentCompany(),
                testResult.getPaymentCompany());
        assertEquals(
                "expect equals paymentAddress1 ",
                this.records[0].getPaymentAddress1(),
                testResult.getPaymentAddress1());
        assertEquals(
                "expect equals paymentAddress2 ",
                this.records[0].getPaymentAddress2(),
                testResult.getPaymentAddress2());
        assertEquals(
                "expect equals paymentCity ",
                this.records[0].getPaymentCity(),
                testResult.getPaymentCity());
        assertEquals(
                "expect equals paymentPostcode ",
                this.records[0].getPaymentPostcode(),
                testResult.getPaymentPostcode());
        assertEquals(
                "expect equals paymentCountry ",
                this.records[0].getPaymentCountry(),
                testResult.getPaymentCountry());
        org.junit.Assert.assertEquals(
                "expect equals paymentCountryId ",
                this.records[0].getPaymentCountryId(),
                testResult.getPaymentCountryId());
        assertEquals(
                "expect equals paymentZone ",
                this.records[0].getPaymentZone(),
                testResult.getPaymentZone());
        org.junit.Assert.assertEquals(
                "expect equals paymentZoneId ",
                this.records[0].getPaymentZoneId(),
                testResult.getPaymentZoneId());
        assertEquals(
                "expect equals paymentAddressFormat ",
                this.records[0].getPaymentAddressFormat(),
                testResult.getPaymentAddressFormat());
        assertEquals(
                "expect equals paymentCustomField ",
                this.records[0].getPaymentCustomField(),
                testResult.getPaymentCustomField());
        assertEquals(
                "expect equals paymentMethod ",
                this.records[0].getPaymentMethod(),
                testResult.getPaymentMethod());
        assertEquals(
                "expect equals paymentCode ",
                this.records[0].getPaymentCode(),
                testResult.getPaymentCode());
        assertEquals(
                "expect equals shippingFirstname ",
                this.records[0].getShippingFirstname(),
                testResult.getShippingFirstname());
        assertEquals(
                "expect equals shippingLastname ",
                this.records[0].getShippingLastname(),
                testResult.getShippingLastname());
        assertEquals(
                "expect equals shippingCompany ",
                this.records[0].getShippingCompany(),
                testResult.getShippingCompany());
        assertEquals(
                "expect equals shippingAddress1 ",
                this.records[0].getShippingAddress1(),
                testResult.getShippingAddress1());
        assertEquals(
                "expect equals shippingAddress2 ",
                this.records[0].getShippingAddress2(),
                testResult.getShippingAddress2());
        assertEquals(
                "expect equals shippingCity ",
                this.records[0].getShippingCity(),
                testResult.getShippingCity());
        assertEquals(
                "expect equals shippingPostcode ",
                this.records[0].getShippingPostcode(),
                testResult.getShippingPostcode());
        assertEquals(
                "expect equals shippingCountry ",
                this.records[0].getShippingCountry(),
                testResult.getShippingCountry());
        org.junit.Assert.assertEquals(
                "expect equals shippingCountryId ",
                this.records[0].getShippingCountryId(),
                testResult.getShippingCountryId());
        assertEquals(
                "expect equals shippingZone ",
                this.records[0].getShippingZone(),
                testResult.getShippingZone());
        org.junit.Assert.assertEquals(
                "expect equals shippingZoneId ",
                this.records[0].getShippingZoneId(),
                testResult.getShippingZoneId());
        assertEquals(
                "expect equals shippingAddressFormat ",
                this.records[0].getShippingAddressFormat(),
                testResult.getShippingAddressFormat());
        assertEquals(
                "expect equals shippingCustomField ",
                this.records[0].getShippingCustomField(),
                testResult.getShippingCustomField());
        assertEquals(
                "expect equals shippingMethod ",
                this.records[0].getShippingMethod(),
                testResult.getShippingMethod());
        assertEquals(
                "expect equals shippingCode ",
                this.records[0].getShippingCode(),
                testResult.getShippingCode());
        assertEquals(
                "expect equals comment ", this.records[0].getComment(), testResult.getComment());
        assertEquals("expect equals total ", this.records[0].getTotal(), testResult.getTotal());
        org.junit.Assert.assertEquals(
                "expect equals orderStatusId ",
                this.records[0].getOrderStatusId(),
                testResult.getOrderStatusId());
        org.junit.Assert.assertEquals(
                "expect equals affiliateId ",
                this.records[0].getAffiliateId(),
                testResult.getAffiliateId());
        assertEquals(
                "expect equals commission ",
                this.records[0].getCommission(),
                testResult.getCommission());
        org.junit.Assert.assertEquals(
                "expect equals marketingId ",
                this.records[0].getMarketingId(),
                testResult.getMarketingId());
        assertEquals(
                "expect equals tracking ", this.records[0].getTracking(), testResult.getTracking());
        org.junit.Assert.assertEquals(
                "expect equals languageId ",
                this.records[0].getLanguageId(),
                testResult.getLanguageId());
        org.junit.Assert.assertEquals(
                "expect equals currencyId ",
                this.records[0].getCurrencyId(),
                testResult.getCurrencyId());
        assertEquals(
                "expect equals currencyCode ",
                this.records[0].getCurrencyCode(),
                testResult.getCurrencyCode());
        assertEquals(
                "expect equals currencyValue ",
                this.records[0].getCurrencyValue(),
                testResult.getCurrencyValue());
        assertEquals("expect equals ip ", this.records[0].getIp(), testResult.getIp());
        assertEquals(
                "expect equals forwardedIp ",
                this.records[0].getForwardedIp(),
                testResult.getForwardedIp());
        assertEquals(
                "expect equals userAgent ",
                this.records[0].getUserAgent(),
                testResult.getUserAgent());
        assertEquals(
                "expect equals acceptLanguage ",
                this.records[0].getAcceptLanguage(),
                testResult.getAcceptLanguage());

        // cleanup
        inputStream.close();
        json = null;
        records = null;
    }

    /**
     * Construct a delimiter file from a json file.
     *
     * @param inputFile the json file.
     * @param charset default charset.
     * @return
     */
    private File createRecordInputStreamFromJsonFile(String inputFile, Charset charset) {
        try {
            final File tempFile = File.createTempFile(inputFile, ".txt");
            tempFile.deleteOnExit();
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            JSONArray docs = new JSONArray(json);
            String csv = CDL.toString(docs);
            org.apache.commons.io.FileUtils.writeStringToFile(
                    tempFile, csv, Charset.defaultCharset());
            return tempFile;
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
