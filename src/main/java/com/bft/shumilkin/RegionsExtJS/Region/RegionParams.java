package com.bft.shumilkin.RegionsExtJS.Region;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;

@Data
public class RegionParams {
    private String searchFor;
    private Long countryId;
    private int limit = 10;
    private int page = 1;
    private String sort;
    private String dir;

    public RegionParams() {

    }

}
