import java.util.Scanner;

public class L03userinput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        //Input string
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // nextLine จะรวมช่องว่างไปด้วย , next จะไม่รวมช่องว่าง

        //Input Int
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        //Input double
        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();

        //Input boolean
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("Your are " + age + " years old");
        System.out.println("Your gpa is " + gpa);

        if(isStudent){
            System.out.println("You are enrolled as a student");
        }
        else{
            System.out.println("You are NOT enrolled");
        }

        // COMMON ISSUES คือกรณีที่ป้อนข้อมูลเป็น int/double แล้วตามด้วย string จะเกิด input buffer

        System.out.print("Enter your age: ");
        //int age = scanner.nextInt();
        scanner.nextLine(); // Clear Input Buffer

        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        System.out.println("Your are " + age + " years old");
        System.out.println("Your like the color " + color);
 
        // Calculate area of a rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is: " + area + " cm2");

        scanner.close();
    }
}
