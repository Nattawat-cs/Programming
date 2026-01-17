package Javaoop.A10Abstraction;

public class Main {
    public static void main(String[] args){

        // abstract = Used to define abstract classes and methods.
        //            Abstraction is the process of hiding implementations details
        //            and showing only the essential features;
        //            Abstract classes CAN'T be instantiated derectly
        //            Can contain 'abstract' method (which must be implemented)
        //            Can contain 'concrete' method (which are inherited)
    
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(3, 4);
        Triangle triangle = new Triangle(5, 6);

        System.out.println(circle.area());
        System.out.println(rectangle.area());
        System.out.println(triangle.area());
    } 
}
