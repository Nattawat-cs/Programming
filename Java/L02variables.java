public class L02variables {
    public static void main(String[] args) {

    // ❎ variable = a reusable container for a value
    //            a variable behaves as if it was the value it contains
    
    // 🟥 Primitive = simple value stored directly in memory (stack)
    // 🟦 Reference = memory address (stack) that points to the (heap)

    // 🟥 Primitive vs 🟦 Reference
    //    ---------       ---------
    //    int             string
    //    double          array
    //    char            object
    //    boolean

    // 2 step to creating a variable
    // -----------------------------
    // 1. declaration
    // 2. assignment
    

    //Ex.1 int
    int age = 21;
    int year = 2025;
    int quantity = 1;

    System.out.println(age + " years old");
    System.out.println("The year is " + year);

    //Ex.2 double
    double price = 19.99;
    double gpa = 3.5;
    double temperature = 12.5;
    
    System.out.println(price);

    //Ex.3 char
    char grade = 'A';
    char symbol = '!';
    char currency = '$';

    System.out.println(grade);

    //Ex.4 boolean
    boolean isStudent = true;
    boolean forSale = false;
    boolean isOnline = true;

    System.out.println(isStudent);
    
    if(isStudent){
        System.out.println("You are a student!");
    }
    else{
        System.out.println("You are NOT a student!");
    }
    
    //Ex.5 string
    String name = "Bro code";
    String food = "pizza";
    String email = "fake123@gmail.com";
    String car = "Mustang";
    String color = "red";

    System.out.println("Hello " + name);
    System.out.println("Your favorite food is " + food);
    System.out.println("Your email is " + email);
    
    System.out.println("Your choice is a " + color + " " + year + " " + car);
    System.out.println("The price is: " + currency + price);

    if(forSale){
        System.out.println("There is a " + car + " for sale");
    }
    else{
        System.out.println("The " + car + " is not for sale");
    }

    }
}