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
package com.opencart.test.utils;

import static org.junit.Assert.assertEquals;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.opencart.test.entity.*;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class JsonParserTest {
    @Test
    public void testParsingOcAddress() throws IOException {
        final String inputFile = "OcAddress.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcAddress> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcAddress(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals addressId ",
                    o.get("addressId").getAsInt(),
                    result.get(i).getAddressId(),
                    0.0001);
            assertEquals(
                    "expect equals customerId ",
                    o.get("customerId").getAsInt(),
                    result.get(i).getCustomerId(),
                    0.0001);
            assertEquals(
                    "expect equals firstname ",
                    o.get("firstname").getAsString(),
                    result.get(i).getFirstname());
            assertEquals(
                    "expect equals lastname ",
                    o.get("lastname").getAsString(),
                    result.get(i).getLastname());
            assertEquals(
                    "expect equals company ",
                    o.get("company").getAsString(),
                    result.get(i).getCompany());
            assertEquals(
                    "expect equals address1 ",
                    o.get("address1").getAsString(),
                    result.get(i).getAddress1());
            assertEquals(
                    "expect equals address2 ",
                    o.get("address2").getAsString(),
                    result.get(i).getAddress2());
            assertEquals(
                    "expect equals city ", o.get("city").getAsString(), result.get(i).getCity());
            assertEquals(
                    "expect equals postcode ",
                    o.get("postcode").getAsString(),
                    result.get(i).getPostcode());
            assertEquals(
                    "expect equals countryId ",
                    o.get("countryId").getAsInt(),
                    result.get(i).getCountryId(),
                    0.0001);
            assertEquals(
                    "expect equals zoneId ",
                    o.get("zoneId").getAsInt(),
                    result.get(i).getZoneId(),
                    0.0001);
            assertEquals(
                    "expect equals customField ",
                    o.get("customField").getAsString(),
                    result.get(i).getCustomField());
        }

        result.clear();
    }

    @Test
    public void testParsingOcAffiliate() throws IOException {
        final String inputFile = "OcAffiliate.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcAffiliate> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcAffiliate(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals affiliateId ",
                    o.get("affiliateId").getAsInt(),
                    result.get(i).getAffiliateId(),
                    0.0001);
            assertEquals(
                    "expect equals firstname ",
                    o.get("firstname").getAsString(),
                    result.get(i).getFirstname());
            assertEquals(
                    "expect equals lastname ",
                    o.get("lastname").getAsString(),
                    result.get(i).getLastname());
            assertEquals(
                    "expect equals email ", o.get("email").getAsString(), result.get(i).getEmail());
            assertEquals(
                    "expect equals telephone ",
                    o.get("telephone").getAsString(),
                    result.get(i).getTelephone());
            assertEquals("expect equals fax ", o.get("fax").getAsString(), result.get(i).getFax());
            assertEquals(
                    "expect equals password ",
                    o.get("password").getAsString(),
                    result.get(i).getPassword());
            assertEquals(
                    "expect equals salt ", o.get("salt").getAsString(), result.get(i).getSalt());
            assertEquals(
                    "expect equals company ",
                    o.get("company").getAsString(),
                    result.get(i).getCompany());
            assertEquals(
                    "expect equals website ",
                    o.get("website").getAsString(),
                    result.get(i).getWebsite());
            assertEquals(
                    "expect equals address1 ",
                    o.get("address1").getAsString(),
                    result.get(i).getAddress1());
            assertEquals(
                    "expect equals address2 ",
                    o.get("address2").getAsString(),
                    result.get(i).getAddress2());
            assertEquals(
                    "expect equals city ", o.get("city").getAsString(), result.get(i).getCity());
            assertEquals(
                    "expect equals postcode ",
                    o.get("postcode").getAsString(),
                    result.get(i).getPostcode());
            assertEquals(
                    "expect equals countryId ",
                    o.get("countryId").getAsInt(),
                    result.get(i).getCountryId(),
                    0.0001);
            assertEquals(
                    "expect equals zoneId ",
                    o.get("zoneId").getAsInt(),
                    result.get(i).getZoneId(),
                    0.0001);
            assertEquals(
                    "expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
            assertEquals(
                    "expect equals commission ",
                    o.get("commission").getAsBigDecimal(),
                    result.get(i).getCommission());
            assertEquals("expect equals tax ", o.get("tax").getAsString(), result.get(i).getTax());
            assertEquals(
                    "expect equals payment ",
                    o.get("payment").getAsString(),
                    result.get(i).getPayment());
            assertEquals(
                    "expect equals cheque ",
                    o.get("cheque").getAsString(),
                    result.get(i).getCheque());
            assertEquals(
                    "expect equals paypal ",
                    o.get("paypal").getAsString(),
                    result.get(i).getPaypal());
            assertEquals(
                    "expect equals bankName ",
                    o.get("bankName").getAsString(),
                    result.get(i).getBankName());
            assertEquals(
                    "expect equals bankBranchNumber ",
                    o.get("bankBranchNumber").getAsString(),
                    result.get(i).getBankBranchNumber());
            assertEquals(
                    "expect equals bankSwiftCode ",
                    o.get("bankSwiftCode").getAsString(),
                    result.get(i).getBankSwiftCode());
            assertEquals(
                    "expect equals bankAccountName ",
                    o.get("bankAccountName").getAsString(),
                    result.get(i).getBankAccountName());
            assertEquals(
                    "expect equals bankAccountNumber ",
                    o.get("bankAccountNumber").getAsString(),
                    result.get(i).getBankAccountNumber());
            assertEquals("expect equals ip ", o.get("ip").getAsString(), result.get(i).getIp());
            assertEquals(
                    "expect equals status ",
                    o.get("status").getAsBoolean(),
                    result.get(i).getStatus());
            assertEquals(
                    "expect equals approved ",
                    o.get("approved").getAsBoolean(),
                    result.get(i).getApproved());
        }

        result.clear();
    }

    @Test
    public void testParsingOcAffiliateActivity() throws IOException {
        final String inputFile = "OcAffiliateActivity.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcAffiliateActivity> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcAffiliateActivity(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals affiliateActivityId ",
                    o.get("affiliateActivityId").getAsInt(),
                    result.get(i).getAffiliateActivityId(),
                    0.0001);
            assertEquals(
                    "expect equals affiliateId ",
                    o.get("affiliateId").getAsInt(),
                    result.get(i).getAffiliateId(),
                    0.0001);
            assertEquals("expect equals key ", o.get("key").getAsString(), result.get(i).getKey());
            assertEquals(
                    "expect equals data ", o.get("data").getAsString(), result.get(i).getData());
            assertEquals("expect equals ip ", o.get("ip").getAsString(), result.get(i).getIp());
        }

        result.clear();
    }

    @Test
    public void testParsingOcAffiliateLogin() throws IOException {
        final String inputFile = "OcAffiliateLogin.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcAffiliateLogin> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcAffiliateLogin(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals affiliateLoginId ",
                    o.get("affiliateLoginId").getAsInt(),
                    result.get(i).getAffiliateLoginId(),
                    0.0001);
            assertEquals(
                    "expect equals email ", o.get("email").getAsString(), result.get(i).getEmail());
            assertEquals("expect equals ip ", o.get("ip").getAsString(), result.get(i).getIp());
            assertEquals(
                    "expect equals total ",
                    o.get("total").getAsInt(),
                    result.get(i).getTotal(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcAffiliateTransaction() throws IOException {
        final String inputFile = "OcAffiliateTransaction.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcAffiliateTransaction> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcAffiliateTransaction(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals affiliateTransactionId ",
                    o.get("affiliateTransactionId").getAsInt(),
                    result.get(i).getAffiliateTransactionId(),
                    0.0001);
            assertEquals(
                    "expect equals affiliateId ",
                    o.get("affiliateId").getAsInt(),
                    result.get(i).getAffiliateId(),
                    0.0001);
            assertEquals(
                    "expect equals orderId ",
                    o.get("orderId").getAsInt(),
                    result.get(i).getOrderId(),
                    0.0001);
            assertEquals(
                    "expect equals description ",
                    o.get("description").getAsString(),
                    result.get(i).getDescription());
            assertEquals(
                    "expect equals amount ",
                    o.get("amount").getAsBigDecimal(),
                    result.get(i).getAmount());
        }

        result.clear();
    }

    @Test
    public void testParsingOcApi() throws IOException {
        final String inputFile = "OcApi.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcApi> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcApi(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals apiId ",
                    o.get("apiId").getAsInt(),
                    result.get(i).getApiId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
            assertEquals("expect equals key ", o.get("key").getAsString(), result.get(i).getKey());
            assertEquals(
                    "expect equals status ",
                    o.get("status").getAsBoolean(),
                    result.get(i).getStatus());
        }

        result.clear();
    }

    @Test
    public void testParsingOcApiIp() throws IOException {
        final String inputFile = "OcApiIp.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcApiIp> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcApiIp(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals apiIpId ",
                    o.get("apiIpId").getAsInt(),
                    result.get(i).getApiIpId(),
                    0.0001);
            assertEquals(
                    "expect equals apiId ",
                    o.get("apiId").getAsInt(),
                    result.get(i).getApiId(),
                    0.0001);
            assertEquals("expect equals ip ", o.get("ip").getAsString(), result.get(i).getIp());
        }

        result.clear();
    }

    @Test
    public void testParsingOcApiSession() throws IOException {
        final String inputFile = "OcApiSession.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcApiSession> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcApiSession(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals apiSessionId ",
                    o.get("apiSessionId").getAsInt(),
                    result.get(i).getApiSessionId(),
                    0.0001);
            assertEquals(
                    "expect equals apiId ",
                    o.get("apiId").getAsInt(),
                    result.get(i).getApiId(),
                    0.0001);
            assertEquals(
                    "expect equals token ", o.get("token").getAsString(), result.get(i).getToken());
            assertEquals(
                    "expect equals sessionId ",
                    o.get("sessionId").getAsString(),
                    result.get(i).getSessionId());
            assertEquals(
                    "expect equals sessionName ",
                    o.get("sessionName").getAsString(),
                    result.get(i).getSessionName());
            assertEquals("expect equals ip ", o.get("ip").getAsString(), result.get(i).getIp());
        }

        result.clear();
    }

    @Test
    public void testParsingOcAttribute() throws IOException {
        final String inputFile = "OcAttribute.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcAttribute> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcAttribute(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals attributeId ",
                    o.get("attributeId").getAsInt(),
                    result.get(i).getAttributeId(),
                    0.0001);
            assertEquals(
                    "expect equals attributeGroupId ",
                    o.get("attributeGroupId").getAsInt(),
                    result.get(i).getAttributeGroupId(),
                    0.0001);
            assertEquals(
                    "expect equals sortOrder ",
                    o.get("sortOrder").getAsInt(),
                    result.get(i).getSortOrder(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcAttributeDescription() throws IOException {
        final String inputFile = "OcAttributeDescription.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcAttributeDescription> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcAttributeDescription(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals attributeId ",
                    o.get("attributeId").getAsInt(),
                    result.get(i).getAttributeId(),
                    0.0001);
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
        }

        result.clear();
    }

    @Test
    public void testParsingOcAttributeGroup() throws IOException {
        final String inputFile = "OcAttributeGroup.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcAttributeGroup> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcAttributeGroup(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals attributeGroupId ",
                    o.get("attributeGroupId").getAsInt(),
                    result.get(i).getAttributeGroupId(),
                    0.0001);
            assertEquals(
                    "expect equals sortOrder ",
                    o.get("sortOrder").getAsInt(),
                    result.get(i).getSortOrder(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcAttributeGroupDescription() throws IOException {
        final String inputFile = "OcAttributeGroupDescription.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcAttributeGroupDescription> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcAttributeGroupDescription(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals attributeGroupId ",
                    o.get("attributeGroupId").getAsInt(),
                    result.get(i).getAttributeGroupId(),
                    0.0001);
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
        }

        result.clear();
    }

    @Test
    public void testParsingOcBanner() throws IOException {
        final String inputFile = "OcBanner.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcBanner> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcBanner(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals bannerId ",
                    o.get("bannerId").getAsInt(),
                    result.get(i).getBannerId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
            assertEquals(
                    "expect equals status ",
                    o.get("status").getAsBoolean(),
                    result.get(i).getStatus());
        }

        result.clear();
    }

    @Test
    public void testParsingOcBannerImage() throws IOException {
        final String inputFile = "OcBannerImage.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcBannerImage> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcBannerImage(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals bannerImageId ",
                    o.get("bannerImageId").getAsInt(),
                    result.get(i).getBannerImageId(),
                    0.0001);
            assertEquals(
                    "expect equals bannerId ",
                    o.get("bannerId").getAsInt(),
                    result.get(i).getBannerId(),
                    0.0001);
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
            assertEquals(
                    "expect equals link ", o.get("link").getAsString(), result.get(i).getLink());
            assertEquals(
                    "expect equals image ", o.get("image").getAsString(), result.get(i).getImage());
            assertEquals(
                    "expect equals sortOrder ",
                    o.get("sortOrder").getAsInt(),
                    result.get(i).getSortOrder(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcCart() throws IOException {
        final String inputFile = "OcCart.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCart> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCart(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals cartId ",
                    o.get("cartId").getAsInt(),
                    result.get(i).getCartId(),
                    0.0001);
            assertEquals(
                    "expect equals apiId ",
                    o.get("apiId").getAsInt(),
                    result.get(i).getApiId(),
                    0.0001);
            assertEquals(
                    "expect equals customerId ",
                    o.get("customerId").getAsInt(),
                    result.get(i).getCustomerId(),
                    0.0001);
            assertEquals(
                    "expect equals sessionId ",
                    o.get("sessionId").getAsString(),
                    result.get(i).getSessionId());
            assertEquals(
                    "expect equals productId ",
                    o.get("productId").getAsInt(),
                    result.get(i).getProductId(),
                    0.0001);
            assertEquals(
                    "expect equals recurringId ",
                    o.get("recurringId").getAsInt(),
                    result.get(i).getRecurringId(),
                    0.0001);
            assertEquals(
                    "expect equals option ",
                    o.get("option").getAsString(),
                    result.get(i).getOption());
            assertEquals(
                    "expect equals quantity ",
                    o.get("quantity").getAsInt(),
                    result.get(i).getQuantity(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcCategory() throws IOException {
        final String inputFile = "OcCategory.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCategory> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCategory(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals categoryId ",
                    o.get("categoryId").getAsInt(),
                    result.get(i).getCategoryId(),
                    0.0001);
            assertEquals(
                    "expect equals image ", o.get("image").getAsString(), result.get(i).getImage());
            assertEquals(
                    "expect equals parentId ",
                    o.get("parentId").getAsInt(),
                    result.get(i).getParentId(),
                    0.0001);
            assertEquals("expect equals top ", o.get("top").getAsBoolean(), result.get(i).getTop());
            assertEquals(
                    "expect equals column ",
                    o.get("column").getAsInt(),
                    result.get(i).getColumn(),
                    0.0001);
            assertEquals(
                    "expect equals sortOrder ",
                    o.get("sortOrder").getAsInt(),
                    result.get(i).getSortOrder(),
                    0.0001);
            assertEquals(
                    "expect equals status ",
                    o.get("status").getAsBoolean(),
                    result.get(i).getStatus());
        }

        result.clear();
    }

    @Test
    public void testParsingOcCategoryDescription() throws IOException {
        final String inputFile = "OcCategoryDescription.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCategoryDescription> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCategoryDescription(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals categoryId ",
                    o.get("categoryId").getAsInt(),
                    result.get(i).getCategoryId(),
                    0.0001);
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
            assertEquals(
                    "expect equals description ",
                    o.get("description").getAsString(),
                    result.get(i).getDescription());
            assertEquals(
                    "expect equals metaTitle ",
                    o.get("metaTitle").getAsString(),
                    result.get(i).getMetaTitle());
            assertEquals(
                    "expect equals metaDescription ",
                    o.get("metaDescription").getAsString(),
                    result.get(i).getMetaDescription());
            assertEquals(
                    "expect equals metaKeyword ",
                    o.get("metaKeyword").getAsString(),
                    result.get(i).getMetaKeyword());
        }

        result.clear();
    }

    @Test
    public void testParsingOcCategoryFilter() throws IOException {
        final String inputFile = "OcCategoryFilter.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCategoryFilter> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCategoryFilter(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals categoryId ",
                    o.get("categoryId").getAsInt(),
                    result.get(i).getCategoryId(),
                    0.0001);
            assertEquals(
                    "expect equals filterId ",
                    o.get("filterId").getAsInt(),
                    result.get(i).getFilterId(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcCategoryPath() throws IOException {
        final String inputFile = "OcCategoryPath.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCategoryPath> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCategoryPath(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals categoryId ",
                    o.get("categoryId").getAsInt(),
                    result.get(i).getCategoryId(),
                    0.0001);
            assertEquals(
                    "expect equals pathId ",
                    o.get("pathId").getAsInt(),
                    result.get(i).getPathId(),
                    0.0001);
            assertEquals(
                    "expect equals level ",
                    o.get("level").getAsInt(),
                    result.get(i).getLevel(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcCategoryToLayout() throws IOException {
        final String inputFile = "OcCategoryToLayout.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCategoryToLayout> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCategoryToLayout(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals storeId ",
                    o.get("storeId").getAsInt(),
                    result.get(i).getStoreId(),
                    0.0001);
            assertEquals(
                    "expect equals categoryId ",
                    o.get("categoryId").getAsInt(),
                    result.get(i).getCategoryId(),
                    0.0001);
            assertEquals(
                    "expect equals layoutId ",
                    o.get("layoutId").getAsInt(),
                    result.get(i).getLayoutId(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcCategoryToStore() throws IOException {
        final String inputFile = "OcCategoryToStore.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCategoryToStore> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCategoryToStore(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals storeId ",
                    o.get("storeId").getAsInt(),
                    result.get(i).getStoreId(),
                    0.0001);
            assertEquals(
                    "expect equals categoryId ",
                    o.get("categoryId").getAsInt(),
                    result.get(i).getCategoryId(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcCountry() throws IOException {
        final String inputFile = "OcCountry.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCountry> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCountry(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals countryId ",
                    o.get("countryId").getAsInt(),
                    result.get(i).getCountryId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
            assertEquals(
                    "expect equals isoCode2 ",
                    o.get("isoCode2").getAsString(),
                    result.get(i).getIsoCode2());
            assertEquals(
                    "expect equals isoCode3 ",
                    o.get("isoCode3").getAsString(),
                    result.get(i).getIsoCode3());
            assertEquals(
                    "expect equals addressFormat ",
                    o.get("addressFormat").getAsString(),
                    result.get(i).getAddressFormat());
            assertEquals(
                    "expect equals postcodeRequired ",
                    o.get("postcodeRequired").getAsBoolean(),
                    result.get(i).getPostcodeRequired());
            assertEquals(
                    "expect equals status ",
                    o.get("status").getAsBoolean(),
                    result.get(i).getStatus());
        }

        result.clear();
    }

    @Test
    public void testParsingOcCoupon() throws IOException {
        final String inputFile = "OcCoupon.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCoupon> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCoupon(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals couponId ",
                    o.get("couponId").getAsInt(),
                    result.get(i).getCouponId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
            assertEquals(
                    "expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
            assertEquals(
                    "expect equals type ", o.get("type").getAsString(), result.get(i).getType());
            assertEquals(
                    "expect equals discount ",
                    o.get("discount").getAsBigDecimal(),
                    result.get(i).getDiscount());
            assertEquals(
                    "expect equals logged ",
                    o.get("logged").getAsBoolean(),
                    result.get(i).getLogged());
            assertEquals(
                    "expect equals shipping ",
                    o.get("shipping").getAsBoolean(),
                    result.get(i).getShipping());
            assertEquals(
                    "expect equals total ",
                    o.get("total").getAsBigDecimal(),
                    result.get(i).getTotal());
            assertEquals(
                    "expect equals usesTotal ",
                    o.get("usesTotal").getAsInt(),
                    result.get(i).getUsesTotal(),
                    0.0001);
            assertEquals(
                    "expect equals usesCustomer ",
                    o.get("usesCustomer").getAsString(),
                    result.get(i).getUsesCustomer());
            assertEquals(
                    "expect equals status ",
                    o.get("status").getAsBoolean(),
                    result.get(i).getStatus());
        }

        result.clear();
    }

    @Test
    public void testParsingOcCouponCategory() throws IOException {
        final String inputFile = "OcCouponCategory.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCouponCategory> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCouponCategory(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals categoryId ",
                    o.get("categoryId").getAsInt(),
                    result.get(i).getCategoryId(),
                    0.0001);
            assertEquals(
                    "expect equals couponId ",
                    o.get("couponId").getAsInt(),
                    result.get(i).getCouponId(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcCouponHistory() throws IOException {
        final String inputFile = "OcCouponHistory.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCouponHistory> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCouponHistory(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals couponHistoryId ",
                    o.get("couponHistoryId").getAsInt(),
                    result.get(i).getCouponHistoryId(),
                    0.0001);
            assertEquals(
                    "expect equals couponId ",
                    o.get("couponId").getAsInt(),
                    result.get(i).getCouponId(),
                    0.0001);
            assertEquals(
                    "expect equals orderId ",
                    o.get("orderId").getAsInt(),
                    result.get(i).getOrderId(),
                    0.0001);
            assertEquals(
                    "expect equals customerId ",
                    o.get("customerId").getAsInt(),
                    result.get(i).getCustomerId(),
                    0.0001);
            assertEquals(
                    "expect equals amount ",
                    o.get("amount").getAsBigDecimal(),
                    result.get(i).getAmount());
        }

        result.clear();
    }

    @Test
    public void testParsingOcCouponProduct() throws IOException {
        final String inputFile = "OcCouponProduct.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCouponProduct> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCouponProduct(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals couponProductId ",
                    o.get("couponProductId").getAsInt(),
                    result.get(i).getCouponProductId(),
                    0.0001);
            assertEquals(
                    "expect equals couponId ",
                    o.get("couponId").getAsInt(),
                    result.get(i).getCouponId(),
                    0.0001);
            assertEquals(
                    "expect equals productId ",
                    o.get("productId").getAsInt(),
                    result.get(i).getProductId(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcCurrency() throws IOException {
        final String inputFile = "OcCurrency.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCurrency> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCurrency(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals currencyId ",
                    o.get("currencyId").getAsInt(),
                    result.get(i).getCurrencyId(),
                    0.0001);
            assertEquals(
                    "expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
            assertEquals(
                    "expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
            assertEquals(
                    "expect equals symbolLeft ",
                    o.get("symbolLeft").getAsString(),
                    result.get(i).getSymbolLeft());
            assertEquals(
                    "expect equals symbolRight ",
                    o.get("symbolRight").getAsString(),
                    result.get(i).getSymbolRight());
            assertEquals(
                    "expect equals decimalPlace ",
                    o.get("decimalPlace").getAsString(),
                    result.get(i).getDecimalPlace());
            assertEquals(
                    "expect equals value ",
                    o.get("value").getAsFloat(),
                    result.get(i).getValue(),
                    0.001);
            assertEquals(
                    "expect equals status ",
                    o.get("status").getAsBoolean(),
                    result.get(i).getStatus());
        }

        result.clear();
    }

    @Test
    public void testParsingOcCustomField() throws IOException {
        final String inputFile = "OcCustomField.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCustomField> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCustomField(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals customFieldId ",
                    o.get("customFieldId").getAsInt(),
                    result.get(i).getCustomFieldId(),
                    0.0001);
            assertEquals(
                    "expect equals type ", o.get("type").getAsString(), result.get(i).getType());
            assertEquals(
                    "expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
            assertEquals(
                    "expect equals validation ",
                    o.get("validation").getAsString(),
                    result.get(i).getValidation());
            assertEquals(
                    "expect equals location ",
                    o.get("location").getAsString(),
                    result.get(i).getLocation());
            assertEquals(
                    "expect equals status ",
                    o.get("status").getAsBoolean(),
                    result.get(i).getStatus());
            assertEquals(
                    "expect equals sortOrder ",
                    o.get("sortOrder").getAsInt(),
                    result.get(i).getSortOrder(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcCustomFieldCustomerGroup() throws IOException {
        final String inputFile = "OcCustomFieldCustomerGroup.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCustomFieldCustomerGroup> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCustomFieldCustomerGroup(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals customFieldId ",
                    o.get("customFieldId").getAsInt(),
                    result.get(i).getCustomFieldId(),
                    0.0001);
            assertEquals(
                    "expect equals customerGroupId ",
                    o.get("customerGroupId").getAsInt(),
                    result.get(i).getCustomerGroupId(),
                    0.0001);
            assertEquals(
                    "expect equals required ",
                    o.get("required").getAsBoolean(),
                    result.get(i).getRequired());
        }

        result.clear();
    }

    @Test
    public void testParsingOcCustomFieldDescription() throws IOException {
        final String inputFile = "OcCustomFieldDescription.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCustomFieldDescription> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCustomFieldDescription(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals customFieldId ",
                    o.get("customFieldId").getAsInt(),
                    result.get(i).getCustomFieldId(),
                    0.0001);
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
        }

        result.clear();
    }

    @Test
    public void testParsingOcCustomFieldValue() throws IOException {
        final String inputFile = "OcCustomFieldValue.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCustomFieldValue> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCustomFieldValue(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals customFieldValueId ",
                    o.get("customFieldValueId").getAsInt(),
                    result.get(i).getCustomFieldValueId(),
                    0.0001);
            assertEquals(
                    "expect equals customFieldId ",
                    o.get("customFieldId").getAsInt(),
                    result.get(i).getCustomFieldId(),
                    0.0001);
            assertEquals(
                    "expect equals sortOrder ",
                    o.get("sortOrder").getAsInt(),
                    result.get(i).getSortOrder(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcCustomFieldValueDescription() throws IOException {
        final String inputFile = "OcCustomFieldValueDescription.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCustomFieldValueDescription> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCustomFieldValueDescription(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals customFieldValueId ",
                    o.get("customFieldValueId").getAsInt(),
                    result.get(i).getCustomFieldValueId(),
                    0.0001);
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals customFieldId ",
                    o.get("customFieldId").getAsInt(),
                    result.get(i).getCustomFieldId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
        }

        result.clear();
    }

    @Test
    public void testParsingOcCustomer() throws IOException {
        final String inputFile = "OcCustomer.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCustomer> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCustomer(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals customerId ",
                    o.get("customerId").getAsInt(),
                    result.get(i).getCustomerId(),
                    0.0001);
            assertEquals(
                    "expect equals customerGroupId ",
                    o.get("customerGroupId").getAsInt(),
                    result.get(i).getCustomerGroupId(),
                    0.0001);
            assertEquals(
                    "expect equals storeId ",
                    o.get("storeId").getAsInt(),
                    result.get(i).getStoreId(),
                    0.0001);
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals firstname ",
                    o.get("firstname").getAsString(),
                    result.get(i).getFirstname());
            assertEquals(
                    "expect equals lastname ",
                    o.get("lastname").getAsString(),
                    result.get(i).getLastname());
            assertEquals(
                    "expect equals email ", o.get("email").getAsString(), result.get(i).getEmail());
            assertEquals(
                    "expect equals telephone ",
                    o.get("telephone").getAsString(),
                    result.get(i).getTelephone());
            assertEquals("expect equals fax ", o.get("fax").getAsString(), result.get(i).getFax());
            assertEquals(
                    "expect equals password ",
                    o.get("password").getAsString(),
                    result.get(i).getPassword());
            assertEquals(
                    "expect equals salt ", o.get("salt").getAsString(), result.get(i).getSalt());
            assertEquals(
                    "expect equals cart ", o.get("cart").getAsString(), result.get(i).getCart());
            assertEquals(
                    "expect equals wishlist ",
                    o.get("wishlist").getAsString(),
                    result.get(i).getWishlist());
            assertEquals(
                    "expect equals newsletter ",
                    o.get("newsletter").getAsBoolean(),
                    result.get(i).getNewsletter());
            assertEquals(
                    "expect equals addressId ",
                    o.get("addressId").getAsInt(),
                    result.get(i).getAddressId(),
                    0.0001);
            assertEquals(
                    "expect equals customField ",
                    o.get("customField").getAsString(),
                    result.get(i).getCustomField());
            assertEquals("expect equals ip ", o.get("ip").getAsString(), result.get(i).getIp());
            assertEquals(
                    "expect equals status ",
                    o.get("status").getAsBoolean(),
                    result.get(i).getStatus());
            assertEquals(
                    "expect equals approved ",
                    o.get("approved").getAsBoolean(),
                    result.get(i).getApproved());
            assertEquals(
                    "expect equals safe ", o.get("safe").getAsBoolean(), result.get(i).getSafe());
            assertEquals(
                    "expect equals token ", o.get("token").getAsString(), result.get(i).getToken());
            assertEquals(
                    "expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
        }

        result.clear();
    }

    @Test
    public void testParsingOcCustomerActivity() throws IOException {
        final String inputFile = "OcCustomerActivity.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCustomerActivity> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCustomerActivity(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals customerActivityId ",
                    o.get("customerActivityId").getAsInt(),
                    result.get(i).getCustomerActivityId(),
                    0.0001);
            assertEquals(
                    "expect equals customerId ",
                    o.get("customerId").getAsInt(),
                    result.get(i).getCustomerId(),
                    0.0001);
            assertEquals("expect equals key ", o.get("key").getAsString(), result.get(i).getKey());
            assertEquals(
                    "expect equals data ", o.get("data").getAsString(), result.get(i).getData());
            assertEquals("expect equals ip ", o.get("ip").getAsString(), result.get(i).getIp());
        }

        result.clear();
    }

    @Test
    public void testParsingOcCustomerGroup() throws IOException {
        final String inputFile = "OcCustomerGroup.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCustomerGroup> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCustomerGroup(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals customerGroupId ",
                    o.get("customerGroupId").getAsInt(),
                    result.get(i).getCustomerGroupId(),
                    0.0001);
            assertEquals(
                    "expect equals approval ",
                    o.get("approval").getAsInt(),
                    result.get(i).getApproval(),
                    0.0001);
            assertEquals(
                    "expect equals sortOrder ",
                    o.get("sortOrder").getAsInt(),
                    result.get(i).getSortOrder(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcCustomerGroupDescription() throws IOException {
        final String inputFile = "OcCustomerGroupDescription.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCustomerGroupDescription> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCustomerGroupDescription(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals customerGroupId ",
                    o.get("customerGroupId").getAsInt(),
                    result.get(i).getCustomerGroupId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
            assertEquals(
                    "expect equals description ",
                    o.get("description").getAsString(),
                    result.get(i).getDescription());
        }

        result.clear();
    }

    @Test
    public void testParsingOcCustomerHistory() throws IOException {
        final String inputFile = "OcCustomerHistory.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCustomerHistory> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCustomerHistory(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals customerHistoryId ",
                    o.get("customerHistoryId").getAsInt(),
                    result.get(i).getCustomerHistoryId(),
                    0.0001);
            assertEquals(
                    "expect equals customerId ",
                    o.get("customerId").getAsInt(),
                    result.get(i).getCustomerId(),
                    0.0001);
            assertEquals(
                    "expect equals comment ",
                    o.get("comment").getAsString(),
                    result.get(i).getComment());
        }

        result.clear();
    }

    @Test
    public void testParsingOcCustomerIp() throws IOException {
        final String inputFile = "OcCustomerIp.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCustomerIp> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCustomerIp(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals customerIpId ",
                    o.get("customerIpId").getAsInt(),
                    result.get(i).getCustomerIpId(),
                    0.0001);
            assertEquals(
                    "expect equals customerId ",
                    o.get("customerId").getAsInt(),
                    result.get(i).getCustomerId(),
                    0.0001);
            assertEquals("expect equals ip ", o.get("ip").getAsString(), result.get(i).getIp());
        }

        result.clear();
    }

    @Test
    public void testParsingOcCustomerLogin() throws IOException {
        final String inputFile = "OcCustomerLogin.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCustomerLogin> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCustomerLogin(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals customerLoginId ",
                    o.get("customerLoginId").getAsInt(),
                    result.get(i).getCustomerLoginId(),
                    0.0001);
            assertEquals(
                    "expect equals email ", o.get("email").getAsString(), result.get(i).getEmail());
            assertEquals("expect equals ip ", o.get("ip").getAsString(), result.get(i).getIp());
            assertEquals(
                    "expect equals total ",
                    o.get("total").getAsInt(),
                    result.get(i).getTotal(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcCustomerOnline() throws IOException {
        final String inputFile = "OcCustomerOnline.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCustomerOnline> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCustomerOnline(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals("expect equals ip ", o.get("ip").getAsString(), result.get(i).getIp());
            assertEquals(
                    "expect equals customerId ",
                    o.get("customerId").getAsInt(),
                    result.get(i).getCustomerId(),
                    0.0001);
            assertEquals("expect equals url ", o.get("url").getAsString(), result.get(i).getUrl());
            assertEquals(
                    "expect equals referer ",
                    o.get("referer").getAsString(),
                    result.get(i).getReferer());
        }

        result.clear();
    }

    @Test
    public void testParsingOcCustomerReward() throws IOException {
        final String inputFile = "OcCustomerReward.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCustomerReward> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCustomerReward(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals customerRewardId ",
                    o.get("customerRewardId").getAsInt(),
                    result.get(i).getCustomerRewardId(),
                    0.0001);
            assertEquals(
                    "expect equals customerId ",
                    o.get("customerId").getAsInt(),
                    result.get(i).getCustomerId(),
                    0.0001);
            assertEquals(
                    "expect equals orderId ",
                    o.get("orderId").getAsInt(),
                    result.get(i).getOrderId(),
                    0.0001);
            assertEquals(
                    "expect equals description ",
                    o.get("description").getAsString(),
                    result.get(i).getDescription());
            assertEquals(
                    "expect equals points ",
                    o.get("points").getAsInt(),
                    result.get(i).getPoints(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcCustomerSearch() throws IOException {
        final String inputFile = "OcCustomerSearch.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCustomerSearch> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCustomerSearch(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals customerSearchId ",
                    o.get("customerSearchId").getAsInt(),
                    result.get(i).getCustomerSearchId(),
                    0.0001);
            assertEquals(
                    "expect equals storeId ",
                    o.get("storeId").getAsInt(),
                    result.get(i).getStoreId(),
                    0.0001);
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals customerId ",
                    o.get("customerId").getAsInt(),
                    result.get(i).getCustomerId(),
                    0.0001);
            assertEquals(
                    "expect equals keyword ",
                    o.get("keyword").getAsString(),
                    result.get(i).getKeyword());
            assertEquals(
                    "expect equals categoryId ",
                    o.get("categoryId").getAsInt(),
                    result.get(i).getCategoryId(),
                    0.0001);
            assertEquals(
                    "expect equals subCategory ",
                    o.get("subCategory").getAsBoolean(),
                    result.get(i).getSubCategory());
            assertEquals(
                    "expect equals description ",
                    o.get("description").getAsBoolean(),
                    result.get(i).getDescription());
            assertEquals(
                    "expect equals products ",
                    o.get("products").getAsInt(),
                    result.get(i).getProducts(),
                    0.0001);
            assertEquals("expect equals ip ", o.get("ip").getAsString(), result.get(i).getIp());
        }

        result.clear();
    }

    @Test
    public void testParsingOcCustomerTransaction() throws IOException {
        final String inputFile = "OcCustomerTransaction.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCustomerTransaction> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCustomerTransaction(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals customerTransactionId ",
                    o.get("customerTransactionId").getAsInt(),
                    result.get(i).getCustomerTransactionId(),
                    0.0001);
            assertEquals(
                    "expect equals customerId ",
                    o.get("customerId").getAsInt(),
                    result.get(i).getCustomerId(),
                    0.0001);
            assertEquals(
                    "expect equals orderId ",
                    o.get("orderId").getAsInt(),
                    result.get(i).getOrderId(),
                    0.0001);
            assertEquals(
                    "expect equals description ",
                    o.get("description").getAsString(),
                    result.get(i).getDescription());
            assertEquals(
                    "expect equals amount ",
                    o.get("amount").getAsBigDecimal(),
                    result.get(i).getAmount());
        }

        result.clear();
    }

    @Test
    public void testParsingOcCustomerWishlist() throws IOException {
        final String inputFile = "OcCustomerWishlist.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcCustomerWishlist> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcCustomerWishlist(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals productId ",
                    o.get("productId").getAsInt(),
                    result.get(i).getProductId(),
                    0.0001);
            assertEquals(
                    "expect equals customerId ",
                    o.get("customerId").getAsInt(),
                    result.get(i).getCustomerId(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcDownload() throws IOException {
        final String inputFile = "OcDownload.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcDownload> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcDownload(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals downloadId ",
                    o.get("downloadId").getAsInt(),
                    result.get(i).getDownloadId(),
                    0.0001);
            assertEquals(
                    "expect equals filename ",
                    o.get("filename").getAsString(),
                    result.get(i).getFilename());
            assertEquals(
                    "expect equals mask ", o.get("mask").getAsString(), result.get(i).getMask());
        }

        result.clear();
    }

    @Test
    public void testParsingOcDownloadDescription() throws IOException {
        final String inputFile = "OcDownloadDescription.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcDownloadDescription> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcDownloadDescription(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals downloadId ",
                    o.get("downloadId").getAsInt(),
                    result.get(i).getDownloadId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
        }

        result.clear();
    }

    @Test
    public void testParsingOcEvent() throws IOException {
        final String inputFile = "OcEvent.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcEvent> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcEvent(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals eventId ",
                    o.get("eventId").getAsInt(),
                    result.get(i).getEventId(),
                    0.0001);
            assertEquals(
                    "expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
            assertEquals(
                    "expect equals trigger ",
                    o.get("trigger").getAsString(),
                    result.get(i).getTrigger());
            assertEquals(
                    "expect equals action ",
                    o.get("action").getAsString(),
                    result.get(i).getAction());
            assertEquals(
                    "expect equals status ",
                    o.get("status").getAsBoolean(),
                    result.get(i).getStatus());
        }

        result.clear();
    }

    @Test
    public void testParsingOcExtension() throws IOException {
        final String inputFile = "OcExtension.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcExtension> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcExtension(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals extensionId ",
                    o.get("extensionId").getAsInt(),
                    result.get(i).getExtensionId(),
                    0.0001);
            assertEquals(
                    "expect equals type ", o.get("type").getAsString(), result.get(i).getType());
            assertEquals(
                    "expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
        }

        result.clear();
    }

    @Test
    public void testParsingOcFilter() throws IOException {
        final String inputFile = "OcFilter.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcFilter> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcFilter(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals filterId ",
                    o.get("filterId").getAsInt(),
                    result.get(i).getFilterId(),
                    0.0001);
            assertEquals(
                    "expect equals filterGroupId ",
                    o.get("filterGroupId").getAsInt(),
                    result.get(i).getFilterGroupId(),
                    0.0001);
            assertEquals(
                    "expect equals sortOrder ",
                    o.get("sortOrder").getAsInt(),
                    result.get(i).getSortOrder(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcFilterDescription() throws IOException {
        final String inputFile = "OcFilterDescription.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcFilterDescription> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcFilterDescription(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals filterId ",
                    o.get("filterId").getAsInt(),
                    result.get(i).getFilterId(),
                    0.0001);
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals filterGroupId ",
                    o.get("filterGroupId").getAsInt(),
                    result.get(i).getFilterGroupId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
        }

        result.clear();
    }

    @Test
    public void testParsingOcFilterGroup() throws IOException {
        final String inputFile = "OcFilterGroup.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcFilterGroup> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcFilterGroup(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals filterGroupId ",
                    o.get("filterGroupId").getAsInt(),
                    result.get(i).getFilterGroupId(),
                    0.0001);
            assertEquals(
                    "expect equals sortOrder ",
                    o.get("sortOrder").getAsInt(),
                    result.get(i).getSortOrder(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcFilterGroupDescription() throws IOException {
        final String inputFile = "OcFilterGroupDescription.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcFilterGroupDescription> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcFilterGroupDescription(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals filterGroupId ",
                    o.get("filterGroupId").getAsInt(),
                    result.get(i).getFilterGroupId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
        }

        result.clear();
    }

    @Test
    public void testParsingOcGeoZone() throws IOException {
        final String inputFile = "OcGeoZone.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcGeoZone> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcGeoZone(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals geoZoneId ",
                    o.get("geoZoneId").getAsInt(),
                    result.get(i).getGeoZoneId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
            assertEquals(
                    "expect equals description ",
                    o.get("description").getAsString(),
                    result.get(i).getDescription());
        }

        result.clear();
    }

    @Test
    public void testParsingOcInformation() throws IOException {
        final String inputFile = "OcInformation.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcInformation> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcInformation(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals informationId ",
                    o.get("informationId").getAsInt(),
                    result.get(i).getInformationId(),
                    0.0001);
            assertEquals(
                    "expect equals bottom ",
                    o.get("bottom").getAsInt(),
                    result.get(i).getBottom(),
                    0.0001);
            assertEquals(
                    "expect equals sortOrder ",
                    o.get("sortOrder").getAsInt(),
                    result.get(i).getSortOrder(),
                    0.0001);
            assertEquals(
                    "expect equals status ",
                    o.get("status").getAsBoolean(),
                    result.get(i).getStatus());
        }

        result.clear();
    }

    @Test
    public void testParsingOcInformationDescription() throws IOException {
        final String inputFile = "OcInformationDescription.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcInformationDescription> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcInformationDescription(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals informationId ",
                    o.get("informationId").getAsInt(),
                    result.get(i).getInformationId(),
                    0.0001);
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
            assertEquals(
                    "expect equals description ",
                    o.get("description").getAsString(),
                    result.get(i).getDescription());
            assertEquals(
                    "expect equals metaTitle ",
                    o.get("metaTitle").getAsString(),
                    result.get(i).getMetaTitle());
            assertEquals(
                    "expect equals metaDescription ",
                    o.get("metaDescription").getAsString(),
                    result.get(i).getMetaDescription());
            assertEquals(
                    "expect equals metaKeyword ",
                    o.get("metaKeyword").getAsString(),
                    result.get(i).getMetaKeyword());
        }

        result.clear();
    }

    @Test
    public void testParsingOcInformationToLayout() throws IOException {
        final String inputFile = "OcInformationToLayout.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcInformationToLayout> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcInformationToLayout(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals informationId ",
                    o.get("informationId").getAsInt(),
                    result.get(i).getInformationId(),
                    0.0001);
            assertEquals(
                    "expect equals storeId ",
                    o.get("storeId").getAsInt(),
                    result.get(i).getStoreId(),
                    0.0001);
            assertEquals(
                    "expect equals layoutId ",
                    o.get("layoutId").getAsInt(),
                    result.get(i).getLayoutId(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcInformationToStore() throws IOException {
        final String inputFile = "OcInformationToStore.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcInformationToStore> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcInformationToStore(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals informationId ",
                    o.get("informationId").getAsInt(),
                    result.get(i).getInformationId(),
                    0.0001);
            assertEquals(
                    "expect equals storeId ",
                    o.get("storeId").getAsInt(),
                    result.get(i).getStoreId(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcLanguage() throws IOException {
        final String inputFile = "OcLanguage.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcLanguage> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcLanguage(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
            assertEquals(
                    "expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
            assertEquals(
                    "expect equals locale ",
                    o.get("locale").getAsString(),
                    result.get(i).getLocale());
            assertEquals(
                    "expect equals image ", o.get("image").getAsString(), result.get(i).getImage());
            assertEquals(
                    "expect equals directory ",
                    o.get("directory").getAsString(),
                    result.get(i).getDirectory());
            assertEquals(
                    "expect equals sortOrder ",
                    o.get("sortOrder").getAsInt(),
                    result.get(i).getSortOrder(),
                    0.0001);
            assertEquals(
                    "expect equals status ",
                    o.get("status").getAsBoolean(),
                    result.get(i).getStatus());
        }

        result.clear();
    }

    @Test
    public void testParsingOcLayout() throws IOException {
        final String inputFile = "OcLayout.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcLayout> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcLayout(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals layoutId ",
                    o.get("layoutId").getAsInt(),
                    result.get(i).getLayoutId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
        }

        result.clear();
    }

    @Test
    public void testParsingOcLayoutModule() throws IOException {
        final String inputFile = "OcLayoutModule.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcLayoutModule> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcLayoutModule(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals layoutModuleId ",
                    o.get("layoutModuleId").getAsInt(),
                    result.get(i).getLayoutModuleId(),
                    0.0001);
            assertEquals(
                    "expect equals layoutId ",
                    o.get("layoutId").getAsInt(),
                    result.get(i).getLayoutId(),
                    0.0001);
            assertEquals(
                    "expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
            assertEquals(
                    "expect equals position ",
                    o.get("position").getAsString(),
                    result.get(i).getPosition());
            assertEquals(
                    "expect equals sortOrder ",
                    o.get("sortOrder").getAsInt(),
                    result.get(i).getSortOrder(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcLayoutRoute() throws IOException {
        final String inputFile = "OcLayoutRoute.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcLayoutRoute> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcLayoutRoute(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals layoutRouteId ",
                    o.get("layoutRouteId").getAsInt(),
                    result.get(i).getLayoutRouteId(),
                    0.0001);
            assertEquals(
                    "expect equals layoutId ",
                    o.get("layoutId").getAsInt(),
                    result.get(i).getLayoutId(),
                    0.0001);
            assertEquals(
                    "expect equals storeId ",
                    o.get("storeId").getAsInt(),
                    result.get(i).getStoreId(),
                    0.0001);
            assertEquals(
                    "expect equals route ", o.get("route").getAsString(), result.get(i).getRoute());
        }

        result.clear();
    }

    @Test
    public void testParsingOcLengthClass() throws IOException {
        final String inputFile = "OcLengthClass.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcLengthClass> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcLengthClass(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals lengthClassId ",
                    o.get("lengthClassId").getAsInt(),
                    result.get(i).getLengthClassId(),
                    0.0001);
            assertEquals(
                    "expect equals value ",
                    o.get("value").getAsBigDecimal(),
                    result.get(i).getValue());
        }

        result.clear();
    }

    @Test
    public void testParsingOcLengthClassDescription() throws IOException {
        final String inputFile = "OcLengthClassDescription.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcLengthClassDescription> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcLengthClassDescription(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals lengthClassId ",
                    o.get("lengthClassId").getAsInt(),
                    result.get(i).getLengthClassId(),
                    0.0001);
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
            assertEquals(
                    "expect equals unit ", o.get("unit").getAsString(), result.get(i).getUnit());
        }

        result.clear();
    }

    @Test
    public void testParsingOcLocation() throws IOException {
        final String inputFile = "OcLocation.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcLocation> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcLocation(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals locationId ",
                    o.get("locationId").getAsInt(),
                    result.get(i).getLocationId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
            assertEquals(
                    "expect equals address ",
                    o.get("address").getAsString(),
                    result.get(i).getAddress());
            assertEquals(
                    "expect equals telephone ",
                    o.get("telephone").getAsString(),
                    result.get(i).getTelephone());
            assertEquals("expect equals fax ", o.get("fax").getAsString(), result.get(i).getFax());
            assertEquals(
                    "expect equals geocode ",
                    o.get("geocode").getAsString(),
                    result.get(i).getGeocode());
            assertEquals(
                    "expect equals image ", o.get("image").getAsString(), result.get(i).getImage());
            assertEquals(
                    "expect equals open ", o.get("open").getAsString(), result.get(i).getOpen());
            assertEquals(
                    "expect equals comment ",
                    o.get("comment").getAsString(),
                    result.get(i).getComment());
        }

        result.clear();
    }

    @Test
    public void testParsingOcManufacturer() throws IOException {
        final String inputFile = "OcManufacturer.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcManufacturer> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcManufacturer(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals manufacturerId ",
                    o.get("manufacturerId").getAsInt(),
                    result.get(i).getManufacturerId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
            assertEquals(
                    "expect equals image ", o.get("image").getAsString(), result.get(i).getImage());
            assertEquals(
                    "expect equals sortOrder ",
                    o.get("sortOrder").getAsInt(),
                    result.get(i).getSortOrder(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcManufacturerToStore() throws IOException {
        final String inputFile = "OcManufacturerToStore.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcManufacturerToStore> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcManufacturerToStore(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals storeId ",
                    o.get("storeId").getAsInt(),
                    result.get(i).getStoreId(),
                    0.0001);
            assertEquals(
                    "expect equals manufacturerId ",
                    o.get("manufacturerId").getAsInt(),
                    result.get(i).getManufacturerId(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcMarketing() throws IOException {
        final String inputFile = "OcMarketing.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcMarketing> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcMarketing(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals marketingId ",
                    o.get("marketingId").getAsInt(),
                    result.get(i).getMarketingId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
            assertEquals(
                    "expect equals description ",
                    o.get("description").getAsString(),
                    result.get(i).getDescription());
            assertEquals(
                    "expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
            assertEquals(
                    "expect equals clicks ",
                    o.get("clicks").getAsInt(),
                    result.get(i).getClicks(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcMenu() throws IOException {
        final String inputFile = "OcMenu.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcMenu> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcMenu(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals menuId ",
                    o.get("menuId").getAsInt(),
                    result.get(i).getMenuId(),
                    0.0001);
            assertEquals(
                    "expect equals storeId ",
                    o.get("storeId").getAsInt(),
                    result.get(i).getStoreId(),
                    0.0001);
            assertEquals(
                    "expect equals type ", o.get("type").getAsString(), result.get(i).getType());
            assertEquals(
                    "expect equals link ", o.get("link").getAsString(), result.get(i).getLink());
            assertEquals(
                    "expect equals sortOrder ",
                    o.get("sortOrder").getAsInt(),
                    result.get(i).getSortOrder(),
                    0.0001);
            assertEquals(
                    "expect equals status ",
                    o.get("status").getAsBoolean(),
                    result.get(i).getStatus());
        }

        result.clear();
    }

    @Test
    public void testParsingOcMenuDescription() throws IOException {
        final String inputFile = "OcMenuDescription.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcMenuDescription> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcMenuDescription(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals menuId ",
                    o.get("menuId").getAsInt(),
                    result.get(i).getMenuId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
        }

        result.clear();
    }

    @Test
    public void testParsingOcMenuModule() throws IOException {
        final String inputFile = "OcMenuModule.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcMenuModule> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcMenuModule(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals menuModuleId ",
                    o.get("menuModuleId").getAsInt(),
                    result.get(i).getMenuModuleId(),
                    0.0001);
            assertEquals(
                    "expect equals menuId ",
                    o.get("menuId").getAsInt(),
                    result.get(i).getMenuId(),
                    0.0001);
            assertEquals(
                    "expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
            assertEquals(
                    "expect equals sortOrder ",
                    o.get("sortOrder").getAsInt(),
                    result.get(i).getSortOrder(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcModification() throws IOException {
        final String inputFile = "OcModification.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcModification> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcModification(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals modificationId ",
                    o.get("modificationId").getAsInt(),
                    result.get(i).getModificationId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
            assertEquals(
                    "expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
            assertEquals(
                    "expect equals author ",
                    o.get("author").getAsString(),
                    result.get(i).getAuthor());
            assertEquals(
                    "expect equals version ",
                    o.get("version").getAsString(),
                    result.get(i).getVersion());
            assertEquals(
                    "expect equals link ", o.get("link").getAsString(), result.get(i).getLink());
            assertEquals("expect equals xml ", o.get("xml").getAsString(), result.get(i).getXml());
            assertEquals(
                    "expect equals status ",
                    o.get("status").getAsBoolean(),
                    result.get(i).getStatus());
        }

        result.clear();
    }

    @Test
    public void testParsingOcModule() throws IOException {
        final String inputFile = "OcModule.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcModule> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcModule(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals moduleId ",
                    o.get("moduleId").getAsInt(),
                    result.get(i).getModuleId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
            assertEquals(
                    "expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
            assertEquals(
                    "expect equals setting ",
                    o.get("setting").getAsString(),
                    result.get(i).getSetting());
        }

        result.clear();
    }

    @Test
    public void testParsingOcOption() throws IOException {
        final String inputFile = "OcOption.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcOption> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcOption(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals optionId ",
                    o.get("optionId").getAsInt(),
                    result.get(i).getOptionId(),
                    0.0001);
            assertEquals(
                    "expect equals type ", o.get("type").getAsString(), result.get(i).getType());
            assertEquals(
                    "expect equals sortOrder ",
                    o.get("sortOrder").getAsInt(),
                    result.get(i).getSortOrder(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcOptionDescription() throws IOException {
        final String inputFile = "OcOptionDescription.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcOptionDescription> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcOptionDescription(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals optionId ",
                    o.get("optionId").getAsInt(),
                    result.get(i).getOptionId(),
                    0.0001);
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
        }

        result.clear();
    }

    @Test
    public void testParsingOcOptionValue() throws IOException {
        final String inputFile = "OcOptionValue.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcOptionValue> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcOptionValue(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals optionValueId ",
                    o.get("optionValueId").getAsInt(),
                    result.get(i).getOptionValueId(),
                    0.0001);
            assertEquals(
                    "expect equals optionId ",
                    o.get("optionId").getAsInt(),
                    result.get(i).getOptionId(),
                    0.0001);
            assertEquals(
                    "expect equals image ", o.get("image").getAsString(), result.get(i).getImage());
            assertEquals(
                    "expect equals sortOrder ",
                    o.get("sortOrder").getAsInt(),
                    result.get(i).getSortOrder(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcOptionValueDescription() throws IOException {
        final String inputFile = "OcOptionValueDescription.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcOptionValueDescription> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcOptionValueDescription(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals optionValueId ",
                    o.get("optionValueId").getAsInt(),
                    result.get(i).getOptionValueId(),
                    0.0001);
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals optionId ",
                    o.get("optionId").getAsInt(),
                    result.get(i).getOptionId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
        }

        result.clear();
    }

    @Test
    public void testParsingOcOrder() throws IOException {
        final String inputFile = "OcOrder.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcOrder> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcOrder(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals orderId ",
                    o.get("orderId").getAsInt(),
                    result.get(i).getOrderId(),
                    0.0001);
            assertEquals(
                    "expect equals invoiceNo ",
                    o.get("invoiceNo").getAsInt(),
                    result.get(i).getInvoiceNo(),
                    0.0001);
            assertEquals(
                    "expect equals invoicePrefix ",
                    o.get("invoicePrefix").getAsString(),
                    result.get(i).getInvoicePrefix());
            assertEquals(
                    "expect equals storeId ",
                    o.get("storeId").getAsInt(),
                    result.get(i).getStoreId(),
                    0.0001);
            assertEquals(
                    "expect equals storeName ",
                    o.get("storeName").getAsString(),
                    result.get(i).getStoreName());
            assertEquals(
                    "expect equals storeUrl ",
                    o.get("storeUrl").getAsString(),
                    result.get(i).getStoreUrl());
            assertEquals(
                    "expect equals customerId ",
                    o.get("customerId").getAsInt(),
                    result.get(i).getCustomerId(),
                    0.0001);
            assertEquals(
                    "expect equals customerGroupId ",
                    o.get("customerGroupId").getAsInt(),
                    result.get(i).getCustomerGroupId(),
                    0.0001);
            assertEquals(
                    "expect equals firstname ",
                    o.get("firstname").getAsString(),
                    result.get(i).getFirstname());
            assertEquals(
                    "expect equals lastname ",
                    o.get("lastname").getAsString(),
                    result.get(i).getLastname());
            assertEquals(
                    "expect equals email ", o.get("email").getAsString(), result.get(i).getEmail());
            assertEquals(
                    "expect equals telephone ",
                    o.get("telephone").getAsString(),
                    result.get(i).getTelephone());
            assertEquals("expect equals fax ", o.get("fax").getAsString(), result.get(i).getFax());
            assertEquals(
                    "expect equals customField ",
                    o.get("customField").getAsString(),
                    result.get(i).getCustomField());
            assertEquals(
                    "expect equals paymentFirstname ",
                    o.get("paymentFirstname").getAsString(),
                    result.get(i).getPaymentFirstname());
            assertEquals(
                    "expect equals paymentLastname ",
                    o.get("paymentLastname").getAsString(),
                    result.get(i).getPaymentLastname());
            assertEquals(
                    "expect equals paymentCompany ",
                    o.get("paymentCompany").getAsString(),
                    result.get(i).getPaymentCompany());
            assertEquals(
                    "expect equals paymentAddress1 ",
                    o.get("paymentAddress1").getAsString(),
                    result.get(i).getPaymentAddress1());
            assertEquals(
                    "expect equals paymentAddress2 ",
                    o.get("paymentAddress2").getAsString(),
                    result.get(i).getPaymentAddress2());
            assertEquals(
                    "expect equals paymentCity ",
                    o.get("paymentCity").getAsString(),
                    result.get(i).getPaymentCity());
            assertEquals(
                    "expect equals paymentPostcode ",
                    o.get("paymentPostcode").getAsString(),
                    result.get(i).getPaymentPostcode());
            assertEquals(
                    "expect equals paymentCountry ",
                    o.get("paymentCountry").getAsString(),
                    result.get(i).getPaymentCountry());
            assertEquals(
                    "expect equals paymentCountryId ",
                    o.get("paymentCountryId").getAsInt(),
                    result.get(i).getPaymentCountryId(),
                    0.0001);
            assertEquals(
                    "expect equals paymentZone ",
                    o.get("paymentZone").getAsString(),
                    result.get(i).getPaymentZone());
            assertEquals(
                    "expect equals paymentZoneId ",
                    o.get("paymentZoneId").getAsInt(),
                    result.get(i).getPaymentZoneId(),
                    0.0001);
            assertEquals(
                    "expect equals paymentAddressFormat ",
                    o.get("paymentAddressFormat").getAsString(),
                    result.get(i).getPaymentAddressFormat());
            assertEquals(
                    "expect equals paymentCustomField ",
                    o.get("paymentCustomField").getAsString(),
                    result.get(i).getPaymentCustomField());
            assertEquals(
                    "expect equals paymentMethod ",
                    o.get("paymentMethod").getAsString(),
                    result.get(i).getPaymentMethod());
            assertEquals(
                    "expect equals paymentCode ",
                    o.get("paymentCode").getAsString(),
                    result.get(i).getPaymentCode());
            assertEquals(
                    "expect equals shippingFirstname ",
                    o.get("shippingFirstname").getAsString(),
                    result.get(i).getShippingFirstname());
            assertEquals(
                    "expect equals shippingLastname ",
                    o.get("shippingLastname").getAsString(),
                    result.get(i).getShippingLastname());
            assertEquals(
                    "expect equals shippingCompany ",
                    o.get("shippingCompany").getAsString(),
                    result.get(i).getShippingCompany());
            assertEquals(
                    "expect equals shippingAddress1 ",
                    o.get("shippingAddress1").getAsString(),
                    result.get(i).getShippingAddress1());
            assertEquals(
                    "expect equals shippingAddress2 ",
                    o.get("shippingAddress2").getAsString(),
                    result.get(i).getShippingAddress2());
            assertEquals(
                    "expect equals shippingCity ",
                    o.get("shippingCity").getAsString(),
                    result.get(i).getShippingCity());
            assertEquals(
                    "expect equals shippingPostcode ",
                    o.get("shippingPostcode").getAsString(),
                    result.get(i).getShippingPostcode());
            assertEquals(
                    "expect equals shippingCountry ",
                    o.get("shippingCountry").getAsString(),
                    result.get(i).getShippingCountry());
            assertEquals(
                    "expect equals shippingCountryId ",
                    o.get("shippingCountryId").getAsInt(),
                    result.get(i).getShippingCountryId(),
                    0.0001);
            assertEquals(
                    "expect equals shippingZone ",
                    o.get("shippingZone").getAsString(),
                    result.get(i).getShippingZone());
            assertEquals(
                    "expect equals shippingZoneId ",
                    o.get("shippingZoneId").getAsInt(),
                    result.get(i).getShippingZoneId(),
                    0.0001);
            assertEquals(
                    "expect equals shippingAddressFormat ",
                    o.get("shippingAddressFormat").getAsString(),
                    result.get(i).getShippingAddressFormat());
            assertEquals(
                    "expect equals shippingCustomField ",
                    o.get("shippingCustomField").getAsString(),
                    result.get(i).getShippingCustomField());
            assertEquals(
                    "expect equals shippingMethod ",
                    o.get("shippingMethod").getAsString(),
                    result.get(i).getShippingMethod());
            assertEquals(
                    "expect equals shippingCode ",
                    o.get("shippingCode").getAsString(),
                    result.get(i).getShippingCode());
            assertEquals(
                    "expect equals comment ",
                    o.get("comment").getAsString(),
                    result.get(i).getComment());
            assertEquals(
                    "expect equals total ",
                    o.get("total").getAsBigDecimal(),
                    result.get(i).getTotal());
            assertEquals(
                    "expect equals orderStatusId ",
                    o.get("orderStatusId").getAsInt(),
                    result.get(i).getOrderStatusId(),
                    0.0001);
            assertEquals(
                    "expect equals affiliateId ",
                    o.get("affiliateId").getAsInt(),
                    result.get(i).getAffiliateId(),
                    0.0001);
            assertEquals(
                    "expect equals commission ",
                    o.get("commission").getAsBigDecimal(),
                    result.get(i).getCommission());
            assertEquals(
                    "expect equals marketingId ",
                    o.get("marketingId").getAsInt(),
                    result.get(i).getMarketingId(),
                    0.0001);
            assertEquals(
                    "expect equals tracking ",
                    o.get("tracking").getAsString(),
                    result.get(i).getTracking());
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals currencyId ",
                    o.get("currencyId").getAsInt(),
                    result.get(i).getCurrencyId(),
                    0.0001);
            assertEquals(
                    "expect equals currencyCode ",
                    o.get("currencyCode").getAsString(),
                    result.get(i).getCurrencyCode());
            assertEquals(
                    "expect equals currencyValue ",
                    o.get("currencyValue").getAsBigDecimal(),
                    result.get(i).getCurrencyValue());
            assertEquals("expect equals ip ", o.get("ip").getAsString(), result.get(i).getIp());
            assertEquals(
                    "expect equals forwardedIp ",
                    o.get("forwardedIp").getAsString(),
                    result.get(i).getForwardedIp());
            assertEquals(
                    "expect equals userAgent ",
                    o.get("userAgent").getAsString(),
                    result.get(i).getUserAgent());
            assertEquals(
                    "expect equals acceptLanguage ",
                    o.get("acceptLanguage").getAsString(),
                    result.get(i).getAcceptLanguage());
        }

        result.clear();
    }

    @Test
    public void testParsingOcOrderCustomField() throws IOException {
        final String inputFile = "OcOrderCustomField.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcOrderCustomField> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcOrderCustomField(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals orderCustomFieldId ",
                    o.get("orderCustomFieldId").getAsInt(),
                    result.get(i).getOrderCustomFieldId(),
                    0.0001);
            assertEquals(
                    "expect equals orderId ",
                    o.get("orderId").getAsInt(),
                    result.get(i).getOrderId(),
                    0.0001);
            assertEquals(
                    "expect equals customFieldId ",
                    o.get("customFieldId").getAsInt(),
                    result.get(i).getCustomFieldId(),
                    0.0001);
            assertEquals(
                    "expect equals customFieldValueId ",
                    o.get("customFieldValueId").getAsInt(),
                    result.get(i).getCustomFieldValueId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
            assertEquals(
                    "expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
            assertEquals(
                    "expect equals type ", o.get("type").getAsString(), result.get(i).getType());
            assertEquals(
                    "expect equals location ",
                    o.get("location").getAsString(),
                    result.get(i).getLocation());
        }

        result.clear();
    }

    @Test
    public void testParsingOcOrderHistory() throws IOException {
        final String inputFile = "OcOrderHistory.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcOrderHistory> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcOrderHistory(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals orderHistoryId ",
                    o.get("orderHistoryId").getAsInt(),
                    result.get(i).getOrderHistoryId(),
                    0.0001);
            assertEquals(
                    "expect equals orderId ",
                    o.get("orderId").getAsInt(),
                    result.get(i).getOrderId(),
                    0.0001);
            assertEquals(
                    "expect equals orderStatusId ",
                    o.get("orderStatusId").getAsInt(),
                    result.get(i).getOrderStatusId(),
                    0.0001);
            assertEquals(
                    "expect equals notify ",
                    o.get("notify").getAsBoolean(),
                    result.get(i).getNotify());
            assertEquals(
                    "expect equals comment ",
                    o.get("comment").getAsString(),
                    result.get(i).getComment());
        }

        result.clear();
    }

    @Test
    public void testParsingOcOrderOption() throws IOException {
        final String inputFile = "OcOrderOption.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcOrderOption> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcOrderOption(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals orderOptionId ",
                    o.get("orderOptionId").getAsInt(),
                    result.get(i).getOrderOptionId(),
                    0.0001);
            assertEquals(
                    "expect equals orderId ",
                    o.get("orderId").getAsInt(),
                    result.get(i).getOrderId(),
                    0.0001);
            assertEquals(
                    "expect equals orderProductId ",
                    o.get("orderProductId").getAsInt(),
                    result.get(i).getOrderProductId(),
                    0.0001);
            assertEquals(
                    "expect equals productOptionId ",
                    o.get("productOptionId").getAsInt(),
                    result.get(i).getProductOptionId(),
                    0.0001);
            assertEquals(
                    "expect equals productOptionValueId ",
                    o.get("productOptionValueId").getAsInt(),
                    result.get(i).getProductOptionValueId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
            assertEquals(
                    "expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
            assertEquals(
                    "expect equals type ", o.get("type").getAsString(), result.get(i).getType());
        }

        result.clear();
    }

    @Test
    public void testParsingOcOrderProduct() throws IOException {
        final String inputFile = "OcOrderProduct.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcOrderProduct> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcOrderProduct(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals orderProductId ",
                    o.get("orderProductId").getAsInt(),
                    result.get(i).getOrderProductId(),
                    0.0001);
            assertEquals(
                    "expect equals orderId ",
                    o.get("orderId").getAsInt(),
                    result.get(i).getOrderId(),
                    0.0001);
            assertEquals(
                    "expect equals productId ",
                    o.get("productId").getAsInt(),
                    result.get(i).getProductId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
            assertEquals(
                    "expect equals model ", o.get("model").getAsString(), result.get(i).getModel());
            assertEquals(
                    "expect equals quantity ",
                    o.get("quantity").getAsInt(),
                    result.get(i).getQuantity(),
                    0.0001);
            assertEquals(
                    "expect equals price ",
                    o.get("price").getAsBigDecimal(),
                    result.get(i).getPrice());
            assertEquals(
                    "expect equals total ",
                    o.get("total").getAsBigDecimal(),
                    result.get(i).getTotal());
            assertEquals(
                    "expect equals tax ", o.get("tax").getAsBigDecimal(), result.get(i).getTax());
            assertEquals(
                    "expect equals reward ",
                    o.get("reward").getAsInt(),
                    result.get(i).getReward(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcOrderRecurring() throws IOException {
        final String inputFile = "OcOrderRecurring.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcOrderRecurring> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcOrderRecurring(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals orderRecurringId ",
                    o.get("orderRecurringId").getAsInt(),
                    result.get(i).getOrderRecurringId(),
                    0.0001);
            assertEquals(
                    "expect equals orderId ",
                    o.get("orderId").getAsInt(),
                    result.get(i).getOrderId(),
                    0.0001);
            assertEquals(
                    "expect equals reference ",
                    o.get("reference").getAsString(),
                    result.get(i).getReference());
            assertEquals(
                    "expect equals productId ",
                    o.get("productId").getAsInt(),
                    result.get(i).getProductId(),
                    0.0001);
            assertEquals(
                    "expect equals productName ",
                    o.get("productName").getAsString(),
                    result.get(i).getProductName());
            assertEquals(
                    "expect equals productQuantity ",
                    o.get("productQuantity").getAsInt(),
                    result.get(i).getProductQuantity(),
                    0.0001);
            assertEquals(
                    "expect equals recurringId ",
                    o.get("recurringId").getAsInt(),
                    result.get(i).getRecurringId(),
                    0.0001);
            assertEquals(
                    "expect equals recurringName ",
                    o.get("recurringName").getAsString(),
                    result.get(i).getRecurringName());
            assertEquals(
                    "expect equals recurringDescription ",
                    o.get("recurringDescription").getAsString(),
                    result.get(i).getRecurringDescription());
            assertEquals(
                    "expect equals recurringFrequency ",
                    o.get("recurringFrequency").getAsString(),
                    result.get(i).getRecurringFrequency());
            assertEquals(
                    "expect equals recurringCycle ",
                    o.get("recurringCycle").getAsInt(),
                    result.get(i).getRecurringCycle(),
                    0.0001);
            assertEquals(
                    "expect equals recurringDuration ",
                    o.get("recurringDuration").getAsInt(),
                    result.get(i).getRecurringDuration(),
                    0.0001);
            assertEquals(
                    "expect equals recurringPrice ",
                    o.get("recurringPrice").getAsBigDecimal(),
                    result.get(i).getRecurringPrice());
            assertEquals(
                    "expect equals trial ",
                    o.get("trial").getAsBoolean(),
                    result.get(i).getTrial());
            assertEquals(
                    "expect equals trialFrequency ",
                    o.get("trialFrequency").getAsString(),
                    result.get(i).getTrialFrequency());
            assertEquals(
                    "expect equals trialCycle ",
                    o.get("trialCycle").getAsInt(),
                    result.get(i).getTrialCycle(),
                    0.0001);
            assertEquals(
                    "expect equals trialDuration ",
                    o.get("trialDuration").getAsInt(),
                    result.get(i).getTrialDuration(),
                    0.0001);
            assertEquals(
                    "expect equals trialPrice ",
                    o.get("trialPrice").getAsBigDecimal(),
                    result.get(i).getTrialPrice());
            assertEquals(
                    "expect equals status ",
                    o.get("status").getAsInt(),
                    result.get(i).getStatus(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcOrderRecurringTransaction() throws IOException {
        final String inputFile = "OcOrderRecurringTransaction.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcOrderRecurringTransaction> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcOrderRecurringTransaction(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals orderRecurringTransactionId ",
                    o.get("orderRecurringTransactionId").getAsInt(),
                    result.get(i).getOrderRecurringTransactionId(),
                    0.0001);
            assertEquals(
                    "expect equals orderRecurringId ",
                    o.get("orderRecurringId").getAsInt(),
                    result.get(i).getOrderRecurringId(),
                    0.0001);
            assertEquals(
                    "expect equals reference ",
                    o.get("reference").getAsString(),
                    result.get(i).getReference());
            assertEquals(
                    "expect equals type ", o.get("type").getAsString(), result.get(i).getType());
            assertEquals(
                    "expect equals amount ",
                    o.get("amount").getAsBigDecimal(),
                    result.get(i).getAmount());
        }

        result.clear();
    }

    @Test
    public void testParsingOcOrderStatus() throws IOException {
        final String inputFile = "OcOrderStatus.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcOrderStatus> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcOrderStatus(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals orderStatusId ",
                    o.get("orderStatusId").getAsInt(),
                    result.get(i).getOrderStatusId(),
                    0.0001);
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
        }

        result.clear();
    }

    @Test
    public void testParsingOcOrderTotal() throws IOException {
        final String inputFile = "OcOrderTotal.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcOrderTotal> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcOrderTotal(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals orderTotalId ",
                    o.get("orderTotalId").getAsInt(),
                    result.get(i).getOrderTotalId(),
                    0.0001);
            assertEquals(
                    "expect equals orderId ",
                    o.get("orderId").getAsInt(),
                    result.get(i).getOrderId(),
                    0.0001);
            assertEquals(
                    "expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
            assertEquals(
                    "expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
            assertEquals(
                    "expect equals value ",
                    o.get("value").getAsBigDecimal(),
                    result.get(i).getValue());
            assertEquals(
                    "expect equals sortOrder ",
                    o.get("sortOrder").getAsInt(),
                    result.get(i).getSortOrder(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcOrderVoucher() throws IOException {
        final String inputFile = "OcOrderVoucher.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcOrderVoucher> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcOrderVoucher(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals orderVoucherId ",
                    o.get("orderVoucherId").getAsInt(),
                    result.get(i).getOrderVoucherId(),
                    0.0001);
            assertEquals(
                    "expect equals orderId ",
                    o.get("orderId").getAsInt(),
                    result.get(i).getOrderId(),
                    0.0001);
            assertEquals(
                    "expect equals voucherId ",
                    o.get("voucherId").getAsInt(),
                    result.get(i).getVoucherId(),
                    0.0001);
            assertEquals(
                    "expect equals description ",
                    o.get("description").getAsString(),
                    result.get(i).getDescription());
            assertEquals(
                    "expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
            assertEquals(
                    "expect equals fromName ",
                    o.get("fromName").getAsString(),
                    result.get(i).getFromName());
            assertEquals(
                    "expect equals fromEmail ",
                    o.get("fromEmail").getAsString(),
                    result.get(i).getFromEmail());
            assertEquals(
                    "expect equals toName ",
                    o.get("toName").getAsString(),
                    result.get(i).getToName());
            assertEquals(
                    "expect equals toEmail ",
                    o.get("toEmail").getAsString(),
                    result.get(i).getToEmail());
            assertEquals(
                    "expect equals voucherThemeId ",
                    o.get("voucherThemeId").getAsInt(),
                    result.get(i).getVoucherThemeId(),
                    0.0001);
            assertEquals(
                    "expect equals message ",
                    o.get("message").getAsString(),
                    result.get(i).getMessage());
            assertEquals(
                    "expect equals amount ",
                    o.get("amount").getAsBigDecimal(),
                    result.get(i).getAmount());
        }

        result.clear();
    }

    @Test
    public void testParsingOcProduct() throws IOException {
        final String inputFile = "OcProduct.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcProduct> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcProduct(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals productId ",
                    o.get("productId").getAsInt(),
                    result.get(i).getProductId(),
                    0.0001);
            assertEquals(
                    "expect equals model ", o.get("model").getAsString(), result.get(i).getModel());
            assertEquals("expect equals sku ", o.get("sku").getAsString(), result.get(i).getSku());
            assertEquals("expect equals upc ", o.get("upc").getAsString(), result.get(i).getUpc());
            assertEquals("expect equals ean ", o.get("ean").getAsString(), result.get(i).getEan());
            assertEquals("expect equals jan ", o.get("jan").getAsString(), result.get(i).getJan());
            assertEquals(
                    "expect equals isbn ", o.get("isbn").getAsString(), result.get(i).getIsbn());
            assertEquals("expect equals mpn ", o.get("mpn").getAsString(), result.get(i).getMpn());
            assertEquals(
                    "expect equals location ",
                    o.get("location").getAsString(),
                    result.get(i).getLocation());
            assertEquals(
                    "expect equals quantity ",
                    o.get("quantity").getAsInt(),
                    result.get(i).getQuantity(),
                    0.0001);
            assertEquals(
                    "expect equals stockStatusId ",
                    o.get("stockStatusId").getAsInt(),
                    result.get(i).getStockStatusId(),
                    0.0001);
            assertEquals(
                    "expect equals image ", o.get("image").getAsString(), result.get(i).getImage());
            assertEquals(
                    "expect equals manufacturerId ",
                    o.get("manufacturerId").getAsInt(),
                    result.get(i).getManufacturerId(),
                    0.0001);
            assertEquals(
                    "expect equals shipping ",
                    o.get("shipping").getAsBoolean(),
                    result.get(i).getShipping());
            assertEquals(
                    "expect equals price ",
                    o.get("price").getAsBigDecimal(),
                    result.get(i).getPrice());
            assertEquals(
                    "expect equals points ",
                    o.get("points").getAsInt(),
                    result.get(i).getPoints(),
                    0.0001);
            assertEquals(
                    "expect equals taxClassId ",
                    o.get("taxClassId").getAsInt(),
                    result.get(i).getTaxClassId(),
                    0.0001);
            assertEquals(
                    "expect equals weight ",
                    o.get("weight").getAsBigDecimal(),
                    result.get(i).getWeight());
            assertEquals(
                    "expect equals weightClassId ",
                    o.get("weightClassId").getAsInt(),
                    result.get(i).getWeightClassId(),
                    0.0001);
            assertEquals(
                    "expect equals length ",
                    o.get("length").getAsBigDecimal(),
                    result.get(i).getLength());
            assertEquals(
                    "expect equals width ",
                    o.get("width").getAsBigDecimal(),
                    result.get(i).getWidth());
            assertEquals(
                    "expect equals height ",
                    o.get("height").getAsBigDecimal(),
                    result.get(i).getHeight());
            assertEquals(
                    "expect equals lengthClassId ",
                    o.get("lengthClassId").getAsInt(),
                    result.get(i).getLengthClassId(),
                    0.0001);
            assertEquals(
                    "expect equals subtract ",
                    o.get("subtract").getAsBoolean(),
                    result.get(i).getSubtract());
            assertEquals(
                    "expect equals minimum ",
                    o.get("minimum").getAsInt(),
                    result.get(i).getMinimum(),
                    0.0001);
            assertEquals(
                    "expect equals sortOrder ",
                    o.get("sortOrder").getAsInt(),
                    result.get(i).getSortOrder(),
                    0.0001);
            assertEquals(
                    "expect equals status ",
                    o.get("status").getAsBoolean(),
                    result.get(i).getStatus());
            assertEquals(
                    "expect equals viewed ",
                    o.get("viewed").getAsInt(),
                    result.get(i).getViewed(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcProductAttribute() throws IOException {
        final String inputFile = "OcProductAttribute.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcProductAttribute> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcProductAttribute(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals attributeId ",
                    o.get("attributeId").getAsInt(),
                    result.get(i).getAttributeId(),
                    0.0001);
            assertEquals(
                    "expect equals productId ",
                    o.get("productId").getAsInt(),
                    result.get(i).getProductId(),
                    0.0001);
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals text ", o.get("text").getAsString(), result.get(i).getText());
        }

        result.clear();
    }

    @Test
    public void testParsingOcProductDescription() throws IOException {
        final String inputFile = "OcProductDescription.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcProductDescription> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcProductDescription(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals productId ",
                    o.get("productId").getAsInt(),
                    result.get(i).getProductId(),
                    0.0001);
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
            assertEquals(
                    "expect equals description ",
                    o.get("description").getAsString(),
                    result.get(i).getDescription());
            assertEquals("expect equals tag ", o.get("tag").getAsString(), result.get(i).getTag());
            assertEquals(
                    "expect equals metaTitle ",
                    o.get("metaTitle").getAsString(),
                    result.get(i).getMetaTitle());
            assertEquals(
                    "expect equals metaDescription ",
                    o.get("metaDescription").getAsString(),
                    result.get(i).getMetaDescription());
            assertEquals(
                    "expect equals metaKeyword ",
                    o.get("metaKeyword").getAsString(),
                    result.get(i).getMetaKeyword());
        }

        result.clear();
    }

    @Test
    public void testParsingOcProductDiscount() throws IOException {
        final String inputFile = "OcProductDiscount.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcProductDiscount> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcProductDiscount(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals productDiscountId ",
                    o.get("productDiscountId").getAsInt(),
                    result.get(i).getProductDiscountId(),
                    0.0001);
            assertEquals(
                    "expect equals productId ",
                    o.get("productId").getAsInt(),
                    result.get(i).getProductId(),
                    0.0001);
            assertEquals(
                    "expect equals customerGroupId ",
                    o.get("customerGroupId").getAsInt(),
                    result.get(i).getCustomerGroupId(),
                    0.0001);
            assertEquals(
                    "expect equals quantity ",
                    o.get("quantity").getAsInt(),
                    result.get(i).getQuantity(),
                    0.0001);
            assertEquals(
                    "expect equals priority ",
                    o.get("priority").getAsInt(),
                    result.get(i).getPriority(),
                    0.0001);
            assertEquals(
                    "expect equals price ",
                    o.get("price").getAsBigDecimal(),
                    result.get(i).getPrice());
        }

        result.clear();
    }

    @Test
    public void testParsingOcProductFilter() throws IOException {
        final String inputFile = "OcProductFilter.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcProductFilter> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcProductFilter(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals filterId ",
                    o.get("filterId").getAsInt(),
                    result.get(i).getFilterId(),
                    0.0001);
            assertEquals(
                    "expect equals productId ",
                    o.get("productId").getAsInt(),
                    result.get(i).getProductId(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcProductImage() throws IOException {
        final String inputFile = "OcProductImage.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcProductImage> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcProductImage(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals productImageId ",
                    o.get("productImageId").getAsInt(),
                    result.get(i).getProductImageId(),
                    0.0001);
            assertEquals(
                    "expect equals productId ",
                    o.get("productId").getAsInt(),
                    result.get(i).getProductId(),
                    0.0001);
            assertEquals(
                    "expect equals image ", o.get("image").getAsString(), result.get(i).getImage());
            assertEquals(
                    "expect equals sortOrder ",
                    o.get("sortOrder").getAsInt(),
                    result.get(i).getSortOrder(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcProductOption() throws IOException {
        final String inputFile = "OcProductOption.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcProductOption> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcProductOption(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals productOptionId ",
                    o.get("productOptionId").getAsInt(),
                    result.get(i).getProductOptionId(),
                    0.0001);
            assertEquals(
                    "expect equals productId ",
                    o.get("productId").getAsInt(),
                    result.get(i).getProductId(),
                    0.0001);
            assertEquals(
                    "expect equals optionId ",
                    o.get("optionId").getAsInt(),
                    result.get(i).getOptionId(),
                    0.0001);
            assertEquals(
                    "expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
            assertEquals(
                    "expect equals required ",
                    o.get("required").getAsBoolean(),
                    result.get(i).getRequired());
        }

        result.clear();
    }

    @Test
    public void testParsingOcProductOptionValue() throws IOException {
        final String inputFile = "OcProductOptionValue.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcProductOptionValue> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcProductOptionValue(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals productOptionValueId ",
                    o.get("productOptionValueId").getAsInt(),
                    result.get(i).getProductOptionValueId(),
                    0.0001);
            assertEquals(
                    "expect equals productOptionId ",
                    o.get("productOptionId").getAsInt(),
                    result.get(i).getProductOptionId(),
                    0.0001);
            assertEquals(
                    "expect equals productId ",
                    o.get("productId").getAsInt(),
                    result.get(i).getProductId(),
                    0.0001);
            assertEquals(
                    "expect equals optionId ",
                    o.get("optionId").getAsInt(),
                    result.get(i).getOptionId(),
                    0.0001);
            assertEquals(
                    "expect equals optionValueId ",
                    o.get("optionValueId").getAsInt(),
                    result.get(i).getOptionValueId(),
                    0.0001);
            assertEquals(
                    "expect equals quantity ",
                    o.get("quantity").getAsInt(),
                    result.get(i).getQuantity(),
                    0.0001);
            assertEquals(
                    "expect equals subtract ",
                    o.get("subtract").getAsBoolean(),
                    result.get(i).getSubtract());
            assertEquals(
                    "expect equals price ",
                    o.get("price").getAsBigDecimal(),
                    result.get(i).getPrice());
            assertEquals(
                    "expect equals pricePrefix ",
                    o.get("pricePrefix").getAsString(),
                    result.get(i).getPricePrefix());
            assertEquals(
                    "expect equals points ",
                    o.get("points").getAsInt(),
                    result.get(i).getPoints(),
                    0.0001);
            assertEquals(
                    "expect equals pointsPrefix ",
                    o.get("pointsPrefix").getAsString(),
                    result.get(i).getPointsPrefix());
            assertEquals(
                    "expect equals weight ",
                    o.get("weight").getAsBigDecimal(),
                    result.get(i).getWeight());
            assertEquals(
                    "expect equals weightPrefix ",
                    o.get("weightPrefix").getAsString(),
                    result.get(i).getWeightPrefix());
        }

        result.clear();
    }

    @Test
    public void testParsingOcProductRecurring() throws IOException {
        final String inputFile = "OcProductRecurring.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcProductRecurring> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcProductRecurring(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals recurringId ",
                    o.get("recurringId").getAsInt(),
                    result.get(i).getRecurringId(),
                    0.0001);
            assertEquals(
                    "expect equals productId ",
                    o.get("productId").getAsInt(),
                    result.get(i).getProductId(),
                    0.0001);
            assertEquals(
                    "expect equals customerGroupId ",
                    o.get("customerGroupId").getAsInt(),
                    result.get(i).getCustomerGroupId(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcProductRelated() throws IOException {
        final String inputFile = "OcProductRelated.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcProductRelated> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcProductRelated(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals relatedId ",
                    o.get("relatedId").getAsInt(),
                    result.get(i).getRelatedId(),
                    0.0001);
            assertEquals(
                    "expect equals productId ",
                    o.get("productId").getAsInt(),
                    result.get(i).getProductId(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcProductReward() throws IOException {
        final String inputFile = "OcProductReward.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcProductReward> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcProductReward(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals productRewardId ",
                    o.get("productRewardId").getAsInt(),
                    result.get(i).getProductRewardId(),
                    0.0001);
            assertEquals(
                    "expect equals productId ",
                    o.get("productId").getAsInt(),
                    result.get(i).getProductId(),
                    0.0001);
            assertEquals(
                    "expect equals customerGroupId ",
                    o.get("customerGroupId").getAsInt(),
                    result.get(i).getCustomerGroupId(),
                    0.0001);
            assertEquals(
                    "expect equals points ",
                    o.get("points").getAsInt(),
                    result.get(i).getPoints(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcProductSpecial() throws IOException {
        final String inputFile = "OcProductSpecial.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcProductSpecial> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcProductSpecial(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals productSpecialId ",
                    o.get("productSpecialId").getAsInt(),
                    result.get(i).getProductSpecialId(),
                    0.0001);
            assertEquals(
                    "expect equals productId ",
                    o.get("productId").getAsInt(),
                    result.get(i).getProductId(),
                    0.0001);
            assertEquals(
                    "expect equals customerGroupId ",
                    o.get("customerGroupId").getAsInt(),
                    result.get(i).getCustomerGroupId(),
                    0.0001);
            assertEquals(
                    "expect equals priority ",
                    o.get("priority").getAsInt(),
                    result.get(i).getPriority(),
                    0.0001);
            assertEquals(
                    "expect equals price ",
                    o.get("price").getAsBigDecimal(),
                    result.get(i).getPrice());
        }

        result.clear();
    }

    @Test
    public void testParsingOcProductToCategory() throws IOException {
        final String inputFile = "OcProductToCategory.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcProductToCategory> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcProductToCategory(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals categoryId ",
                    o.get("categoryId").getAsInt(),
                    result.get(i).getCategoryId(),
                    0.0001);
            assertEquals(
                    "expect equals productId ",
                    o.get("productId").getAsInt(),
                    result.get(i).getProductId(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcProductToDownload() throws IOException {
        final String inputFile = "OcProductToDownload.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcProductToDownload> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcProductToDownload(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals productId ",
                    o.get("productId").getAsInt(),
                    result.get(i).getProductId(),
                    0.0001);
            assertEquals(
                    "expect equals downloadId ",
                    o.get("downloadId").getAsInt(),
                    result.get(i).getDownloadId(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcProductToLayout() throws IOException {
        final String inputFile = "OcProductToLayout.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcProductToLayout> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcProductToLayout(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals storeId ",
                    o.get("storeId").getAsInt(),
                    result.get(i).getStoreId(),
                    0.0001);
            assertEquals(
                    "expect equals productId ",
                    o.get("productId").getAsInt(),
                    result.get(i).getProductId(),
                    0.0001);
            assertEquals(
                    "expect equals layoutId ",
                    o.get("layoutId").getAsInt(),
                    result.get(i).getLayoutId(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcProductToStore() throws IOException {
        final String inputFile = "OcProductToStore.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcProductToStore> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcProductToStore(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals storeId ",
                    o.get("storeId").getAsInt(),
                    result.get(i).getStoreId(),
                    0.0001);
            assertEquals(
                    "expect equals productId ",
                    o.get("productId").getAsInt(),
                    result.get(i).getProductId(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcRecurring() throws IOException {
        final String inputFile = "OcRecurring.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcRecurring> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcRecurring(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals recurringId ",
                    o.get("recurringId").getAsInt(),
                    result.get(i).getRecurringId(),
                    0.0001);
            assertEquals(
                    "expect equals price ",
                    o.get("price").getAsBigDecimal(),
                    result.get(i).getPrice());
            assertEquals(
                    "expect equals frequency ",
                    o.get("frequency").getAsString(),
                    result.get(i).getFrequency());
            assertEquals(
                    "expect equals duration ",
                    o.get("duration").getAsInt(),
                    result.get(i).getDuration(),
                    0.0001);
            assertEquals(
                    "expect equals cycle ",
                    o.get("cycle").getAsInt(),
                    result.get(i).getCycle(),
                    0.0001);
            assertEquals(
                    "expect equals trialStatus ",
                    o.get("trialStatus").getAsInt(),
                    result.get(i).getTrialStatus(),
                    0.0001);
            assertEquals(
                    "expect equals trialPrice ",
                    o.get("trialPrice").getAsBigDecimal(),
                    result.get(i).getTrialPrice());
            assertEquals(
                    "expect equals trialFrequency ",
                    o.get("trialFrequency").getAsString(),
                    result.get(i).getTrialFrequency());
            assertEquals(
                    "expect equals trialDuration ",
                    o.get("trialDuration").getAsInt(),
                    result.get(i).getTrialDuration(),
                    0.0001);
            assertEquals(
                    "expect equals trialCycle ",
                    o.get("trialCycle").getAsInt(),
                    result.get(i).getTrialCycle(),
                    0.0001);
            assertEquals(
                    "expect equals status ",
                    o.get("status").getAsInt(),
                    result.get(i).getStatus(),
                    0.0001);
            assertEquals(
                    "expect equals sortOrder ",
                    o.get("sortOrder").getAsInt(),
                    result.get(i).getSortOrder(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcRecurringDescription() throws IOException {
        final String inputFile = "OcRecurringDescription.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcRecurringDescription> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcRecurringDescription(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals recurringId ",
                    o.get("recurringId").getAsInt(),
                    result.get(i).getRecurringId(),
                    0.0001);
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
        }

        result.clear();
    }

    @Test
    public void testParsingOcReturn() throws IOException {
        final String inputFile = "OcReturn.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcReturn> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcReturn(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals returnId ",
                    o.get("returnId").getAsInt(),
                    result.get(i).getReturnId(),
                    0.0001);
            assertEquals(
                    "expect equals orderId ",
                    o.get("orderId").getAsInt(),
                    result.get(i).getOrderId(),
                    0.0001);
            assertEquals(
                    "expect equals productId ",
                    o.get("productId").getAsInt(),
                    result.get(i).getProductId(),
                    0.0001);
            assertEquals(
                    "expect equals customerId ",
                    o.get("customerId").getAsInt(),
                    result.get(i).getCustomerId(),
                    0.0001);
            assertEquals(
                    "expect equals firstname ",
                    o.get("firstname").getAsString(),
                    result.get(i).getFirstname());
            assertEquals(
                    "expect equals lastname ",
                    o.get("lastname").getAsString(),
                    result.get(i).getLastname());
            assertEquals(
                    "expect equals email ", o.get("email").getAsString(), result.get(i).getEmail());
            assertEquals(
                    "expect equals telephone ",
                    o.get("telephone").getAsString(),
                    result.get(i).getTelephone());
            assertEquals(
                    "expect equals product ",
                    o.get("product").getAsString(),
                    result.get(i).getProduct());
            assertEquals(
                    "expect equals model ", o.get("model").getAsString(), result.get(i).getModel());
            assertEquals(
                    "expect equals quantity ",
                    o.get("quantity").getAsInt(),
                    result.get(i).getQuantity(),
                    0.0001);
            assertEquals(
                    "expect equals opened ",
                    o.get("opened").getAsBoolean(),
                    result.get(i).getOpened());
            assertEquals(
                    "expect equals returnReasonId ",
                    o.get("returnReasonId").getAsInt(),
                    result.get(i).getReturnReasonId(),
                    0.0001);
            assertEquals(
                    "expect equals returnActionId ",
                    o.get("returnActionId").getAsInt(),
                    result.get(i).getReturnActionId(),
                    0.0001);
            assertEquals(
                    "expect equals returnStatusId ",
                    o.get("returnStatusId").getAsInt(),
                    result.get(i).getReturnStatusId(),
                    0.0001);
            assertEquals(
                    "expect equals comment ",
                    o.get("comment").getAsString(),
                    result.get(i).getComment());
        }

        result.clear();
    }

    @Test
    public void testParsingOcReturnAction() throws IOException {
        final String inputFile = "OcReturnAction.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcReturnAction> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcReturnAction(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals returnActionId ",
                    o.get("returnActionId").getAsInt(),
                    result.get(i).getReturnActionId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
        }

        result.clear();
    }

    @Test
    public void testParsingOcReturnHistory() throws IOException {
        final String inputFile = "OcReturnHistory.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcReturnHistory> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcReturnHistory(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals returnHistoryId ",
                    o.get("returnHistoryId").getAsInt(),
                    result.get(i).getReturnHistoryId(),
                    0.0001);
            assertEquals(
                    "expect equals returnId ",
                    o.get("returnId").getAsInt(),
                    result.get(i).getReturnId(),
                    0.0001);
            assertEquals(
                    "expect equals returnStatusId ",
                    o.get("returnStatusId").getAsInt(),
                    result.get(i).getReturnStatusId(),
                    0.0001);
            assertEquals(
                    "expect equals notify ",
                    o.get("notify").getAsBoolean(),
                    result.get(i).getNotify());
            assertEquals(
                    "expect equals comment ",
                    o.get("comment").getAsString(),
                    result.get(i).getComment());
        }

        result.clear();
    }

    @Test
    public void testParsingOcReturnReason() throws IOException {
        final String inputFile = "OcReturnReason.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcReturnReason> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcReturnReason(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals returnReasonId ",
                    o.get("returnReasonId").getAsInt(),
                    result.get(i).getReturnReasonId(),
                    0.0001);
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
        }

        result.clear();
    }

    @Test
    public void testParsingOcReturnStatus() throws IOException {
        final String inputFile = "OcReturnStatus.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcReturnStatus> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcReturnStatus(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals returnStatusId ",
                    o.get("returnStatusId").getAsInt(),
                    result.get(i).getReturnStatusId(),
                    0.0001);
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
        }

        result.clear();
    }

    @Test
    public void testParsingOcReview() throws IOException {
        final String inputFile = "OcReview.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcReview> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcReview(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals reviewId ",
                    o.get("reviewId").getAsInt(),
                    result.get(i).getReviewId(),
                    0.0001);
            assertEquals(
                    "expect equals productId ",
                    o.get("productId").getAsInt(),
                    result.get(i).getProductId(),
                    0.0001);
            assertEquals(
                    "expect equals customerId ",
                    o.get("customerId").getAsInt(),
                    result.get(i).getCustomerId(),
                    0.0001);
            assertEquals(
                    "expect equals author ",
                    o.get("author").getAsString(),
                    result.get(i).getAuthor());
            assertEquals(
                    "expect equals text ", o.get("text").getAsString(), result.get(i).getText());
            assertEquals(
                    "expect equals rating ",
                    o.get("rating").getAsInt(),
                    result.get(i).getRating(),
                    0.0001);
            assertEquals(
                    "expect equals status ",
                    o.get("status").getAsBoolean(),
                    result.get(i).getStatus());
        }

        result.clear();
    }

    @Test
    public void testParsingOcSetting() throws IOException {
        final String inputFile = "OcSetting.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcSetting> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcSetting(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals settingId ",
                    o.get("settingId").getAsInt(),
                    result.get(i).getSettingId(),
                    0.0001);
            assertEquals(
                    "expect equals storeId ",
                    o.get("storeId").getAsInt(),
                    result.get(i).getStoreId(),
                    0.0001);
            assertEquals(
                    "expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
            assertEquals("expect equals key ", o.get("key").getAsString(), result.get(i).getKey());
            assertEquals(
                    "expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
            assertEquals(
                    "expect equals serialized ",
                    o.get("serialized").getAsBoolean(),
                    result.get(i).getSerialized());
        }

        result.clear();
    }

    @Test
    public void testParsingOcStockStatus() throws IOException {
        final String inputFile = "OcStockStatus.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcStockStatus> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcStockStatus(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals stockStatusId ",
                    o.get("stockStatusId").getAsInt(),
                    result.get(i).getStockStatusId(),
                    0.0001);
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
        }

        result.clear();
    }

    @Test
    public void testParsingOcStore() throws IOException {
        final String inputFile = "OcStore.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcStore> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcStore(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals storeId ",
                    o.get("storeId").getAsInt(),
                    result.get(i).getStoreId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
            assertEquals("expect equals url ", o.get("url").getAsString(), result.get(i).getUrl());
            assertEquals("expect equals ssl ", o.get("ssl").getAsString(), result.get(i).getSsl());
        }

        result.clear();
    }

    @Test
    public void testParsingOcTaxClass() throws IOException {
        final String inputFile = "OcTaxClass.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcTaxClass> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcTaxClass(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals taxClassId ",
                    o.get("taxClassId").getAsInt(),
                    result.get(i).getTaxClassId(),
                    0.0001);
            assertEquals(
                    "expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
            assertEquals(
                    "expect equals description ",
                    o.get("description").getAsString(),
                    result.get(i).getDescription());
        }

        result.clear();
    }

    @Test
    public void testParsingOcTaxRate() throws IOException {
        final String inputFile = "OcTaxRate.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcTaxRate> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcTaxRate(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals taxRateId ",
                    o.get("taxRateId").getAsInt(),
                    result.get(i).getTaxRateId(),
                    0.0001);
            assertEquals(
                    "expect equals geoZoneId ",
                    o.get("geoZoneId").getAsInt(),
                    result.get(i).getGeoZoneId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
            assertEquals(
                    "expect equals rate ",
                    o.get("rate").getAsBigDecimal(),
                    result.get(i).getRate());
            assertEquals(
                    "expect equals type ", o.get("type").getAsString(), result.get(i).getType());
        }

        result.clear();
    }

    @Test
    public void testParsingOcTaxRateToCustomerGroup() throws IOException {
        final String inputFile = "OcTaxRateToCustomerGroup.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcTaxRateToCustomerGroup> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcTaxRateToCustomerGroup(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals taxRateId ",
                    o.get("taxRateId").getAsInt(),
                    result.get(i).getTaxRateId(),
                    0.0001);
            assertEquals(
                    "expect equals customerGroupId ",
                    o.get("customerGroupId").getAsInt(),
                    result.get(i).getCustomerGroupId(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcTaxRule() throws IOException {
        final String inputFile = "OcTaxRule.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcTaxRule> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcTaxRule(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals taxRuleId ",
                    o.get("taxRuleId").getAsInt(),
                    result.get(i).getTaxRuleId(),
                    0.0001);
            assertEquals(
                    "expect equals taxClassId ",
                    o.get("taxClassId").getAsInt(),
                    result.get(i).getTaxClassId(),
                    0.0001);
            assertEquals(
                    "expect equals taxRateId ",
                    o.get("taxRateId").getAsInt(),
                    result.get(i).getTaxRateId(),
                    0.0001);
            assertEquals(
                    "expect equals based ", o.get("based").getAsString(), result.get(i).getBased());
            assertEquals(
                    "expect equals priority ",
                    o.get("priority").getAsInt(),
                    result.get(i).getPriority(),
                    0.0001);
        }

        result.clear();
    }

    @Test
    public void testParsingOcTheme() throws IOException {
        final String inputFile = "OcTheme.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcTheme> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcTheme(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals themeId ",
                    o.get("themeId").getAsInt(),
                    result.get(i).getThemeId(),
                    0.0001);
            assertEquals(
                    "expect equals storeId ",
                    o.get("storeId").getAsInt(),
                    result.get(i).getStoreId(),
                    0.0001);
            assertEquals(
                    "expect equals theme ", o.get("theme").getAsString(), result.get(i).getTheme());
            assertEquals(
                    "expect equals route ", o.get("route").getAsString(), result.get(i).getRoute());
            assertEquals(
                    "expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
        }

        result.clear();
    }

    @Test
    public void testParsingOcTranslation() throws IOException {
        final String inputFile = "OcTranslation.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcTranslation> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcTranslation(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals translationId ",
                    o.get("translationId").getAsInt(),
                    result.get(i).getTranslationId(),
                    0.0001);
            assertEquals(
                    "expect equals storeId ",
                    o.get("storeId").getAsInt(),
                    result.get(i).getStoreId(),
                    0.0001);
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals route ", o.get("route").getAsString(), result.get(i).getRoute());
            assertEquals("expect equals key ", o.get("key").getAsString(), result.get(i).getKey());
            assertEquals(
                    "expect equals value ", o.get("value").getAsString(), result.get(i).getValue());
        }

        result.clear();
    }

    @Test
    public void testParsingOcUpload() throws IOException {
        final String inputFile = "OcUpload.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcUpload> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcUpload(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals uploadId ",
                    o.get("uploadId").getAsInt(),
                    result.get(i).getUploadId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
            assertEquals(
                    "expect equals filename ",
                    o.get("filename").getAsString(),
                    result.get(i).getFilename());
            assertEquals(
                    "expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
        }

        result.clear();
    }

    @Test
    public void testParsingOcUrlAlias() throws IOException {
        final String inputFile = "OcUrlAlias.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcUrlAlias> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcUrlAlias(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals urlAliasId ",
                    o.get("urlAliasId").getAsInt(),
                    result.get(i).getUrlAliasId(),
                    0.0001);
            assertEquals(
                    "expect equals query ", o.get("query").getAsString(), result.get(i).getQuery());
            assertEquals(
                    "expect equals keyword ",
                    o.get("keyword").getAsString(),
                    result.get(i).getKeyword());
        }

        result.clear();
    }

    @Test
    public void testParsingOcUser() throws IOException {
        final String inputFile = "OcUser.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcUser> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcUser(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals userId ",
                    o.get("userId").getAsInt(),
                    result.get(i).getUserId(),
                    0.0001);
            assertEquals(
                    "expect equals userGroupId ",
                    o.get("userGroupId").getAsInt(),
                    result.get(i).getUserGroupId(),
                    0.0001);
            assertEquals(
                    "expect equals username ",
                    o.get("username").getAsString(),
                    result.get(i).getUsername());
            assertEquals(
                    "expect equals password ",
                    o.get("password").getAsString(),
                    result.get(i).getPassword());
            assertEquals(
                    "expect equals salt ", o.get("salt").getAsString(), result.get(i).getSalt());
            assertEquals(
                    "expect equals firstname ",
                    o.get("firstname").getAsString(),
                    result.get(i).getFirstname());
            assertEquals(
                    "expect equals lastname ",
                    o.get("lastname").getAsString(),
                    result.get(i).getLastname());
            assertEquals(
                    "expect equals email ", o.get("email").getAsString(), result.get(i).getEmail());
            assertEquals(
                    "expect equals image ", o.get("image").getAsString(), result.get(i).getImage());
            assertEquals(
                    "expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
            assertEquals("expect equals ip ", o.get("ip").getAsString(), result.get(i).getIp());
            assertEquals(
                    "expect equals status ",
                    o.get("status").getAsBoolean(),
                    result.get(i).getStatus());
        }

        result.clear();
    }

    @Test
    public void testParsingOcUserGroup() throws IOException {
        final String inputFile = "OcUserGroup.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcUserGroup> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcUserGroup(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals userGroupId ",
                    o.get("userGroupId").getAsInt(),
                    result.get(i).getUserGroupId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
            assertEquals(
                    "expect equals permission ",
                    o.get("permission").getAsString(),
                    result.get(i).getPermission());
        }

        result.clear();
    }

    @Test
    public void testParsingOcVoucher() throws IOException {
        final String inputFile = "OcVoucher.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcVoucher> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcVoucher(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals voucherId ",
                    o.get("voucherId").getAsInt(),
                    result.get(i).getVoucherId(),
                    0.0001);
            assertEquals(
                    "expect equals orderId ",
                    o.get("orderId").getAsInt(),
                    result.get(i).getOrderId(),
                    0.0001);
            assertEquals(
                    "expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
            assertEquals(
                    "expect equals fromName ",
                    o.get("fromName").getAsString(),
                    result.get(i).getFromName());
            assertEquals(
                    "expect equals fromEmail ",
                    o.get("fromEmail").getAsString(),
                    result.get(i).getFromEmail());
            assertEquals(
                    "expect equals toName ",
                    o.get("toName").getAsString(),
                    result.get(i).getToName());
            assertEquals(
                    "expect equals toEmail ",
                    o.get("toEmail").getAsString(),
                    result.get(i).getToEmail());
            assertEquals(
                    "expect equals voucherThemeId ",
                    o.get("voucherThemeId").getAsInt(),
                    result.get(i).getVoucherThemeId(),
                    0.0001);
            assertEquals(
                    "expect equals message ",
                    o.get("message").getAsString(),
                    result.get(i).getMessage());
            assertEquals(
                    "expect equals amount ",
                    o.get("amount").getAsBigDecimal(),
                    result.get(i).getAmount());
            assertEquals(
                    "expect equals status ",
                    o.get("status").getAsBoolean(),
                    result.get(i).getStatus());
        }

        result.clear();
    }

    @Test
    public void testParsingOcVoucherHistory() throws IOException {
        final String inputFile = "OcVoucherHistory.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcVoucherHistory> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcVoucherHistory(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals voucherHistoryId ",
                    o.get("voucherHistoryId").getAsInt(),
                    result.get(i).getVoucherHistoryId(),
                    0.0001);
            assertEquals(
                    "expect equals voucherId ",
                    o.get("voucherId").getAsInt(),
                    result.get(i).getVoucherId(),
                    0.0001);
            assertEquals(
                    "expect equals orderId ",
                    o.get("orderId").getAsInt(),
                    result.get(i).getOrderId(),
                    0.0001);
            assertEquals(
                    "expect equals amount ",
                    o.get("amount").getAsBigDecimal(),
                    result.get(i).getAmount());
        }

        result.clear();
    }

    @Test
    public void testParsingOcVoucherTheme() throws IOException {
        final String inputFile = "OcVoucherTheme.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcVoucherTheme> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcVoucherTheme(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals voucherThemeId ",
                    o.get("voucherThemeId").getAsInt(),
                    result.get(i).getVoucherThemeId(),
                    0.0001);
            assertEquals(
                    "expect equals image ", o.get("image").getAsString(), result.get(i).getImage());
        }

        result.clear();
    }

    @Test
    public void testParsingOcVoucherThemeDescription() throws IOException {
        final String inputFile = "OcVoucherThemeDescription.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcVoucherThemeDescription> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcVoucherThemeDescription(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals voucherThemeId ",
                    o.get("voucherThemeId").getAsInt(),
                    result.get(i).getVoucherThemeId(),
                    0.0001);
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
        }

        result.clear();
    }

    @Test
    public void testParsingOcWeightClass() throws IOException {
        final String inputFile = "OcWeightClass.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcWeightClass> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcWeightClass(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals weightClassId ",
                    o.get("weightClassId").getAsInt(),
                    result.get(i).getWeightClassId(),
                    0.0001);
            assertEquals(
                    "expect equals value ",
                    o.get("value").getAsBigDecimal(),
                    result.get(i).getValue());
        }

        result.clear();
    }

    @Test
    public void testParsingOcWeightClassDescription() throws IOException {
        final String inputFile = "OcWeightClassDescription.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcWeightClassDescription> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcWeightClassDescription(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals weightClassId ",
                    o.get("weightClassId").getAsInt(),
                    result.get(i).getWeightClassId(),
                    0.0001);
            assertEquals(
                    "expect equals languageId ",
                    o.get("languageId").getAsInt(),
                    result.get(i).getLanguageId(),
                    0.0001);
            assertEquals(
                    "expect equals title ", o.get("title").getAsString(), result.get(i).getTitle());
            assertEquals(
                    "expect equals unit ", o.get("unit").getAsString(), result.get(i).getUnit());
        }

        result.clear();
    }

    @Test
    public void testParsingOcZone() throws IOException {
        final String inputFile = "OcZone.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcZone> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcZone(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals zoneId ",
                    o.get("zoneId").getAsInt(),
                    result.get(i).getZoneId(),
                    0.0001);
            assertEquals(
                    "expect equals countryId ",
                    o.get("countryId").getAsInt(),
                    result.get(i).getCountryId(),
                    0.0001);
            assertEquals(
                    "expect equals name ", o.get("name").getAsString(), result.get(i).getName());
            assertEquals(
                    "expect equals code ", o.get("code").getAsString(), result.get(i).getCode());
            assertEquals(
                    "expect equals status ",
                    o.get("status").getAsBoolean(),
                    result.get(i).getStatus());
        }

        result.clear();
    }

    @Test
    public void testParsingOcZoneToGeoZone() throws IOException {
        final String inputFile = "OcZoneToGeoZone.json";
        final String json =
                FileUtils.readFileFromResource2String(inputFile, Charset.defaultCharset());
        JsonArray arr = JsonHelper.fromJson2Arr(json);
        final List<OcZoneToGeoZone> result = new ArrayList<>();
        arr.forEach(o -> result.add(JsonHelper.fromJson2OcZoneToGeoZone(o)));
        for (int i = 0; i < arr.size(); i++) {
            JsonObject o = arr.get(i).getAsJsonObject();
            assertEquals(
                    "expect equals zoneToGeoZoneId ",
                    o.get("zoneToGeoZoneId").getAsInt(),
                    result.get(i).getZoneToGeoZoneId(),
                    0.0001);
            assertEquals(
                    "expect equals countryId ",
                    o.get("countryId").getAsInt(),
                    result.get(i).getCountryId(),
                    0.0001);
            assertEquals(
                    "expect equals zoneId ",
                    o.get("zoneId").getAsInt(),
                    result.get(i).getZoneId(),
                    0.0001);
            assertEquals(
                    "expect equals geoZoneId ",
                    o.get("geoZoneId").getAsInt(),
                    result.get(i).getGeoZoneId(),
                    0.0001);
        }

        result.clear();
    }
}
