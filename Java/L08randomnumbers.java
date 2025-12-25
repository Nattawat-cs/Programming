import java.util.Random;

public class L08randomnumbers {
    public static void main(String[] args) {

        Random random = new Random();

        //Ex.1
        int number;

        number = random.nextInt(1, 6); //random 1-5

        System.out.println(number);

        //Ex.2
        boolean isHeads;

        isHeads = random.nextBoolean();

        if(isHeads){
            System.out.println("HEAD");
        }
        else{
            System.out.println("TAILS");
        }
    }
}