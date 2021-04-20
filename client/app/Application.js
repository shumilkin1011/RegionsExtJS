/**
 * The main application class. An instance of this class is created by app.js when it
 * calls Ext.application(). This is the ideal place to handle application launch and
 * initialization details.
 */
Ext.define('extJSApp.Application', {
    extend: 'Ext.app.Application',

    name: 'extJSApp',

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
        'extJSApp.store.CountryAll'
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

