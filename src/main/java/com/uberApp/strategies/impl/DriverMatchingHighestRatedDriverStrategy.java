package com.uberApp.strategies.impl;

import com.uberApp.entities.Driver;

import com.uberApp.entities.RideRequest;
import com.uberApp.strategies.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return List.of();
    }
}

