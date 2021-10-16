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
import com.opencart.test.entity.OcAffiliate;
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

public class OcAffiliateHandlerTestIt {
    static final String inputFile = "OcAffiliate.json";
    static OcAffiliateHandler handler;
    private static JpaDao jpa;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private OcAffiliate[] records;

    /** Run before the test. */
    @BeforeClass
    public static void before() {
        final EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("testpersistence");
        jpa = new StandaloneJpaDao(factory.createEntityManager());
        handler = new OcAffiliateHandler(jpa);
    }

    @Test
    public void testSelect() throws IOException {
        final File tempFile =
                createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
        final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
        int count = handler.process(inputStream);
        String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        records = gson.fromJson(json, OcAffiliate[].class);
        assertEquals("match count", count, records.length);
        OcAffiliate testResult = jpa.find(OcAffiliate.class, records[0].getAffiliateId());
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
        assertEquals(
                "expect equals company ", this.records[0].getCompany(), testResult.getCompany());
        assertEquals(
                "expect equals website ", this.records[0].getWebsite(), testResult.getWebsite());
        assertEquals(
                "expect equals address1 ", this.records[0].getAddress1(), testResult.getAddress1());
        assertEquals(
                "expect equals address2 ", this.records[0].getAddress2(), testResult.getAddress2());
        assertEquals("expect equals city ", this.records[0].getCity(), testResult.getCity());
        assertEquals(
                "expect equals postcode ", this.records[0].getPostcode(), testResult.getPostcode());
        org.junit.Assert.assertEquals(
                "expect equals countryId ",
                this.records[0].getCountryId(),
                testResult.getCountryId());
        org.junit.Assert.assertEquals(
                "expect equals zoneId ", this.records[0].getZoneId(), testResult.getZoneId());
        assertEquals("expect equals code ", this.records[0].getCode(), testResult.getCode());
        assertEquals(
                "expect equals commission ",
                this.records[0].getCommission(),
                testResult.getCommission());
        assertEquals("expect equals tax ", this.records[0].getTax(), testResult.getTax());
        assertEquals(
                "expect equals payment ", this.records[0].getPayment(), testResult.getPayment());
        assertEquals("expect equals cheque ", this.records[0].getCheque(), testResult.getCheque());
        assertEquals("expect equals paypal ", this.records[0].getPaypal(), testResult.getPaypal());
        assertEquals(
                "expect equals bankName ", this.records[0].getBankName(), testResult.getBankName());
        assertEquals(
                "expect equals bankBranchNumber ",
                this.records[0].getBankBranchNumber(),
                testResult.getBankBranchNumber());
        assertEquals(
                "expect equals bankSwiftCode ",
                this.records[0].getBankSwiftCode(),
                testResult.getBankSwiftCode());
        assertEquals(
                "expect equals bankAccountName ",
                this.records[0].getBankAccountName(),
                testResult.getBankAccountName());
        assertEquals(
                "expect equals bankAccountNumber ",
                this.records[0].getBankAccountNumber(),
                testResult.getBankAccountNumber());
        assertEquals("expect equals ip ", this.records[0].getIp(), testResult.getIp());
        org.junit.Assert.assertEquals(
                "expect equals status ", this.records[0].getStatus(), testResult.getStatus());
        org.junit.Assert.assertEquals(
                "expect equals approved ", this.records[0].getApproved(), testResult.getApproved());

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
