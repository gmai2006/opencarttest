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
import com.opencart.test.entity.OcOrderRecurring;
import com.opencart.test.utils.ByteArrayToBase64TypeAdapter;
import com.opencart.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class OcOrderRecurringServiceTest {
    private static DefaultOcOrderRecurringService serviceMock;
    private static OcOrderRecurring[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultOcOrderRecurringService.class);
        String inputFile = "OcOrderRecurring.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, OcOrderRecurring[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getOrderRecurringId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        OcOrderRecurring testResult = serviceMock.find(records[0].getOrderRecurringId());

        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertTrue(
                "expect equals orderId ", records[0].getOrderId() == testResult.getOrderId());
        org.junit.Assert.assertEquals(
                "expect equals reference ", records[0].getReference(), testResult.getReference());
        org.junit.Assert.assertTrue(
                "expect equals productId ", records[0].getProductId() == testResult.getProductId());
        org.junit.Assert.assertEquals(
                "expect equals productName ",
                records[0].getProductName(),
                testResult.getProductName());
        org.junit.Assert.assertTrue(
                "expect equals productQuantity ",
                records[0].getProductQuantity() == testResult.getProductQuantity());
        org.junit.Assert.assertTrue(
                "expect equals recurringId ",
                records[0].getRecurringId() == testResult.getRecurringId());
        org.junit.Assert.assertEquals(
                "expect equals recurringName ",
                records[0].getRecurringName(),
                testResult.getRecurringName());
        org.junit.Assert.assertEquals(
                "expect equals recurringDescription ",
                records[0].getRecurringDescription(),
                testResult.getRecurringDescription());
        org.junit.Assert.assertEquals(
                "expect equals recurringFrequency ",
                records[0].getRecurringFrequency(),
                testResult.getRecurringFrequency());
        org.junit.Assert.assertTrue(
                "expect equals recurringCycle ",
                records[0].getRecurringCycle() == testResult.getRecurringCycle());
        org.junit.Assert.assertTrue(
                "expect equals recurringDuration ",
                records[0].getRecurringDuration() == testResult.getRecurringDuration());
        org.junit.Assert.assertEquals(
                "expect equals recurringPrice ",
                records[0].getRecurringPrice(),
                testResult.getRecurringPrice());
        org.junit.Assert.assertTrue(
                "expect equals trial ", records[0].getTrial() == testResult.getTrial());
        org.junit.Assert.assertEquals(
                "expect equals trialFrequency ",
                records[0].getTrialFrequency(),
                testResult.getTrialFrequency());
        org.junit.Assert.assertTrue(
                "expect equals trialCycle ",
                records[0].getTrialCycle() == testResult.getTrialCycle());
        org.junit.Assert.assertTrue(
                "expect equals trialDuration ",
                records[0].getTrialDuration() == testResult.getTrialDuration());
        org.junit.Assert.assertEquals(
                "expect equals trialPrice ",
                records[0].getTrialPrice(),
                testResult.getTrialPrice());
        org.junit.Assert.assertTrue(
                "expect equals status ", records[0].getStatus() == testResult.getStatus());
    }
}
