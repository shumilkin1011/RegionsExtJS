Ext.define('extJSApp.view.tagField.TagField', {
    extend: 'Ext.panel.Panel',
    xtype: 'tagFieldMain',
    title: "Множественный выбор регионов",

    requires: [
        'extJSApp.view.tagField.TagFieldController',
        'extJSApp.view.tagField.TagFieldViewModel',
    ],

    controller: 'tagfield',
    viewModel: 'tagfield',

    items: [
        {
            fieldLabel: 'Choose regions',
            xtype: 'tagfield',
            margin: '5 0 0 0',
            queryMode: 'remote',
            displayField: 'regionName',
            valueField: 'id',
            anyMatch: true,
            queryParam: "searchFor",
            autoSelect: false,
            //hideTrigger: true,
            typeAhead: true,
            bind: {
                store: "{regionStore}",
            },
            listeners: {
                select: 'regionSelected'
            },
        },
        {
            xtype: 'tagfield',
            fieldLabel: 'Choose city',
            margin: '5 0 0 0',
            minChars: 3,
            queryMode: 'remote',
            displayField: 'cityName',
            valueField: 'cityName',
            anyMatch: true,
            queryParam: "searchFor",
            autoSelect: false,
            typeAhead: true,
            bind: {
                store: "{cityStore}",
                disabled: "{cityBoxDisabled}",
            },
        },
    ]
});