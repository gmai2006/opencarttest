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
import com.opencart.test.entity.OcWeightClass;
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

public class OcWeightClassDaoTestIt {
    static final String inputFile = "OcWeightClass.json";
    static OcWeightClassDao dao;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private OcWeightClass[] records;

    /** Run when the class is loaded. */
    @BeforeClass
    public static void beforeClass() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
        JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
        dao = new DefaultOcWeightClassDao(jpa);
    }

    /** Run before the test. */
    @Before
    public void before() {
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, OcWeightClass[].class);
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
        OcWeightClass testResult = dao.find(records[1].getWeightClassId());
        assertNotNull("expect result", testResult);
        org.junit.Assert.assertEquals(
                "expect equals value ", this.records[1].getValue(), testResult.getValue());
    }
}
