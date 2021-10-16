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
package com.opencart.test.rest;

import com.opencart.test.dao.JpaDao;
import com.opencart.test.handler.*;
import com.opencart.test.utils.MetaDataEnum;
import java.io.InputStream;
import java.util.Arrays;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/admin")
@Consumes(MediaType.APPLICATION_JSON)
@Produces({MediaType.APPLICATION_JSON})
public class DatabaseLoadingResource {
    private final Logger logger = Logger.getLogger(this.getClass().getName());

    public DatabaseLoadingResource() {}

    @Inject
    @Named("DefaultJpaDao")
    JpaDao jpa;

    /**
     * hello.
     *
     * @return a hello.
     */
    @GET
    @Path("")
    public Response hello() {
        return Response.status(Response.Status.OK).entity(this.getClass().getName()).build();
    }

    @GET
    @Path("loaddata")
    public Response loadData() {

        Arrays.stream(MetaDataEnum.values())
                .forEach(
                        item -> {
                            logger.info("processing " + item.name());
                            InputStream in =
                                    DatabaseLoadingResource.class.getResourceAsStream(
                                            "/" + item.name() + ".csv");
                            process(item.name(), in, jpa);
                        });

        return Response.status(Response.Status.OK)
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Credentials", "true")
                .header(
                        "Access-Control-Allow-Headers",
                        "origin, content-type, accept, authorization")
                .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD")
                .build();
    }

    private static void process(String handlerName, InputStream inputStream, JpaDao jpa) {
        DelimiterFileHandler handler = null;

        switch (handlerName) {
            case "OcAddress":
                handler = new OcAddressHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcAffiliate":
                handler = new OcAffiliateHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcAffiliateActivity":
                handler = new OcAffiliateActivityHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcAffiliateLogin":
                handler = new OcAffiliateLoginHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcAffiliateTransaction":
                handler = new OcAffiliateTransactionHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcApi":
                handler = new OcApiHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcApiIp":
                handler = new OcApiIpHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcApiSession":
                handler = new OcApiSessionHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcAttribute":
                handler = new OcAttributeHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcAttributeDescription":
                handler = new OcAttributeDescriptionHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcAttributeGroup":
                handler = new OcAttributeGroupHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcAttributeGroupDescription":
                handler = new OcAttributeGroupDescriptionHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcBanner":
                handler = new OcBannerHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcBannerImage":
                handler = new OcBannerImageHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCart":
                handler = new OcCartHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCategory":
                handler = new OcCategoryHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCategoryDescription":
                handler = new OcCategoryDescriptionHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCategoryFilter":
                handler = new OcCategoryFilterHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCategoryPath":
                handler = new OcCategoryPathHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCategoryToLayout":
                handler = new OcCategoryToLayoutHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCategoryToStore":
                handler = new OcCategoryToStoreHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCountry":
                handler = new OcCountryHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCoupon":
                handler = new OcCouponHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCouponCategory":
                handler = new OcCouponCategoryHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCouponHistory":
                handler = new OcCouponHistoryHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCouponProduct":
                handler = new OcCouponProductHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCurrency":
                handler = new OcCurrencyHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCustomField":
                handler = new OcCustomFieldHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCustomFieldCustomerGroup":
                handler = new OcCustomFieldCustomerGroupHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCustomFieldDescription":
                handler = new OcCustomFieldDescriptionHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCustomFieldValue":
                handler = new OcCustomFieldValueHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCustomFieldValueDescription":
                handler = new OcCustomFieldValueDescriptionHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCustomer":
                handler = new OcCustomerHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCustomerActivity":
                handler = new OcCustomerActivityHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCustomerGroup":
                handler = new OcCustomerGroupHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCustomerGroupDescription":
                handler = new OcCustomerGroupDescriptionHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCustomerHistory":
                handler = new OcCustomerHistoryHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCustomerIp":
                handler = new OcCustomerIpHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCustomerLogin":
                handler = new OcCustomerLoginHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCustomerOnline":
                handler = new OcCustomerOnlineHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCustomerReward":
                handler = new OcCustomerRewardHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCustomerSearch":
                handler = new OcCustomerSearchHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCustomerTransaction":
                handler = new OcCustomerTransactionHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcCustomerWishlist":
                handler = new OcCustomerWishlistHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcDownload":
                handler = new OcDownloadHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcDownloadDescription":
                handler = new OcDownloadDescriptionHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcEvent":
                handler = new OcEventHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcExtension":
                handler = new OcExtensionHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcFilter":
                handler = new OcFilterHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcFilterDescription":
                handler = new OcFilterDescriptionHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcFilterGroup":
                handler = new OcFilterGroupHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcFilterGroupDescription":
                handler = new OcFilterGroupDescriptionHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcGeoZone":
                handler = new OcGeoZoneHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcInformation":
                handler = new OcInformationHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcInformationDescription":
                handler = new OcInformationDescriptionHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcInformationToLayout":
                handler = new OcInformationToLayoutHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcInformationToStore":
                handler = new OcInformationToStoreHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcLanguage":
                handler = new OcLanguageHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcLayout":
                handler = new OcLayoutHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcLayoutModule":
                handler = new OcLayoutModuleHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcLayoutRoute":
                handler = new OcLayoutRouteHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcLengthClass":
                handler = new OcLengthClassHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcLengthClassDescription":
                handler = new OcLengthClassDescriptionHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcLocation":
                handler = new OcLocationHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcManufacturer":
                handler = new OcManufacturerHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcManufacturerToStore":
                handler = new OcManufacturerToStoreHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcMarketing":
                handler = new OcMarketingHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcMenu":
                handler = new OcMenuHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcMenuDescription":
                handler = new OcMenuDescriptionHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcMenuModule":
                handler = new OcMenuModuleHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcModification":
                handler = new OcModificationHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcModule":
                handler = new OcModuleHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcOption":
                handler = new OcOptionHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcOptionDescription":
                handler = new OcOptionDescriptionHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcOptionValue":
                handler = new OcOptionValueHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcOptionValueDescription":
                handler = new OcOptionValueDescriptionHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcOrder":
                handler = new OcOrderHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcOrderCustomField":
                handler = new OcOrderCustomFieldHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcOrderHistory":
                handler = new OcOrderHistoryHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcOrderOption":
                handler = new OcOrderOptionHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcOrderProduct":
                handler = new OcOrderProductHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcOrderRecurring":
                handler = new OcOrderRecurringHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcOrderRecurringTransaction":
                handler = new OcOrderRecurringTransactionHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcOrderStatus":
                handler = new OcOrderStatusHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcOrderTotal":
                handler = new OcOrderTotalHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcOrderVoucher":
                handler = new OcOrderVoucherHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcProduct":
                handler = new OcProductHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcProductAttribute":
                handler = new OcProductAttributeHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcProductDescription":
                handler = new OcProductDescriptionHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcProductDiscount":
                handler = new OcProductDiscountHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcProductFilter":
                handler = new OcProductFilterHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcProductImage":
                handler = new OcProductImageHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcProductOption":
                handler = new OcProductOptionHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcProductOptionValue":
                handler = new OcProductOptionValueHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcProductRecurring":
                handler = new OcProductRecurringHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcProductRelated":
                handler = new OcProductRelatedHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcProductReward":
                handler = new OcProductRewardHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcProductSpecial":
                handler = new OcProductSpecialHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcProductToCategory":
                handler = new OcProductToCategoryHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcProductToDownload":
                handler = new OcProductToDownloadHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcProductToLayout":
                handler = new OcProductToLayoutHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcProductToStore":
                handler = new OcProductToStoreHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcRecurring":
                handler = new OcRecurringHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcRecurringDescription":
                handler = new OcRecurringDescriptionHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcReturn":
                handler = new OcReturnHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcReturnAction":
                handler = new OcReturnActionHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcReturnHistory":
                handler = new OcReturnHistoryHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcReturnReason":
                handler = new OcReturnReasonHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcReturnStatus":
                handler = new OcReturnStatusHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcReview":
                handler = new OcReviewHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcSetting":
                handler = new OcSettingHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcStockStatus":
                handler = new OcStockStatusHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcStore":
                handler = new OcStoreHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcTaxClass":
                handler = new OcTaxClassHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcTaxRate":
                handler = new OcTaxRateHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcTaxRateToCustomerGroup":
                handler = new OcTaxRateToCustomerGroupHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcTaxRule":
                handler = new OcTaxRuleHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcTheme":
                handler = new OcThemeHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcTranslation":
                handler = new OcTranslationHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcUpload":
                handler = new OcUploadHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcUrlAlias":
                handler = new OcUrlAliasHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcUser":
                handler = new OcUserHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcUserGroup":
                handler = new OcUserGroupHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcVoucher":
                handler = new OcVoucherHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcVoucherHistory":
                handler = new OcVoucherHistoryHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcVoucherTheme":
                handler = new OcVoucherThemeHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcVoucherThemeDescription":
                handler = new OcVoucherThemeDescriptionHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcWeightClass":
                handler = new OcWeightClassHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcWeightClassDescription":
                handler = new OcWeightClassDescriptionHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcZone":
                handler = new OcZoneHandler(jpa);
                handler.process(inputStream);
                break;

            case "OcZoneToGeoZone":
                handler = new OcZoneToGeoZoneHandler(jpa);
                handler.process(inputStream);
                break;

            default:
                System.out.println("Not found " + handlerName);
        }
    }
}
