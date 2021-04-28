Ext.define('extJSApp.view.main.Main', {
    extend: 'Ext.tab.Panel',
    xtype: 'app-main',

    requires: [
        'Ext.plugin.Viewport',
        'Ext.window.MessageBox',

        'extJSApp.view.main.MainController',
        'extJSApp.view.main.MainModel',
        'extJSApp.view.main.List'
    ],

    controller: 'main',
    viewModel: 'main',

    ui: 'navigation',

    tabBarHeaderPosition: 1,
    titleRotation: 0,
    tabRotation: 0,
    header: {
        layout: {
            align: 'stretchmax'
        },
        title: {
            bind: {
                text: '{name}'
            },
            flex: 0
        },
        iconCls: 'fa-th-list'
    },

    tabBar: {
        flex: 1,
        layout: {
            align: 'stretch',
            overflow: 'scroller'
        }
    },

    responsiveConfig: {
        tall: {
            headerPosition: 'top'
        },
        wide: {
            headerPosition: 'left'
        }
    },

    defaults: {
        bodyPadding: 20,
        tabConfig: {
            responsiveConfig: {
                wide: {
                    iconAlign: 'left',
                    textAlign: 'left'
                },
                tall: {
                    iconAlign: 'top',
                    textAlign: 'center',
                    width: 120
                }
            }
        }
    },

    items: [{
        title: 'Просто список',
        items: [{
            xtype: 'mainlist',

        }],

        tabConfig: {
            listeners: {
                click: 'usrLstClicked'
            }
        }
    }, {
        title: 'Комбобоксики',
        items: [{
            xtype: 'comboBoxesMain'
        }],
        tabConfig: {
            listeners: {
                click: 'comboboxesClicked'
            }
        }
    }, {
        title: 'Копируем грид',
        items: [
            {
                xtype: 'countryGrid'
            }],
        tabConfig: {
            listeners: {
                click: 'copyGridClicked'
            }
        }
    }, {
        title: 'Россия вперёд!',
        items: [
            {
                xtype: 'comboBoxesRUS'
            }
        ],
        tabConfig: {
            listeners: {
                click: 'russianBoxesClicked'
            }
        }
    },
        {
            title: 'Выбор нескольких регионов',
            items: [
                {
                    xtype: 'tagFieldMain'
                }
            ],
            tabConfig: {
                listeners: {
                    click: 'tagfieldClicked'
                }
            }
        },
        {
            title: 'Сохраняем пользователей',
            items: [
                {
                    xtype: 'userList',
                    layout: 'card',
                },
            ],
            tabConfig: {
                listeners: {
                    click: 'usersClicked'
                }
            }
        },
        {
            title: 'Большой текстбокс',
            tabConfig: {
                listeners: {
                    click: 'bigBoxClicked'
                }
            },
            items: [
                {
                    xtype: 'textfield',
                    fieldLabel: "Очень большой текстфилд",
                    labelAlign: 'top',
                    validateOnChange: false,
                    msgTarget: 'none',
                    listeners: {
                        render: function (cmp) {
                            cmp.tooltip = new Ext.tip.ToolTip({
                                target: cmp,
                                html: "",
                                maxWidth: 500,
                                maxHeight: '100%',
                                trackMouse: true,
                                disabled: true
                            })
                        },

                        change: function (cmp) {
                            var DIFFERENCE = 25;
                            var txtSize = Ext.util.TextMetrics.measure(cmp.getEl(), cmp.value).width;
                            var elSize = cmp.getWidth();

                            var disabled = (elSize - txtSize > DIFFERENCE)
                            if (disabled) {
                                cmp.clearInvalid();
                                return
                            }

                            cmp.markInvalid(true);
                            cmp.tooltip.setHtml('<hr/> <b>' + cmp.getValue() + '</b> <hr/> ');
                            cmp.tooltip.setDisabled(disabled);

                        }
                    },
                }

            ],

        },
    ]
});
