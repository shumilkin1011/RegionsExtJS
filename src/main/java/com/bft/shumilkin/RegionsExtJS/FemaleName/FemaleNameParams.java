package com.bft.shumilkin.RegionsExtJS.FemaleName;

import lombok.Data;

@Data
public class FemaleNameParams {
    private int limit;
    private int page;
    private String sort;
    private String dir;
    private String searchFor;
    private Long femNameId;
}
