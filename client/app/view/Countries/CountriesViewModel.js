Ext.define('extJSApp.view.Countries.CountriesViewModel', {
    extend: 'Ext.app.ViewModel',
    alias: 'viewmodel.countries',

    data: {
        regionBoxDisabled: true,
        cityBoxDisabled:true,
        name: "testName",
        country_id : 6,
        region_id: 1,
        prevSelected: ''
    },
    stores: {
        countryStore: {
            type: 'Country',
            autoLoad: false,
          },
        regionStore: {
            viewModel: 'countries',
            type: 'Region',
            autoLoad: false,
            listeners: {
                beforeLoad: 'befRegionLoads'
            },
            pageSize: 100
        },
        cityStore: {
            type: 'City',
            autoLoad: false,
            listeners: {
                beforeLoad: 'befCityLoads'
            }
        }
    }
});