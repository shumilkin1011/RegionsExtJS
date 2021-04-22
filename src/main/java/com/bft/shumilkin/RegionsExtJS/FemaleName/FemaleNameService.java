package com.bft.shumilkin.RegionsExtJS.FemaleName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FemaleNameService {

    FemaleNameRepo repo;

    @Autowired
    public FemaleNameService(FemaleNameRepo repo) {
        this.repo = repo;
    }

    public void saveFemNames(List<FemaleName> names) {
        repo.saveAll(names);
    }

    public Page<FemaleName> getFemNames(Pageable p) {
       return repo.findAll(p);
    }
}
