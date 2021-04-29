package com.bft.shumilkin.RegionsExtJS.Country;

import com.bft.shumilkin.RegionsExtJS.Region.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/countries")
public class CountryController {

    CountryService service;

    @Autowired
    public CountryController(CountryService service) {
        this.service = service;
    }

    @DeleteMapping(path = "/{id}")
    public String deleteCountryById(@PathVariable(value = "id") Long id) {
        return service.deleteCountryById(id) ? "DELETED" : "NOT EXIST";
    }

    @DeleteMapping
    public String deleteCountriesAll(@RequestParam(name = "deleteAll", defaultValue = "false") Boolean isAll) {
        if (isAll) {
            service.deleteCountriesAll();
            return "DELETED";
        } else {
            return "Wrong param value: \'deleteAll\'";
        }

    }
    @PostMapping
    public String saveCountries(@RequestBody @Validated List<Country> countries) {
        service.saveCountries(countries);
        return "OK";
    }

    @PostMapping(path = "/{id}")
    public String addRegionsToCountry(@PathVariable(name = "id") Long countryId,
                                      @RequestBody List<Region> countries) {
        service.addRegionsToCountry(countryId, countries);
        return "OK";
    }

    @GetMapping
    public List<Country> getAllCountries(@RequestParam(name = "searchFor", required = false) String searchFor) {
        if (searchFor!=null) {
            return service.getAllCountriesSearch(searchFor);
        }
        return service.getAllCountries();
    }

    @GetMapping(path = "/tree", produces = "text/plain;charset=UTF-8")
    public String getAllCountries() {
        return service.getAllCountriesTree();
    }
}
