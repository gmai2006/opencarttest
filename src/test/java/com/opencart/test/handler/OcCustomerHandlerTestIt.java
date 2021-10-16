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
import com.opencart.test.entity.OcCustomer;
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

public class OcCustomerHandlerTestIt {
    static final String inputFile = "OcCustomer.json";
    static OcCustomerHandler handler;
    private static JpaDao jpa;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private OcCustomer[] records;

    /** Run before the test. */
    @BeforeClass
    public static void before() {
        final EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("testpersistence");
        jpa = new StandaloneJpaDao(factory.createEntityManager());
        handler = new OcCustomerHandler(jpa);
    }

    @Test
    public void testSelect() throws IOException {
        final File tempFile =
                createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
        final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
        int count = handler.process(inputStream);
        String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        records = gson.fromJson(json, OcCustomer[].class);
        assertEquals("match count", count, records.length);
        OcCustomer testResult = jpa.find(OcCustomer.class, records[0].getCustomerId());
        org.junit.Assert.assertEquals(
                "expect equals customerGroupId ",
                this.records[0].getCustomerGroupId(),
                testResult.getCustomerGroupId());
        org.junit.Assert.assertEquals(
                "expect equals storeId ", this.records[0].getStoreId(), testResult.getStoreId());
        org.junit.Assert.assertEquals(
                "expect equals languageId ",
                this.records[0].getLanguageId(),
                testResult.getLanguageId());
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
        assertEquals("expect equals fax ", this.records[0].getFax(), testResult.getFax());
        assertEquals(
                "expect equals password ", this.records[0].getPassword(), testResult.getPassword());
        assertEquals("expect equals salt ", this.records[0].getSalt(), testResult.getSalt());
        assertEquals("expect equals cart ", this.records[0].getCart(), testResult.getCart());
        assertEquals(
                "expect equals wishlist ", this.records[0].getWishlist(), testResult.getWishlist());
        org.junit.Assert.assertEquals(
                "expect equals newsletter ",
                this.records[0].getNewsletter(),
                testResult.getNewsletter());
        org.junit.Assert.assertEquals(
                "expect equals addressId ",
                this.records[0].getAddressId(),
                testResult.getAddressId());
        assertEquals(
                "expect equals customField ",
                this.records[0].getCustomField(),
                testResult.getCustomField());
        assertEquals("expect equals ip ", this.records[0].getIp(), testResult.getIp());
        org.junit.Assert.assertEquals(
                "expect equals status ", this.records[0].getStatus(), testResult.getStatus());
        org.junit.Assert.assertEquals(
                "expect equals approved ", this.records[0].getApproved(), testResult.getApproved());
        org.junit.Assert.assertEquals(
                "expect equals safe ", this.records[0].getSafe(), testResult.getSafe());
        assertEquals("expect equals token ", this.records[0].getToken(), testResult.getToken());
        assertEquals("expect equals code ", this.records[0].getCode(), testResult.getCode());

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
