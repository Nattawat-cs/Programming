using System;

namespace MyfirstProgram
{
    class L4Constants
    {
        static void Main(string[] args)
        {
            // constants = immutable values which are known at compile time
            //             and do not change for the life of the program
            
            const double pi = 3.14159;

            pi = 340;

            Console.WriteLine(pi); // 3.14159

            Console.ReadKey();
        }
    }  
}
