Ext.define('extJSApp.store.City', {
    extend: 'Ext.data.Store',
    xtype: 'City',
    id: 'City',
    alias: 'store.City',
    autoSort: true,
    sorters: [{
        property: 'cityName',
        direction: 'ASC'
    }],
    
    model: 'extJSApp.model.City',
    proxy: {
        method: 'get',
        type: 'ajax',
        url : '../api/v1/cities',
    },
    autoLoad: true,
    remoteFilter: true,

});




