Ext.define('extJSApp.store.Region', {
    extend: 'Ext.data.Store',
    xtype: 'Region',
    alias: 'store.Region',
    sorters: [{
        property: 'regionName',
        direction: 'ASC'
    }],
    
    model: 'extJSApp.model.Region',
    proxy: {
        type: 'ajax',
        url : '../api/v1/regions',
        reader: {
            type:'json',
            rootProperty:'content'
        }
    },
    autoLoad: true,
    remoteFilter: true,
    pageSize: 0,

});




