package com.bft.shumilkin.RegionsExtJS.City;

import com.bft.shumilkin.RegionsExtJS.Region.Region;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table( name = "city")
public class City{

    @SequenceGenerator(name = "seqCity")

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seqCity")
    Long id;
    @NotNull
    String cityName;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    Region region;

}
