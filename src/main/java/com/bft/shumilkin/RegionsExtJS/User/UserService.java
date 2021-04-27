package com.bft.shumilkin.RegionsExtJS.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class UserService {

    UserRepo repo;

    @Autowired
    public UserService(UserRepo repo) {
        this.repo = repo;
    }

    public List<User> getUsers() {
        return repo.findAll();
    }


    public List<User> getBirthdaysBetween(Date dateStart, Date dateEnd) {
        return repo.findUsersByBirthdayBetween(dateStart, dateEnd);
    }

    public void saveUser(User user) {
        repo.save(user);
    }
}
