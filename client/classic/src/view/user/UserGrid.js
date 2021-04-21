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
            var win = Ext.create('Ext.window.Window', {
                layout: 'fit',
                iconCls: 'x-fa fa-user',
                title: rec.get('lastName') + " " + rec.get('firstName'),
                titleAlign: 'center',
                ghost: false,
                listeners: {
                    beforeclose: function (window) {
                        if (window.down('form').isDirty() && !window.isConfirmed) {
                            Ext.MessageBox.confirm('Закрытие окна', 'Вы точно хотите закрыть это окно? Все несохранённые данные будут удалены.',
                                function (btn) {
                                    if (btn === 'yes') {
                                        window.isConfirmed = true;
                                        window.close();
                                    }
                                });
                            return false;
                        } else return true;
                    }
                },
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
                var win = Ext.create('Ext.window.Window', {
                    layout: 'fit',
                    iconCls: 'x-fa fa-user',
                    title: 'Пользователь',
                    titleAlign: 'center',
                    ghost: false,
                    listeners: {
                        beforeclose: function (window) {
                            if (window.down('form').isDirty() && !window.isConfirmed) {
                                Ext.MessageBox.confirm('Закрытие окна', 'Вы точно хотите закрыть это окно? Все несохранённые данные будут удалены.',
                                    function (btn) {
                                        if (btn === 'yes') {
                                            window.isConfirmed = true;
                                            window.close();
                                        }
                                    });
                                return false;
                            } else return true;
                        }
                    },
                    items: [{
                        xtype: 'userform'
                    }]
                });
                win.show();
            }
        }
    ]

});


