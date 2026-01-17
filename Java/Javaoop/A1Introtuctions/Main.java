package Javaoop.A1Introtuctions;

public class Main {
    public static void main(String[] args){

        Car car = new Car();

        car.isRunning = true;

        System.out.println(car.make);       // Ford
        System.out.println(car.model);      // Mustang
        System.out.println(car.year);       // 2025
        System.out.println(car.price);      // 58000.99
        System.out.println(car.isRunning);  // true

        System.out.println(car.isRunning);  // true
        car.start();                        // You start the engine
        System.out.println(car.isRunning);  // false
        car.stop();                         // You stop the engine
        System.out.println(car.isRunning);  // true

        car.drive();                        // you drive the Mustang
    }
    
}
