package com.SpringLesson.lesson1.controller;

import com.SpringLesson.lesson1.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    @PostMapping("users")
    public User saveUser(@RequestBody User user){
        System.out.println("User Saved!");
        user.setPassword("");
        return user;
    }


    @PostMapping("users-all")
    public List<User> saveAllUser(@RequestBody List<User> users){
        System.out.println("User Saved!");
        users.forEach(user->user.setPassword(""));
        return users;
    }
}
