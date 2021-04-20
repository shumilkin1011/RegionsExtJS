package com.bft.shumilkin.RegionsExtJS.Region;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;

@Data
public class RegionParams {
    String searchFor;
    Long countryId;
    int limit;
    int page;
    String sort;
    String dir;

    public RegionParams() {

    }

}
