package com.example.passivehouse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WallController {
    @GetMapping("/calculate/{zoneId}")
    public double calcCoeff(@PathVariable Integer zoneId) {
        return zoneId;
    }
}
