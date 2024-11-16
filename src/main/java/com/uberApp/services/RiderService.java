package com.uberApp.services;

import com.uberApp.dto.DriverDto;
import com.uberApp.dto.RideDto;
import com.uberApp.dto.RideRequestDto;
import com.uberApp.dto.RiderDto;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    List<RideDto> getAllMyRides();
}
