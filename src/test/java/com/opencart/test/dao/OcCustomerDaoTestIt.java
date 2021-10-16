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
import com.opencart.test.entity.OcCustomer;
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

public class OcCustomerDaoTestIt {
    static final String inputFile = "OcCustomer.json";
    static OcCustomerDao dao;
    static Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();
    private OcCustomer[] records;

    /** Run when the class is loaded. */
    @BeforeClass
    public static void beforeClass() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("testpersistence");
        JpaDao jpa = new StandaloneJpaDao(factory.createEntityManager());
        dao = new DefaultOcCustomerDao(jpa);
    }

    /** Run before the test. */
    @Before
    public void before() {
        try {
            String json =
                    FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
            records = gson.fromJson(json, OcCustomer[].class);
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
        OcCustomer testResult = dao.find(records[1].getCustomerId());
        assertNotNull("expect result", testResult);
        org.junit.Assert.assertTrue(
                "expect equals customerGroupId ",
                this.records[1].getCustomerGroupId() == testResult.getCustomerGroupId());
        org.junit.Assert.assertTrue(
                "expect equals storeId ", this.records[1].getStoreId() == testResult.getStoreId());
        org.junit.Assert.assertTrue(
                "expect equals languageId ",
                this.records[1].getLanguageId() == testResult.getLanguageId());
        org.junit.Assert.assertEquals(
                "expect equals firstname ",
                this.records[1].getFirstname(),
                testResult.getFirstname());
        org.junit.Assert.assertEquals(
                "expect equals lastname ", this.records[1].getLastname(), testResult.getLastname());
        org.junit.Assert.assertEquals(
                "expect equals email ", this.records[1].getEmail(), testResult.getEmail());
        org.junit.Assert.assertEquals(
                "expect equals telephone ",
                this.records[1].getTelephone(),
                testResult.getTelephone());
        org.junit.Assert.assertEquals(
                "expect equals fax ", this.records[1].getFax(), testResult.getFax());
        org.junit.Assert.assertEquals(
                "expect equals password ", this.records[1].getPassword(), testResult.getPassword());
        org.junit.Assert.assertEquals(
                "expect equals salt ", this.records[1].getSalt(), testResult.getSalt());
        org.junit.Assert.assertEquals(
                "expect equals cart ", this.records[1].getCart(), testResult.getCart());
        org.junit.Assert.assertEquals(
                "expect equals wishlist ", this.records[1].getWishlist(), testResult.getWishlist());
        org.junit.Assert.assertTrue(
                "expect equals newsletter ",
                this.records[1].getNewsletter() == testResult.getNewsletter());
        org.junit.Assert.assertTrue(
                "expect equals addressId ",
                this.records[1].getAddressId() == testResult.getAddressId());
        org.junit.Assert.assertEquals(
                "expect equals customField ",
                this.records[1].getCustomField(),
                testResult.getCustomField());
        org.junit.Assert.assertEquals(
                "expect equals ip ", this.records[1].getIp(), testResult.getIp());
        org.junit.Assert.assertTrue(
                "expect equals status ", this.records[1].getStatus() == testResult.getStatus());
        org.junit.Assert.assertTrue(
                "expect equals approved ",
                this.records[1].getApproved() == testResult.getApproved());
        org.junit.Assert.assertTrue(
                "expect equals safe ", this.records[1].getSafe() == testResult.getSafe());
        org.junit.Assert.assertEquals(
                "expect equals token ", this.records[1].getToken(), testResult.getToken());
        org.junit.Assert.assertEquals(
                "expect equals code ", this.records[1].getCode(), testResult.getCode());
    }
}