Ext.define('extJSApp.model.SOAP_MODEL', {
    extend: 'Ext.data.Model',

    fields: [
        'snils', 'lastName','firstName',
        {
            name: 'docTypeCode',
            mapping: 'recipientDocList.recipientDoc[0].docTypeCode',
        },
        {
            name:  "serDoc",
            mapping: 'recipientDocList.recipientDoc[0].serDoc',
        },
        {
            name: "numDoc",
            mapping: 'recipientDocList.recipientDoc[0].numDoc',
        },
        {
            name: "whoIssued",
            mapping: 'recipientDocList.recipientDoc[0].whoIssued',
        },
        {
           name: "dateIssued",
            mapping: 'recipientDocList.recipientDoc[0].dateIssued',
        }

    ]

});
