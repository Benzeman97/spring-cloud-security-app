package com.benz.cloud.oauth.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class SsoController {

    @GetMapping
    public String welcome()
    {
        return "Welcome to google";
    }

    @GetMapping("/user")
    public Principal getUser(Principal principal){
        System.out.println("username "+principal.getName());
        return principal;
    }
}
