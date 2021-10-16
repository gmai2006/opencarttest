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
import com.opencart.test.entity.OcProduct;
import com.opencart.test.utils.ByteArrayToBase64TypeAdapter;
import com.opencart.test.utils.FileUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import org.junit.BeforeClass;
import org.junit.Test;

public class OcProductServiceTest {
    private static DefaultOcProductService serviceMock;
    private static OcProduct[] records;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /** Run when the class is loaded. */
    @BeforeClass
    public static void setUp() {
        serviceMock = mock(DefaultOcProductService.class);
        String inputFile = "OcProduct.json";
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, OcProduct[].class);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // test data
        when(serviceMock.find(records[0].getProductId())).thenReturn(records[0]);
    }

    @Test
    public void testFind_success() {
        OcProduct testResult = serviceMock.find(records[0].getProductId());

        org.junit.Assert.assertNotNull(testResult);
        org.junit.Assert.assertEquals(
                "expect equals model ", records[0].getModel(), testResult.getModel());
        org.junit.Assert.assertEquals(
                "expect equals sku ", records[0].getSku(), testResult.getSku());
        org.junit.Assert.assertEquals(
                "expect equals upc ", records[0].getUpc(), testResult.getUpc());
        org.junit.Assert.assertEquals(
                "expect equals ean ", records[0].getEan(), testResult.getEan());
        org.junit.Assert.assertEquals(
                "expect equals jan ", records[0].getJan(), testResult.getJan());
        org.junit.Assert.assertEquals(
                "expect equals isbn ", records[0].getIsbn(), testResult.getIsbn());
        org.junit.Assert.assertEquals(
                "expect equals mpn ", records[0].getMpn(), testResult.getMpn());
        org.junit.Assert.assertEquals(
                "expect equals location ", records[0].getLocation(), testResult.getLocation());
        org.junit.Assert.assertTrue(
                "expect equals quantity ", records[0].getQuantity() == testResult.getQuantity());
        org.junit.Assert.assertTrue(
                "expect equals stockStatusId ",
                records[0].getStockStatusId() == testResult.getStockStatusId());
        org.junit.Assert.assertEquals(
                "expect equals image ", records[0].getImage(), testResult.getImage());
        org.junit.Assert.assertTrue(
                "expect equals manufacturerId ",
                records[0].getManufacturerId() == testResult.getManufacturerId());
        org.junit.Assert.assertTrue(
                "expect equals shipping ", records[0].getShipping() == testResult.getShipping());
        org.junit.Assert.assertEquals(
                "expect equals price ", records[0].getPrice(), testResult.getPrice());
        org.junit.Assert.assertTrue(
                "expect equals points ", records[0].getPoints() == testResult.getPoints());
        org.junit.Assert.assertTrue(
                "expect equals taxClassId ",
                records[0].getTaxClassId() == testResult.getTaxClassId());
        org.junit.Assert.assertEquals(
                "expect equals weight ", records[0].getWeight(), testResult.getWeight());
        org.junit.Assert.assertTrue(
                "expect equals weightClassId ",
                records[0].getWeightClassId() == testResult.getWeightClassId());
        org.junit.Assert.assertEquals(
                "expect equals length ", records[0].getLength(), testResult.getLength());
        org.junit.Assert.assertEquals(
                "expect equals width ", records[0].getWidth(), testResult.getWidth());
        org.junit.Assert.assertEquals(
                "expect equals height ", records[0].getHeight(), testResult.getHeight());
        org.junit.Assert.assertTrue(
                "expect equals lengthClassId ",
                records[0].getLengthClassId() == testResult.getLengthClassId());
        org.junit.Assert.assertTrue(
                "expect equals subtract ", records[0].getSubtract() == testResult.getSubtract());
        org.junit.Assert.assertTrue(
                "expect equals minimum ", records[0].getMinimum() == testResult.getMinimum());
        org.junit.Assert.assertTrue(
                "expect equals sortOrder ", records[0].getSortOrder() == testResult.getSortOrder());
        org.junit.Assert.assertTrue(
                "expect equals status ", records[0].getStatus() == testResult.getStatus());
        org.junit.Assert.assertTrue(
                "expect equals viewed ", records[0].getViewed() == testResult.getViewed());
    }
}
