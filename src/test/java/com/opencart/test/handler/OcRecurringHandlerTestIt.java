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
package com.opencart.test.handler;

import static org.junit.Assert.assertEquals;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opencart.test.dao.JpaDao;
import com.opencart.test.dao.StandaloneJpaDao;
import com.opencart.test.entity.OcRecurring;
import com.opencart.test.utils.ByteArrayToBase64TypeAdapter;
import com.opencart.test.utils.FileUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.json.CDL;
import org.json.JSONArray;
import org.junit.BeforeClass;
import org.junit.Test;

public class OcRecurringHandlerTestIt {
    static final String inputFile = "OcRecurring.json";
    static OcRecurringHandler handler;
    private static JpaDao jpa;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private OcRecurring[] records;

    /** Run before the test. */
    @BeforeClass
    public static void before() {
        final EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("testpersistence");
        jpa = new StandaloneJpaDao(factory.createEntityManager());
        handler = new OcRecurringHandler(jpa);
    }

    @Test
    public void testSelect() throws IOException {
        final File tempFile =
                createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
        final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
        int count = handler.process(inputStream);
        String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        records = gson.fromJson(json, OcRecurring[].class);
        assertEquals("match count", count, records.length);
        OcRecurring testResult = jpa.find(OcRecurring.class, records[0].getRecurringId());
        assertEquals("expect equals price ", this.records[0].getPrice(), testResult.getPrice());
        assertEquals(
                "expect equals frequency ",
                this.records[0].getFrequency(),
                testResult.getFrequency());
        org.junit.Assert.assertEquals(
                "expect equals duration ", this.records[0].getDuration(), testResult.getDuration());
        org.junit.Assert.assertEquals(
                "expect equals cycle ", this.records[0].getCycle(), testResult.getCycle());
        org.junit.Assert.assertEquals(
                "expect equals trialStatus ",
                this.records[0].getTrialStatus(),
                testResult.getTrialStatus());
        assertEquals(
                "expect equals trialPrice ",
                this.records[0].getTrialPrice(),
                testResult.getTrialPrice());
        assertEquals(
                "expect equals trialFrequency ",
                this.records[0].getTrialFrequency(),
                testResult.getTrialFrequency());
        org.junit.Assert.assertEquals(
                "expect equals trialDuration ",
                this.records[0].getTrialDuration(),
                testResult.getTrialDuration());
        org.junit.Assert.assertEquals(
                "expect equals trialCycle ",
                this.records[0].getTrialCycle(),
                testResult.getTrialCycle());
        org.junit.Assert.assertEquals(
                "expect equals status ", this.records[0].getStatus(), testResult.getStatus());
        org.junit.Assert.assertEquals(
                "expect equals sortOrder ",
                this.records[0].getSortOrder(),
                testResult.getSortOrder());

        // cleanup
        inputStream.close();
        json = null;
        records = null;
    }

    /**
     * Construct a delimiter file from a json file.
     *
     * @param inputFile the json file.
     * @param charset default charset.
     * @return
     */
    private File createRecordInputStreamFromJsonFile(String inputFile, Charset charset) {
        try {
            final File tempFile = File.createTempFile(inputFile, ".txt");
            tempFile.deleteOnExit();
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            JSONArray docs = new JSONArray(json);
            String csv = CDL.toString(docs);
            org.apache.commons.io.FileUtils.writeStringToFile(
                    tempFile, csv, Charset.defaultCharset());
            return tempFile;
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
