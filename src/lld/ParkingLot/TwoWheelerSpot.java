package lld.ParkingLot;

public class TwoWheelerSpot extends ParkingSpot{
    public TwoWheelerSpot(int id, boolean isEmpty, Vehicle vehicle) {
        super(id, isEmpty, vehicle);
    }

    public int price(){
        return 10;
    }
}
