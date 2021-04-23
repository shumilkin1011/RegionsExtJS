Ext.define('extJSApp.model.FemName', {
    extend: 'extJSApp.model.Base',

    fields: [
        {
            name: 'femNameId',
            mapping: 'id',
        },
        'femName'
    ],

    idProperty: "femName_id"
});