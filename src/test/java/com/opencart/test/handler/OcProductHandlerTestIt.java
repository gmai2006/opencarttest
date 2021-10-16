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
import com.opencart.test.entity.OcProduct;
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

public class OcProductHandlerTestIt {
    static final String inputFile = "OcProduct.json";
    static OcProductHandler handler;
    private static JpaDao jpa;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private OcProduct[] records;

    /** Run before the test. */
    @BeforeClass
    public static void before() {
        final EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("testpersistence");
        jpa = new StandaloneJpaDao(factory.createEntityManager());
        handler = new OcProductHandler(jpa);
    }

    @Test
    public void testSelect() throws IOException {
        final File tempFile =
                createRecordInputStreamFromJsonFile(inputFile, Charset.defaultCharset());
        final InputStream inputStream = new BufferedInputStream(new FileInputStream(tempFile));
        int count = handler.process(inputStream);
        String json = FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        records = gson.fromJson(json, OcProduct[].class);
        assertEquals("match count", count, records.length);
        OcProduct testResult = jpa.find(OcProduct.class, records[0].getProductId());
        assertEquals("expect equals model ", this.records[0].getModel(), testResult.getModel());
        assertEquals("expect equals sku ", this.records[0].getSku(), testResult.getSku());
        assertEquals("expect equals upc ", this.records[0].getUpc(), testResult.getUpc());
        assertEquals("expect equals ean ", this.records[0].getEan(), testResult.getEan());
        assertEquals("expect equals jan ", this.records[0].getJan(), testResult.getJan());
        assertEquals("expect equals isbn ", this.records[0].getIsbn(), testResult.getIsbn());
        assertEquals("expect equals mpn ", this.records[0].getMpn(), testResult.getMpn());
        assertEquals(
                "expect equals location ", this.records[0].getLocation(), testResult.getLocation());
        org.junit.Assert.assertEquals(
                "expect equals quantity ", this.records[0].getQuantity(), testResult.getQuantity());
        org.junit.Assert.assertEquals(
                "expect equals stockStatusId ",
                this.records[0].getStockStatusId(),
                testResult.getStockStatusId());
        assertEquals("expect equals image ", this.records[0].getImage(), testResult.getImage());
        org.junit.Assert.assertEquals(
                "expect equals manufacturerId ",
                this.records[0].getManufacturerId(),
                testResult.getManufacturerId());
        org.junit.Assert.assertEquals(
                "expect equals shipping ", this.records[0].getShipping(), testResult.getShipping());
        assertEquals("expect equals price ", this.records[0].getPrice(), testResult.getPrice());
        org.junit.Assert.assertEquals(
                "expect equals points ", this.records[0].getPoints(), testResult.getPoints());
        org.junit.Assert.assertEquals(
                "expect equals taxClassId ",
                this.records[0].getTaxClassId(),
                testResult.getTaxClassId());
        assertEquals("expect equals weight ", this.records[0].getWeight(), testResult.getWeight());
        org.junit.Assert.assertEquals(
                "expect equals weightClassId ",
                this.records[0].getWeightClassId(),
                testResult.getWeightClassId());
        assertEquals("expect equals length ", this.records[0].getLength(), testResult.getLength());
        assertEquals("expect equals width ", this.records[0].getWidth(), testResult.getWidth());
        assertEquals("expect equals height ", this.records[0].getHeight(), testResult.getHeight());
        org.junit.Assert.assertEquals(
                "expect equals lengthClassId ",
                this.records[0].getLengthClassId(),
                testResult.getLengthClassId());
        org.junit.Assert.assertEquals(
                "expect equals subtract ", this.records[0].getSubtract(), testResult.getSubtract());
        org.junit.Assert.assertEquals(
                "expect equals minimum ", this.records[0].getMinimum(), testResult.getMinimum());
        org.junit.Assert.assertEquals(
                "expect equals sortOrder ",
                this.records[0].getSortOrder(),
                testResult.getSortOrder());
        org.junit.Assert.assertEquals(
                "expect equals status ", this.records[0].getStatus(), testResult.getStatus());
        org.junit.Assert.assertEquals(
                "expect equals viewed ", this.records[0].getViewed(), testResult.getViewed());

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
