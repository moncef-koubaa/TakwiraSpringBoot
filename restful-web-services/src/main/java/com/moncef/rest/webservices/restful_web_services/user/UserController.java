package com.moncef.rest.webservices.restful_web_services.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public void createUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }
    @RequestMapping("/user/verify")
    public User getUserByEmail(@PathVariable String email) {
        return userService.getUserByEmail(email);
    }





}
