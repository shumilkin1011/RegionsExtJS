package com.bft.shumilkin.RegionsExtJS.User;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

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

    public User() {

    }
}
