package project.uber.uberApp.strategies.implementation;

import project.uber.uberApp.dto.RideRequestDto;
import project.uber.uberApp.strategies.RideFareCalculationStrategy;

public class RiderFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {

    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
