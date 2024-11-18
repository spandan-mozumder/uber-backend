package com.uberApp.strategies.impl;

import com.uberApp.entities.Driver;

import com.uberApp.entities.RideRequest;
import com.uberApp.repositories.DriverRepository;
import com.uberApp.strategies.DriverMatchingStrategy;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {

    private final DriverRepository driverRepository;

    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return driverRepository.findTenNearestDrivers(rideRequest.getPickupLocation());
    }
}
