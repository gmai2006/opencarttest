import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'orderId', header: 'orderId', defaultFlex: 1 },
  { name: 'invoiceNo', header: 'invoiceNo', defaultFlex: 1 },
  { name: 'invoicePrefix', header: 'invoicePrefix', defaultFlex: 1 },
  { name: 'storeId', header: 'storeId', defaultFlex: 1 },
  { name: 'storeName', header: 'storeName', defaultFlex: 1 },
  { name: 'storeUrl', header: 'storeUrl', defaultFlex: 1 },
  { name: 'customerId', header: 'customerId', defaultFlex: 1 },
  { name: 'customerGroupId', header: 'customerGroupId', defaultFlex: 1 },
  { name: 'firstname', header: 'firstname', defaultFlex: 1 },
  { name: 'lastname', header: 'lastname', defaultFlex: 1 },
  { name: 'email', header: 'email', defaultFlex: 1 },
  { name: 'telephone', header: 'telephone', defaultFlex: 1 },
  { name: 'fax', header: 'fax', defaultFlex: 1 },
  { name: 'customField', header: 'customField', defaultFlex: 1 },
  { name: 'paymentFirstname', header: 'paymentFirstname', defaultFlex: 1 },
  { name: 'paymentLastname', header: 'paymentLastname', defaultFlex: 1 },
  { name: 'paymentCompany', header: 'paymentCompany', defaultFlex: 1 },
  { name: 'paymentAddress1', header: 'paymentAddress1', defaultFlex: 1 },
  { name: 'paymentAddress2', header: 'paymentAddress2', defaultFlex: 1 },
  { name: 'paymentCity', header: 'paymentCity', defaultFlex: 1 },
  { name: 'paymentPostcode', header: 'paymentPostcode', defaultFlex: 1 },
  { name: 'paymentCountry', header: 'paymentCountry', defaultFlex: 1 },
  { name: 'paymentCountryId', header: 'paymentCountryId', defaultFlex: 1 },
  { name: 'paymentZone', header: 'paymentZone', defaultFlex: 1 },
  { name: 'paymentZoneId', header: 'paymentZoneId', defaultFlex: 1 },
  { name: 'paymentAddressFormat', header: 'paymentAddressFormat', defaultFlex: 1 },
  { name: 'paymentCustomField', header: 'paymentCustomField', defaultFlex: 1 },
  { name: 'paymentMethod', header: 'paymentMethod', defaultFlex: 1 },
  { name: 'paymentCode', header: 'paymentCode', defaultFlex: 1 },
  { name: 'shippingFirstname', header: 'shippingFirstname', defaultFlex: 1 },
  { name: 'shippingLastname', header: 'shippingLastname', defaultFlex: 1 },
  { name: 'shippingCompany', header: 'shippingCompany', defaultFlex: 1 },
  { name: 'shippingAddress1', header: 'shippingAddress1', defaultFlex: 1 },
  { name: 'shippingAddress2', header: 'shippingAddress2', defaultFlex: 1 },
  { name: 'shippingCity', header: 'shippingCity', defaultFlex: 1 },
  { name: 'shippingPostcode', header: 'shippingPostcode', defaultFlex: 1 },
  { name: 'shippingCountry', header: 'shippingCountry', defaultFlex: 1 },
  { name: 'shippingCountryId', header: 'shippingCountryId', defaultFlex: 1 },
  { name: 'shippingZone', header: 'shippingZone', defaultFlex: 1 },
  { name: 'shippingZoneId', header: 'shippingZoneId', defaultFlex: 1 },
  { name: 'shippingAddressFormat', header: 'shippingAddressFormat', defaultFlex: 1 },
  { name: 'shippingCustomField', header: 'shippingCustomField', defaultFlex: 1 },
  { name: 'shippingMethod', header: 'shippingMethod', defaultFlex: 1 },
  { name: 'shippingCode', header: 'shippingCode', defaultFlex: 1 },
  { name: 'comment', header: 'comment', defaultFlex: 1 },
  { name: 'total', header: 'total', defaultFlex: 1 },
  { name: 'orderStatusId', header: 'orderStatusId', defaultFlex: 1 },
  { name: 'affiliateId', header: 'affiliateId', defaultFlex: 1 },
  { name: 'commission', header: 'commission', defaultFlex: 1 },
  { name: 'marketingId', header: 'marketingId', defaultFlex: 1 },
  { name: 'tracking', header: 'tracking', defaultFlex: 1 },
  { name: 'languageId', header: 'languageId', defaultFlex: 1 },
  { name: 'currencyId', header: 'currencyId', defaultFlex: 1 },
  { name: 'currencyCode', header: 'currencyCode', defaultFlex: 1 },
  { name: 'currencyValue', header: 'currencyValue', defaultFlex: 1 },
  { name: 'ip', header: 'ip', defaultFlex: 1 },
  { name: 'forwardedIp', header: 'forwardedIp', defaultFlex: 1 },
  { name: 'userAgent', header: 'userAgent', defaultFlex: 1 },
  { name: 'acceptLanguage', header: 'acceptLanguage', defaultFlex: 1 },
  { name: 'dateAdded', header: 'dateAdded', defaultFlex: 1 },
  { name: 'dateModified', header: 'dateModified', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'ocorder/selectAll',{
    headers : {
      'Content-Type': 'application/json',
      'Accept': 'application/json'
     }
  }).then(response => {
    return response.json().then(data => {
      console.log(data);
      return data;
    })
  })
}

const OcOrder = () => {
  const dataSource = useCallback(loadData, []);
  return (
      <ReactDataGrid
        idProperty="id"
        style={gridStyle}
        columns={columns}
        pagination
        defaultLimit={15}
        defaultSkip={15}
        dataSource={dataSource}
        />
  )
}

export default OcOrder;