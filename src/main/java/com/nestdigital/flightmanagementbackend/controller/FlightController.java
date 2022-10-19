package com.nestdigital.flightmanagementbackend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {

    @CrossOrigin(origins = "*")
    @PostMapping("/addFlight")
    private String addFlight(){
        return "test";
    }
}
