package com.bft.shumilkin.RegionsExtJS.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping(value = "/api/v1/users")
public class UserController {

    UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> getUsers() {
        return service.getUsers();
    }

//    @PostMapping
//    public String saveUsers(@RequestBody List<User> users) {
//        service.saveUsers(users);
//        return "SAVED";
//    }

    @PostMapping
    public String saveUser(@RequestBody User user) {
        service.saveUser(user);
        return "SAVED";
    }
}
