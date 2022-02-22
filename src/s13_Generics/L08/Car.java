package s13_Generics.L08;

public class Car extends Vehicle{
    private String CarModel;

    public Car(int vehicleID, String carModel) {
        super(vehicleID);
        CarModel = carModel;
    }

    public String getCarModel() {
        return CarModel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "CarModel='" + CarModel + '\'' +
                '}';
    }

    @Override
    void info(){
        System.out.println("Car model is: "+getCarModel());
    }
}
