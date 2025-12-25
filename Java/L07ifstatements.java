import java.util.Scanner;

public class L07ifstatements {
    public static void main(String[] args) {

        // if statement = performs a block of code if its condition is true
        
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter Your age: ");
        age = scanner.nextInt();

        // GROUP 1
        if(name.isEmpty()){
            System.out.println("You didn't enter your name!");
        }
        else{
            System.out.println("Hello " + name + "!");
        }

        // GROUP 2
        if(age >= 18){
            System.out.println("You are an adult!");
        }
        else if(age >= 65){
            System.out.println("You are a senior!");
        }
        else if(age < 0){
            System.out.println("You haven't been born yet!");
        }
        else if(age == 0){
            System.out.println("You are a baby!");
        }
        else{
            System.out.println("You are a child!");
        }
 
        scanner.close();
 
    }
}