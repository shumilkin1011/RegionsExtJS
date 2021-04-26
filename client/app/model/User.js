Ext.define('extJSApp.model.User', {
    extend: 'Ext.data.Model',
    fields: [
        'id', 'firstName', 'lastName', 'middleName',
        'email', 'sex', 'likesCoffee', 'likesTea', 'age', 'coffeeType', {name: 'birthday', type:'date',
            dateFormat: 'Y-m-d'}],
    idProperty: "user_id"

});