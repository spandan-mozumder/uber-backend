package com.uberApp.strategies.impl;

import com.uberApp.dto.RideRequestDto;
import com.uberApp.entities.Driver;
import com.uberApp.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {

    @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
