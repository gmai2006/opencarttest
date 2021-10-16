import React from 'react';
import init from "../init";
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';
import OcAddress from '../pages/tables/OcAddress';
import OcAffiliate from '../pages/tables/OcAffiliate';
import OcAffiliateActivity from '../pages/tables/OcAffiliateActivity';
import OcAffiliateLogin from '../pages/tables/OcAffiliateLogin';
import OcAffiliateTransaction from '../pages/tables/OcAffiliateTransaction';
import OcApi from '../pages/tables/OcApi';
import OcApiIp from '../pages/tables/OcApiIp';
import OcApiSession from '../pages/tables/OcApiSession';
import OcAttribute from '../pages/tables/OcAttribute';
import OcAttributeDescription from '../pages/tables/OcAttributeDescription';
import OcAttributeGroup from '../pages/tables/OcAttributeGroup';
import OcAttributeGroupDescription from '../pages/tables/OcAttributeGroupDescription';
import OcBanner from '../pages/tables/OcBanner';
import OcBannerImage from '../pages/tables/OcBannerImage';
import OcCart from '../pages/tables/OcCart';
import OcCategory from '../pages/tables/OcCategory';
import OcCategoryDescription from '../pages/tables/OcCategoryDescription';
import OcCategoryFilter from '../pages/tables/OcCategoryFilter';
import OcCategoryPath from '../pages/tables/OcCategoryPath';
import OcCategoryToLayout from '../pages/tables/OcCategoryToLayout';
import OcCategoryToStore from '../pages/tables/OcCategoryToStore';
import OcCountry from '../pages/tables/OcCountry';
import OcCoupon from '../pages/tables/OcCoupon';
import OcCouponCategory from '../pages/tables/OcCouponCategory';
import OcCouponHistory from '../pages/tables/OcCouponHistory';
import OcCouponProduct from '../pages/tables/OcCouponProduct';
import OcCurrency from '../pages/tables/OcCurrency';
import OcCustomField from '../pages/tables/OcCustomField';
import OcCustomFieldCustomerGroup from '../pages/tables/OcCustomFieldCustomerGroup';
import OcCustomFieldDescription from '../pages/tables/OcCustomFieldDescription';
import OcCustomFieldValue from '../pages/tables/OcCustomFieldValue';
import OcCustomFieldValueDescription from '../pages/tables/OcCustomFieldValueDescription';
import OcCustomer from '../pages/tables/OcCustomer';
import OcCustomerActivity from '../pages/tables/OcCustomerActivity';
import OcCustomerGroup from '../pages/tables/OcCustomerGroup';
import OcCustomerGroupDescription from '../pages/tables/OcCustomerGroupDescription';
import OcCustomerHistory from '../pages/tables/OcCustomerHistory';
import OcCustomerIp from '../pages/tables/OcCustomerIp';
import OcCustomerLogin from '../pages/tables/OcCustomerLogin';
import OcCustomerOnline from '../pages/tables/OcCustomerOnline';
import OcCustomerReward from '../pages/tables/OcCustomerReward';
import OcCustomerSearch from '../pages/tables/OcCustomerSearch';
import OcCustomerTransaction from '../pages/tables/OcCustomerTransaction';
import OcCustomerWishlist from '../pages/tables/OcCustomerWishlist';
import OcDownload from '../pages/tables/OcDownload';
import OcDownloadDescription from '../pages/tables/OcDownloadDescription';
import OcEvent from '../pages/tables/OcEvent';
import OcExtension from '../pages/tables/OcExtension';
import OcFilter from '../pages/tables/OcFilter';
import OcFilterDescription from '../pages/tables/OcFilterDescription';
import OcFilterGroup from '../pages/tables/OcFilterGroup';
import OcFilterGroupDescription from '../pages/tables/OcFilterGroupDescription';
import OcGeoZone from '../pages/tables/OcGeoZone';
import OcInformation from '../pages/tables/OcInformation';
import OcInformationDescription from '../pages/tables/OcInformationDescription';
import OcInformationToLayout from '../pages/tables/OcInformationToLayout';
import OcInformationToStore from '../pages/tables/OcInformationToStore';
import OcLanguage from '../pages/tables/OcLanguage';
import OcLayout from '../pages/tables/OcLayout';
import OcLayoutModule from '../pages/tables/OcLayoutModule';
import OcLayoutRoute from '../pages/tables/OcLayoutRoute';
import OcLengthClass from '../pages/tables/OcLengthClass';
import OcLengthClassDescription from '../pages/tables/OcLengthClassDescription';
import OcLocation from '../pages/tables/OcLocation';
import OcManufacturer from '../pages/tables/OcManufacturer';
import OcManufacturerToStore from '../pages/tables/OcManufacturerToStore';
import OcMarketing from '../pages/tables/OcMarketing';
import OcMenu from '../pages/tables/OcMenu';
import OcMenuDescription from '../pages/tables/OcMenuDescription';
import OcMenuModule from '../pages/tables/OcMenuModule';
import OcModification from '../pages/tables/OcModification';
import OcModule from '../pages/tables/OcModule';
import OcOption from '../pages/tables/OcOption';
import OcOptionDescription from '../pages/tables/OcOptionDescription';
import OcOptionValue from '../pages/tables/OcOptionValue';
import OcOptionValueDescription from '../pages/tables/OcOptionValueDescription';
import OcOrder from '../pages/tables/OcOrder';
import OcOrderCustomField from '../pages/tables/OcOrderCustomField';
import OcOrderHistory from '../pages/tables/OcOrderHistory';
import OcOrderOption from '../pages/tables/OcOrderOption';
import OcOrderProduct from '../pages/tables/OcOrderProduct';
import OcOrderRecurring from '../pages/tables/OcOrderRecurring';
import OcOrderRecurringTransaction from '../pages/tables/OcOrderRecurringTransaction';
import OcOrderStatus from '../pages/tables/OcOrderStatus';
import OcOrderTotal from '../pages/tables/OcOrderTotal';
import OcOrderVoucher from '../pages/tables/OcOrderVoucher';
import OcProduct from '../pages/tables/OcProduct';
import OcProductAttribute from '../pages/tables/OcProductAttribute';
import OcProductDescription from '../pages/tables/OcProductDescription';
import OcProductDiscount from '../pages/tables/OcProductDiscount';
import OcProductFilter from '../pages/tables/OcProductFilter';
import OcProductImage from '../pages/tables/OcProductImage';
import OcProductOption from '../pages/tables/OcProductOption';
import OcProductOptionValue from '../pages/tables/OcProductOptionValue';
import OcProductRecurring from '../pages/tables/OcProductRecurring';
import OcProductRelated from '../pages/tables/OcProductRelated';
import OcProductReward from '../pages/tables/OcProductReward';
import OcProductSpecial from '../pages/tables/OcProductSpecial';
import OcProductToCategory from '../pages/tables/OcProductToCategory';
import OcProductToDownload from '../pages/tables/OcProductToDownload';
import OcProductToLayout from '../pages/tables/OcProductToLayout';
import OcProductToStore from '../pages/tables/OcProductToStore';
import OcRecurring from '../pages/tables/OcRecurring';
import OcRecurringDescription from '../pages/tables/OcRecurringDescription';
import OcReturn from '../pages/tables/OcReturn';
import OcReturnAction from '../pages/tables/OcReturnAction';
import OcReturnHistory from '../pages/tables/OcReturnHistory';
import OcReturnReason from '../pages/tables/OcReturnReason';
import OcReturnStatus from '../pages/tables/OcReturnStatus';
import OcReview from '../pages/tables/OcReview';
import OcSetting from '../pages/tables/OcSetting';
import OcStockStatus from '../pages/tables/OcStockStatus';
import OcStore from '../pages/tables/OcStore';
import OcTaxClass from '../pages/tables/OcTaxClass';
import OcTaxRate from '../pages/tables/OcTaxRate';
import OcTaxRateToCustomerGroup from '../pages/tables/OcTaxRateToCustomerGroup';
import OcTaxRule from '../pages/tables/OcTaxRule';
import OcTheme from '../pages/tables/OcTheme';
import OcTranslation from '../pages/tables/OcTranslation';
import OcUpload from '../pages/tables/OcUpload';
import OcUrlAlias from '../pages/tables/OcUrlAlias';
import OcUser from '../pages/tables/OcUser';
import OcUserGroup from '../pages/tables/OcUserGroup';
import OcVoucher from '../pages/tables/OcVoucher';
import OcVoucherHistory from '../pages/tables/OcVoucherHistory';
import OcVoucherTheme from '../pages/tables/OcVoucherTheme';
import OcVoucherThemeDescription from '../pages/tables/OcVoucherThemeDescription';
import OcWeightClass from '../pages/tables/OcWeightClass';
import OcWeightClassDescription from '../pages/tables/OcWeightClassDescription';
import OcZone from '../pages/tables/OcZone';
import OcZoneToGeoZone from '../pages/tables/OcZoneToGeoZone';;

const TableMenu = () => {
  const path = '/' + init.appName;
  return (
    <div>
      <Switch>

          <Route path={path + '/tables/ocaddress'} component={OcAddress} />
          <Route path={path + '/tables/ocaffiliate'} component={OcAffiliate} />
          <Route path={path + '/tables/ocaffiliateactivity'} component={OcAffiliateActivity} />
          <Route path={path + '/tables/ocaffiliatelogin'} component={OcAffiliateLogin} />
          <Route path={path + '/tables/ocaffiliatetransaction'} component={OcAffiliateTransaction} />
          <Route path={path + '/tables/ocapi'} component={OcApi} />
          <Route path={path + '/tables/ocapiip'} component={OcApiIp} />
          <Route path={path + '/tables/ocapisession'} component={OcApiSession} />
          <Route path={path + '/tables/ocattribute'} component={OcAttribute} />
          <Route path={path + '/tables/ocattributedescription'} component={OcAttributeDescription} />
          <Route path={path + '/tables/ocattributegroup'} component={OcAttributeGroup} />
          <Route path={path + '/tables/ocattributegroupdescription'} component={OcAttributeGroupDescription} />
          <Route path={path + '/tables/ocbanner'} component={OcBanner} />
          <Route path={path + '/tables/ocbannerimage'} component={OcBannerImage} />
          <Route path={path + '/tables/occart'} component={OcCart} />
          <Route path={path + '/tables/occategory'} component={OcCategory} />
          <Route path={path + '/tables/occategorydescription'} component={OcCategoryDescription} />
          <Route path={path + '/tables/occategoryfilter'} component={OcCategoryFilter} />
          <Route path={path + '/tables/occategorypath'} component={OcCategoryPath} />
          <Route path={path + '/tables/occategorytolayout'} component={OcCategoryToLayout} />
          <Route path={path + '/tables/occategorytostore'} component={OcCategoryToStore} />
          <Route path={path + '/tables/occountry'} component={OcCountry} />
          <Route path={path + '/tables/occoupon'} component={OcCoupon} />
          <Route path={path + '/tables/occouponcategory'} component={OcCouponCategory} />
          <Route path={path + '/tables/occouponhistory'} component={OcCouponHistory} />
          <Route path={path + '/tables/occouponproduct'} component={OcCouponProduct} />
          <Route path={path + '/tables/occurrency'} component={OcCurrency} />
          <Route path={path + '/tables/occustomfield'} component={OcCustomField} />
          <Route path={path + '/tables/occustomfieldcustomergroup'} component={OcCustomFieldCustomerGroup} />
          <Route path={path + '/tables/occustomfielddescription'} component={OcCustomFieldDescription} />
          <Route path={path + '/tables/occustomfieldvalue'} component={OcCustomFieldValue} />
          <Route path={path + '/tables/occustomfieldvaluedescription'} component={OcCustomFieldValueDescription} />
          <Route path={path + '/tables/occustomer'} component={OcCustomer} />
          <Route path={path + '/tables/occustomeractivity'} component={OcCustomerActivity} />
          <Route path={path + '/tables/occustomergroup'} component={OcCustomerGroup} />
          <Route path={path + '/tables/occustomergroupdescription'} component={OcCustomerGroupDescription} />
          <Route path={path + '/tables/occustomerhistory'} component={OcCustomerHistory} />
          <Route path={path + '/tables/occustomerip'} component={OcCustomerIp} />
          <Route path={path + '/tables/occustomerlogin'} component={OcCustomerLogin} />
          <Route path={path + '/tables/occustomeronline'} component={OcCustomerOnline} />
          <Route path={path + '/tables/occustomerreward'} component={OcCustomerReward} />
          <Route path={path + '/tables/occustomersearch'} component={OcCustomerSearch} />
          <Route path={path + '/tables/occustomertransaction'} component={OcCustomerTransaction} />
          <Route path={path + '/tables/occustomerwishlist'} component={OcCustomerWishlist} />
          <Route path={path + '/tables/ocdownload'} component={OcDownload} />
          <Route path={path + '/tables/ocdownloaddescription'} component={OcDownloadDescription} />
          <Route path={path + '/tables/ocevent'} component={OcEvent} />
          <Route path={path + '/tables/ocextension'} component={OcExtension} />
          <Route path={path + '/tables/ocfilter'} component={OcFilter} />
          <Route path={path + '/tables/ocfilterdescription'} component={OcFilterDescription} />
          <Route path={path + '/tables/ocfiltergroup'} component={OcFilterGroup} />
          <Route path={path + '/tables/ocfiltergroupdescription'} component={OcFilterGroupDescription} />
          <Route path={path + '/tables/ocgeozone'} component={OcGeoZone} />
          <Route path={path + '/tables/ocinformation'} component={OcInformation} />
          <Route path={path + '/tables/ocinformationdescription'} component={OcInformationDescription} />
          <Route path={path + '/tables/ocinformationtolayout'} component={OcInformationToLayout} />
          <Route path={path + '/tables/ocinformationtostore'} component={OcInformationToStore} />
          <Route path={path + '/tables/oclanguage'} component={OcLanguage} />
          <Route path={path + '/tables/oclayout'} component={OcLayout} />
          <Route path={path + '/tables/oclayoutmodule'} component={OcLayoutModule} />
          <Route path={path + '/tables/oclayoutroute'} component={OcLayoutRoute} />
          <Route path={path + '/tables/oclengthclass'} component={OcLengthClass} />
          <Route path={path + '/tables/oclengthclassdescription'} component={OcLengthClassDescription} />
          <Route path={path + '/tables/oclocation'} component={OcLocation} />
          <Route path={path + '/tables/ocmanufacturer'} component={OcManufacturer} />
          <Route path={path + '/tables/ocmanufacturertostore'} component={OcManufacturerToStore} />
          <Route path={path + '/tables/ocmarketing'} component={OcMarketing} />
          <Route path={path + '/tables/ocmenu'} component={OcMenu} />
          <Route path={path + '/tables/ocmenudescription'} component={OcMenuDescription} />
          <Route path={path + '/tables/ocmenumodule'} component={OcMenuModule} />
          <Route path={path + '/tables/ocmodification'} component={OcModification} />
          <Route path={path + '/tables/ocmodule'} component={OcModule} />
          <Route path={path + '/tables/ocoption'} component={OcOption} />
          <Route path={path + '/tables/ocoptiondescription'} component={OcOptionDescription} />
          <Route path={path + '/tables/ocoptionvalue'} component={OcOptionValue} />
          <Route path={path + '/tables/ocoptionvaluedescription'} component={OcOptionValueDescription} />
          <Route path={path + '/tables/ocorder'} component={OcOrder} />
          <Route path={path + '/tables/ocordercustomfield'} component={OcOrderCustomField} />
          <Route path={path + '/tables/ocorderhistory'} component={OcOrderHistory} />
          <Route path={path + '/tables/ocorderoption'} component={OcOrderOption} />
          <Route path={path + '/tables/ocorderproduct'} component={OcOrderProduct} />
          <Route path={path + '/tables/ocorderrecurring'} component={OcOrderRecurring} />
          <Route path={path + '/tables/ocorderrecurringtransaction'} component={OcOrderRecurringTransaction} />
          <Route path={path + '/tables/ocorderstatus'} component={OcOrderStatus} />
          <Route path={path + '/tables/ocordertotal'} component={OcOrderTotal} />
          <Route path={path + '/tables/ocordervoucher'} component={OcOrderVoucher} />
          <Route path={path + '/tables/ocproduct'} component={OcProduct} />
          <Route path={path + '/tables/ocproductattribute'} component={OcProductAttribute} />
          <Route path={path + '/tables/ocproductdescription'} component={OcProductDescription} />
          <Route path={path + '/tables/ocproductdiscount'} component={OcProductDiscount} />
          <Route path={path + '/tables/ocproductfilter'} component={OcProductFilter} />
          <Route path={path + '/tables/ocproductimage'} component={OcProductImage} />
          <Route path={path + '/tables/ocproductoption'} component={OcProductOption} />
          <Route path={path + '/tables/ocproductoptionvalue'} component={OcProductOptionValue} />
          <Route path={path + '/tables/ocproductrecurring'} component={OcProductRecurring} />
          <Route path={path + '/tables/ocproductrelated'} component={OcProductRelated} />
          <Route path={path + '/tables/ocproductreward'} component={OcProductReward} />
          <Route path={path + '/tables/ocproductspecial'} component={OcProductSpecial} />
          <Route path={path + '/tables/ocproducttocategory'} component={OcProductToCategory} />
          <Route path={path + '/tables/ocproducttodownload'} component={OcProductToDownload} />
          <Route path={path + '/tables/ocproducttolayout'} component={OcProductToLayout} />
          <Route path={path + '/tables/ocproducttostore'} component={OcProductToStore} />
          <Route path={path + '/tables/ocrecurring'} component={OcRecurring} />
          <Route path={path + '/tables/ocrecurringdescription'} component={OcRecurringDescription} />
          <Route path={path + '/tables/ocreturn'} component={OcReturn} />
          <Route path={path + '/tables/ocreturnaction'} component={OcReturnAction} />
          <Route path={path + '/tables/ocreturnhistory'} component={OcReturnHistory} />
          <Route path={path + '/tables/ocreturnreason'} component={OcReturnReason} />
          <Route path={path + '/tables/ocreturnstatus'} component={OcReturnStatus} />
          <Route path={path + '/tables/ocreview'} component={OcReview} />
          <Route path={path + '/tables/ocsetting'} component={OcSetting} />
          <Route path={path + '/tables/ocstockstatus'} component={OcStockStatus} />
          <Route path={path + '/tables/ocstore'} component={OcStore} />
          <Route path={path + '/tables/octaxclass'} component={OcTaxClass} />
          <Route path={path + '/tables/octaxrate'} component={OcTaxRate} />
          <Route path={path + '/tables/octaxratetocustomergroup'} component={OcTaxRateToCustomerGroup} />
          <Route path={path + '/tables/octaxrule'} component={OcTaxRule} />
          <Route path={path + '/tables/octheme'} component={OcTheme} />
          <Route path={path + '/tables/octranslation'} component={OcTranslation} />
          <Route path={path + '/tables/ocupload'} component={OcUpload} />
          <Route path={path + '/tables/ocurlalias'} component={OcUrlAlias} />
          <Route path={path + '/tables/ocuser'} component={OcUser} />
          <Route path={path + '/tables/ocusergroup'} component={OcUserGroup} />
          <Route path={path + '/tables/ocvoucher'} component={OcVoucher} />
          <Route path={path + '/tables/ocvoucherhistory'} component={OcVoucherHistory} />
          <Route path={path + '/tables/ocvouchertheme'} component={OcVoucherTheme} />
          <Route path={path + '/tables/ocvoucherthemedescription'} component={OcVoucherThemeDescription} />
          <Route path={path + '/tables/ocweightclass'} component={OcWeightClass} />
          <Route path={path + '/tables/ocweightclassdescription'} component={OcWeightClassDescription} />
          <Route path={path + '/tables/oczone'} component={OcZone} />
          <Route path={path + '/tables/oczonetogeozone'} component={OcZoneToGeoZone} />
      </Switch>
  </div>
)};

export default TableMenu;