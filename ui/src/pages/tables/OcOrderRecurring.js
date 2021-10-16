import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'orderRecurringId', header: 'orderRecurringId', defaultFlex: 1 },
  { name: 'orderId', header: 'orderId', defaultFlex: 1 },
  { name: 'reference', header: 'reference', defaultFlex: 1 },
  { name: 'productId', header: 'productId', defaultFlex: 1 },
  { name: 'productName', header: 'productName', defaultFlex: 1 },
  { name: 'productQuantity', header: 'productQuantity', defaultFlex: 1 },
  { name: 'recurringId', header: 'recurringId', defaultFlex: 1 },
  { name: 'recurringName', header: 'recurringName', defaultFlex: 1 },
  { name: 'recurringDescription', header: 'recurringDescription', defaultFlex: 1 },
  { name: 'recurringFrequency', header: 'recurringFrequency', defaultFlex: 1 },
  { name: 'recurringCycle', header: 'recurringCycle', defaultFlex: 1 },
  { name: 'recurringDuration', header: 'recurringDuration', defaultFlex: 1 },
  { name: 'recurringPrice', header: 'recurringPrice', defaultFlex: 1 },
  { name: 'trial', header: 'trial', defaultFlex: 1 },
  { name: 'trialFrequency', header: 'trialFrequency', defaultFlex: 1 },
  { name: 'trialCycle', header: 'trialCycle', defaultFlex: 1 },
  { name: 'trialDuration', header: 'trialDuration', defaultFlex: 1 },
  { name: 'trialPrice', header: 'trialPrice', defaultFlex: 1 },
  { name: 'status', header: 'status', defaultFlex: 1 },
  { name: 'dateAdded', header: 'dateAdded', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'ocorderrecurring/selectAll',{
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

const OcOrderRecurring = () => {
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

export default OcOrderRecurring;