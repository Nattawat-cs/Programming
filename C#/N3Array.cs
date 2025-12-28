using System;

namespace MyfirstProgram
{
    class N3Array
    {
        static void Main(string[] args)
        {
            // Array = a variable that can store multiple values. fixed size

            String[] cars = {"BMW", "Mustang", "Corvette"};

            cars[0] = "tesla";

            //Ex.1
            Console.WriteLine(cars[0]); // tesla
            Console.WriteLine(cars[1]); // Mustang
            Console.WriteLine(cars[2]); // Corvette
            
            //Ex.2
            for (int i = 0; i < cars.length; i++)
            {
                Console.WriteLine(cars[i]);
            }

            //Ex.3
            String[] cars = new String[3];

            cars[0] = "tesla";
            cars[1] = "Mustang";
            cars[2] = "Corvette";

            Console.ReadKey();
        }
    }  
}
