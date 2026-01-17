package Javaoop.A3OverloadedConstuctors;

public class Main {
    public static void main(String[] args){

        // Overloaded Constructors = Allow a class to have multiple constructors
        //                           with different parameter lists.
        //                           Enable objects to be initialzed in various ways.

        User user1 = new User("Spongbob");
        User user2 = new User("Patrick", "Pat.123@gmail.com");
        User user3 = new User("Sandy", "SCheeks@gmail.com", 27);

        System.out.println(user1.username);  // Spongbob
        System.out.println(user1.email);     // Not Provided
        System.out.println(user1.age);       // 0

        System.out.println(user2.username);  // Patrick
        System.out.println(user2.email);     // Pat.123@gmail.com
        System.out.println(user2.age);       // 0

        System.out.println(user3.username);  // Sandy
        System.out.println(user3.email);     // SCheeks@gmail.com
        System.out.println(user3.age);       // 27
    }
}
