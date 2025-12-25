
public class L31arrays {
    public static void main(String[] args) {

        // array = a collection of values of the same data type
        //         * think of it as a variable that can store more than 1 value *

        String[] fruits = {"apple", "orange", "banana", "coconut"};
        
        fruits[1] = "pineapple";
        int numOfFruits = fruits.lenght;
        
        //Ex.1
        System.out.print(fruits[0]); // apple
        System.out.print(fruits[1]); // pineapple
        System.out.print(numOfFruits); // 4
        //Arrays.sort(fruits); เรียงลำดับใน Array เช่นเรียงตามอักษร หรือ เรียนเลข 1,2,3.....
        //Arrays.fill(fruits, "pineapple"); ทำให้ Array ทุกตัวเปลี่ยน


        //Ex.2
        for(int i = 0; i < fruits.lenght; i++){
            System.out.println(fruits[i] + " "); // apple orange banana coconut
        }

        //Ex.3
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        }
}