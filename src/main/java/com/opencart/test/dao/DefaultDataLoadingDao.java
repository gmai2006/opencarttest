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

import com.opencart.test.entity.DataLoadingStatus;
import com.opencart.test.entity.Loadingstatus;
import com.opencart.test.entity.OcAddress;
import com.opencart.test.entity.OcAffiliate;
import com.opencart.test.entity.OcAffiliateActivity;
import com.opencart.test.entity.OcAffiliateLogin;
import com.opencart.test.entity.OcAffiliateTransaction;
import com.opencart.test.entity.OcApi;
import com.opencart.test.entity.OcApiIp;
import com.opencart.test.entity.OcApiSession;
import com.opencart.test.entity.OcAttribute;
import com.opencart.test.entity.OcAttributeDescription;
import com.opencart.test.entity.OcAttributeGroup;
import com.opencart.test.entity.OcAttributeGroupDescription;
import com.opencart.test.entity.OcBanner;
import com.opencart.test.entity.OcBannerImage;
import com.opencart.test.entity.OcCart;
import com.opencart.test.entity.OcCategory;
import com.opencart.test.entity.OcCategoryDescription;
import com.opencart.test.entity.OcCategoryFilter;
import com.opencart.test.entity.OcCategoryPath;
import com.opencart.test.entity.OcCategoryToLayout;
import com.opencart.test.entity.OcCategoryToStore;
import com.opencart.test.entity.OcCountry;
import com.opencart.test.entity.OcCoupon;
import com.opencart.test.entity.OcCouponCategory;
import com.opencart.test.entity.OcCouponHistory;
import com.opencart.test.entity.OcCouponProduct;
import com.opencart.test.entity.OcCurrency;
import com.opencart.test.entity.OcCustomField;
import com.opencart.test.entity.OcCustomFieldCustomerGroup;
import com.opencart.test.entity.OcCustomFieldDescription;
import com.opencart.test.entity.OcCustomFieldValue;
import com.opencart.test.entity.OcCustomFieldValueDescription;
import com.opencart.test.entity.OcCustomer;
import com.opencart.test.entity.OcCustomerActivity;
import com.opencart.test.entity.OcCustomerGroup;
import com.opencart.test.entity.OcCustomerGroupDescription;
import com.opencart.test.entity.OcCustomerHistory;
import com.opencart.test.entity.OcCustomerIp;
import com.opencart.test.entity.OcCustomerLogin;
import com.opencart.test.entity.OcCustomerOnline;
import com.opencart.test.entity.OcCustomerReward;
import com.opencart.test.entity.OcCustomerSearch;
import com.opencart.test.entity.OcCustomerTransaction;
import com.opencart.test.entity.OcCustomerWishlist;
import com.opencart.test.entity.OcDownload;
import com.opencart.test.entity.OcDownloadDescription;
import com.opencart.test.entity.OcEvent;
import com.opencart.test.entity.OcExtension;
import com.opencart.test.entity.OcFilter;
import com.opencart.test.entity.OcFilterDescription;
import com.opencart.test.entity.OcFilterGroup;
import com.opencart.test.entity.OcFilterGroupDescription;
import com.opencart.test.entity.OcGeoZone;
import com.opencart.test.entity.OcInformation;
import com.opencart.test.entity.OcInformationDescription;
import com.opencart.test.entity.OcInformationToLayout;
import com.opencart.test.entity.OcInformationToStore;
import com.opencart.test.entity.OcLanguage;
import com.opencart.test.entity.OcLayout;
import com.opencart.test.entity.OcLayoutModule;
import com.opencart.test.entity.OcLayoutRoute;
import com.opencart.test.entity.OcLengthClass;
import com.opencart.test.entity.OcLengthClassDescription;
import com.opencart.test.entity.OcLocation;
import com.opencart.test.entity.OcManufacturer;
import com.opencart.test.entity.OcManufacturerToStore;
import com.opencart.test.entity.OcMarketing;
import com.opencart.test.entity.OcMenu;
import com.opencart.test.entity.OcMenuDescription;
import com.opencart.test.entity.OcMenuModule;
import com.opencart.test.entity.OcModification;
import com.opencart.test.entity.OcModule;
import com.opencart.test.entity.OcOption;
import com.opencart.test.entity.OcOptionDescription;
import com.opencart.test.entity.OcOptionValue;
import com.opencart.test.entity.OcOptionValueDescription;
import com.opencart.test.entity.OcOrder;
import com.opencart.test.entity.OcOrderCustomField;
import com.opencart.test.entity.OcOrderHistory;
import com.opencart.test.entity.OcOrderOption;
import com.opencart.test.entity.OcOrderProduct;
import com.opencart.test.entity.OcOrderRecurring;
import com.opencart.test.entity.OcOrderRecurringTransaction;
import com.opencart.test.entity.OcOrderStatus;
import com.opencart.test.entity.OcOrderTotal;
import com.opencart.test.entity.OcOrderVoucher;
import com.opencart.test.entity.OcProduct;
import com.opencart.test.entity.OcProductAttribute;
import com.opencart.test.entity.OcProductDescription;
import com.opencart.test.entity.OcProductDiscount;
import com.opencart.test.entity.OcProductFilter;
import com.opencart.test.entity.OcProductImage;
import com.opencart.test.entity.OcProductOption;
import com.opencart.test.entity.OcProductOptionValue;
import com.opencart.test.entity.OcProductRecurring;
import com.opencart.test.entity.OcProductRelated;
import com.opencart.test.entity.OcProductReward;
import com.opencart.test.entity.OcProductSpecial;
import com.opencart.test.entity.OcProductToCategory;
import com.opencart.test.entity.OcProductToDownload;
import com.opencart.test.entity.OcProductToLayout;
import com.opencart.test.entity.OcProductToStore;
import com.opencart.test.entity.OcRecurring;
import com.opencart.test.entity.OcRecurringDescription;
import com.opencart.test.entity.OcReturn;
import com.opencart.test.entity.OcReturnAction;
import com.opencart.test.entity.OcReturnHistory;
import com.opencart.test.entity.OcReturnReason;
import com.opencart.test.entity.OcReturnStatus;
import com.opencart.test.entity.OcReview;
import com.opencart.test.entity.OcSetting;
import com.opencart.test.entity.OcStockStatus;
import com.opencart.test.entity.OcStore;
import com.opencart.test.entity.OcTaxClass;
import com.opencart.test.entity.OcTaxRate;
import com.opencart.test.entity.OcTaxRateToCustomerGroup;
import com.opencart.test.entity.OcTaxRule;
import com.opencart.test.entity.OcTheme;
import com.opencart.test.entity.OcTranslation;
import com.opencart.test.entity.OcUpload;
import com.opencart.test.entity.OcUrlAlias;
import com.opencart.test.entity.OcUser;
import com.opencart.test.entity.OcUserGroup;
import com.opencart.test.entity.OcVoucher;
import com.opencart.test.entity.OcVoucherHistory;
import com.opencart.test.entity.OcVoucherTheme;
import com.opencart.test.entity.OcVoucherThemeDescription;
import com.opencart.test.entity.OcWeightClass;
import com.opencart.test.entity.OcWeightClassDescription;
import com.opencart.test.entity.OcZone;
import com.opencart.test.entity.OcZoneToGeoZone;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

@Stateless
@Named("DefaultDataLoadingDao")
public class DefaultDataLoadingDao implements DataLoadingDao {

    private static final Logger logger = Logger.getLogger(DefaultDataLoadingDao.class.getName());
    private JpaDao dao;

    @Inject
    @Named("DefaultJpaDao")
    public DefaultDataLoadingDao(JpaDao dao) {
        this.dao = dao;
    }

    /** {@inheritDoc} */
    @Override
    public DataLoadingStatus update(DataLoadingStatus e) {
        return dao.update(e);
    }

    /** {@inheritDoc} */
    @Override
    public DataLoadingStatus getLoadingStatus(String type) {
        DataLoadingStatus loadingStatus = dao.find(DataLoadingStatus.class, type);
        if (null == loadingStatus) {
            loadingStatus = new DataLoadingStatus(type, Loadingstatus.NEW);
            dao.create(loadingStatus);
        }
        return loadingStatus;
    }

    /** {@inheritDoc} */
    @Override
    public <E> E create(E e) {
        return dao.create(e);
    }

    /** {@inheritDoc} */
    @Override
    public void delete(String id) {
        dao.delete(DataLoadingStatus.class, id);
    }

    /** {@inheritDoc} */
    @Override
    public void deleteAll() {
        dao.deleteAll(OcAddress.class);
        dao.deleteAll(OcAffiliate.class);
        dao.deleteAll(OcAffiliateActivity.class);
        dao.deleteAll(OcAffiliateLogin.class);
        dao.deleteAll(OcAffiliateTransaction.class);
        dao.deleteAll(OcApi.class);
        dao.deleteAll(OcApiIp.class);
        dao.deleteAll(OcApiSession.class);
        dao.deleteAll(OcAttribute.class);
        dao.deleteAll(OcAttributeDescription.class);
        dao.deleteAll(OcAttributeGroup.class);
        dao.deleteAll(OcAttributeGroupDescription.class);
        dao.deleteAll(OcBanner.class);
        dao.deleteAll(OcBannerImage.class);
        dao.deleteAll(OcCart.class);
        dao.deleteAll(OcCategory.class);
        dao.deleteAll(OcCategoryDescription.class);
        dao.deleteAll(OcCategoryFilter.class);
        dao.deleteAll(OcCategoryPath.class);
        dao.deleteAll(OcCategoryToLayout.class);
        dao.deleteAll(OcCategoryToStore.class);
        dao.deleteAll(OcCountry.class);
        dao.deleteAll(OcCoupon.class);
        dao.deleteAll(OcCouponCategory.class);
        dao.deleteAll(OcCouponHistory.class);
        dao.deleteAll(OcCouponProduct.class);
        dao.deleteAll(OcCurrency.class);
        dao.deleteAll(OcCustomField.class);
        dao.deleteAll(OcCustomFieldCustomerGroup.class);
        dao.deleteAll(OcCustomFieldDescription.class);
        dao.deleteAll(OcCustomFieldValue.class);
        dao.deleteAll(OcCustomFieldValueDescription.class);
        dao.deleteAll(OcCustomer.class);
        dao.deleteAll(OcCustomerActivity.class);
        dao.deleteAll(OcCustomerGroup.class);
        dao.deleteAll(OcCustomerGroupDescription.class);
        dao.deleteAll(OcCustomerHistory.class);
        dao.deleteAll(OcCustomerIp.class);
        dao.deleteAll(OcCustomerLogin.class);
        dao.deleteAll(OcCustomerOnline.class);
        dao.deleteAll(OcCustomerReward.class);
        dao.deleteAll(OcCustomerSearch.class);
        dao.deleteAll(OcCustomerTransaction.class);
        dao.deleteAll(OcCustomerWishlist.class);
        dao.deleteAll(OcDownload.class);
        dao.deleteAll(OcDownloadDescription.class);
        dao.deleteAll(OcEvent.class);
        dao.deleteAll(OcExtension.class);
        dao.deleteAll(OcFilter.class);
        dao.deleteAll(OcFilterDescription.class);
        dao.deleteAll(OcFilterGroup.class);
        dao.deleteAll(OcFilterGroupDescription.class);
        dao.deleteAll(OcGeoZone.class);
        dao.deleteAll(OcInformation.class);
        dao.deleteAll(OcInformationDescription.class);
        dao.deleteAll(OcInformationToLayout.class);
        dao.deleteAll(OcInformationToStore.class);
        dao.deleteAll(OcLanguage.class);
        dao.deleteAll(OcLayout.class);
        dao.deleteAll(OcLayoutModule.class);
        dao.deleteAll(OcLayoutRoute.class);
        dao.deleteAll(OcLengthClass.class);
        dao.deleteAll(OcLengthClassDescription.class);
        dao.deleteAll(OcLocation.class);
        dao.deleteAll(OcManufacturer.class);
        dao.deleteAll(OcManufacturerToStore.class);
        dao.deleteAll(OcMarketing.class);
        dao.deleteAll(OcMenu.class);
        dao.deleteAll(OcMenuDescription.class);
        dao.deleteAll(OcMenuModule.class);
        dao.deleteAll(OcModification.class);
        dao.deleteAll(OcModule.class);
        dao.deleteAll(OcOption.class);
        dao.deleteAll(OcOptionDescription.class);
        dao.deleteAll(OcOptionValue.class);
        dao.deleteAll(OcOptionValueDescription.class);
        dao.deleteAll(OcOrder.class);
        dao.deleteAll(OcOrderCustomField.class);
        dao.deleteAll(OcOrderHistory.class);
        dao.deleteAll(OcOrderOption.class);
        dao.deleteAll(OcOrderProduct.class);
        dao.deleteAll(OcOrderRecurring.class);
        dao.deleteAll(OcOrderRecurringTransaction.class);
        dao.deleteAll(OcOrderStatus.class);
        dao.deleteAll(OcOrderTotal.class);
        dao.deleteAll(OcOrderVoucher.class);
        dao.deleteAll(OcProduct.class);
        dao.deleteAll(OcProductAttribute.class);
        dao.deleteAll(OcProductDescription.class);
        dao.deleteAll(OcProductDiscount.class);
        dao.deleteAll(OcProductFilter.class);
        dao.deleteAll(OcProductImage.class);
        dao.deleteAll(OcProductOption.class);
        dao.deleteAll(OcProductOptionValue.class);
        dao.deleteAll(OcProductRecurring.class);
        dao.deleteAll(OcProductRelated.class);
        dao.deleteAll(OcProductReward.class);
        dao.deleteAll(OcProductSpecial.class);
        dao.deleteAll(OcProductToCategory.class);
        dao.deleteAll(OcProductToDownload.class);
        dao.deleteAll(OcProductToLayout.class);
        dao.deleteAll(OcProductToStore.class);
        dao.deleteAll(OcRecurring.class);
        dao.deleteAll(OcRecurringDescription.class);
        dao.deleteAll(OcReturn.class);
        dao.deleteAll(OcReturnAction.class);
        dao.deleteAll(OcReturnHistory.class);
        dao.deleteAll(OcReturnReason.class);
        dao.deleteAll(OcReturnStatus.class);
        dao.deleteAll(OcReview.class);
        dao.deleteAll(OcSetting.class);
        dao.deleteAll(OcStockStatus.class);
        dao.deleteAll(OcStore.class);
        dao.deleteAll(OcTaxClass.class);
        dao.deleteAll(OcTaxRate.class);
        dao.deleteAll(OcTaxRateToCustomerGroup.class);
        dao.deleteAll(OcTaxRule.class);
        dao.deleteAll(OcTheme.class);
        dao.deleteAll(OcTranslation.class);
        dao.deleteAll(OcUpload.class);
        dao.deleteAll(OcUrlAlias.class);
        dao.deleteAll(OcUser.class);
        dao.deleteAll(OcUserGroup.class);
        dao.deleteAll(OcVoucher.class);
        dao.deleteAll(OcVoucherHistory.class);
        dao.deleteAll(OcVoucherTheme.class);
        dao.deleteAll(OcVoucherThemeDescription.class);
        dao.deleteAll(OcWeightClass.class);
        dao.deleteAll(OcWeightClassDescription.class);
        dao.deleteAll(OcZone.class);
        dao.deleteAll(OcZoneToGeoZone.class);
    }
}
