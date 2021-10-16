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
import com.opencart.test.entity.OcCoupon;
import com.opencart.test.utils.ByteArrayToBase64TypeAdapter;
import com.opencart.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class OcCouponServiceTest {
    private static DefaultOcCouponService serviceMock;
    private static OcCoupon[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultOcCouponService.class);
        String inputFile = "OcCoupon.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, OcCoupon[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getCouponId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        OcCoupon testResult = serviceMock.find(records[0].getCouponId());

        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertEquals(
                "expect equals name ", records[0].getName(), testResult.getName());
        org.junit.Assert.assertEquals(
                "expect equals code ", records[0].getCode(), testResult.getCode());
        org.junit.Assert.assertEquals(
                "expect equals type ", records[0].getType(), testResult.getType());
        org.junit.Assert.assertEquals(
                "expect equals discount ", records[0].getDiscount(), testResult.getDiscount());
        org.junit.Assert.assertTrue(
                "expect equals logged ", records[0].getLogged() == testResult.getLogged());
        org.junit.Assert.assertTrue(
                "expect equals shipping ", records[0].getShipping() == testResult.getShipping());
        org.junit.Assert.assertEquals(
                "expect equals total ", records[0].getTotal(), testResult.getTotal());
        org.junit.Assert.assertTrue(
                "expect equals usesTotal ", records[0].getUsesTotal() == testResult.getUsesTotal());
        org.junit.Assert.assertEquals(
                "expect equals usesCustomer ",
                records[0].getUsesCustomer(),
                testResult.getUsesCustomer());
        org.junit.Assert.assertTrue(
                "expect equals status ", records[0].getStatus() == testResult.getStatus());
    }
}
