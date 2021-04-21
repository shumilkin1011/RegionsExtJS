Ext.define('extJSApp.view.user.UserGrid', {
    extend: 'Ext.grid.Panel',
    xtype: 'userList',
    autoScroll: 'false',
    stripeRows: true,
    scrollable: false,
    plugins: 'gridfilters',
    requires: [
        'extJSApp.store.User',
    ],

    title: "Пользователи",
    store: 'extJSApp.store.User',


    columns: [
        {
            text: '№',
            dataIndex: 'id',
            draggable: true,
        },
        {
            text: 'Имя',
            dataIndex: 'firstName',
            draggable: true,
        },
        {
            dataIndex: 'lastName',
            text: 'Фамилия',

        },
        {
            dataIndex: 'middleName',
            text: 'Отчество',
        },
        {
            dataIndex: 'age',
            text: 'Возраст',
        },
        {
            dataIndex: 'sex',
            text: 'Пол',
        },
        {
            dataIndex: 'email',
            text: 'Эл/почта',
        },
        {
            xtype: 'booleancolumn',
            dataIndex: 'likesCoffee',
            text: 'Кофе?',
            trueText: 'ДА',
            falseText: 'НЕТ',
        },
        {
            dataIndex: 'coffeeType',
            text: 'Любимый кофе',
        },
        {
            xtype: 'booleancolumn',
            dataIndex: 'likesTea',
            text: 'Чай?',
            trueText: 'ДА',
            falseText: 'НЕТ',
        },

    ],
    bbar: [
        {
            xtype: 'button', text: 'Добавить пользователя', handler: function () {
                var win = Ext.create('Ext.window.Window', {
                    layout: 'fit',
                    items: [ {
                        xtype: 'userform'
                    }]
                });
                win.show();
            }
        }
    ]

});


