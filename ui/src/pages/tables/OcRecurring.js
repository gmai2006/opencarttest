import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'recurringId', header: 'recurringId', defaultFlex: 1 },
  { name: 'price', header: 'price', defaultFlex: 1 },
  { name: 'frequency', header: 'frequency', defaultFlex: 1 },
  { name: 'duration', header: 'duration', defaultFlex: 1 },
  { name: 'cycle', header: 'cycle', defaultFlex: 1 },
  { name: 'trialStatus', header: 'trialStatus', defaultFlex: 1 },
  { name: 'trialPrice', header: 'trialPrice', defaultFlex: 1 },
  { name: 'trialFrequency', header: 'trialFrequency', defaultFlex: 1 },
  { name: 'trialDuration', header: 'trialDuration', defaultFlex: 1 },
  { name: 'trialCycle', header: 'trialCycle', defaultFlex: 1 },
  { name: 'status', header: 'status', defaultFlex: 1 },
  { name: 'sortOrder', header: 'sortOrder', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'ocrecurring/selectAll',{
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

const OcRecurring = () => {
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

export default OcRecurring;