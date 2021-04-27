Ext.define('extJSApp.store.RegionBad', {
    extend: 'Ext.data.Store',
    xtype: 'RegionBad',
    alias: 'store.RegionBad',
    sorters: [{
        property: 'regionName',
        direction: 'ASC'
    }],

    model: 'extJSApp.model.Region',
    proxy: {
        type: 'ajax',
        url: '../api/v1/regions/bad',
        reader: {
            type: 'json',
        }
    },
    autoLoad: true,
    listeners: {
        load: function (store) {
            if (this.count() < 1) return;
            var win = Ext.create('Ext.window.Window', {
                title: 'Найдены некорректные данные!!!',
                width: 350,
                dockedItems: [{
                    xtype: 'toolbar',
                    dock: 'bottom',
                    layout: {
                        pack: 'center',
                        type: 'hbox'
                    },
                    items: [{
                        xtype: 'button',
                        text: "Показать записи (" + this.count() + " шт)",
                        handler: function (cmp) {
                            var store = Ext.getApplication().getRegionBadStore();
                            var mainView = Ext.getApplication().getMainView();
                            var tagPanel = Ext.getApplication().getMainView().down('tagFieldMain').ownerCt;
                            var tagfield = tagPanel.down('tagfield');
                            var grid = tagPanel.down('grid');
                            var window = cmp.ownerCt.ownerCt;
                            mainView.setActiveTab(tagPanel);
                            grid.ownerCt.getViewModel().getStore('regionStore').load({
                                callback: function () {
                                    tagfield.setValue(store.getRange());
                                    grid.store.setRecords(tagfield.getValueRecords());
                                    window.close();
                                }
                            })

                        }
                    }]
                }],
            });
            win.show();
        }
    }

});




