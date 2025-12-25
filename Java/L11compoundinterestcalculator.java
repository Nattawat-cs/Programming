import java.util.Scanner;

public class L11compoundinterestcalculator {
    public static void main(String[] args) {

    // Compoundd interest calculator

    Scanner scanner = new Scanner(System.in);

    double principal;
    double rate;
    int timesCompounded;
    int years;
    double amouth;

    System.out.print("Enter the principal amount: ");
    principal =  scanner.nextDouble();
    
    System.out.print("Enter the interest rate (in %): ");
    rate = scanner.nextDouble() / 100;

    System.out.print("Enter the # of times compounded per years: ");
    timesCompounded = scanner.nextInt();

    System.out.print("Enter the # of years: ");
    years = scanner.nextInt();

    amouth = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

    System.out.println("The amount after " + years + " is: $" + amouth);
    
    scanner.close();
    }
}