package Javaoop.A22Polymorphism;

public class Main {
    public static void main(String[] args){

        // Polymorphism = "POLY" = "MANY"
        //                "MORPH" = "SHAPE"
        //                Objects can identify as objects.
        //                Objects can treated as Objects of a common superclass.

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        //Ex.1
        car.go();
        bike.go();
        boat.go();

        //Ex.2
        Vehicle[] vehicles = {car, bike, boat};
        
        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}
