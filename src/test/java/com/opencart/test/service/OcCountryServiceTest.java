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
import com.opencart.test.entity.OcCountry;
import com.opencart.test.utils.ByteArrayToBase64TypeAdapter;
import com.opencart.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class OcCountryServiceTest {
    private static DefaultOcCountryService serviceMock;
    private static OcCountry[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultOcCountryService.class);
        String inputFile = "OcCountry.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, OcCountry[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getCountryId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        OcCountry testResult = serviceMock.find(records[0].getCountryId());

        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertEquals(
                "expect equals name ", records[0].getName(), testResult.getName());
        org.junit.Assert.assertEquals(
                "expect equals isoCode2 ", records[0].getIsoCode2(), testResult.getIsoCode2());
        org.junit.Assert.assertEquals(
                "expect equals isoCode3 ", records[0].getIsoCode3(), testResult.getIsoCode3());
        org.junit.Assert.assertEquals(
                "expect equals addressFormat ",
                records[0].getAddressFormat(),
                testResult.getAddressFormat());
        org.junit.Assert.assertTrue(
                "expect equals postcodeRequired ",
                records[0].getPostcodeRequired() == testResult.getPostcodeRequired());
        org.junit.Assert.assertTrue(
                "expect equals status ", records[0].getStatus() == testResult.getStatus());
    }
}
