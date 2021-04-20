package com.bft.shumilkin.RegionsExtJS.Region;

import com.bft.shumilkin.RegionsExtJS.City.City;
import com.bft.shumilkin.RegionsExtJS.Country.Country;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;
import lombok.Data;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table( name = "region")
public class Region{

    @SequenceGenerator(name = "seqRegion")

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seqRegion")
    Long id;
    @NotNull
    String regionName;
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    Country country;
    @Formula(value = "id || ' ' || region_name")
    String composite;
    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "region")
    List<City> cities;

    public void AddCity(City city) {
        cities.add(city);
        city.setRegion(this);
    }
    public void RemoveCity(City city) {
        cities.remove(city);
        city.setRegion(this);
    }

}
