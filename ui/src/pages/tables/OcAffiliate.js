import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'affiliateId', header: 'affiliateId', defaultFlex: 1 },
  { name: 'firstname', header: 'firstname', defaultFlex: 1 },
  { name: 'lastname', header: 'lastname', defaultFlex: 1 },
  { name: 'email', header: 'email', defaultFlex: 1 },
  { name: 'telephone', header: 'telephone', defaultFlex: 1 },
  { name: 'fax', header: 'fax', defaultFlex: 1 },
  { name: 'password', header: 'password', defaultFlex: 1 },
  { name: 'salt', header: 'salt', defaultFlex: 1 },
  { name: 'company', header: 'company', defaultFlex: 1 },
  { name: 'website', header: 'website', defaultFlex: 1 },
  { name: 'address1', header: 'address1', defaultFlex: 1 },
  { name: 'address2', header: 'address2', defaultFlex: 1 },
  { name: 'city', header: 'city', defaultFlex: 1 },
  { name: 'postcode', header: 'postcode', defaultFlex: 1 },
  { name: 'countryId', header: 'countryId', defaultFlex: 1 },
  { name: 'zoneId', header: 'zoneId', defaultFlex: 1 },
  { name: 'code', header: 'code', defaultFlex: 1 },
  { name: 'commission', header: 'commission', defaultFlex: 1 },
  { name: 'tax', header: 'tax', defaultFlex: 1 },
  { name: 'payment', header: 'payment', defaultFlex: 1 },
  { name: 'cheque', header: 'cheque', defaultFlex: 1 },
  { name: 'paypal', header: 'paypal', defaultFlex: 1 },
  { name: 'bankName', header: 'bankName', defaultFlex: 1 },
  { name: 'bankBranchNumber', header: 'bankBranchNumber', defaultFlex: 1 },
  { name: 'bankSwiftCode', header: 'bankSwiftCode', defaultFlex: 1 },
  { name: 'bankAccountName', header: 'bankAccountName', defaultFlex: 1 },
  { name: 'bankAccountNumber', header: 'bankAccountNumber', defaultFlex: 1 },
  { name: 'ip', header: 'ip', defaultFlex: 1 },
  { name: 'status', header: 'status', defaultFlex: 1 },
  { name: 'approved', header: 'approved', defaultFlex: 1 },
  { name: 'dateAdded', header: 'dateAdded', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'ocaffiliate/selectAll',{
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

const OcAffiliate = () => {
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

export default OcAffiliate;