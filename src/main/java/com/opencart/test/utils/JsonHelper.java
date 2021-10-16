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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.opencart.test.entity.*;
import java.util.Objects;

public class JsonHelper {
    static final Gson gson =
            new GsonBuilder()
                    .registerTypeHierarchyAdapter(byte[].class, new ByteArrayToBase64TypeAdapter())
                    .setDateFormat("yyyy-MM-dd HH:mm:ss.S")
                    .create();

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcAddress.
     */
    public static OcAddress fromJson2OcAddress(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcAddress.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcAffiliate.
     */
    public static OcAffiliate fromJson2OcAffiliate(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcAffiliate.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcAffiliateActivity.
     */
    public static OcAffiliateActivity fromJson2OcAffiliateActivity(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcAffiliateActivity.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcAffiliateLogin.
     */
    public static OcAffiliateLogin fromJson2OcAffiliateLogin(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcAffiliateLogin.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcAffiliateTransaction.
     */
    public static OcAffiliateTransaction fromJson2OcAffiliateTransaction(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcAffiliateTransaction.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcApi.
     */
    public static OcApi fromJson2OcApi(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcApi.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcApiIp.
     */
    public static OcApiIp fromJson2OcApiIp(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcApiIp.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcApiSession.
     */
    public static OcApiSession fromJson2OcApiSession(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcApiSession.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcAttribute.
     */
    public static OcAttribute fromJson2OcAttribute(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcAttribute.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcAttributeDescription.
     */
    public static OcAttributeDescription fromJson2OcAttributeDescription(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcAttributeDescription.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcAttributeGroup.
     */
    public static OcAttributeGroup fromJson2OcAttributeGroup(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcAttributeGroup.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcAttributeGroupDescription.
     */
    public static OcAttributeGroupDescription fromJson2OcAttributeGroupDescription(
            JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcAttributeGroupDescription.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcBanner.
     */
    public static OcBanner fromJson2OcBanner(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcBanner.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcBannerImage.
     */
    public static OcBannerImage fromJson2OcBannerImage(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcBannerImage.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCart.
     */
    public static OcCart fromJson2OcCart(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCart.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCategory.
     */
    public static OcCategory fromJson2OcCategory(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCategory.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCategoryDescription.
     */
    public static OcCategoryDescription fromJson2OcCategoryDescription(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCategoryDescription.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCategoryFilter.
     */
    public static OcCategoryFilter fromJson2OcCategoryFilter(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCategoryFilter.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCategoryPath.
     */
    public static OcCategoryPath fromJson2OcCategoryPath(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCategoryPath.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCategoryToLayout.
     */
    public static OcCategoryToLayout fromJson2OcCategoryToLayout(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCategoryToLayout.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCategoryToStore.
     */
    public static OcCategoryToStore fromJson2OcCategoryToStore(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCategoryToStore.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCountry.
     */
    public static OcCountry fromJson2OcCountry(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCountry.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCoupon.
     */
    public static OcCoupon fromJson2OcCoupon(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCoupon.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCouponCategory.
     */
    public static OcCouponCategory fromJson2OcCouponCategory(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCouponCategory.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCouponHistory.
     */
    public static OcCouponHistory fromJson2OcCouponHistory(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCouponHistory.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCouponProduct.
     */
    public static OcCouponProduct fromJson2OcCouponProduct(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCouponProduct.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCurrency.
     */
    public static OcCurrency fromJson2OcCurrency(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCurrency.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCustomField.
     */
    public static OcCustomField fromJson2OcCustomField(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCustomField.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCustomFieldCustomerGroup.
     */
    public static OcCustomFieldCustomerGroup fromJson2OcCustomFieldCustomerGroup(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCustomFieldCustomerGroup.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCustomFieldDescription.
     */
    public static OcCustomFieldDescription fromJson2OcCustomFieldDescription(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCustomFieldDescription.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCustomFieldValue.
     */
    public static OcCustomFieldValue fromJson2OcCustomFieldValue(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCustomFieldValue.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCustomFieldValueDescription.
     */
    public static OcCustomFieldValueDescription fromJson2OcCustomFieldValueDescription(
            JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCustomFieldValueDescription.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCustomer.
     */
    public static OcCustomer fromJson2OcCustomer(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCustomer.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCustomerActivity.
     */
    public static OcCustomerActivity fromJson2OcCustomerActivity(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCustomerActivity.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCustomerGroup.
     */
    public static OcCustomerGroup fromJson2OcCustomerGroup(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCustomerGroup.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCustomerGroupDescription.
     */
    public static OcCustomerGroupDescription fromJson2OcCustomerGroupDescription(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCustomerGroupDescription.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCustomerHistory.
     */
    public static OcCustomerHistory fromJson2OcCustomerHistory(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCustomerHistory.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCustomerIp.
     */
    public static OcCustomerIp fromJson2OcCustomerIp(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCustomerIp.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCustomerLogin.
     */
    public static OcCustomerLogin fromJson2OcCustomerLogin(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCustomerLogin.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCustomerOnline.
     */
    public static OcCustomerOnline fromJson2OcCustomerOnline(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCustomerOnline.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCustomerReward.
     */
    public static OcCustomerReward fromJson2OcCustomerReward(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCustomerReward.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCustomerSearch.
     */
    public static OcCustomerSearch fromJson2OcCustomerSearch(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCustomerSearch.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCustomerTransaction.
     */
    public static OcCustomerTransaction fromJson2OcCustomerTransaction(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCustomerTransaction.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcCustomerWishlist.
     */
    public static OcCustomerWishlist fromJson2OcCustomerWishlist(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcCustomerWishlist.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcDownload.
     */
    public static OcDownload fromJson2OcDownload(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcDownload.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcDownloadDescription.
     */
    public static OcDownloadDescription fromJson2OcDownloadDescription(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcDownloadDescription.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcEvent.
     */
    public static OcEvent fromJson2OcEvent(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcEvent.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcExtension.
     */
    public static OcExtension fromJson2OcExtension(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcExtension.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcFilter.
     */
    public static OcFilter fromJson2OcFilter(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcFilter.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcFilterDescription.
     */
    public static OcFilterDescription fromJson2OcFilterDescription(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcFilterDescription.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcFilterGroup.
     */
    public static OcFilterGroup fromJson2OcFilterGroup(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcFilterGroup.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcFilterGroupDescription.
     */
    public static OcFilterGroupDescription fromJson2OcFilterGroupDescription(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcFilterGroupDescription.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcGeoZone.
     */
    public static OcGeoZone fromJson2OcGeoZone(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcGeoZone.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcInformation.
     */
    public static OcInformation fromJson2OcInformation(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcInformation.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcInformationDescription.
     */
    public static OcInformationDescription fromJson2OcInformationDescription(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcInformationDescription.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcInformationToLayout.
     */
    public static OcInformationToLayout fromJson2OcInformationToLayout(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcInformationToLayout.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcInformationToStore.
     */
    public static OcInformationToStore fromJson2OcInformationToStore(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcInformationToStore.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcLanguage.
     */
    public static OcLanguage fromJson2OcLanguage(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcLanguage.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcLayout.
     */
    public static OcLayout fromJson2OcLayout(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcLayout.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcLayoutModule.
     */
    public static OcLayoutModule fromJson2OcLayoutModule(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcLayoutModule.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcLayoutRoute.
     */
    public static OcLayoutRoute fromJson2OcLayoutRoute(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcLayoutRoute.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcLengthClass.
     */
    public static OcLengthClass fromJson2OcLengthClass(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcLengthClass.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcLengthClassDescription.
     */
    public static OcLengthClassDescription fromJson2OcLengthClassDescription(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcLengthClassDescription.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcLocation.
     */
    public static OcLocation fromJson2OcLocation(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcLocation.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcManufacturer.
     */
    public static OcManufacturer fromJson2OcManufacturer(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcManufacturer.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcManufacturerToStore.
     */
    public static OcManufacturerToStore fromJson2OcManufacturerToStore(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcManufacturerToStore.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcMarketing.
     */
    public static OcMarketing fromJson2OcMarketing(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcMarketing.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcMenu.
     */
    public static OcMenu fromJson2OcMenu(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcMenu.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcMenuDescription.
     */
    public static OcMenuDescription fromJson2OcMenuDescription(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcMenuDescription.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcMenuModule.
     */
    public static OcMenuModule fromJson2OcMenuModule(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcMenuModule.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcModification.
     */
    public static OcModification fromJson2OcModification(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcModification.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcModule.
     */
    public static OcModule fromJson2OcModule(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcModule.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcOption.
     */
    public static OcOption fromJson2OcOption(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcOption.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcOptionDescription.
     */
    public static OcOptionDescription fromJson2OcOptionDescription(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcOptionDescription.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcOptionValue.
     */
    public static OcOptionValue fromJson2OcOptionValue(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcOptionValue.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcOptionValueDescription.
     */
    public static OcOptionValueDescription fromJson2OcOptionValueDescription(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcOptionValueDescription.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcOrder.
     */
    public static OcOrder fromJson2OcOrder(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcOrder.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcOrderCustomField.
     */
    public static OcOrderCustomField fromJson2OcOrderCustomField(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcOrderCustomField.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcOrderHistory.
     */
    public static OcOrderHistory fromJson2OcOrderHistory(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcOrderHistory.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcOrderOption.
     */
    public static OcOrderOption fromJson2OcOrderOption(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcOrderOption.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcOrderProduct.
     */
    public static OcOrderProduct fromJson2OcOrderProduct(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcOrderProduct.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcOrderRecurring.
     */
    public static OcOrderRecurring fromJson2OcOrderRecurring(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcOrderRecurring.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcOrderRecurringTransaction.
     */
    public static OcOrderRecurringTransaction fromJson2OcOrderRecurringTransaction(
            JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcOrderRecurringTransaction.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcOrderStatus.
     */
    public static OcOrderStatus fromJson2OcOrderStatus(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcOrderStatus.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcOrderTotal.
     */
    public static OcOrderTotal fromJson2OcOrderTotal(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcOrderTotal.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcOrderVoucher.
     */
    public static OcOrderVoucher fromJson2OcOrderVoucher(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcOrderVoucher.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcProduct.
     */
    public static OcProduct fromJson2OcProduct(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcProduct.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcProductAttribute.
     */
    public static OcProductAttribute fromJson2OcProductAttribute(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcProductAttribute.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcProductDescription.
     */
    public static OcProductDescription fromJson2OcProductDescription(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcProductDescription.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcProductDiscount.
     */
    public static OcProductDiscount fromJson2OcProductDiscount(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcProductDiscount.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcProductFilter.
     */
    public static OcProductFilter fromJson2OcProductFilter(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcProductFilter.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcProductImage.
     */
    public static OcProductImage fromJson2OcProductImage(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcProductImage.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcProductOption.
     */
    public static OcProductOption fromJson2OcProductOption(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcProductOption.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcProductOptionValue.
     */
    public static OcProductOptionValue fromJson2OcProductOptionValue(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcProductOptionValue.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcProductRecurring.
     */
    public static OcProductRecurring fromJson2OcProductRecurring(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcProductRecurring.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcProductRelated.
     */
    public static OcProductRelated fromJson2OcProductRelated(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcProductRelated.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcProductReward.
     */
    public static OcProductReward fromJson2OcProductReward(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcProductReward.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcProductSpecial.
     */
    public static OcProductSpecial fromJson2OcProductSpecial(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcProductSpecial.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcProductToCategory.
     */
    public static OcProductToCategory fromJson2OcProductToCategory(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcProductToCategory.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcProductToDownload.
     */
    public static OcProductToDownload fromJson2OcProductToDownload(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcProductToDownload.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcProductToLayout.
     */
    public static OcProductToLayout fromJson2OcProductToLayout(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcProductToLayout.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcProductToStore.
     */
    public static OcProductToStore fromJson2OcProductToStore(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcProductToStore.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcRecurring.
     */
    public static OcRecurring fromJson2OcRecurring(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcRecurring.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcRecurringDescription.
     */
    public static OcRecurringDescription fromJson2OcRecurringDescription(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcRecurringDescription.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcReturn.
     */
    public static OcReturn fromJson2OcReturn(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcReturn.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcReturnAction.
     */
    public static OcReturnAction fromJson2OcReturnAction(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcReturnAction.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcReturnHistory.
     */
    public static OcReturnHistory fromJson2OcReturnHistory(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcReturnHistory.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcReturnReason.
     */
    public static OcReturnReason fromJson2OcReturnReason(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcReturnReason.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcReturnStatus.
     */
    public static OcReturnStatus fromJson2OcReturnStatus(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcReturnStatus.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcReview.
     */
    public static OcReview fromJson2OcReview(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcReview.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcSetting.
     */
    public static OcSetting fromJson2OcSetting(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcSetting.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcStockStatus.
     */
    public static OcStockStatus fromJson2OcStockStatus(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcStockStatus.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcStore.
     */
    public static OcStore fromJson2OcStore(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcStore.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcTaxClass.
     */
    public static OcTaxClass fromJson2OcTaxClass(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcTaxClass.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcTaxRate.
     */
    public static OcTaxRate fromJson2OcTaxRate(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcTaxRate.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcTaxRateToCustomerGroup.
     */
    public static OcTaxRateToCustomerGroup fromJson2OcTaxRateToCustomerGroup(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcTaxRateToCustomerGroup.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcTaxRule.
     */
    public static OcTaxRule fromJson2OcTaxRule(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcTaxRule.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcTheme.
     */
    public static OcTheme fromJson2OcTheme(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcTheme.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcTranslation.
     */
    public static OcTranslation fromJson2OcTranslation(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcTranslation.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcUpload.
     */
    public static OcUpload fromJson2OcUpload(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcUpload.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcUrlAlias.
     */
    public static OcUrlAlias fromJson2OcUrlAlias(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcUrlAlias.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcUser.
     */
    public static OcUser fromJson2OcUser(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcUser.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcUserGroup.
     */
    public static OcUserGroup fromJson2OcUserGroup(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcUserGroup.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcVoucher.
     */
    public static OcVoucher fromJson2OcVoucher(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcVoucher.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcVoucherHistory.
     */
    public static OcVoucherHistory fromJson2OcVoucherHistory(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcVoucherHistory.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcVoucherTheme.
     */
    public static OcVoucherTheme fromJson2OcVoucherTheme(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcVoucherTheme.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcVoucherThemeDescription.
     */
    public static OcVoucherThemeDescription fromJson2OcVoucherThemeDescription(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcVoucherThemeDescription.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcWeightClass.
     */
    public static OcWeightClass fromJson2OcWeightClass(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcWeightClass.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcWeightClassDescription.
     */
    public static OcWeightClassDescription fromJson2OcWeightClassDescription(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcWeightClassDescription.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcZone.
     */
    public static OcZone fromJson2OcZone(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcZone.class);
    }

    /**
     * Helper function that converts JSON to an POJO.
     *
     * @param json The JSON string.
     * @return The OcZoneToGeoZone.
     */
    public static OcZoneToGeoZone fromJson2OcZoneToGeoZone(JsonElement json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, OcZoneToGeoZone.class);
    }

    /**
     * Helper function that converts JSON to an JSON array.
     *
     * @param json The JSON string.
     * @return an JSON array.
     */
    public static JsonArray fromJson2Arr(String json) {
        Objects.requireNonNull(json);
        return gson.fromJson(json, JsonArray.class);
    }
}
