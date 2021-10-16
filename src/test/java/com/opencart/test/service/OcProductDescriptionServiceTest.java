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
import com.opencart.test.entity.OcProductDescription;
import com.opencart.test.entity.OcProductDescriptionId;
import com.opencart.test.utils.ByteArrayToBase64TypeAdapter;
import com.opencart.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class OcProductDescriptionServiceTest {
    private static DefaultOcProductDescriptionService serviceMock;
    private static OcProductDescription[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultOcProductDescriptionService.class);
        String inputFile = "OcProductDescription.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, OcProductDescription[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        final OcProductDescriptionId id =
                new OcProductDescriptionId(records[0].getProductId(), records[0].getLanguageId());
        when(serviceMock.find(id)).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        final OcProductDescriptionId id =
                new OcProductDescriptionId(records[0].getProductId(), records[0].getLanguageId());
        OcProductDescription testResult = serviceMock.find(id);
        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertEquals(
                "expect equals name ", records[0].getName(), testResult.getName());
        org.junit.Assert.assertEquals(
                "expect equals description ",
                records[0].getDescription(),
                testResult.getDescription());
        org.junit.Assert.assertEquals(
                "expect equals tag ", records[0].getTag(), testResult.getTag());
        org.junit.Assert.assertEquals(
                "expect equals metaTitle ", records[0].getMetaTitle(), testResult.getMetaTitle());
        org.junit.Assert.assertEquals(
                "expect equals metaDescription ",
                records[0].getMetaDescription(),
                testResult.getMetaDescription());
        org.junit.Assert.assertEquals(
                "expect equals metaKeyword ",
                records[0].getMetaKeyword(),
                testResult.getMetaKeyword());
    }
}
