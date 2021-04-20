Ext.define('extJSApp.store.RegionFullData', {
    extend: 'Ext.data.Store',
    xtype: 'RegionFullData',
    alias: 'store.RegionFullData',
    autoSort: true,
    sorters: [{
        property: 'regionName',
        direction: 'ASC'
    }],

    data: [
        {"id": '', 'regionName': '', 'square': '', 'population': ''}
    ],

    model: 'extJSApp.model.RegionFullData',
    proxy: {
        type: 'ajax',
        url : '../api/v1/regions',
    },
    autoLoad: false,
    remoteFilter: false

});




