package s13_Generics.L08;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();
        list.add(new Vehicle(10));
        list.add(new Vehicle(20));
        list.add(new Vehicle(30));
        list.add(new Vehicle(40));
        list.add(new Car(14,"A14"));
        displayLowerBound(list);
        displayUpperBound(list);
    }
    public static void displayLowerBound(List<? extends Vehicle> list){
        System.out.println("Lower Bound");
        for(Vehicle element : list){
            element.info();
        }
    }

    public static void displayUpperBound(List<? super Car> list){
        System.out.println("Upper bownd");
        for(Object element : list){
            System.out.println("Element: " + element.toString());
        }
    }
}
