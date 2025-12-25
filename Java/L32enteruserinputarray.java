import java.util.Scanner;

public class L32enteruserinputarray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Ex.1 กำหนด size ไม่ได้
        String[] foods = new String[3]; //Size of array

        //Ex.2 กำหนด size เองได้
        String[] foods1;
        int size;

        System.out.print("What # of food do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods1 = new String[size];

        for(int i = 0; i < food.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.println(food);
        }

        scanner.close();
    }
}