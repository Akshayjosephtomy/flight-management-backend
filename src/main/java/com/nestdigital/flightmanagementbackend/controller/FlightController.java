package com.nestdigital.flightmanagementbackend.controller;

import com.nestdigital.flightmanagementbackend.dao.FlightDao;
import com.nestdigital.flightmanagementbackend.model.FlightModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FlightController {

    @Autowired
    private FlightDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addFlight",consumes = "application/json",produces = "application/json")
    private String addFlight(@RequestBody FlightModel flight){
        System.out.println(flight.toString());
        dao.save(flight);
        return "(status:'success')";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewFlights")
    public List<FlightModel> viewFlights(){
        return (List<FlightModel>) dao.findAll();
    }
}
