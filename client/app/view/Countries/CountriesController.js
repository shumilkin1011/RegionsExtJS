Ext.define('extJSApp.view.Countries.CountriesController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.countries',
    viewModel: 'extJSApp.view.Countries.CountriesViewModel',
    requires: ['extJSApp.view.Countries.CountriesViewModel'],


    countrySelected: function (combo, record, eOpts) {
        this.getViewModel().set('regionBoxDisabled', false);
        this.getViewModel().set('countryId', record.get('id'));

    },
    regionSelected: function (combo, record, eOpts) {
        this.getViewModel().set('regionId', record.get('id'));
        this.getViewModel().set('cityBoxDisabled', false);
    },
    citySelected: function (combo, record, eOpts) {

    },
    befRegionLoads: function (store) {
        store.getProxy().setExtraParam('countryId', this.getViewModel().get('countryId'));
    },
    befCityLoads: function (store) {
        store.getProxy().setExtraParam('regionId', this.getViewModel().get('regionId'));
    },


});