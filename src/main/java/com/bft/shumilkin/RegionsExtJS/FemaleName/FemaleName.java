package com.bft.shumilkin.RegionsExtJS.FemaleName;

import lombok.Data;
import org.springframework.stereotype.Controller;

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
    String femname;

    public FemaleName() {
    }
}
