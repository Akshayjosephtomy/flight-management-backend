package com.nestdigital.flightmanagementbackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "flights")
public class FlightModel {
    @Id
    @GeneratedValue
    private int id;
    private String flightName;
    private String origin;
    private String destination;
    private String capacity;

    public FlightModel() {
    }

    public FlightModel(int id, String flightName, String origin, String capacity) {
        this.id = id;
        this.flightName = flightName;
        this.origin = origin;
        this.capacity = capacity;
    }

    public FlightModel(String destination) {
        this.destination = destination;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
