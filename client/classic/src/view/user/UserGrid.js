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
    allowDeselect: true,
    listeners: {
        select: function (cmp, rec, index, eOpts) {
            var win = Ext.getCmp('userWindow');
            var form = win.down('form');
            win.setTitle(rec.get('lastName') + " " + rec.get('firstName'));

            var femStore = form.getForm().getFields().get("comboBoxFemName").getStore();
            femStore.load(
                {
                    params: {
                        'femNameId': rec.get('favFemNameId')
                    },
                    scope: this,
                    callback: function () {
                        form.loadRecord(rec);
                        form.reset();
                    }
                });
            win.show();
        },
    },

    columns: [
        {
            text: '№',
            dataIndex: 'id',
            draggable: true,
            width: 70,
        },
        {
            text: 'Имя',
            dataIndex: 'firstName',
            draggable: true,
            flex: 1,
        },
        {
            dataIndex: 'lastName',
            text: 'Фамилия',
            flex: 1,

        },
        {
            dataIndex: 'middleName',
            text: 'Отчество',
            flex: 1,
        },
        {
            dataIndex: 'age',
            text: 'Возраст',
            width: 70,
        },
        {
            dataIndex: 'sex',
            text: 'Пол',
            width: 100,
        },
        {
            dataIndex: 'email',
            text: 'Эл/почта',
            flex: 1,
        },
        {
            xtype: 'booleancolumn',
            dataIndex: 'likesCoffee',
            text: 'Кофе?',
            trueText: 'ДА',
            falseText: 'НЕТ',
            width: 70,
        },
        {
            dataIndex: 'coffeeType',
            text: 'Любимый кофе',
            flex: 1,
        },
        {
            xtype: 'booleancolumn',
            dataIndex: 'likesTea',
            text: 'Чай?',
            trueText: 'ДА',
            falseText: 'НЕТ',
            width: 70,
        },
        {
            layout: 'fit',
            width: 600,
            xtype: 'userwindow',
            renderTo: Ext.getBody(),
            id: 'userWindow',
            closeAction: 'hide',
            hidden: true,
        }
    ],
    items: [
        {
            xtype: "gridpanel",
            store: "extJSApp.store.User",
            title: 'tit',
            columns: [
                {
                    text: 'Имя',
                    dataIndex: 'firstName'
                },
                {
                    text: 'ДР',
                    dataIndex: 'birthday'
                }
            ]

        },
    ],
    bbar: [
        {
            xtype: 'textfield',
        },
        {
            xtype: 'button',
            text: 'filter',
            handler: function () {
                debugger;
                var date = this.ownerCt.down('textfield').value;
                var userStore = this.ownerCt.ownerCt.store;

                userStore.load(
                    {
                        params: {
                            'birthday': date,
                        },
                        scope: this,
                        callback: function () {

                        }
                    });
            }
        },
        {
            xtype: 'button', text: 'Добавить пользователя', handler: function () {
                var win = Ext.getCmp('userWindow');
                var form = win.down('form');

                form.getForm().loadRecord(form.initialValues);
                form.reset();
                win.setTitle('Новый пользователь');
                win.show();
            }
        }
    ]
})
;


