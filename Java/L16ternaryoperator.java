
public class L16ternaryoperator {
    public static void main(String[] args) {

    // ternary operator ? = Return 1 of 2 values if a condition is true

    // variable = (condition) ? ifTrue : ifFalse;
    
    //Ex.1
    int score = 55;

    String passOrFail = (score >= 60) ? "PASS" : "FAIL";

    System.out.println(passOrFail);

    //Ex.2
    int number = 3;

    String evenOrOdd = (number % 2 == 0) "EVEN" : "ODD";

    System.out.println(evenOrOdd);
 
    //Ex.3
    int hours = 3;

    String timeOfDay = (hours % 2 == 0) "A.M." : "P.M";

    System.out.println(timeOfDay);

    //Ex.4
    int income = 60,000;

    double taxRate = (income >= 40,000) 0.25 : 0.15;

    System.out.println(taxRate);

    }
}