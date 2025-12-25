
public class L35twodarrays {
    public static void main(String[] args) {

        // 2D arrays = An array where each elemnt is an array
        //             Useful for storing a matrix of data
        
        //Ex.1
        String[] frutis = {"apple", "orange", "banana"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "pork", "beef", "fish"};

        String[][] groceries = {fruits, vegetables, meats};

        groceries[1][0] = "celery";

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }

        //Ex.2
        char[][] numpads = {{'1', '2', '3'},
                            {'4', '5', '6'},
                            {'7', '8', '9'},
                            {'*', '0', '#'}};

        for(char[] row : numpads){
            for(char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}