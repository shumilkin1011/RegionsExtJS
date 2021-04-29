Ext.define('extJSApp.store.CountryTreeStore', {
    extend: 'Ext.data.TreeStore',
    model: 'extJSApp.model.CountryTreeModel',
    proxy: {
        type: 'ajax',
        url: '../api/v1/countries/tree',
        reader: {
            type: 'json',
        }
    },
    defaultRootText: "Страны",

    folderSort: true,
    autoLoad: true,

});