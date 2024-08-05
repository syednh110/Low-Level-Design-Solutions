package lld.parkinglot;

public class Ticket {
    private long time;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;

    public Ticket(long time, Vehicle vehicle, ParkingSpot parkingSpot) {
        this.time = time;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }

    public long getTime() {
        return time;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
