using System;

namespace MyfirstProgram
{
    class N4ForeachLoop
    {
        static void Main(string[] args)
        {
            // Foreach loop = a similer way to iterate over an array, but it's lees flexible

            String[] cars = {"BMW", "Mustang", "Corvette"};

            foreach (String car in cars)
            {
                Console.WriteLine(car);
            }

            Console.ReadKey();
        }
    }  
}
