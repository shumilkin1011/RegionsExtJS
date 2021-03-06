Ext.define('extJSApp.widget.user.UserForm', {
    extend: 'Ext.form.Panel',
    width: 600,
    xtype: 'userform',
    header: false,
    jsonSubmit: true,
    model: 'extJSApp.model.User',
    initialValues: Ext.create('extJSApp.model.User', {
        "id": '',
        "firstName": '',
        "lastName": '',
        "middleName": '',
        "email": '',
        "coffeeType": null,
        "age": '21',
        "sex": 'MALE',
        "likesCoffee": false,
        "likesTea": false
    }),
    trackResetOnLoad: true,
    items: [
        {
            xtype: "fieldcontainer",
            defaultType: 'textfield',
            layout: 'hbox',
            flex: 1,
            margin: '10 0 0 0',

            items: [
                {
                    hidden: true,
                    name: 'id',
                    dataIndex: 'id'
                },
                {
                    margin: '0 10 0 20',
                    labelAlign: 'top',
                    fieldLabel: 'Фамилия',
                    name: 'lastName',
                    allowBlank: false,
                },
                {
                    margin: '0 10 0 10',
                    labelAlign: 'top',
                    fieldLabel: 'Имя',
                    name: 'firstName',
                    allowBlank: false,
                },
                {
                    margin: '0 10 0 10',
                    labelAlign: 'top',
                    fieldLabel: 'Отчество',
                    name: 'middleName',
                    allowBlank: false,
                },
            ]
        },
        {
            xtype: "fieldcontainer",
            defaultType: 'textfield',
            layout: 'hbox',
            flex: 1,
            items: [
                {
                    margin: '0 10 0 20',
                    labelAlign: 'top',
                    fieldLabel: 'Адрес эл/почты',
                    name: 'email',
                    vtype: 'email',
                    allowBlank: false,
                }
            ]
        },
        {
            xtype: "fieldcontainer",
            layout: 'hbox',
            flex: 1,
            items: [
                {
                    xtype: 'radiofield',
                    margin: '0 10 0 20',
                    inputValue: 'MALE',
                    labelAlign: 'left',
                    boxLabel: 'М',
                    name: 'sex',
                },
                {
                    xtype: 'radiofield',
                    margin: '0 10 0 0',
                    inputValue: 'FEMALE',
                    labelAlign: 'left',
                    boxLabel: 'Ж',
                    name: 'sex',
                }
            ]
        },
        {
            xtype: "fieldcontainer",
            layout: 'hbox',
            flex: 1,
            items: [
                {
                    xtype: 'numberfield',
                    margin: '0 0 0 20',
                    labelAlign: 'left',
                    labelWidth: '7',
                    fieldLabel: 'Возраст',
                    value: 21,
                    maxValue: 120,
                    minValue: 7,
                    name: 'age',
                }
            ]
        },
        {
            xtype: "fieldcontainer",
            layout: 'vbox',
            align: 'center',
            flex: 1,
            items: [
                {
                    xtype: 'checkboxfield',
                    boxLabel: "Любит пить кофе",
                    margin: '0 0 0 20',
                    checked: false,
                    inputValue: 'likesCoffee',
                    name: 'likesCoffee',
                    listeners: {
                        change: function (cpt, newValue, oldValue, eOpts) {
                            cpt.ownerCt.getComponent('comboBoxCoffee').setHidden(oldValue);
                        }
                    }
                },
                {
                    id: 'comboBoxCoffee',
                    xtype: 'combobox',
                    fieldLabel: 'Любимые вкусы:',
                    margin: '0 0 0 20',
                    store: 'extJSApp.store.CoffeeTypes',
                    displayField: 'coffeeType',
                    valueField: 'coffeeType',
                    hidden: true,
                    name: 'coffeeType'

                },
            ]
        },
        {
            xtype: "fieldcontainer",
            layout: 'vbox',
            align: 'center',
            margin: '0 0 20 0',
            flex: 1,
            items: [
                {
                    xtype: 'checkboxfield',
                    boxLabel: "Любит пить чай",
                    margin: '0 0 0 20',
                    checked: false,
                    inputValue: 'likesTea',
                    name: 'likesTea',

                },

            ]
        },
    ],
    buttons: [
        {
            text: 'Сохранить пользователя',
            handler: function () {
                var form = this.up('form').getForm();
                form.owner.mask('Сохраняем...')

                if (form.isValid()) {
                    form.submit({
                        url: '../api/v1/users',
                        success: function (form, action) {
                            Ext.Msg.alert('Успех!', "Пользователь сохранён", function (btn) {
                                if (btn == "ok") {
                                    form.owner.ownerCt.isConfirmed = true;
                                    form.owner.up('userList').view.getStore().load();
                                    form.owner.ownerCt.close();
                                }
                            });
                            form.owner.unmask();

                        },

                        failure: function (form, action) {
                            Ext.Msg.alert('Недача!', 'Произошла ошибка', function (btn) {
                                if (btn == "ok") {
                                    form.owner.ownerCt.isConfirmed = true;
                                    form.owner.up('userList').view.getStore().load();
                                    form.owner.ownerCt.close();
                                }
                            });
                            form.owner.unmask();
                        }
                    });
                } else {
                    Ext.Msg.alert("Ошибка!", "Форма заполнена с ошибками!");
                    form.owner.unmask()
                }
            }
        }
    ]
})