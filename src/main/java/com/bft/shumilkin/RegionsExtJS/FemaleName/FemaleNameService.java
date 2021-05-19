package com.bft.shumilkin.RegionsExtJS.FemaleName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

    public Page<FemaleName> getFemNames(String searchFor, Pageable p) {
        if(searchFor == null) return repo.findAll(p);
        return repo.findByFemNameStartsWithIgnoreCase(searchFor,p);
    }

    public Page<FemaleName> getFemNameById(Long femNameId) {
        return new PageImpl<FemaleName>(Collections.singletonList(repo.findById(femNameId).orElse(null)));
    }
}
