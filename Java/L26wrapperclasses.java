public class L26wrapperclasses {
    public static void main(String[] args) {

        // Wrapperr classes = Allow primitive values (int, char, double, boolean)
        //                    to be used as objects. "Wrap them in an object"
        //                    Generally, don't wrap primitivees unless you need an object.
        //                    Allows use of  Collections Framework and static Utility Methods.

        // Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;
        String e = "pizza";

        // Unboxing
        int x = a;

        //Ex.1
        String f = Integer.toString(123);
        String g = Double.toString(3.14);
        String h = Character.toString('@');
        String i = Boolean.toString(false);

        String y = f + g + h + i;

        System.out.println(y); // 1233.14@false

        //Ex.2
        int j = Integer.parseInt("123");
        double k = Double.parseDouble(3.14);
        char l = "Pizza".charAt(0);
        String m = Boolean.parseBoolean("true");

        //Ex.3

        char letter = 'b';

        System.out.println(Character.isLetter(letter)); //true
        System.out.println(Character.isUpperCase(letter)); //false
        
    }
}