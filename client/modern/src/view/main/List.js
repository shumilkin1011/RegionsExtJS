/**
 * This view is an example list of people.
 */
Ext.define('extJSApp.view.main.List', {
    extend: 'Ext.grid.Panel',
    xtype: 'mainlist',
    autoScroll: 'true',
    height: 600,
    plugins: 'gridfilters',
    viewModel : 'list',
    controller: 'main',
    requires: [
        'extJSApp.store.Region',
        'extJSApp.view.ListViewModel',
        'extJSApp.view.main.MainController'
    ],

    title: {
        bind: {
            text: "{loadStatus}",
        },
            textAlign: 'left'
    },
    bind: {
        store: "{regionStoreMain}"
    },


    columns: [
        { text: 'Номер региона',  dataIndex: 'id', draggable: true, },
        { text: 'Имя региона',
            dataIndex: 'regionName',
            flex: 1,
            draggable: true,
            filter: {
                type: 'string',
                //value: 'край'
            }},
        {
            xtype:'actioncolumn',
            width:40,
            items:[{
                icon:'https://image.flaticon.com/icons/png/128/1828/1828843.png',
                handler: 'removeRegion'
            }]
        }
    ],


    listeners: {
        select: 'onItemSelected'
    },

});


