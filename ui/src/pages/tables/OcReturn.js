import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'returnId', header: 'returnId', defaultFlex: 1 },
  { name: 'orderId', header: 'orderId', defaultFlex: 1 },
  { name: 'productId', header: 'productId', defaultFlex: 1 },
  { name: 'customerId', header: 'customerId', defaultFlex: 1 },
  { name: 'firstname', header: 'firstname', defaultFlex: 1 },
  { name: 'lastname', header: 'lastname', defaultFlex: 1 },
  { name: 'email', header: 'email', defaultFlex: 1 },
  { name: 'telephone', header: 'telephone', defaultFlex: 1 },
  { name: 'product', header: 'product', defaultFlex: 1 },
  { name: 'model', header: 'model', defaultFlex: 1 },
  { name: 'quantity', header: 'quantity', defaultFlex: 1 },
  { name: 'opened', header: 'opened', defaultFlex: 1 },
  { name: 'returnReasonId', header: 'returnReasonId', defaultFlex: 1 },
  { name: 'returnActionId', header: 'returnActionId', defaultFlex: 1 },
  { name: 'returnStatusId', header: 'returnStatusId', defaultFlex: 1 },
  { name: 'comment', header: 'comment', defaultFlex: 1 },
  { name: 'dateOrdered', header: 'dateOrdered', defaultFlex: 1 },
  { name: 'dateAdded', header: 'dateAdded', defaultFlex: 1 },
  { name: 'dateModified', header: 'dateModified', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'ocreturn/selectAll',{
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

const OcReturn = () => {
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

export default OcReturn;