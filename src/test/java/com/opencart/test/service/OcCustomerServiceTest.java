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
import com.opencart.test.entity.OcCustomer;
import com.opencart.test.utils.ByteArrayToBase64TypeAdapter;
import com.opencart.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class OcCustomerServiceTest {
    private static DefaultOcCustomerService serviceMock;
    private static OcCustomer[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultOcCustomerService.class);
        String inputFile = "OcCustomer.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, OcCustomer[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getCustomerId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        OcCustomer testResult = serviceMock.find(records[0].getCustomerId());

        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertTrue(
                "expect equals customerGroupId ",
                records[0].getCustomerGroupId() == testResult.getCustomerGroupId());
        org.junit.Assert.assertTrue(
                "expect equals storeId ", records[0].getStoreId() == testResult.getStoreId());
        org.junit.Assert.assertTrue(
                "expect equals languageId ",
                records[0].getLanguageId() == testResult.getLanguageId());
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
                "expect equals cart ", records[0].getCart(), testResult.getCart());
        org.junit.Assert.assertEquals(
                "expect equals wishlist ", records[0].getWishlist(), testResult.getWishlist());
        org.junit.Assert.assertTrue(
                "expect equals newsletter ",
                records[0].getNewsletter() == testResult.getNewsletter());
        org.junit.Assert.assertTrue(
                "expect equals addressId ", records[0].getAddressId() == testResult.getAddressId());
        org.junit.Assert.assertEquals(
                "expect equals customField ",
                records[0].getCustomField(),
                testResult.getCustomField());
        org.junit.Assert.assertEquals("expect equals ip ", records[0].getIp(), testResult.getIp());
        org.junit.Assert.assertTrue(
                "expect equals status ", records[0].getStatus() == testResult.getStatus());
        org.junit.Assert.assertTrue(
                "expect equals approved ", records[0].getApproved() == testResult.getApproved());
        org.junit.Assert.assertTrue(
                "expect equals safe ", records[0].getSafe() == testResult.getSafe());
        org.junit.Assert.assertEquals(
                "expect equals token ", records[0].getToken(), testResult.getToken());
        org.junit.Assert.assertEquals(
                "expect equals code ", records[0].getCode(), testResult.getCode());
    }
}
