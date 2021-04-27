package com.bft.shumilkin.RegionsExtJS.User;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "users")
@Entity
@Data
public class User {
    @SequenceGenerator(name = "userSeq")
    @GeneratedValue(generator = "userSeq")
    @Id()
    Long id;
    @NotNull
    String firstName, lastName, middleName, email, coffeeType;
    @NotNull
    Integer age;
    @NotNull
    UserSexEnum sex;
    boolean likesCoffee, likesTea;
    @JsonFormat(pattern = "yyyy-MM-dd")
    LocalDate birthday;
    Long favFemNameId;

    public User() {

    }
}
