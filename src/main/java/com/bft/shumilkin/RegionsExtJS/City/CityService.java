package com.bft.shumilkin.RegionsExtJS.City;

import com.bft.shumilkin.RegionsExtJS.Country.Country;
import com.bft.shumilkin.RegionsExtJS.Country.CountryService;
import com.bft.shumilkin.RegionsExtJS.Region.Region;
import com.bft.shumilkin.RegionsExtJS.Region.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {

    private CityRepo repo;
    private RegionService regionService;

    @Autowired
    public CityService(CityRepo repo, RegionService regionService) {
        this.repo = repo;
        this.regionService = regionService;
    }


    public City getCityById(Long id) {
        Optional<City> cityMaybe = repo.findById(id);
        return cityMaybe.orElseThrow();
    }

    public boolean deleteCityById(Long id) {
        Optional<City> cityMaybe = repo.findById(id);
        if(cityMaybe.isEmpty()) return false;
        else {
            repo.delete(cityMaybe.get());
            return true;
        }
    }

    public List<City> getAllCities() {
        return repo.findAll();
    }

    public List<City> getAllCitiesSearch(String searchFor) {
        return repo.findByCityNameContainingIgnoreCase(searchFor);
    }

    public List<City> getAllCitiesByRegionIds(String searchFor, Long[] ids) {
        return repo.findByCityNameContainingIgnoreCaseAndRegion_IdIn(searchFor, ids);
    }

    public List<City> getCitiesByRegionId(Long[] ids) {
        return repo.findAllByRegion_IdIn(ids);
    }

    public void saveCities(List<City> cities) {
        repo.saveAll(cities);
    }

    public void deleteCitiesAll() {
        repo.deleteAll();
    }
}
