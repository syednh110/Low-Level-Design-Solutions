package lld.ParkingLot;

public class FourWheelerSpot extends ParkingSpot{
    public FourWheelerSpot(int id, boolean isEmpty, Vehicle vehicle) {
        super(id, isEmpty, vehicle);
    }

    public int price(){
        return 20;
    }
}
