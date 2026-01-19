public class L16breakcontinue {
    public static void main(String[] args) {

        // break = break out of a loop (STOP)
        // continue = skip current iteration of a loop (SKIP)

        //Ex.1
        for(int i = 0; i < 10; i++){

            if(i == 5){
                break;
            }

            System.out.print(i + " "); // 0 1 2 3 4
        }

        //Ex.2
        for(int i = 0; i < 10; i++){

            if(i == 5){
                continue;
            }

            System.out.print(i + " "); // 0 1 2 3 4 6 7 8 9
        }
    }
}