package Javaoop.A26Composition;

public class Main {
    public static void main(String[] args) {
        
        // Composition = Represents a "Part-of" relationship between objects.
        //               For example,  an Engine is "part of" a Car.
        //               Allows complex objects to be constructed from smaller objects.

        Car car = new Car("Corvette", 2025, "V8");
    
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.Type);

        car.start();
    }
}
