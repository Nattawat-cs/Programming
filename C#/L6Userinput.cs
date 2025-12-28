using System;

namespace MyfirstProgram
{
    class L6Userinput
    {
        static void Main(string[] args)
        {
            Console.WriteLine("What's your name?");
            String name = Console.ReadLine();

            Console.WriteLine("What's your age?");
            int age = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Hello " + name);
            Console.WriteLine("Your are " + age + " years old");

            Console.ReadKey();
        }
    }  
}
