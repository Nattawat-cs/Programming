using System;

namespace MyfirstProgram
{
    class L3Variables
    {
        static void Main(string[] args)
        {
            int x; //declaration
            x = 123; //intialization

            int y = 321; // declaration + intialization

            int z = x + y;

            //Ex.1
            Console.WriteLine(x); // 123
            Console.WriteLine(y); // 321
            Console.WriteLine(z); // 444

            int age = 21; // whole integer
            double height = 300.5; // decimal number
            bool alive = true; // true or false
            char symbol = '@';
            String name = "Bro";

            Console.WriteLine("Hello " + name);
            Console.WriteLine("Your age is " + age); // Your age is 21
            Console.WriteLine("Your height is " + height + "cm"); // Your height is 300.5cm
            Console.WriteLine("Are you alive?: " + alive); // Are you alive?: true
            Console.WriteLine("Your symbol is " + symbol); // Your symbol is 

            String userName = symbol + name;

            Console.WriteLine("Your username is: " + userName); // Your username is: @Bro

            Console.ReadKey();
        }
    }  
}
