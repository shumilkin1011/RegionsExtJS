Ext.define('extJSApp.store.User', {
    extend: 'Ext.data.Store',
    xtype: 'userStore',

    alias: 'store.User',
    autoSort: true,
    sorters: [{
        property: 'id',
        direction: 'ASC'
    }],

    model: 'extJSApp.model.User',
    proxy: {
        type: 'ajax',
        url : '../api/v1/users',
    },
    autoLoad: true,
    remoteFilter: true,

});




