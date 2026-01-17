package Javaoop.A6Inheritance;

public class Main {
    public static void main(String[] args){

        // Inheritance = One class inherits the attributes and methods
        //               from another class.
        //               Child <- Parent <- Grandparent

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        //Ex.1
        System.out.println(dog.isAlive); // true
        System.out.println(cat.isAlive); // true

        //EX.2
        dog.eat();                       // The animal is eating
        cat.eat();                       // The animal is eating

        //EX.3
        System.out.println(dog.lives);   // 1
        System.out.println(cat.lives);   // 9

        dog.speak();                     // The dog goes *meow*
        cat.speak();                     // The cat goes *woof*

        //EX.4 
        System.out.println(plant.isAlive); // true

        plant.photosynthesize();           // The plant absorbs sunlight

    }
}
