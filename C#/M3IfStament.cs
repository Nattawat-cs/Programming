using System;

namespace MyfirstProgram
{
    class M3IfStament
    {
        static void Main(string[] args)
        {
            // if statement = a basic form of decision making

            //Ex.1
            Console.WriteLine("Please enter your age: ");
            int age = Convert.ToInt32(Console.ReadLine());

            if (age >= 18)
            {
                Console.WriteLine("You are niw singned up!");
            }
            else if (age > 100)
            {
                Console.WriteLine("You are too old to sing up!");
            }
            else if (age < 0)
            {
                Console.WriteLine("You haven't been born yet!");
            }
            else
            {
                Console.WriteLine("You must be 18+ to sign up!");
            }

            //Ex.2
            Console.WriteLine("Please enter your name: ");
            String name = Console.ReadLine();

            if (name != "")
            {
                Console.WriteLine("Hello " + name);
            }
            else
            {
                Console.WriteLine("You did not enter your name!");

            }


            Console.ReadKey();
        }
    }  
}
