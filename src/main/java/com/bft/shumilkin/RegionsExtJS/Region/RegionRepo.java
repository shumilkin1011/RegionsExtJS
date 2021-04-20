package com.bft.shumilkin.RegionsExtJS.Region;

import com.bft.shumilkin.RegionsExtJS.Country.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface RegionRepo extends JpaRepository<Region,Long> {

    Page<Region> findByRegionNameContainingIgnoreCase(String searchFor,Pageable pageable);
    Page<Region> findByCountry(Country country, Pageable pageable);
    Page<Region> findAll(Pageable pageable);
    Page<Region> findByRegionNameContainingIgnoreCaseAndCountry_Id(String searchFor, Long id, Pageable pageable);

}
