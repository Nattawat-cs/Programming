public class L04arithmetic {
    public static void main(String[] args) {

    // Arithmetic Operators

    int x = 10;
    int y = 2;
    int z;

    //z = x + y;
    //z = x - y;
    //z = x * y;
    //z = x / y;
    z = x % y;

    System.out.println(z);

    // Augmented Assignment Operators
    
    //x += y;
    //x -= y;
    //x *= y;
    //x /= y;
    //x %= y;

    // Increment and Decrement Operators

    int v = 1;

    v++;  // v = v + 1
    v--;  // v = v - 1

    System.out.println(v);

    // ORDER OF OPERATIONS [P-E-M-D-A-S)]

    double result = 3 + 4 * (7 - 5) / 2.0;

    System.out.println(result);

    }
}