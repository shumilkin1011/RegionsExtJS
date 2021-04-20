package com.bft.shumilkin.RegionsExtJS.Country;

import com.bft.shumilkin.RegionsExtJS.Region.Region;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "country")
public class Country {

    @SequenceGenerator(name = "seqCountry")
    @Id
    @Column(name = "country_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seqCountry")
    Long id;
    @NotNull
    String countryName;
    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "country")
    List<Region> regions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public void AddRegion(Region region) {
        regions.add(region);
        region.setCountry(this);
    }
    public void RemoveRegion(Region region) {
        regions.remove(region);
        region.setCountry(null);
    }
}
