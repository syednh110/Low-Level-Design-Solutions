package lld.parkinglot;

import java.util.Arrays;
import java.util.List;

public class TwoWheelerPSManager extends ParkingSpotManager{
    public static List<ParkingSpot> parkingSpots = Arrays.asList(new TwoWheelerSpot(101,true,new Vehicle("BR07AT9997",VehicleType.TWO_WHEELER)));
    public TwoWheelerPSManager() {
        super(parkingSpots);
    }
}
