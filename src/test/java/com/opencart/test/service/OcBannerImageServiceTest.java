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
import com.opencart.test.entity.OcBannerImage;
import com.opencart.test.utils.ByteArrayToBase64TypeAdapter;
import com.opencart.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class OcBannerImageServiceTest {
    private static DefaultOcBannerImageService serviceMock;
    private static OcBannerImage[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultOcBannerImageService.class);
        String inputFile = "OcBannerImage.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, OcBannerImage[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getBannerImageId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        OcBannerImage testResult = serviceMock.find(records[0].getBannerImageId());

        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertTrue(
                "expect equals bannerId ", records[0].getBannerId() == testResult.getBannerId());
        org.junit.Assert.assertTrue(
                "expect equals languageId ",
                records[0].getLanguageId() == testResult.getLanguageId());
        org.junit.Assert.assertEquals(
                "expect equals title ", records[0].getTitle(), testResult.getTitle());
        org.junit.Assert.assertEquals(
                "expect equals link ", records[0].getLink(), testResult.getLink());
        org.junit.Assert.assertEquals(
                "expect equals image ", records[0].getImage(), testResult.getImage());
        org.junit.Assert.assertTrue(
                "expect equals sortOrder ", records[0].getSortOrder() == testResult.getSortOrder());
    }
}
