Ext.define('extJSApp.view.countries.Boxes', {
    extend: 'Ext.panel.Panel',
    xtype: 'comboBoxesMain',
    title: "Выбираем город",

    requires: [
        'extJSApp.view.Countries.CountriesController',
        'extJSApp.view.Countries.CountriesViewModel',
    ],

    controller: 'countries',
    viewModel: 'countries',

    items: [
        {
            xtype: 'combobox',
            fieldLabel: 'Choose country',
            margin: '5 0 0 0',
            minChars: 3,
            queryMode: 'remote',
            displayField: 'countryName',
            valueField: 'countryName',
            anyMatch: true,
            queryParam: "searchFor",
            autoSelect: false,
            //hideTrigger: true,
            typeAhead: true,
            disabled: false,
            requires: [
                'extJSApp.view.Countries.CountriesController',
                'extJSApp.view.Countries.CountriesViewModel'
            ],
            listeners: {
                select: 'countrySelected'
            },
            bind: {
                store: "{countryStore}",
            }
        },
        {
            fieldLabel: 'Choose region',
            xtype: 'combobox',
            margin: '5 0 0 0',
            queryMode: 'remote',
            displayField: 'regionName',
            valueField: 'regionName',
            anyMatch: true,
            queryParam: "searchFor",
            autoSelect: false,
            //hideTrigger: true,
            typeAhead: true,
            requires: [
                'extJSApp.view.Countries.CountriesController',
                'extJSApp.view.Countries.CountriesViewModel'
            ],
            bind: {
                disabled: "{regionBoxDisabled}",
                store: "{regionStore}",
            },
            listeners: {
                select: 'regionSelected'
            },
        },
        {
            xtype: 'combobox',
            fieldLabel: 'Choose city',
            margin: '5 0 0 0',
            minChars: 3,
            queryMode: 'remote',
            displayField: 'cityName',
            valueField: 'cityName',
            anyMatch: true,
            queryParam: "searchFor",
            autoSelect: false,
            store: 'extJSApp.store.City',
            //hideTrigger: true,
            typeAhead: true,
            bind: {
                store: "{cityStore}",
                disabled: "{cityBoxDisabled}",
            },
            listeners: {
                select: 'citySelected'
            },
        },
    ]
});