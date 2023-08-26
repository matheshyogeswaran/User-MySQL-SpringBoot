package com.crud.user.controller;

import com.crud.user.model.User;
import com.crud.user.service.BL.UserServiceBL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserServiceBL userServiceBL;

    @GetMapping
    public List<User> getAllUsers() {
        return userServiceBL.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userServiceBL.getUserById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userServiceBL.createUser(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userServiceBL.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userServiceBL.deleteUser(id);
    }
}
