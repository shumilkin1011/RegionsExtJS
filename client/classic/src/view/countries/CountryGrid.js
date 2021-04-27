
Ext.define('extJSApp.view.countryGrid', {
    extend: 'Ext.grid.Panel',
    xtype: 'countryGrid',
    autoScroll: 'true',
    height: 600,
    viewModel : 'countries',
    controller: 'countries',
    store: 'extJSApp.store.RegionFullData',
    requires: [
        'extJSApp.view.Countries.CountriesController',
        'extJSApp.view.Countries.CountriesViewModel',
    ],
    selModel: 'cellmodel',
    plugins: {
        ptype: 'cellediting',
        clicksToEdit: 2
    },

    title: "Country GridView",

    columns: [
        {
            header: 'Выбор региона',
            flex: 3,
            dataIndex: 'regionName',
            editor: {
                completeOnEnter: false,

                field: {
                    xtype: 'combobox',
                    queryMode: 'remote',
                    displayField: 'regionName',
                    valueField: 'regionName',
                    anyMatch: true,
                    queryParam: "searchFor",
                    autoSelect: false,
                    typeAhead: true,
                    requires: [
                        'extJSApp.view.Countries.CountriesController',
                        'extJSApp.view.Countries.CountriesViewModel',
                        'extJSApp.store.Region'
                    ],
                    bind: {
                        store: "{regionStore}",
                    },
                    listeners: {
                        select: function (cmp, record,eOpts) {
                            var item = cmp.ownerCt.ownerCmp.getView().store.data.items[0];
                            item.set('id',record.get('id'));
                            item.set('regionName',record.get('extJSApp.store.Region'));
                        }
                    }
                }
            },
        },
        {
            text: 'Площадь',
            dataIndex: 'square',
            flex: 3,
            draggable: true,
            editor: {

            }
        },
        {
            text: 'Население',
            dataIndex: 'population',
            flex: 3,
            draggable: true,
            editor: {

            }
        },
    ],

});


