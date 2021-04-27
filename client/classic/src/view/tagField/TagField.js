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
            xtype: "fieldcontainer",
            layout: 'hbox',
            margin: '10 0 0 0',
            items: [
                {
                    flex: 1,
                    fieldLabel: 'Choose regions',
                    xtype: 'tagfield',
                    queryMode: 'remote',
                    displayField: 'regionName',
                    valueField: 'id',
                    anyMatch: true,
                    queryParam: "searchFor",
                    autoSelect: false,
                    typeAhead: true,
                    bind: {
                        store: "{regionStore}",
                    },
                    listeners: {
                        select: 'regionSelected',
                        change: 'regionSelected'
                    },
                },
                {
                    width: 150,
                    xtype: 'button',
                    text: "Применить фильтр",
                    handler: function (button) {
                        var tagfield = button.ownerCt.down('tagfield');
                        var grid = button.ownerCt.ownerCt.ownerCt.down('grid');
                        grid.store.setRecords(tagfield.getValueRecords());
                    }
                }
            ]
        },
        {
            xtype: "fieldcontainer",
            layout: 'hbox',
          items: [

          ]
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
        {
            xtype: 'gridpanel',
            margin: '20 0 0 0',
            autoScroll: 'true',
            height: 400,
            layout: 'fit',
            bind: {
                store: "{regionStore}",
            },

            title: "Regions",

            columns: [
                {
                    text: '№',
                    flex: 1,
                    dataIndex: 'id',
                    draggable: true,
                },
                {
                    text: 'Имя региона',
                    dataIndex: 'regionName',
                    flex: 3,
                    draggable: true,
                },
            ],
        }

    ]
});