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
    listeners: {
        select: function (cmp, rec, index, eOpts) {
            var win = Ext.create('extJSApp.widget.user.UserWindows', {
                title: rec.get('lastName') + " " + rec.get('firstName'),
                items: [{
                    xtype: 'userform',
                    trackResetOnLoad: true,
                    listeners: {
                        added: function (cmp) {
                            cmp.reset();
                        }
                    }

                }]
            });
            var form = win.down('form');
            form.loadRecord(rec);
            win.show();
        }
    },

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
                var win = Ext.create('extJSApp.widget.user.UserWindows');
                win.show();
            }
        }
    ]

});


