package Javaoop.A8MethodOverriding;


public class Main {
    public static void main(String[] args){
        
        // Method Overriding = When a subclass provides its own
        //                     implementation of a method that is already defind.
        //                     Allows for code reusability and give specific implementations.

        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();

        cat.move();    // This animal is running
        dog.move();    // This animal is running
        fish.move();   // This animal is swimming
    }
}
