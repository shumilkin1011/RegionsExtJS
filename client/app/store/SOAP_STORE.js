Ext.define('extJSApp.store.SOAP_STORE', {
    extend: 'Ext.data.Store',
    xtype: 'soapstore',

    alias: 'store.SOAP',
    autoSort: false,
    pageSize: 0,

    model: 'extJSApp.model.SOAP_MODEL',
    proxy: {
        type: 'ajax',
        url : '../api/v1/recipient/',
    },

});




