package com.bft.shumilkin.RegionsExtJS.Region;

import com.bft.shumilkin.RegionsExtJS.City.City;
import com.bft.shumilkin.RegionsExtJS.Country.Country;
import com.bft.shumilkin.RegionsExtJS.Country.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegionService {

    private RegionRepo repo;
    private CountryService countryService;

    @Autowired
    public RegionService(RegionRepo repo, CountryService countryService) {
        this.repo = repo;
        this.countryService = countryService;
    }

    public Region getRegionById(Long id) {
        Optional<Region> regionMaybe = repo.findById(id);
        return regionMaybe.orElse(null);
    }

    public boolean deleteRegionById(Long id) {
        Optional<Region> regionMaybe = repo.findById(id);
        if(!regionMaybe.isPresent()) return false;
        else {
            repo.delete(regionMaybe.get());
            return true;
        }
    }

    public Page<Region> getAllRegionsByCountryId(String searchFor, Long id, Pageable pageable) {
        return repo.findByRegionNameContainingIgnoreCaseAndCountry_Id(searchFor, id, pageable);
    }

    public Page<Region> getAllRegionsPageable(Pageable p) {
        return repo.findAll(p);
    }
    public List<Region> getAllRegions() {
        return repo.findAll();
    }

    public Page<Region> getAllRegionsSearch(String searchFor, Pageable pageable) {
        return repo.findByRegionNameContainingIgnoreCase(searchFor, pageable);
    }

    public Page<Region> getRegionsByCountryId(Long id,Pageable pageable) {
        Country country = countryService.findCountryById(id);
        return repo.findByCountry(country, pageable);
    }

    public void addCitiesToRegion(Long regionId, List<City> cities) {
        Optional<Region> regionOpt = repo.findById(regionId);
        if(regionOpt.isPresent()) return;
        Region region = regionOpt.get();
        for(City city: cities) {
            region.AddCity(city);
        }
        repo.save(region);
    }

    public void saveRegions(List<Region> regions) {
        repo.saveAll(regions);
    }

    public void deleteRegionsAll() {
        repo.deleteAll();
    }
}
