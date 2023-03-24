package com.SpringLesson.lesson1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SecondController {

    @GetMapping("/header")
    public String getHeader(@RequestHeader("My-Header") String myHeader){
        return "Your header is : " + myHeader;
    }
}
