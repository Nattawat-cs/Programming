import java.util.Scanner;

public class L15weightconverter {
    public static void main(String[] args) {

        // WEIGHT CONVERSION PROGRAM

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.print("Weight Conversion Program");
        System.out.print("1. Convert lbs to kgs");
        System.out.print("2. Convert kgs to lbs");
        
        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.println("The new weight in kgs is: %.2f", newWeight);
        }
        else if(choice == 2){
            System.out.print("Enter the weight  in kgs: %.2f", newWeight);
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.println("The new weight in kgs is: %.2f", newWeight);
        }
        else{
            System.out.println("That was not a valid choice");
        }
    
    scanner.close();
    }
}