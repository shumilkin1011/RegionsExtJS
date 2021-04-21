/**
 * This view is an example list of people.
 */
Ext.define('extJSApp.view.main.List', {
    extend: 'Ext.grid.Panel',
    xtype: 'mainlist',
    autoScroll: 'false',
    stripeRows : true,
    scrollable: false,
    plugins: 'gridfilters',
    viewModel : 'list',
    controller: 'main',
    requires: [
        'extJSApp.store.Region',
        'extJSApp.view.ListViewModel',
        'extJSApp.view.main.MainController'
    ],

    title: "Регионы",
    bind: {
        store: "{regionStoreMain}"
    },

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
        {
            dataIndex: 'composite',
            text: 'Объед. информация',
            flex: 7,
            renderer: function(value, record) {
                return record.record.get('id') + " - " + record.record.get('regionName');
            }
        },
        {
            menuDisabled: true,
            xtype:'actioncolumn',
            width:30,
            items:[{
                icon:'https://image.flaticon.com/icons/png/128/1828/1828843.png',
                handler: 'removeRegion'
            }]
        }
    ],
    bbar: [{
        xtype: 'pagingtoolbar',
        bind:{
            store: '{regionStoreMain}'
        },
        displayInfo: true,
        displayMsg: 'Displaying {0} to {1} of {2} &nbsp;records ',
        emptyMsg: "No records to display&nbsp;"
    }],


    listeners: {
        select: 'onItemSelected'
    },

});


