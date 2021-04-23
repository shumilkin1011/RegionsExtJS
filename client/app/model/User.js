Ext.define('extJSApp.model.User', {
    extend: 'Ext.data.Model',
    fields: ['id', 'firstName', 'lastName', 'middleName', 'email', 'sex', 'likesCoffee', 'likesTea', 'age', 'coffeeType'],
    idProperty: "user_id"

});