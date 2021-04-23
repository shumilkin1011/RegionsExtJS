package com.bft.shumilkin.RegionsExtJS.FemaleName;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "female_name")
@Data
public class FemaleName {
    @SequenceGenerator(name = "fem_nameSeq")

    @Id
    @GeneratedValue(generator = "fem_nameSeq")
    Long id;
    @Column(name = "femname")
    @NotNull
    String femName;

    public FemaleName() {
    }
}
