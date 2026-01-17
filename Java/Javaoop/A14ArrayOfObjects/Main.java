package Javaoop.A4ArrayOfObjects;

public class Main {
    public static void main(String[] args){

        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Corvette", "Blue");
        Car car3 = new Car("Charger", "Yellow");

        Car[] cars = {car1, car2, car3};      //  Car[] car = {new Car("Mustang", "Red"), new Car("Corvette", "Blue"), new Car("Charger", "Yellow")};

        for(int i = 0; i < cars.length; i++){    
            cars[i].drive();                      
        }                                         

        // You drive the Red Mustang
        // You drive the Blue Corvette
        // You drive the Yellow Charger

        for(Car car : cars){
            car.color = "Black";
        }

        for(Car car : cars){
            car.drive();
        }

        // You drive the Black Mustang
        // You drive the Black Corvette
        // You drive the Black Charger
    }
}
