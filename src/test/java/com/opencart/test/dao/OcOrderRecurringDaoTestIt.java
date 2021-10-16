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
import com.opencart.test.entity.OcOrderRecurring;
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

public class OcOrderRecurringDaoTestIt {
    static final String inputFile = "OcOrderRecurring.json";
    static OcOrderRecurringDao dao;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private OcOrderRecurring[] records;

    /** Run when the class is loaded. */
    @BeforeClass
    public static void beforeClass() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
        JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
        dao = new DefaultOcOrderRecurringDao(jpa);
    }

    /** Run before the test. */
    @Before
    public void before() {
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, OcOrderRecurring[].class);
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
        OcOrderRecurring testResult = dao.find(records[1].getOrderRecurringId());
        assertNotNull("expect result", testResult);
        org.junit.Assert.assertTrue(
                "expect equals orderId ", this.records[1].getOrderId() == testResult.getOrderId());
        org.junit.Assert.assertEquals(
                "expect equals reference ",
                this.records[1].getReference(),
                testResult.getReference());
        org.junit.Assert.assertTrue(
                "expect equals productId ",
                this.records[1].getProductId() == testResult.getProductId());
        org.junit.Assert.assertEquals(
                "expect equals productName ",
                this.records[1].getProductName(),
                testResult.getProductName());
        org.junit.Assert.assertTrue(
                "expect equals productQuantity ",
                this.records[1].getProductQuantity() == testResult.getProductQuantity());
        org.junit.Assert.assertTrue(
                "expect equals recurringId ",
                this.records[1].getRecurringId() == testResult.getRecurringId());
        org.junit.Assert.assertEquals(
                "expect equals recurringName ",
                this.records[1].getRecurringName(),
                testResult.getRecurringName());
        org.junit.Assert.assertEquals(
                "expect equals recurringDescription ",
                this.records[1].getRecurringDescription(),
                testResult.getRecurringDescription());
        org.junit.Assert.assertEquals(
                "expect equals recurringFrequency ",
                this.records[1].getRecurringFrequency(),
                testResult.getRecurringFrequency());
        org.junit.Assert.assertTrue(
                "expect equals recurringCycle ",
                this.records[1].getRecurringCycle() == testResult.getRecurringCycle());
        org.junit.Assert.assertTrue(
                "expect equals recurringDuration ",
                this.records[1].getRecurringDuration() == testResult.getRecurringDuration());
        org.junit.Assert.assertEquals(
                "expect equals recurringPrice ",
                this.records[1].getRecurringPrice(),
                testResult.getRecurringPrice());
        org.junit.Assert.assertTrue(
                "expect equals trial ", this.records[1].getTrial() == testResult.getTrial());
        org.junit.Assert.assertEquals(
                "expect equals trialFrequency ",
                this.records[1].getTrialFrequency(),
                testResult.getTrialFrequency());
        org.junit.Assert.assertTrue(
                "expect equals trialCycle ",
                this.records[1].getTrialCycle() == testResult.getTrialCycle());
        org.junit.Assert.assertTrue(
                "expect equals trialDuration ",
                this.records[1].getTrialDuration() == testResult.getTrialDuration());
        org.junit.Assert.assertEquals(
                "expect equals trialPrice ",
                this.records[1].getTrialPrice(),
                testResult.getTrialPrice());
        org.junit.Assert.assertTrue(
                "expect equals status ", this.records[1].getStatus() == testResult.getStatus());
    }
}
