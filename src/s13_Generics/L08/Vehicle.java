package s13_Generics.L08;

public class Vehicle {
    private int VehicleID;

    public Vehicle(int vehicleID) {
        super();
        VehicleID = vehicleID;
    }

    public int getVehicleID() {
        return VehicleID;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "VehicleID=" + VehicleID +
                '}';
    }

    void info(){
        System.out.println("Vehicle ID is : " + getVehicleID());
    }
}
