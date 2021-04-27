package com.bft.shumilkin.RegionsExtJS.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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
    public List<User> getUsers(@RequestParam(name = "dateStart", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)  LocalDate dateStart,
                               @RequestParam(name = "dateEnd", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)  LocalDate dateEnd) {
        if (dateStart != null && dateEnd != null) return service.getBirthdaysBetween(dateStart, dateEnd);
        return service.getUsers();
    }

    @PostMapping
    public ResponseEntity<String> saveUser(@RequestBody User user) {
        service.saveUser(user);
        return ResponseEntity.ok("{\"success\": true}");
    }
}
