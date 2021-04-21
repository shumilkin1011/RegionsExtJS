package com.bft.shumilkin.RegionsExtJS.City;

import lombok.Data;

@Data
public class CityParams {
    String searchFor;
    Long[] regionIds;

    public CityParams() {

    }
}
