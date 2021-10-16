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
import com.opencart.test.entity.OcOrderProduct;
import com.opencart.test.utils.ByteArrayToBase64TypeAdapter;
import com.opencart.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class OcOrderProductServiceTest {
    private static DefaultOcOrderProductService serviceMock;
    private static OcOrderProduct[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultOcOrderProductService.class);
        String inputFile = "OcOrderProduct.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, OcOrderProduct[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getOrderProductId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        OcOrderProduct testResult = serviceMock.find(records[0].getOrderProductId());

        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertTrue(
                "expect equals orderId ", records[0].getOrderId() == testResult.getOrderId());
        org.junit.Assert.assertTrue(
                "expect equals productId ", records[0].getProductId() == testResult.getProductId());
        org.junit.Assert.assertEquals(
                "expect equals name ", records[0].getName(), testResult.getName());
        org.junit.Assert.assertEquals(
                "expect equals model ", records[0].getModel(), testResult.getModel());
        org.junit.Assert.assertTrue(
                "expect equals quantity ", records[0].getQuantity() == testResult.getQuantity());
        org.junit.Assert.assertEquals(
                "expect equals price ", records[0].getPrice(), testResult.getPrice());
        org.junit.Assert.assertEquals(
                "expect equals total ", records[0].getTotal(), testResult.getTotal());
        org.junit.Assert.assertEquals(
                "expect equals tax ", records[0].getTax(), testResult.getTax());
        org.junit.Assert.assertTrue(
                "expect equals reward ", records[0].getReward() == testResult.getReward());
    }
}
