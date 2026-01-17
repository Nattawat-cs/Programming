package Javaoop.A19toStringMethod;

public class Main {
    public static void main(String[] args){

        // .toString() = Method inherited from the object class.
        //               Used to return a string repersenttation of an object.
        //               By default, it returns a hash code as a unique identifier.
        //               It can be overrindden to provide meaningful details.
    
        Car car1 = new Car("Ford", "Mustang", 2025, "Red");
        Car car2 = new Car("Chevrolet", "Corvette", 2026, "Blue");

        System.out.println(car1); // Red 2025 Ford Mustang
        System.out.println(car2); // Blue 2026 Chevrolet Corvette
    
    }
}
