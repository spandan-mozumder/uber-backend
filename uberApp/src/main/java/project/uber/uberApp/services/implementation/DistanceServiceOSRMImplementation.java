package project.uber.uberApp.services.implementation;

import org.springframework.stereotype.Service;
import org.locationtech.jts.geom.Point;
import project.uber.uberApp.services.DistanceService;

@Service
public class DistanceServiceOSRMImplementation implements DistanceService {

    @Override
    public double calculateDistance(Point src, Point dest) {
        return 0;
    }
}
