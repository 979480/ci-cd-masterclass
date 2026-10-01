package com.ci.cd.spring_boot_app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/welcome")
@RestController
public class WelcomeController {

    @GetMapping
    public ResponseEntity<String> welcome(){
        return ResponseEntity.ok("Welcome to spring boot app!");
    }
}
