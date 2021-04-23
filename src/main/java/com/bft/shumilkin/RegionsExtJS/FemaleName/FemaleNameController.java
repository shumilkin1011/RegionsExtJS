package com.bft.shumilkin.RegionsExtJS.FemaleName;

import org.springframework.data.domain.*;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/femNames")
public class FemaleNameController {

    FemaleNameService service;

    public FemaleNameController(FemaleNameService service) {
        this.service = service;
    }

    @GetMapping
    public Page<FemaleName> getFemNames(FemaleNameParams params) {
        if(params.getFemNameId() != null) return service.getFemNameById(params.getFemNameId());
        int size = params.getLimit() == 0 ? 10 : params.getLimit();
        int page = params.getPage() == 0 ? 0 : params.getPage()-1;
        Sort sort;
        if(params.getSort() == null ) {
            sort = Sort.unsorted();
        }else if(params.getDir() == null) {
            sort = Sort.by(Sort.Direction.ASC,params.getSort());
        }
        else {
            sort = Sort.by(Sort.Direction.fromString(params.getDir()), params.getSort());
        }
        Pageable p = PageRequest.of(page,size,sort);
        return service.getFemNames(params.getSearchFor(),p);
    }

    @PostMapping
    public String saveFemNames(@RequestBody @Validated List<FemaleName> femNames) {
        service.saveFemNames(femNames);
        return "SAVED";
    }
}
