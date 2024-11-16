package com.uberApp.strategies.impl;

import com.uberApp.dto.RideRequestDto;
import com.uberApp.entities.Driver;
import com.uberApp.strategies.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
