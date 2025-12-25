

public class L10printf {
    public static void main(String[] args) {

        // printf() = is a method used to format output

        // %[flags][width][.precision][specifier-character]

        //Ex.1
        String name = "Spongbob";
        char firstletter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstletter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old", name, age);

        //Ex.2

        // [flags]

        // + = output a plus
        // , = comma grouping sepaator
        // ( = negative  numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        double price1 = 9000.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("%+.1f\n", price1);
        System.out.printf("%+.1f\n", price2);
        System.out.printf("%+.1f\n", price3);        

        System.out.printf("%,.1f\n", price1); // 9,000.99

        // [width]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.print("%04d\n", id1); // 1000
        System.out.print("%04d\n", id2); // 2300
        System.out.print("%04d\n", id3); // 4560
        System.out.print("%04d\n", id4); // 7890

        System.out.print("%4d\n", id1); // ---1
        System.out.print("%4d\n", id1); // --23
        System.out.print("%4d\n", id1); // -456
        System.out.print("%4d\n", id1); // 7890

        System.out.print("%-4d\n", id1); // 1---
        System.out.print("%-4d\n", id1); // 23--
        System.out.print("%-4d\n", id1); // 456-
        System.out.print("%-4d\n", id1); // 7890



    }
}