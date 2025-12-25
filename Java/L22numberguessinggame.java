import java.util.Random;
import java.util.Scanner;

public class L22numberguessinggame {
    public static void main(String[] args) {

        // NUMBER GUESSING GAME

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1, 11);

        System.out.print("Number Guessing Game");
        System.out.print("Guess a Number between 1-10: ");
        
        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.print("TOO LOW! Try again");
            }
            else if(guess > randomNumber){
                System.out.print("TOO HIGH! Try again");
            }
            else{
                System.out.print("CORRECT! The number was " + randomNumber);
                System.out.print("# of attempts: " + attempts);
            }

        }while(guess != randomNumber);

        scanner.close();
    }
}