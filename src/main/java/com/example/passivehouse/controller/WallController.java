package com.example.passivehouse.controller;

import com.example.passivehouse.model.WallRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class WallController {
    @PostMapping("/calculate")
    public String calculateCoefficient(@RequestBody WallRequest wallRequest) {

        return wallRequest.climateZone + " " + wallRequest.layers.get(0) + " " + wallRequest.layers.get(1);
    }
}
