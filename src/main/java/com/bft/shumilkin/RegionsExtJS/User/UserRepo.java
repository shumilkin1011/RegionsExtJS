package com.bft.shumilkin.RegionsExtJS.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

    List<User> findByBirthday(Date birthday);

    List<User> findUsersByBirthdayBetween(LocalDate dateStart, LocalDate dateEnd);
}
