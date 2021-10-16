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
import com.opencart.test.entity.OcAffiliate;
import com.opencart.test.utils.ByteArrayToBase64TypeAdapter;
import com.opencart.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class OcAffiliateServiceTest {
    private static DefaultOcAffiliateService serviceMock;
    private static OcAffiliate[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultOcAffiliateService.class);
        String inputFile = "OcAffiliate.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, OcAffiliate[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getAffiliateId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        OcAffiliate testResult = serviceMock.find(records[0].getAffiliateId());

        org.junit.Assert.assertNotNull(testResult);
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
                "expect equals password ", records[0].getPassword(), testResult.getPassword());
        org.junit.Assert.assertEquals(
                "expect equals salt ", records[0].getSalt(), testResult.getSalt());
        org.junit.Assert.assertEquals(
                "expect equals company ", records[0].getCompany(), testResult.getCompany());
        org.junit.Assert.assertEquals(
                "expect equals website ", records[0].getWebsite(), testResult.getWebsite());
        org.junit.Assert.assertEquals(
                "expect equals address1 ", records[0].getAddress1(), testResult.getAddress1());
        org.junit.Assert.assertEquals(
                "expect equals address2 ", records[0].getAddress2(), testResult.getAddress2());
        org.junit.Assert.assertEquals(
                "expect equals city ", records[0].getCity(), testResult.getCity());
        org.junit.Assert.assertEquals(
                "expect equals postcode ", records[0].getPostcode(), testResult.getPostcode());
        org.junit.Assert.assertTrue(
                "expect equals countryId ", records[0].getCountryId() == testResult.getCountryId());
        org.junit.Assert.assertTrue(
                "expect equals zoneId ", records[0].getZoneId() == testResult.getZoneId());
        org.junit.Assert.assertEquals(
                "expect equals code ", records[0].getCode(), testResult.getCode());
        org.junit.Assert.assertEquals(
                "expect equals commission ",
                records[0].getCommission(),
                testResult.getCommission());
        org.junit.Assert.assertEquals(
                "expect equals tax ", records[0].getTax(), testResult.getTax());
        org.junit.Assert.assertEquals(
                "expect equals payment ", records[0].getPayment(), testResult.getPayment());
        org.junit.Assert.assertEquals(
                "expect equals cheque ", records[0].getCheque(), testResult.getCheque());
        org.junit.Assert.assertEquals(
                "expect equals paypal ", records[0].getPaypal(), testResult.getPaypal());
        org.junit.Assert.assertEquals(
                "expect equals bankName ", records[0].getBankName(), testResult.getBankName());
        org.junit.Assert.assertEquals(
                "expect equals bankBranchNumber ",
                records[0].getBankBranchNumber(),
                testResult.getBankBranchNumber());
        org.junit.Assert.assertEquals(
                "expect equals bankSwiftCode ",
                records[0].getBankSwiftCode(),
                testResult.getBankSwiftCode());
        org.junit.Assert.assertEquals(
                "expect equals bankAccountName ",
                records[0].getBankAccountName(),
                testResult.getBankAccountName());
        org.junit.Assert.assertEquals(
                "expect equals bankAccountNumber ",
                records[0].getBankAccountNumber(),
                testResult.getBankAccountNumber());
        org.junit.Assert.assertEquals("expect equals ip ", records[0].getIp(), testResult.getIp());
        org.junit.Assert.assertTrue(
                "expect equals status ", records[0].getStatus() == testResult.getStatus());
        org.junit.Assert.assertTrue(
                "expect equals approved ", records[0].getApproved() == testResult.getApproved());
    }
}
