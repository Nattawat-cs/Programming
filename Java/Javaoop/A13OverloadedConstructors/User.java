package Javaoop.A13OverloadedConstructors;

public class User {
    
    String username;
    String email;
    int age;

    // Constuctor 1
    User(){
        this.username = "Guest";
        this.email = "Not Provided";
        this.age = 0;
    }

    // Constuctor 2
    User(String username){
        this.username = username;
        this.email = "Not Provided";
        this.age = 0;
    }

    // Constructor 3
    User(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    // Constructor 4
    User(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
