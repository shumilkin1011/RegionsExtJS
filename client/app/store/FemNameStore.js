Ext.define('extJSApp.store.FemName', {
    extend: 'Ext.data.Store',
    xtype: 'FemName',
    alias: 'store.FemName',

    model: 'extJSApp.model.FemName',
    proxy: {
        type: 'ajax',
        url : '../api/v1/femNames',
        simpleSortMode : true,
        reader: {
            type:'json',
            rootProperty:'content',
            totalProperty: 'totalElements'
        }
    },
    sorters: 'femName',
    autoLoad: true,
    autoSort: true,
    remoteSort: true,
    remoteFilter: true,
    pageSize: 5,

});




