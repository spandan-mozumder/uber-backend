package project.uber.uberApp.services.implementation;

import org.springframework.stereotype.Service;
import project.uber.uberApp.dto.DriverDto;
import project.uber.uberApp.dto.RideDto;
import project.uber.uberApp.dto.RideRequestDto;
import project.uber.uberApp.dto.RiderDto;
import project.uber.uberApp.services.RiderService;

import java.util.List;

@Service
public class RiderServiceImplementation implements RiderService {
    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }
}
