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
package com.opencart.test.dao;

import static org.junit.Assert.assertNotNull;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opencart.test.entity.OcProduct;
import com.opencart.test.utils.ByteArrayToBase64TypeAdapter;
import com.opencart.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OcProductDaoTestIt {
    static final String inputFile = "OcProduct.json";
    static OcProductDao dao;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private OcProduct[] records;

    /** Run when the class is loaded. */
    @BeforeClass
    public static void beforeClass() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
        JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
        dao = new DefaultOcProductDao(jpa);
    }

    /** Run before the test. */
    @Before
    public void before() {
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, OcProduct[].class);
            json = null;
            Arrays.stream(records).skip(1).forEach(o -> dao.create(o));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @After
    public void after() {
        records = null;
    }

    @Test
    public void testSelect() {
        OcProduct testResult = dao.find(records[1].getProductId());
        assertNotNull("expect result", testResult);
        org.junit.Assert.assertEquals(
                "expect equals model ", this.records[1].getModel(), testResult.getModel());
        org.junit.Assert.assertEquals(
                "expect equals sku ", this.records[1].getSku(), testResult.getSku());
        org.junit.Assert.assertEquals(
                "expect equals upc ", this.records[1].getUpc(), testResult.getUpc());
        org.junit.Assert.assertEquals(
                "expect equals ean ", this.records[1].getEan(), testResult.getEan());
        org.junit.Assert.assertEquals(
                "expect equals jan ", this.records[1].getJan(), testResult.getJan());
        org.junit.Assert.assertEquals(
                "expect equals isbn ", this.records[1].getIsbn(), testResult.getIsbn());
        org.junit.Assert.assertEquals(
                "expect equals mpn ", this.records[1].getMpn(), testResult.getMpn());
        org.junit.Assert.assertEquals(
                "expect equals location ", this.records[1].getLocation(), testResult.getLocation());
        org.junit.Assert.assertTrue(
                "expect equals quantity ",
                this.records[1].getQuantity() == testResult.getQuantity());
        org.junit.Assert.assertTrue(
                "expect equals stockStatusId ",
                this.records[1].getStockStatusId() == testResult.getStockStatusId());
        org.junit.Assert.assertEquals(
                "expect equals image ", this.records[1].getImage(), testResult.getImage());
        org.junit.Assert.assertTrue(
                "expect equals manufacturerId ",
                this.records[1].getManufacturerId() == testResult.getManufacturerId());
        org.junit.Assert.assertTrue(
                "expect equals shipping ",
                this.records[1].getShipping() == testResult.getShipping());
        org.junit.Assert.assertEquals(
                "expect equals price ", this.records[1].getPrice(), testResult.getPrice());
        org.junit.Assert.assertTrue(
                "expect equals points ", this.records[1].getPoints() == testResult.getPoints());
        org.junit.Assert.assertTrue(
                "expect equals taxClassId ",
                this.records[1].getTaxClassId() == testResult.getTaxClassId());
        org.junit.Assert.assertEquals(
                "expect equals weight ", this.records[1].getWeight(), testResult.getWeight());
        org.junit.Assert.assertTrue(
                "expect equals weightClassId ",
                this.records[1].getWeightClassId() == testResult.getWeightClassId());
        org.junit.Assert.assertEquals(
                "expect equals length ", this.records[1].getLength(), testResult.getLength());
        org.junit.Assert.assertEquals(
                "expect equals width ", this.records[1].getWidth(), testResult.getWidth());
        org.junit.Assert.assertEquals(
                "expect equals height ", this.records[1].getHeight(), testResult.getHeight());
        org.junit.Assert.assertTrue(
                "expect equals lengthClassId ",
                this.records[1].getLengthClassId() == testResult.getLengthClassId());
        org.junit.Assert.assertTrue(
                "expect equals subtract ",
                this.records[1].getSubtract() == testResult.getSubtract());
        org.junit.Assert.assertTrue(
                "expect equals minimum ", this.records[1].getMinimum() == testResult.getMinimum());
        org.junit.Assert.assertTrue(
                "expect equals sortOrder ",
                this.records[1].getSortOrder() == testResult.getSortOrder());
        org.junit.Assert.assertTrue(
                "expect equals status ", this.records[1].getStatus() == testResult.getStatus());
        org.junit.Assert.assertTrue(
                "expect equals viewed ", this.records[1].getViewed() == testResult.getViewed());
    }
}
