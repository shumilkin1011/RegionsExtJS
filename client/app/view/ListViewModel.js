Ext.define('extJSApp.view.ListViewModel', {
    extend: 'Ext.app.ViewModel',
    alias: 'viewmodel.list',
    controller: 'main',

    data: {
        title: 'Testing ViewModel',
        loadStatus: "Empty"
    },
    stores: {
        regionStoreMain: {
            extend: 'Ext.data.Store',

            model: 'extJSApp.model.Region',
            proxy: {
                type: 'ajax',
                simpleSortMode : true,
                url : '../api/v1/regions',
                reader: {
                    type:'json',
                    rootProperty:'content',
                    totalProperty: 'totalElements'
                }
            },
            listeners: {
                beforeSort: function (store, sorters, eOpts) {
                    //debugger;
                }
            },
            remoteSort: true,
            autoLoad: {start: 0, limit: 15},
            pageSize: 15
        }
    },

});


