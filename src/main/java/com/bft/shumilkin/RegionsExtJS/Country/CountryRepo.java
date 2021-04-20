package com.bft.shumilkin.RegionsExtJS.Country;

import com.bft.shumilkin.RegionsExtJS.Region.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepo extends JpaRepository<Country,Long> {

    List<Country> findByCountryNameContainingIgnoreCase(String searchFor);
}
