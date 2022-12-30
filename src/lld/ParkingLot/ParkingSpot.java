package lld.ParkingLot;

public class ParkingSpot {
    private int id;
    private boolean isEmpty;
    private Vehicle vehicle;

    public ParkingSpot(int id, boolean isEmpty, Vehicle vehicle) {
        this.id = id;
        this.isEmpty = isEmpty;
        this.vehicle = vehicle;
    }

    public int getId() {
        return id;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void parkVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        this.isEmpty = false;
    }

    public void removeVehicle(){
        this.vehicle =null;
        this.isEmpty = true;
    }
}
