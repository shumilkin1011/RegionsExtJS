Ext.define('extJSApp.view.tagField.TagFieldViewModel', {
    extend: 'Ext.app.ViewModel',
    alias: 'viewmodel.tagfield',

    data: {
        region_id: [1],
        cityBoxDisabled:true,
    },
    stores: {
        regionStore: {
            type: 'Region',
            autoLoad: false,
            pageSize: 100
        },
        cityStore: {
            type: 'City',
            autoLoad: false,
            listeners: {
                beforeLoad: 'befCityLoads'
            },
            pageSize: 100
        }
    }
});