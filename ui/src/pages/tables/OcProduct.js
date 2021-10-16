import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'productId', header: 'productId', defaultFlex: 1 },
  { name: 'model', header: 'model', defaultFlex: 1 },
  { name: 'sku', header: 'sku', defaultFlex: 1 },
  { name: 'upc', header: 'upc', defaultFlex: 1 },
  { name: 'ean', header: 'ean', defaultFlex: 1 },
  { name: 'jan', header: 'jan', defaultFlex: 1 },
  { name: 'isbn', header: 'isbn', defaultFlex: 1 },
  { name: 'mpn', header: 'mpn', defaultFlex: 1 },
  { name: 'location', header: 'location', defaultFlex: 1 },
  { name: 'quantity', header: 'quantity', defaultFlex: 1 },
  { name: 'stockStatusId', header: 'stockStatusId', defaultFlex: 1 },
  { name: 'image', header: 'image', defaultFlex: 1 },
  { name: 'manufacturerId', header: 'manufacturerId', defaultFlex: 1 },
  { name: 'shipping', header: 'shipping', defaultFlex: 1 },
  { name: 'price', header: 'price', defaultFlex: 1 },
  { name: 'points', header: 'points', defaultFlex: 1 },
  { name: 'taxClassId', header: 'taxClassId', defaultFlex: 1 },
  { name: 'dateAvailable', header: 'dateAvailable', defaultFlex: 1 },
  { name: 'weight', header: 'weight', defaultFlex: 1 },
  { name: 'weightClassId', header: 'weightClassId', defaultFlex: 1 },
  { name: 'length', header: 'length', defaultFlex: 1 },
  { name: 'width', header: 'width', defaultFlex: 1 },
  { name: 'height', header: 'height', defaultFlex: 1 },
  { name: 'lengthClassId', header: 'lengthClassId', defaultFlex: 1 },
  { name: 'subtract', header: 'subtract', defaultFlex: 1 },
  { name: 'minimum', header: 'minimum', defaultFlex: 1 },
  { name: 'sortOrder', header: 'sortOrder', defaultFlex: 1 },
  { name: 'status', header: 'status', defaultFlex: 1 },
  { name: 'viewed', header: 'viewed', defaultFlex: 1 },
  { name: 'dateAdded', header: 'dateAdded', defaultFlex: 1 },
  { name: 'dateModified', header: 'dateModified', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'ocproduct/selectAll',{
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

const OcProduct = () => {
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

export default OcProduct;