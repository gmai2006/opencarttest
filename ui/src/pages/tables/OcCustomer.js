import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'customerId', header: 'customerId', defaultFlex: 1 },
  { name: 'customerGroupId', header: 'customerGroupId', defaultFlex: 1 },
  { name: 'storeId', header: 'storeId', defaultFlex: 1 },
  { name: 'languageId', header: 'languageId', defaultFlex: 1 },
  { name: 'firstname', header: 'firstname', defaultFlex: 1 },
  { name: 'lastname', header: 'lastname', defaultFlex: 1 },
  { name: 'email', header: 'email', defaultFlex: 1 },
  { name: 'telephone', header: 'telephone', defaultFlex: 1 },
  { name: 'fax', header: 'fax', defaultFlex: 1 },
  { name: 'password', header: 'password', defaultFlex: 1 },
  { name: 'salt', header: 'salt', defaultFlex: 1 },
  { name: 'cart', header: 'cart', defaultFlex: 1 },
  { name: 'wishlist', header: 'wishlist', defaultFlex: 1 },
  { name: 'newsletter', header: 'newsletter', defaultFlex: 1 },
  { name: 'addressId', header: 'addressId', defaultFlex: 1 },
  { name: 'customField', header: 'customField', defaultFlex: 1 },
  { name: 'ip', header: 'ip', defaultFlex: 1 },
  { name: 'status', header: 'status', defaultFlex: 1 },
  { name: 'approved', header: 'approved', defaultFlex: 1 },
  { name: 'safe', header: 'safe', defaultFlex: 1 },
  { name: 'token', header: 'token', defaultFlex: 1 },
  { name: 'code', header: 'code', defaultFlex: 1 },
  { name: 'dateAdded', header: 'dateAdded', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'occustomer/selectAll',{
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

const OcCustomer = () => {
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

export default OcCustomer;