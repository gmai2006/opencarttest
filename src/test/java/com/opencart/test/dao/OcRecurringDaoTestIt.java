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
import com.opencart.test.entity.OcRecurring;
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

public class OcRecurringDaoTestIt {
    static final String inputFile = "OcRecurring.json";
    static OcRecurringDao dao;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private OcRecurring[] records;

    /** Run when the class is loaded. */
    @BeforeClass
    public static void beforeClass() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
        JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
        dao = new DefaultOcRecurringDao(jpa);
    }

    /** Run before the test. */
    @Before
    public void before() {
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, OcRecurring[].class);
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
        OcRecurring testResult = dao.find(records[1].getRecurringId());
        assertNotNull("expect result", testResult);
        org.junit.Assert.assertEquals(
                "expect equals price ", this.records[1].getPrice(), testResult.getPrice());
        org.junit.Assert.assertEquals(
                "expect equals frequency ",
                this.records[1].getFrequency(),
                testResult.getFrequency());
        org.junit.Assert.assertTrue(
                "expect equals duration ",
                this.records[1].getDuration() == testResult.getDuration());
        org.junit.Assert.assertTrue(
                "expect equals cycle ", this.records[1].getCycle() == testResult.getCycle());
        org.junit.Assert.assertTrue(
                "expect equals trialStatus ",
                this.records[1].getTrialStatus() == testResult.getTrialStatus());
        org.junit.Assert.assertEquals(
                "expect equals trialPrice ",
                this.records[1].getTrialPrice(),
                testResult.getTrialPrice());
        org.junit.Assert.assertEquals(
                "expect equals trialFrequency ",
                this.records[1].getTrialFrequency(),
                testResult.getTrialFrequency());
        org.junit.Assert.assertTrue(
                "expect equals trialDuration ",
                this.records[1].getTrialDuration() == testResult.getTrialDuration());
        org.junit.Assert.assertTrue(
                "expect equals trialCycle ",
                this.records[1].getTrialCycle() == testResult.getTrialCycle());
        org.junit.Assert.assertTrue(
                "expect equals status ", this.records[1].getStatus() == testResult.getStatus());
        org.junit.Assert.assertTrue(
                "expect equals sortOrder ",
                this.records[1].getSortOrder() == testResult.getSortOrder());
    }
}
