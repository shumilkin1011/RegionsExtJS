package com.bft.shumilkin.RegionsExtJS.City;

import com.bft.shumilkin.RegionsExtJS.Country.Country;
import com.bft.shumilkin.RegionsExtJS.Region.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepo extends JpaRepository<City,Long> {

    List<City> findByCityNameContainingIgnoreCase(String searchFor);
    List<City> findByRegion(Region region);
    List<City> findByCityNameContainingIgnoreCaseAndRegion_Id(String searchFor, Long id);

}
