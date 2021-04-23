Ext.define('extJSApp.view.countries.RussianComboBoxes', {
    extend: 'Ext.panel.Panel',
    xtype: 'comboBoxesRUS',
    title: "I <3 Russia",

    requires: [
        'extJSApp.view.Countries.CountriesController',
        'extJSApp.view.Countries.CountriesViewModel',
    ],

    controller: 'countries',
    viewModel: 'countries',

    items: [
        {
            xtype: 'combobox',
            fieldLabel: 'Choose your favourite country',
            margin: '5 0 0 0',
            queryMode: 'local',
            displayField: 'name',
            valueField: 'name',
            anyMatch: true,
            autoSelect: true,
            sortOnLoad: true,
            //hideTrigger: true,
            typeAhead: true,
            disabled: false,
            requires: [
                'extJSApp.view.Countries.CountriesController',
                'extJSApp.view.Countries.CountriesViewModel'
            ],
            listeners: {
                render: function (comp) {
                    comp.store.findRecord('name', 'Russian Federation').set('priority', 10);
                    comp.store.load();
                },
                select: function (comp,rec,opt) {
                    debugger;
                    comp.ownerCt.getViewModel().set('prevSelected',rec.get('name'));
                    comp.store.each(function (rec) {
                        rec.set('priority', 0)
                    });
                    comp.store.findRecord('name', 'Russian Federation').set('priority', 10);
                    if (comp.ownerCt.getViewModel().get('prevSelected') )
                        comp.store.findRecord('name',
                            comp.ownerCt.getViewModel().get('prevSelected')).set('priority', 9);
                    comp.store.load();
                }
            },
            store: 'extJSApp.store.CountryAll'

        },
    ]
});