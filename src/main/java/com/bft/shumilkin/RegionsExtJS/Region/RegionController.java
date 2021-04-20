package com.bft.shumilkin.RegionsExtJS.Region;

import com.bft.shumilkin.RegionsExtJS.City.City;
import com.bft.shumilkin.RegionsExtJS.Country.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.data.domain.Sort.*;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController()
@RequestMapping(value = "/api/v1/regions")
public class RegionController {

    private RegionService service;

    @Autowired
    public RegionController(RegionService service) {
        this.service = service;
    }

    @GetMapping
    public Page<Region> getAllRegions(RegionParams params) {
        int page = 1,
                size = 10;
        Long countryId = null;
        String searchFor = null;


        if (params.getPage() != 0) page = params.getPage();
        if (params.getLimit() != 0) size = params.getLimit();
        if(params.getCountryId() != null) countryId = params.getCountryId();
        if(params.getSearchFor() != null) searchFor = params.getSearchFor();

        List<Order> orders = new ArrayList<>();
        Pageable pageable;
        if (params.getSort() != null && params.getDir() != null) {
            orders.add(new Order(Sort.Direction.fromString(params.getDir()), params.getSort()));
            pageable = PageRequest.of(page - 1, size, Sort.by(orders.get(0)));
        }
        else {
            pageable = PageRequest.of(page - 1, size);
        }

        if (countryId != null && searchFor != null) {
            return service.getAllRegionsByCountryId(searchFor, countryId, pageable);
        }
        if (countryId != null) {
            return service.getRegionsByCountryId(countryId, pageable);
        }
        return service.getAllRegionsPageable(pageable);
    }


    @GetMapping(path = "/{id}")
    public Region getRegionById(@PathVariable(value = "id") Long id) {
        return service.getRegionById(id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteRegionById(@PathVariable(value = "id") Long id) {
        return service.deleteRegionById(id) ? "DELETED" : "NOT EXIST";
    }

    @PostMapping(path = "/{id}")
    public String addCitiesToRegion(@PathVariable(name = "id") Long regionId,
                                    @RequestBody List<City> cities) {
        service.addCitiesToRegion(regionId, cities);
        return "OK";
    }

    @DeleteMapping
    public String deleteRegionsAll(@RequestParam(name = "deleteAll", defaultValue = "false") Boolean isAll) {
        if (isAll) {
            service.deleteRegionsAll();
            return "DELETED";
        } else {
            return "Wrong param value: 'deleteAll'";
        }

    }

    @PostMapping
    public String saveRegions(@RequestBody @Validated List<Region> regions) {
        service.saveRegions(regions);
        return "OK";
    }
}
