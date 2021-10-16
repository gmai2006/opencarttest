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
import com.opencart.test.entity.OcOrderRecurring;
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

public class OcOrderRecurringHandlerTestIt {
    static final String inputFile = "OcOrderRecurring.json";
    static OcOrderRecurringHandler handler;
    private static JpaDao jpa;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private OcOrderRecurring[] records;

    /** Run before the test. */
    @BeforeClass
    public static void before() {
        final EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("testpersistence");
        jpa = new StandaloneJpaDao(factory.createEntityManager());
        handler = new OcOrderRecurringHandler(jpa);
    }

    @Test
    public void testSelect() throws IOException {
        final File tempFile =
                createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
        final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
        int count = handler.process(inputStream);
        String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        records = gson.fromJson(json, OcOrderRecurring[].class);
        assertEquals("match count", count, records.length);
        OcOrderRecurring testResult =
                jpa.find(OcOrderRecurring.class, records[0].getOrderRecurringId());
        org.junit.Assert.assertEquals(
                "expect equals orderId ", this.records[0].getOrderId(), testResult.getOrderId());
        assertEquals(
                "expect equals reference ",
                this.records[0].getReference(),
                testResult.getReference());
        org.junit.Assert.assertEquals(
                "expect equals productId ",
                this.records[0].getProductId(),
                testResult.getProductId());
        assertEquals(
                "expect equals productName ",
                this.records[0].getProductName(),
                testResult.getProductName());
        org.junit.Assert.assertEquals(
                "expect equals productQuantity ",
                this.records[0].getProductQuantity(),
                testResult.getProductQuantity());
        org.junit.Assert.assertEquals(
                "expect equals recurringId ",
                this.records[0].getRecurringId(),
                testResult.getRecurringId());
        assertEquals(
                "expect equals recurringName ",
                this.records[0].getRecurringName(),
                testResult.getRecurringName());
        assertEquals(
                "expect equals recurringDescription ",
                this.records[0].getRecurringDescription(),
                testResult.getRecurringDescription());
        assertEquals(
                "expect equals recurringFrequency ",
                this.records[0].getRecurringFrequency(),
                testResult.getRecurringFrequency());
        org.junit.Assert.assertEquals(
                "expect equals recurringCycle ",
                this.records[0].getRecurringCycle(),
                testResult.getRecurringCycle());
        org.junit.Assert.assertEquals(
                "expect equals recurringDuration ",
                this.records[0].getRecurringDuration(),
                testResult.getRecurringDuration());
        assertEquals(
                "expect equals recurringPrice ",
                this.records[0].getRecurringPrice(),
                testResult.getRecurringPrice());
        org.junit.Assert.assertEquals(
                "expect equals trial ", this.records[0].getTrial(), testResult.getTrial());
        assertEquals(
                "expect equals trialFrequency ",
                this.records[0].getTrialFrequency(),
                testResult.getTrialFrequency());
        org.junit.Assert.assertEquals(
                "expect equals trialCycle ",
                this.records[0].getTrialCycle(),
                testResult.getTrialCycle());
        org.junit.Assert.assertEquals(
                "expect equals trialDuration ",
                this.records[0].getTrialDuration(),
                testResult.getTrialDuration());
        assertEquals(
                "expect equals trialPrice ",
                this.records[0].getTrialPrice(),
                testResult.getTrialPrice());
        org.junit.Assert.assertEquals(
                "expect equals status ", this.records[0].getStatus(), testResult.getStatus());

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
