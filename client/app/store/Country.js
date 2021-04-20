Ext.define('extJSApp.store.Country', {
    extend: 'Ext.data.Store',
    xtype: 'Country',
    id: 'Country',
    alias: 'store.Country',
    autoSort: true,
    sorters: [{
        property: 'countryName',
        direction: 'ASC'
    }],

    model: 'extJSApp.model.Country',
    proxy: {
        type: 'ajax',
        url : '../api/v1/countries',
    },
    autoLoad: true,
    remoteFilter: true,

});




