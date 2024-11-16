package com.uberApp.strategies;

import com.uberApp.dto.RideRequestDto;

public interface RideFareCalculationStrategy {

    double calculateFare(RideRequestDto rideRequestDto);

}
