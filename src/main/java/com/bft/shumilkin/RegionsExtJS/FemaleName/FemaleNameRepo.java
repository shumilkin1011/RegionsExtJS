package com.bft.shumilkin.RegionsExtJS.FemaleName;

import com.bft.shumilkin.RegionsExtJS.Region.Region;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FemaleNameRepo extends JpaRepository<FemaleName,Long> {

    Page<FemaleName> findAll(Pageable pageable);
}
