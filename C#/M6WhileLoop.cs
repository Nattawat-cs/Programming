using System;

namespace MyfirstProgram
{
    class M6WhileLoop
    {
        static void Main(string[] args)
        {
            // while loop = repeats some code while some condition remains true

            String name = "";

            while (name == "")
            {
                Console.WriteLine("Enter your name: ");
                String name = ReadLine();
            }

            Console.WriteLine("Hello " + name);

            Console.ReadKey();
        }
    }  
}
