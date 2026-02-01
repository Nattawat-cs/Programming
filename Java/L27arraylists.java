import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class L27arraylists {
    public static void main(String[] args) {

        // ArrayList = A resizeable array that stores objects (autoboxing).
        //             Arrays are fixed is size, but ArrayLists can change.

        //EX.1
        ArrayList<Integer> list  = new ArrayList<>();

        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list); // [3, 4, 5]
        
        
        //Ex.2
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Coconut");

        //fruits.remove(0); // [Orange, Banana, Coconut]
        //fruits.set(0, "Pineapple") // [Pineapple, Orange, BAnana, Coconut]
        
        //System.out.println(fruits.get(0)); // Apple
        //System.out.println(fruits.size()); // 4

        Collections.sort(fruits);

        System.out.println(fruits); // [Apple, Banana, Coconut, Orange]

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        // Apple
        // Banana
        // Coconut
        // Orange

        //Ex.3

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.println("Enter the # of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i <= numOfFood; i++){
            System.out.println("Enter food #" + i +": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        scanner.close();
    }
}