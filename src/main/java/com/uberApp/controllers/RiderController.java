package com.uberApp.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rider")
public class RiderController{

    public RideRequestDto requestRide(@RequestBody RideRequestDto rideRequestDto)

}