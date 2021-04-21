Ext.define('extJSApp.store.CoffeeTypes', {
    extend: 'Ext.data.Store',
    sorters: 'coffeeType',
    fields: ['id', 'coffeeType'],
    listeners: {},
    data: [
        {'id': 1, "coffeeType": "Cappuccino"},
        {'id': 2, "coffeeType": "Latte"},
        {'id': 3, "coffeeType": "Espresso"},
        {'id': 4, "coffeeType": "Americano"},
        {'id': 5, "coffeeType": "Instant coffee"},
    ]
})