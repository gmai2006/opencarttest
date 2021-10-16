import React, { useCallback } from 'react';
import ReactDataGrid from '@inovua/reactdatagrid-community';
import '@inovua/reactdatagrid-community/index.css';
import init from "../../init";

const gridStyle = { minHeight: 550 }

const columns = [
  { name: 'locationId', header: 'locationId', defaultFlex: 1 },
  { name: 'name', header: 'name', defaultFlex: 1 },
  { name: 'address', header: 'address', defaultFlex: 1 },
  { name: 'telephone', header: 'telephone', defaultFlex: 1 },
  { name: 'fax', header: 'fax', defaultFlex: 1 },
  { name: 'geocode', header: 'geocode', defaultFlex: 1 },
  { name: 'image', header: 'image', defaultFlex: 1 },
  { name: 'open', header: 'open', defaultFlex: 1 },
  { name: 'comment', header: 'comment', defaultFlex: 1 },
]

const loadData = () => {
  return fetch('/' + init.appName + '/rest/'  + 'oclocation/selectAll',{
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

const OcLocation = () => {
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

export default OcLocation;