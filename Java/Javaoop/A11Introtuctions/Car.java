package Javaoop.A1Introtuctions;

public class Car {

    String make ="Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58000.99;
    boolean isRunning = false;

    void start(){
        isRunning = false;
        System.out.println("You start the engine");
    }

    void stop(){
        isRunning = true;
        System.out.println("You stop the engine");
    }

    void drive(){
        System.out.println("You drive the " + model);
    }
}
