import java.util.Scanner;

public class L29bankingprogram {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // JAVA BANKING PROGRAM FOR BEGINNERS
        
        
        double  balance = 0;
        boolean isRunning = true;
        int choice;

        while(isRunning){
            System.out.print("****************");
            System.out.print("BANKING PROGRAM");
            System.out.print("****************");
            System.out.print("1. Show Balance");
            System.out.print("2. Deposite");
            System.out.print("3. Withdraw");
            System.out.print("4. Exit");

            System.out.print("Enter your choice (1 - 4): ");
            choice = scanner.nextInt();
            
            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw();
                case 4 -> isRunning = false;
                default -> System.out.print("INVALID CHOICE");
            }
        }
        
        System.out.print("Thank you! Have a nice day!");

        scanner.close();
    }
    static void showBalance(double balance){
        System.out.println("$%f\n", balance);
    }
    static double deposit(double balance){

        double amount;
        System.out.print("Enter an amount to be deposite: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.print("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }

    }
    static double withdraw(double balance){

        double amount;
        
        System.out.print("Enter amount to be withdraw: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
}