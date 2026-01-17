package Javaoop.A2Constructors;

public class Main {
    public static void main(String[] args){

        // Constructor = A special method to initiallize objects
        //               You can pass arguments to a constructors
        //               and set up initial value

        Student student1 = new Student("Spongbob", 30, 3.2);
        Student student2 = new Student("Patrick", 34, 1.5);

        System.out.println(student1.name);  // Spongbob
        System.out.println(student1.age);   // 30
        System.out.println(student1.gpa);   // 3.2

        System.out.println(student2.name);  // Patrick
        System.out.println(student2.age);   // 34
        System.out.println(student2.gpa);   // 1.5

        student1.study();                   // Spongbob is studying
        student2.study();                   // Patrick is studying
    }
    
}
