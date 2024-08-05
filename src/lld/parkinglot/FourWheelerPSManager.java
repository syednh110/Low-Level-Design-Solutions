package lld.parkinglot;

import java.util.Arrays;
import java.util.List;

public class FourWheelerPSManager extends ParkingSpotManager{
    public static List<ParkingSpot> parkingSpots = Arrays.asList(new ParkingSpot(201,true,new Vehicle("BR06AR9999",VehicleType.FOUR_WHEELER)));
    public FourWheelerPSManager() {
        super(parkingSpots);
    }
}
