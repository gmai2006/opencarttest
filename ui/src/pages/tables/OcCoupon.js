import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'couponId', header: 'couponId', defaultFlex: 1 },
  { name: 'name', header: 'name', defaultFlex: 1 },
  { name: 'code', header: 'code', defaultFlex: 1 },
  { name: 'type', header: 'type', defaultFlex: 1 },
  { name: 'discount', header: 'discount', defaultFlex: 1 },
  { name: 'logged', header: 'logged', defaultFlex: 1 },
  { name: 'shipping', header: 'shipping', defaultFlex: 1 },
  { name: 'total', header: 'total', defaultFlex: 1 },
  { name: 'dateStart', header: 'dateStart', defaultFlex: 1 },
  { name: 'dateEnd', header: 'dateEnd', defaultFlex: 1 },
  { name: 'usesTotal', header: 'usesTotal', defaultFlex: 1 },
  { name: 'usesCustomer', header: 'usesCustomer', defaultFlex: 1 },
  { name: 'status', header: 'status', defaultFlex: 1 },
  { name: 'dateAdded', header: 'dateAdded', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'occoupon/selectAll',{
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

const OcCoupon = () => {
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

export default OcCoupon;