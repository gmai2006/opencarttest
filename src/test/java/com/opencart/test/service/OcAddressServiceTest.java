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
import com.opencart.test.entity.OcAddress;
import com.opencart.test.utils.ByteArrayToBase64TypeAdapter;
import com.opencart.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class OcAddressServiceTest {
    private static DefaultOcAddressService serviceMock;
    private static OcAddress[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultOcAddressService.class);
        String inputFile = "OcAddress.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, OcAddress[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getAddressId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        OcAddress testResult = serviceMock.find(records[0].getAddressId());

        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertTrue(
                "expect equals customerId ",
                records[0].getCustomerId() == testResult.getCustomerId());
        org.junit.Assert.assertEquals(
                "expect equals firstname ", records[0].getFirstname(), testResult.getFirstname());
        org.junit.Assert.assertEquals(
                "expect equals lastname ", records[0].getLastname(), testResult.getLastname());
        org.junit.Assert.assertEquals(
                "expect equals company ", records[0].getCompany(), testResult.getCompany());
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
                "expect equals customField ",
                records[0].getCustomField(),
                testResult.getCustomField());
    }
}
