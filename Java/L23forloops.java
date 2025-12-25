import java.util.Scanner;

public class L23forloops {
    public static void main(String[] args) throws InterruptedException {

        // for loop = execute some code a CERTAIN amount of time

        Scanner scanner = new Scanner(System.in);

        //Ex.1
        for(int i = 0; i < 10 ; i++){
            System.out.print(i);
        }

        //Ex.2
        for(int i = 10; i < 0 ; i--){
            System.out.print(i);
        }

        //Ex.3
        for(int i = 0; i < 10 ; i+=2){
            System.out.print(i);
        }
        
        //Ex.4

        System.out.print("Enter how many Times you want to loop: ");
        int max = scanner.nextInt();

        for(int i = 0; i < max; i++){
            System.out.print(i);
        }
        
        //Ex.5
        int start = 10;

        for(int i = start; i > 0; i--){
            System.out.print(i);
            Thread.sleep(1000);
        }

        scanner.close();
    }
}