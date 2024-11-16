package com.uberApp.strategies;

import com.uberApp.dto.RideRequestDto;
import com.uberApp.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);
}
