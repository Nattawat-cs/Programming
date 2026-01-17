package Javaoop.A17super;

public class Main {
    public static void main(String[] args){

        // super = Refer to the parent class (subclass <- superclass)
        //         Used in constructors and method overriding
        //         Calls the parent constructor to initialize attributes

        Person person = new Person("Tom", "Riddle");
        Student student = new Student("Harry", "Potter", 3.25);
        Employee employee = new Employee("Rubeus", "Hagrid", 50000);

        person.showName();                // Tom Riddle
        student.showName();               // Harry Potter
        
        System.out.println(student.gpa);  // 3.25

        student.showGpa();                // Harry's gpa is 3.25

        employee.showSalary();            // Rubeus salary is 50000
    }
    
}
