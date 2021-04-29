package com.bft.shumilkin.RegionsExtJS.Country;

import com.bft.shumilkin.RegionsExtJS.City.City;
import com.bft.shumilkin.RegionsExtJS.Region.Region;
import com.google.gson.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

    public String getAllCountriesTree() {

        List<Country> list = getAllCountries();

        JsonObject nodeMain = new JsonObject();
        JsonArray childrenMain= new JsonArray();

        nodeMain.add("text", JsonParser.parseString("Countries"));

        for(Country c : list) {
            JsonArray childrenCountry = new JsonArray();

            for(Region r : c.getRegions()) {
                JsonArray childrenRegion = new JsonArray();

                JsonObject region = new JsonObject();
                region.add("text", new JsonPrimitive(r.getRegionName()));

                for(City _city : r.getCities()){
                    JsonObject city = new JsonObject();
                    city.add("text", new JsonPrimitive(_city.getCityName()));
                    city.add("leaf", new JsonPrimitive(true));
                    childrenRegion.add(city);
                }

                region.add("children", childrenRegion);
                childrenCountry.add(region);
            }

            JsonObject country = new JsonObject();
            country.add("text", JsonParser.parseString(c.getCountryName()));

            country.add("children",childrenCountry);

            childrenMain.add(country);

        }
        nodeMain.add("children", childrenMain);
        return nodeMain.toString();
    };

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
