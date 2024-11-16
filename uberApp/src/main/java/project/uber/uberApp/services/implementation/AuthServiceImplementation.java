package project.uber.uberApp.services.implementation;

import org.springframework.stereotype.Service;
import project.uber.uberApp.dto.DriverDto;
import project.uber.uberApp.dto.SignupDto;
import project.uber.uberApp.dto.UserDto;
import project.uber.uberApp.services.AuthService;

@Service
public class AuthServiceImplementation implements AuthService {

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
