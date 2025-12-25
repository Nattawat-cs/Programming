import java.util.Scanner;

public class L33searchanarray {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    //Ex.1
        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        int target = 2;
        boolean isFound = false;

    for(int i = 0; i < numbers.length; i++){

        if(target == numbers[i]){
            System.out.print("Element found at index: " + i);
            isFound = true;
            break;
        }
    }

    if(!isFound){
        System.out.print("Element not found in array!");
    }

    //Ex.2
    String[] fruits = {"apple", "orange", "banana"};
    String target1;
    
    System.out.print("Enter a fruit to search for: ");
    target1 = scanner.nextInt();

    for(int i = 0; i < fruits.length; i++){

        if(fruits[i].equals(target1)){
            System.out.print("Element found at index: " + i);
            isFound = true;
            break;
        }
    }

    if(!isFound){
        System.out.print("Element not found in array!");
    }

    scanner.close();
    }
}