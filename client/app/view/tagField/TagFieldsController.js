Ext.define('extJSApp.view.tagField.TagFieldController', {
    extend: 'Ext.app.ViewController',
    alias: 'controller.tagfield',
    viewModel: 'extJSApp.view.tagField.TagFieldViewModel',
    requires: ['extJSApp.view.tagField.TagFieldViewModel'],


    regionSelected: function (cmp, record, eOpts) {
        this.getViewModel().set('regionId', cmp.getSubmitData());
        this.getViewModel().set('cityBoxDisabled', false);
        this.getViewModel().get('cityStore').load();
    },

    befCityLoads: function (store) {
        store.getProxy().setExtraParam('regionId', this.getViewModel().get('regionId'));
    },

});