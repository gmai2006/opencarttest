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
import com.opencart.test.entity.OcUser;
import com.opencart.test.utils.ByteArrayToBase64TypeAdapter;
import com.opencart.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class OcUserServiceTest {
    private static DefaultOcUserService serviceMock;
    private static OcUser[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultOcUserService.class);
        String inputFile = "OcUser.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, OcUser[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getUserId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        OcUser testResult = serviceMock.find(records[0].getUserId());

        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertTrue(
                "expect equals userGroupId ",
                records[0].getUserGroupId() == testResult.getUserGroupId());
        org.junit.Assert.assertEquals(
                "expect equals username ", records[0].getUsername(), testResult.getUsername());
        org.junit.Assert.assertEquals(
                "expect equals password ", records[0].getPassword(), testResult.getPassword());
        org.junit.Assert.assertEquals(
                "expect equals salt ", records[0].getSalt(), testResult.getSalt());
        org.junit.Assert.assertEquals(
                "expect equals firstname ", records[0].getFirstname(), testResult.getFirstname());
        org.junit.Assert.assertEquals(
                "expect equals lastname ", records[0].getLastname(), testResult.getLastname());
        org.junit.Assert.assertEquals(
                "expect equals email ", records[0].getEmail(), testResult.getEmail());
        org.junit.Assert.assertEquals(
                "expect equals image ", records[0].getImage(), testResult.getImage());
        org.junit.Assert.assertEquals(
                "expect equals code ", records[0].getCode(), testResult.getCode());
        org.junit.Assert.assertEquals("expect equals ip ", records[0].getIp(), testResult.getIp());
        org.junit.Assert.assertTrue(
                "expect equals status ", records[0].getStatus() == testResult.getStatus());
    }
}
