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
import com.opencart.test.entity.OcVoucherThemeDescription;
import com.opencart.test.entity.OcVoucherThemeDescriptionId;
import com.opencart.test.utils.ByteArrayToBase64TypeAdapter;
import com.opencart.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class OcVoucherThemeDescriptionServiceTest {
    private static DefaultOcVoucherThemeDescriptionService serviceMock;
    private static OcVoucherThemeDescription[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultOcVoucherThemeDescriptionService.class);
        String inputFile = "OcVoucherThemeDescription.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, OcVoucherThemeDescription[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        final OcVoucherThemeDescriptionId id =
                new OcVoucherThemeDescriptionId(
                        records[0].getVoucherThemeId(), records[0].getLanguageId());
        when(serviceMock.find(id)).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        final OcVoucherThemeDescriptionId id =
                new OcVoucherThemeDescriptionId(
                        records[0].getVoucherThemeId(), records[0].getLanguageId());
        OcVoucherThemeDescription testResult = serviceMock.find(id);
        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertEquals(
                "expect equals name ", records[0].getName(), testResult.getName());
    }
}
