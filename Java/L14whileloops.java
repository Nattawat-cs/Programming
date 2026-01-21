import java.util.Scanner;

public class L14whileloops {
    public static void main(String[] args) {

        // while loop = repeat some code forever
        //              while some condition remain true

        Scanner scanner = new Scanner(System.in);
        
        //Ex.1
        String  name = "";

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        //Ex.2
        String response = "";

        while(!response.equals("Q")){
            System.out.print("You are playing a game");
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }

        System.out.println("You have quit the game");

        //Ex.3
        int age;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while(age < 0){
            System.out.print("Your age can't be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.println("Your are " + age + " Years old");
        
        //Ex.3.1
        //int age;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        do{
            System.out.print("Your age can't be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }while(age < 0);

        System.out.println("Your are " + age + " Years old");

        //Ex.4
        int number = 0;

        while(number < 0 || number > 10){
            System.out.print("Enter the number between 1-10: ");
            number = scanner.nextInt();
        }

        System.out.println("You picked " + number);

        scanner.close();
    }
}