/*
 * This file launches the application by asking Ext JS to create
 * and launch() the Application class.
 */
Ext.application({
    extend: 'extJSApp.Application',

    name: 'extJSApp',

    requires: [
        // This will automatically load all classes in the extJSApp namespace
        // so that application classes do not need to require each other.
        'extJSApp.*'
    ],


    // The name of the initial view to create.
    mainView: 'extJSApp.view.main.Main'
});
