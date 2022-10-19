package com.nestdigital.flightmanagementbackend.dao;

import com.nestdigital.flightmanagementbackend.model.FlightModel;
import org.springframework.data.repository.CrudRepository;

public interface FlightDao extends CrudRepository<FlightModel,Integer> {
}
