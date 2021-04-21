package com.bft.shumilkin.RegionsExtJS.City;

import com.bft.shumilkin.RegionsExtJS.Region.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(value = "/api/v1/cities")
public class CityController {

    private CityService service;

    @Autowired
    public CityController(CityService service) {
        this.service = service;
    }

    @GetMapping
    public List<City> getAllCities(
            @RequestParam(name = "searchFor", required = false) String searchFor,
                                      @RequestParam(name = "regionId",required = false) Long[] regionIds) {
        if (regionIds!= null && searchFor!=null) {
            return service.getAllCitiesByRegionIds(searchFor,regionIds);
        }
        if(regionIds!=null)
        {
            return service.getCitiesByRegionId(regionIds);
        }
        return service.getAllCities();
    }

    @GetMapping(path = "/{id}")
    public City getCityById(@PathVariable(value = "id") Long id) {
        return service.getCityById(id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteCityById(@PathVariable(value = "id") Long id) {
        return service.deleteCityById(id) ? "DELETED" : "NOT EXIST";
    }

    @DeleteMapping
    public String deleteCitiesAll(@RequestParam(name = "deleteAll", defaultValue = "false") Boolean isAll) {
        if (isAll) {
            service.deleteCitiesAll();
            return "DELETED";
        } else {
            return "Wrong param value: 'deleteAll'";
        }

    }

    @PostMapping
    public String saveCity(@RequestBody @Validated List<City> cities) {
        service.saveCities(cities);
        return "OK";
    }
}
