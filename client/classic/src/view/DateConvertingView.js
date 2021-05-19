Ext.define('extJSApp.view.DateConvertingView', {
    extend: 'Ext.panel.Panel',
    xtype: 'dateconverter',

    items: [
        {
            reference: 'dateInp',
            xtype: "datefield",
            format: 'd/m/y',
            fieldLabel: "Исходная дата (timestamp)",

        },
        {
            reference: 'dateInpText',
            xtype: 'textfield',
            fieldLabel: 'Внутреннее представление',
            width: 550
        },
        {
            reference: 'dateConv',
            xtype: 'textfield',
            fieldLabel: "Конв. дата",
            width: 550
        },
        {
            xtype: 'container',
            layout: 'hbox',
            items: [
                {
                    xtype: 'button',
                    text: 'Конвертировать!',
                    width: 280,
                    handler: function (cmp) {
                        debugger;
                        var root = cmp.up('app-main'),
                            dateInp = root.lookupReference('dateInp'),
                            dateConv = root.lookupReference('dateConv'),
                            dateInpText = root.lookupReference('dateInpText'),
                            format = root.lookupReference('format');

                        if (!Ext.ClassManager.isCreated('dateModel')) {
                            Ext.define('dateModel', {
                                extend: 'Ext.data.Model',
                                fields: [
                                    {
                                        name: 'value',
                                        type: 'date',
                                        convert: function (v, rec) {

                                        }
                                    }
                                ]
                            });
                        }

                        Ext.ClassManager.get('dateModel').getField('value').convert = function (v, rec) {
                            return Ext.Date.format(v, format.getValue());
                        }
                        dateInpText.setValue(dateInp.getValue());
                        var date = Ext.create('dateModel', {
                            value: dateInp.getValue()
                        });
                        dateConv.setValue(date.get('value'));

                    }
                },
                {
                    reference: 'format',
                    xtype: 'textfield',
                    allowBlank: false,
                    labelWidth: 70,
                    labelAlign: 'right',
                    fieldLabel: 'формат'
                }
            ]

        }

    ],


})