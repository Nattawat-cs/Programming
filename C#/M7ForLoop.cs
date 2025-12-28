using System;

namespace MyfirstProgram
{
    class M7ForLoop
    {
        static void Main(string[] args)
        {
            // for loop = repeats some code a FINITE amount of times

            //Ex.1
            for(int  i = 0; i <= 10; i++)
            {
                Console.WriteLine(i);
            }

            //Ex.2
            for(int  i = 10; i <= 0; i--)
            {
                Console.WriteLine(i);
            }

            Console.ReadKey();
        }
    }  
}
