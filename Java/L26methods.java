
public class L26methods {
    public static void main(String[] args) {

        // method = a block of reusable code that is executed when called ()
       
        //Ex.1
        happyBirthDay();

        //Ex.2
        String name = "Tle";
        int age = 21;

        happyBirthDay(name, age);

        //Ex.3
        double result = square(3);
        System.out.println(result);

        //Ex.4
        System.out.println(cube(4));

        //Ex.5
        String fullName = getFullName("Nattawat", "Lertchidumrongsri");
        System.out.println(fullName);

        //Ex.6
        int age = 21;

        if(ageCheck(age)){
            System.out.println("You may sing up!");
        }
        else{
            System.out.println("You must be 18+ sing up");
        }

    }
    static void happyBirthDay(String name, int age){
        System.out.print("Happy Birthday to you!");
        System.out.print("Happy birthday dear %s!\n", name);
        System.out.print("You are %d year old!\n", age);
        System.out.print("Happy Birthday to you!\n");
    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static String getFullName(String first, String last){
        return first + " " + last;
    }
    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}