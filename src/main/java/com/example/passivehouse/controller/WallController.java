package com.example.passivehouse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WallController {
    @GetMapping("/calculate")
    public double calcCoeff() {
        return 42.0;
    }
}
