Ext.define('extJSApp.view.SOAP_PARSER',
    {
        extend: 'Ext.panel.Panel',
        xtype: 'soapparser',


        store: Ext.create('extJSApp.store.SOAP_STORE'),
        requires: [
            'Ext.data.soap.Proxy',
            'Ext.data.soap.Reader'
        ],
        viewModel: 'main',
        bodyStyle: {
            backgroundColor: 'transparent',
        },

        dockedItems: [
            {
                dock: 'top',
                xtype: 'panel',

                layout: {
                    type: 'hbox',
                    align: 'middle',
                    pack: 'center'
                },

                height: 50,
                items: [
                    {
                        xtype: 'textfield',
                        width: '300',
                        emptyText: 'Введите СНИЛС',
                        regex: /^[0-9]{11}$/,
                        allowBlank: false,
                        regexText: 'Введите СНИЛС в формате "12345678912" (11 цифр без пробелов и тире) '
                    },
                    {
                        xtype: 'button',
                        margin: '0 20 0 20',
                        text: 'Получить информацию',
                        handler: function (cmp) {
                            var panel = cmp.up('soapparser'),
                                vm = panel.getViewModel(),
                                _snils = panel.down('textfield').getValue();

                            panel.store.load({
                                params: {
                                    snils: _snils
                                },
                                callback: function (records) {
                                    vm.set('rec', records[0]);
                                }
                            })
                        }
                    }
                ],

            }
        ],

        items: [
            {
                xtype: 'panel',
                layout: {
                    type: 'vbox',
                    align: 'stretch'
                },
                bodyStyle: {
                    backgroundColor: 'transparent',
                },
                items: [
                    {
                        xtype: 'panel',
                        height: 2,
                        bodyStyle: {
                            backgroundColor: 'black'
                        }
                    },
                    {
                        xtype: 'container',
                        margin: 10,
                        layout: {
                            type: 'hbox',
                            align: 'stretch'
                        },
                        defaults: {
                            labelAlign: 'top',
                            padding: '0 10 0 10'
                        },
                        items: [
                            {
                                xtype: 'textfield',
                                labelStyle: {
                                    'font-weight': 'bold',
                                    'font-size': '22px'
                                },
                                flex: 1,
                                bind: {value: '{rec.snils}'},
                                labelAlign: 'top',
                                fieldLabel: 'СНИЛС'
                            },

                            {
                                xtype: 'textfield',
                                flex: 1,
                                fieldLabel: 'ИМЯ',
                                bind: {value: '{rec.firstName}'},
                            },
                            {
                                xtype: 'textfield',
                                flex: 1,
                                fieldLabel: 'ФАМИЛИЯ',
                                bind: {value: '{rec.lastName}'},
                            },
                            {
                                xtype: 'textfield',
                                flex: 1,
                                fieldLabel: 'ОТЧЕСТВО',
                                bind: {value: '{rec.middleName}'},
                            }
                        ]
                    },
                    {
                        xtype: 'container',
                        layout: 'hbox',
                        style: {
                            border: 'black 1px solid',
                            'background-color': 'rgba(0,0,255.66)'
                        },
                        defaults: {
                            labelAlign: 'top',
                            padding: '0 10 0 10'
                        },
                        padding: 10,
                        items: [
                            {
                                xtype: 'textfield',
                                flex: 1,
                                fieldLabel: 'Пол',
                                bind: {value: '{rec.gender}'},
                            },
                            {
                                xtype: 'textfield',
                                flex: 1,
                                fieldLabel: 'Дата рождения',
                                bind: {value: '{rec.birthDate}'},
                            },
                            {
                                xtype: 'textfield',
                                flex: 1,
                                fieldLabel: 'Эл/почта',
                                bind: {value: '{rec.email}'},
                            },
                            {
                                xtype: 'textfield',
                                flex: 1,
                                fieldLabel: 'Область обслуживания',
                                bind: {value: '{rec.serviceRegion}'},
                            },
                        ]
                    },
                    {
                        xtype: 'container',
                        layout: 'hbox',
                        defaults: {
                            labelAlign: 'top',
                            padding: '0 10 0 10'
                        },
                        style: {
                            'border-bottom': 'black 1px solid',
                            'background-color': 'rgba(255,0,0,0.66)'
                        },
                        padding: 10,

                        items: [
                            {
                                xtype: 'textfield',
                                flex: 1,
                                fieldLabel: 'Тип документа',
                                bind: {value: '{rec.docTypeCode}'},
                            },
                            {
                                xtype: 'textfield',
                                flex: 1,
                                fieldLabel: 'Серия',
                                bind: {value: '{rec.serDoc}'},
                            },
                            {
                                xtype: 'textfield',
                                flex: 1,
                                fieldLabel: 'Номер',
                                bind: {value: '{rec.numDoc}'},
                            },
                            {
                                xtype: 'textfield',
                                flex: 1,
                                fieldLabel: 'Кто выдал',
                                bind: {value: '{rec.whoIssued}'},
                            },
                            {
                                xtype: 'textfield',
                                flex: 1,
                                fieldLabel: 'Дата выдачи',
                                bind: {value: '{rec.dateIssued}'},
                            },

                        ]
                    },

                ]
            },

        ]

    })