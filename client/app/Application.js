Ext.define('extJSApp.Application', {
    extend: 'Ext.app.Application',
    name: 'extJSApp',
    defaultToken : 'users',
    quickTips: false,

    platformConfig: {
        desktop: {
            quickTips: true
        }
    },

    stores: [
        'extJSApp.store.Region',
        'extJSApp.store.Country',
        'extJSApp.store.City',
        'extJSApp.store.RegionFullData',
        'extJSApp.store.CountryAll',
        'extJSApp.store.CoffeeTypes',
        'extJSApp.store.User',
        'extJSApp.store.FemName',
        'extJSApp.store.RegionBad'
    ],

    controllers: [
        'extJSApp.controller.navigation.NavigationController',
    ],

    onAppUpdate: function () {
        Ext.Msg.confirm('Application Update', 'This application has an update, reload?',
            function (choice) {
                if (choice === 'yes') {
                    window.location.reload();
                }
            }
        );
    },
});

