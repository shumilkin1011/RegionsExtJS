package com.bft.shumilkin.RegionsExtJS.Country;

import com.bft.shumilkin.RegionsExtJS.Region.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    CountryRepo countryRepo;

    @Autowired
    public CountryService(CountryRepo countryRepo) {
        this.countryRepo = countryRepo;
    }

    public Country findCountryById(Long id) {
        return countryRepo.findById(id).orElseThrow();
    }

    public List<Country> getAllCountries() {
        return countryRepo.findAll();
    }

    public void saveCountries(List<Country> countries) {

        for (Country country : countries) {
            if (country.countryName != null) {
                countryRepo.save(country);
            }
        }
    }

    public boolean deleteCountryById(Long id) {
        Optional<Country> countryMaybe = countryRepo.findById(id);
        if(countryMaybe.isEmpty()) return false;
        else {
            countryRepo.delete(countryMaybe.get());
            return true;
        }
    }

    public List<Country> getAllCountriesSearch(String searchFor) {
        List<Country> s =countryRepo.findByCountryNameContainingIgnoreCase(searchFor);
        return s;

    }

    public void deleteCountriesAll() {
        countryRepo.deleteAll();
    }

    public void addRegionsToCountry(Long countryId, List<Region> regions) {
        Optional<Country> countryOpt = countryRepo.findById(countryId);
        if(countryOpt.isEmpty()) return;
        Country country = countryOpt.get();
        for(Region reg: regions) {
            country.AddRegion(reg);
        }
        countryRepo.save(country);
    }
}
