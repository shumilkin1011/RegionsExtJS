Ext.define('extJSApp.view.main.MainController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.main',

    // загрузка на первой странице + mask
    onStoreBeforeLoadMain : function ( store, operation, eOpts) {
        var model = this.getView('extJSApp.view.main.List');
        model.mask("loading...");

        // клонируем store
        var origin = Ext.getStore("extJSApp.store.Region"),
            clone = store;
        if(origin.count() > 0)
        {
            this.cloneStore(origin,clone);
        }
        else {
            origin.on("datachanged",
                function () {
                    this.cloneStore(origin,clone);
                    this.getView('extJSApp.view.main.List').unmask();
                },
                this);
        }
        return false;
    },

    onDataChangedMain: function (store, eOpts) {
        var model = this.getView('extJSApp.view.main.List');
        model.unmask();
    },

    // Загрузка на второй странице
    onCityStoreBeforeLoad: function( store, operation, eOpts) {
        var origin = Ext.getStore("extJSApp.store.City"),
            clone = store;
        if(origin.count() > 0)
        {
            this.cloneStore(origin,clone);
        }
        else {
            origin.on("datachanged",
                function () {
                    this.cloneStore(origin,clone);
                },
                this);
        }
        return false;
    },

    onRegionStoreBeforeLoad: function( store, operation, eOpts) {
        var origin = Ext.getStore("extJSApp.store.Region"),
            clone = store;
        if(origin.count() > 0)
        {
            this.cloneStore(origin,clone);
        }
        else {
            origin.on("datachanged",
                function () {
                    this.cloneStore(origin,clone);
                },
                this);
        }
        return false;
    },
    onCountryStoreBeforeLoad: function( store, operation, eOpts) {
        var origin = Ext.getStore("extJSApp.store.City"),
            clone = store;
        if(origin.count() > 0)
        {
            this.cloneStore(origin,clone);
        }
        else {
            origin.on("datachanged",
                function () {
                    this.cloneStore(origin,clone);
                },
                this);
        }
        return false;
    },

    cloneStore(originStore, targetStore) {
        targetStore.loadData(originStore.data.items);
    },
});
