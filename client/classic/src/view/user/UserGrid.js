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
            xtype: 'fieldcontainer',
            layout: 'vbox',
            items: [
                {
                    xtype: 'fieldcontainer',
                    layout: 'vbox',
                    items: [
                        {
                            xtype: 'button', text: 'Добавить пользователя', handler: function () {
                                var win = Ext.getCmp('userWindow');
                                var form = win.down('form');

                                form.getForm().loadRecord(form.initialValues);
                                form.reset();
                                win.setTitle('Новый пользователь');
                                win.show();
                            }
                        },
                        {
                            xtype: 'numberfield',
                            anchor: '100%',
                            margin : '20 0 0 0',
                            fieldLabel: 'Два знака после запятой',
                            decimalPrecision: 2,
                            value: 0.00,
                            step: 0.10,
                            listeners: {
                                render: function () {
                                    var value = this.getValue()
                                    newValue = value.toFixed(2);
                                    this.setRawValue(newValue);
                                },
                                blur: function () {
                                    var value = this.getValue()
                                    newValue = value.toFixed(2);
                                    this.setRawValue(newValue);
                                }
                            }
                        },
                    ]
                },

                {
                    xtype: 'fieldcontainer',
                    layout: 'vbox',
                    items: [
                        {
                            labelAlign: 'top',
                            fieldLabel: "С",
                            submitFormat: 'Y-m-d',
                            dateFormat: 'd/m/Y',
                            format: 'd/m/Y',
                            xtype: 'datefield',
                        },
                        {
                            labelAlign: 'top',
                            fieldLabel: "До",
                            dateFormat: 'd/m/Y',
                            format: 'd/m/Y',
                            submitFormat: 'Y-m-d',
                            xtype: 'datefield',
                        },
                        {
                            xtype: 'button',
                            align: 'center',
                            text: 'Диапазон дат',
                            handler: function () {
                                debugger;
                                var dateStart = this.ownerCt.items.items[0].getSubmitValue();
                                var dateEnd = this.ownerCt.items.items[1].getSubmitValue();
                                var userStore = this.ownerCt.ownerCt.ownerCt.ownerCt.store;

                                userStore.load(
                                    {
                                        params: {
                                            'dateStart': dateStart,
                                            'dateEnd': dateEnd,
                                        },
                                        scope: this,
                                        callback: function () {

                                        }
                                    });
                            }
                        },
                    ]
                },
            ]
        }

    ]
})
;


