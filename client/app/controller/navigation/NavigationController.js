Ext.define('extJSApp.controller.navigation.NavigationController', {
    extend: 'Ext.app.Controller',
    alias: 'controller.navigation',

    routes: {
        'comboBoxes': 'onComBoxes',
        'gridCopy': 'onGridCopy',
        'boxesRus': 'onRusComBoxes',
        'tagfield': 'onTagField',
        'users': 'onUsers',
        'regLst/:page': 'onRegLstPage',
        'bigBox': 'onBigBox',
        'tree': 'onTree'
    },

    onTree: function () {
        var grid = Ext.getApplication().getMainView('main');
        grid.setActiveTab(7);
    },
    onBigBox: function () {
        var grid = Ext.getApplication().getMainView('main');
        grid.setActiveTab(6);
    },
    onRegLstPage: function (page) {
        this.onRegLst();
        var grid = Ext.getApplication().getMainView().down('mainlist');
        grid.store.loadPage(page);
        debugger;
    },

    onTagField: function () {
        var grid = Ext.getApplication().getMainView('main');
        grid.setActiveTab(4);
    },
    onRusComBoxes: function () {
        var grid = Ext.getApplication().getMainView('main');
        grid.setActiveTab(3);
    },
    onGridCopy: function () {
        var grid = Ext.getApplication().getMainView('main');
        grid.setActiveTab(2);
    },
    onComBoxes: function () {
        var grid = Ext.getApplication().getMainView('main');
        grid.setActiveTab(1);
    },
    onRegLst: function () {
        var grid = Ext.getApplication().getMainView('main');
        grid.setActiveTab(0);
    },
    onUsers: function () {
        var grid = Ext.getApplication().getMainView('main');
        grid.setActiveTab(5);
    },
});