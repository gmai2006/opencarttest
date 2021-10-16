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
import com.opencart.test.entity.OcCart;
import com.opencart.test.utils.ByteArrayToBase64TypeAdapter;
import com.opencart.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class OcCartServiceTest {
    private static DefaultOcCartService serviceMock;
    private static OcCart[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultOcCartService.class);
        String inputFile = "OcCart.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, OcCart[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getCartId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        OcCart testResult = serviceMock.find(records[0].getCartId());

        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertTrue(
                "expect equals apiId ", records[0].getApiId() == testResult.getApiId());
        org.junit.Assert.assertTrue(
                "expect equals customerId ",
                records[0].getCustomerId() == testResult.getCustomerId());
        org.junit.Assert.assertEquals(
                "expect equals sessionId ", records[0].getSessionId(), testResult.getSessionId());
        org.junit.Assert.assertTrue(
                "expect equals productId ", records[0].getProductId() == testResult.getProductId());
        org.junit.Assert.assertTrue(
                "expect equals recurringId ",
                records[0].getRecurringId() == testResult.getRecurringId());
        org.junit.Assert.assertEquals(
                "expect equals option ", records[0].getOption(), testResult.getOption());
        org.junit.Assert.assertTrue(
                "expect equals quantity ", records[0].getQuantity() == testResult.getQuantity());
    }
}