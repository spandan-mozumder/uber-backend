package com.uberApp.services.impl;

import com.uberApp.dto.DriverDto;
import com.uberApp.dto.SignupDto;
import com.uberApp.dto.UserDto;

import com.uberApp.services.AuthService;

import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
