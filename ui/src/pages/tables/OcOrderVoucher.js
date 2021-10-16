import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'orderVoucherId', header: 'orderVoucherId', defaultFlex: 1 },
  { name: 'orderId', header: 'orderId', defaultFlex: 1 },
  { name: 'voucherId', header: 'voucherId', defaultFlex: 1 },
  { name: 'description', header: 'description', defaultFlex: 1 },
  { name: 'code', header: 'code', defaultFlex: 1 },
  { name: 'fromName', header: 'fromName', defaultFlex: 1 },
  { name: 'fromEmail', header: 'fromEmail', defaultFlex: 1 },
  { name: 'toName', header: 'toName', defaultFlex: 1 },
  { name: 'toEmail', header: 'toEmail', defaultFlex: 1 },
  { name: 'voucherThemeId', header: 'voucherThemeId', defaultFlex: 1 },
  { name: 'message', header: 'message', defaultFlex: 1 },
  { name: 'amount', header: 'amount', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'ocordervoucher/selectAll',{
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

const OcOrderVoucher = () => {
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

export default OcOrderVoucher;