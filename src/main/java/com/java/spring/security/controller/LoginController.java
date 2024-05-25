package com.java.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String getHome() {
        return "home";
    }

    @GetMapping("/user")
    public String getUser() {
        return "user";
    }

    @GetMapping("/admin")
    public String getAdmin() {
        return "admin";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }
}
