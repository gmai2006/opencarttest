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
import com.opencart.test.entity.OcRecurring;
import com.opencart.test.utils.ByteArrayToBase64TypeAdapter;
import com.opencart.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class OcRecurringServiceTest {
    private static DefaultOcRecurringService serviceMock;
    private static OcRecurring[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultOcRecurringService.class);
        String inputFile = "OcRecurring.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, OcRecurring[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getRecurringId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        OcRecurring testResult = serviceMock.find(records[0].getRecurringId());

        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertEquals(
                "expect equals price ", records[0].getPrice(), testResult.getPrice());
        org.junit.Assert.assertEquals(
                "expect equals frequency ", records[0].getFrequency(), testResult.getFrequency());
        org.junit.Assert.assertTrue(
                "expect equals duration ", records[0].getDuration() == testResult.getDuration());
        org.junit.Assert.assertTrue(
                "expect equals cycle ", records[0].getCycle() == testResult.getCycle());
        org.junit.Assert.assertTrue(
                "expect equals trialStatus ",
                records[0].getTrialStatus() == testResult.getTrialStatus());
        org.junit.Assert.assertEquals(
                "expect equals trialPrice ",
                records[0].getTrialPrice(),
                testResult.getTrialPrice());
        org.junit.Assert.assertEquals(
                "expect equals trialFrequency ",
                records[0].getTrialFrequency(),
                testResult.getTrialFrequency());
        org.junit.Assert.assertTrue(
                "expect equals trialDuration ",
                records[0].getTrialDuration() == testResult.getTrialDuration());
        org.junit.Assert.assertTrue(
                "expect equals trialCycle ",
                records[0].getTrialCycle() == testResult.getTrialCycle());
        org.junit.Assert.assertTrue(
                "expect equals status ", records[0].getStatus() == testResult.getStatus());
        org.junit.Assert.assertTrue(
                "expect equals sortOrder ", records[0].getSortOrder() == testResult.getSortOrder());
    }
}
