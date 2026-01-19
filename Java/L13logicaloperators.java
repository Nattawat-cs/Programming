import java.util.scanner;

public class L13logicaloperators {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);

        // && = AND
        // || = OR
        // ! = NOT
        
        //Ex.1
        double temp = -10;
        boolean isSunny = true;

        if(temp <= 30 && temp >= 0 && temp isSunny){
            System.out.println("The weather is GOOD");
            System.out.println("It is SUNNY outside");
        }
        else if(temp <= 30 && temp >= 0 && !isSunny){
            System.out.println("The weather is GOOD");
            System.out.println("It is CLOUDY outside");
        }
        else if(temp > 30 || temp < 0){
            System.out.println("The weather is bad");
        }

        //Ex.2

        // username must be betwen 4-12 characters
        // username must not contain spaces or underscore

        String username;

        System.out.print("Enter your new username: ");
        username = scanner.nextLine();

        if(username.lenght() < 4 || username.lenght() > 12){
            System.out.println("Usernname must be between 4-12 characters");
        }
        else if(username.contain(" ") || username,contain("_")){
            System.out.println("Usernname must be not contain space or underscore");
        }
        else{
            System.out.println("welcome " + username);
        }

        scanner.close();
    }
}