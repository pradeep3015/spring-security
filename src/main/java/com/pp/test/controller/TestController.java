package com.pp.test.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/test")
public class TestController {


    @GetMapping("/home")
    @PreAuthorize("hasRole('ADMIN') || hasRole('USER')")
    public  String home(){
        return "This is home for all user";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public  String admin(){
        return "This is only for admin";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('USER')")
    public  String user(){
        return "This is only for user";
    }


}
