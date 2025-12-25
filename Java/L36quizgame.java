import java.util.Scanner;

public class L36quizgame {
    public static void main(String[] args) {

        String[] questions = {"What is the main function of a router?",
                              "Which part of the computer is considered the brain?",
                              "What year was FAcebook launched?",
                              "Who is know as the father of computers?",
                              "What was the first programming language?"};

        String[][] options = {{"1. Storing file", "2. Encrypting", "3. Direction internet traffic", "4. Managing password"},
                              {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                              {"1. 2000", "2. 2004", "3. 2006", "4.2008"},
                              {"1. Steve Job", "2. Bill Gates", "3. Alan Turing", "4. Charles Badies"},
                              {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}};

        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("*************");
        System.out.print("Welcome to the java Quiz Game!");
        System.out.print("*************");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String options : options[i]){
                System.out.println(options);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                System.out.print("*********");
                System.out.print("CORRECT!");
                System.out.print("*********");
                score++;
            }
            else{
                System.out.print("**********");
                System.out.print("WRONG!");
                System.out.print("**********");
            }
        }
        
        System.out.println("Your final score is: " + score + " out of " +  questions.length);
        
        scanner.close();
    }
}