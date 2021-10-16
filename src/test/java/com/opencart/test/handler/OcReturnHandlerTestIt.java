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
import com.opencart.test.entity.OcReturn;
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

public class OcReturnHandlerTestIt {
    static final String inputFile = "OcReturn.json";
    static OcReturnHandler handler;
    private static JpaDao jpa;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private OcReturn[] records;

    /** Run before the test. */
    @BeforeClass
    public static void before() {
        final EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("testpersistence");
        jpa = new StandaloneJpaDao(factory.createEntityManager());
        handler = new OcReturnHandler(jpa);
    }

    @Test
    public void testSelect() throws IOException {
        final File tempFile =
                createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
        final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
        int count = handler.process(inputStream);
        String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        records = gson.fromJson(json, OcReturn[].class);
        assertEquals("match count", count, records.length);
        OcReturn testResult = jpa.find(OcReturn.class, records[0].getReturnId());
        org.junit.Assert.assertEquals(
                "expect equals orderId ", this.records[0].getOrderId(), testResult.getOrderId());
        org.junit.Assert.assertEquals(
                "expect equals productId ",
                this.records[0].getProductId(),
                testResult.getProductId());
        org.junit.Assert.assertEquals(
                "expect equals customerId ",
                this.records[0].getCustomerId(),
                testResult.getCustomerId());
        assertEquals(
                "expect equals firstname ",
                this.records[0].getFirstname(),
                testResult.getFirstname());
        assertEquals(
                "expect equals lastname ", this.records[0].getLastname(), testResult.getLastname());
        assertEquals("expect equals email ", this.records[0].getEmail(), testResult.getEmail());
        assertEquals(
                "expect equals telephone ",
                this.records[0].getTelephone(),
                testResult.getTelephone());
        assertEquals(
                "expect equals product ", this.records[0].getProduct(), testResult.getProduct());
        assertEquals("expect equals model ", this.records[0].getModel(), testResult.getModel());
        org.junit.Assert.assertEquals(
                "expect equals quantity ", this.records[0].getQuantity(), testResult.getQuantity());
        org.junit.Assert.assertEquals(
                "expect equals opened ", this.records[0].getOpened(), testResult.getOpened());
        org.junit.Assert.assertEquals(
                "expect equals returnReasonId ",
                this.records[0].getReturnReasonId(),
                testResult.getReturnReasonId());
        org.junit.Assert.assertEquals(
                "expect equals returnActionId ",
                this.records[0].getReturnActionId(),
                testResult.getReturnActionId());
        org.junit.Assert.assertEquals(
                "expect equals returnStatusId ",
                this.records[0].getReturnStatusId(),
                testResult.getReturnStatusId());
        assertEquals(
                "expect equals comment ", this.records[0].getComment(), testResult.getComment());

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