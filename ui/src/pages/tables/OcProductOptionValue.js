import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'productOptionValueId', header: 'productOptionValueId', defaultFlex: 1 },
  { name: 'productOptionId', header: 'productOptionId', defaultFlex: 1 },
  { name: 'productId', header: 'productId', defaultFlex: 1 },
  { name: 'optionId', header: 'optionId', defaultFlex: 1 },
  { name: 'optionValueId', header: 'optionValueId', defaultFlex: 1 },
  { name: 'quantity', header: 'quantity', defaultFlex: 1 },
  { name: 'subtract', header: 'subtract', defaultFlex: 1 },
  { name: 'price', header: 'price', defaultFlex: 1 },
  { name: 'pricePrefix', header: 'pricePrefix', defaultFlex: 1 },
  { name: 'points', header: 'points', defaultFlex: 1 },
  { name: 'pointsPrefix', header: 'pointsPrefix', defaultFlex: 1 },
  { name: 'weight', header: 'weight', defaultFlex: 1 },
  { name: 'weightPrefix', header: 'weightPrefix', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'ocproductoptionvalue/selectAll',{
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

const OcProductOptionValue = () => {
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

export default OcProductOptionValue;