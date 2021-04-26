package com.bft.shumilkin.RegionsExtJS.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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
    public List<User> getUsers(@RequestParam(required = false) @DateTimeFormat(pattern = "dd/MM/yyyy")Date birthday) {
        if(birthday != null) return service.getUsersByBirthday(birthday);
        return service.getUsers();
    }

    @PostMapping
    public ResponseEntity<String> saveUser(@RequestBody User user) {
        service.saveUser(user);
        return ResponseEntity.ok("{\"success\": true}");
    }
}
