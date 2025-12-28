using System;

namespace MyfirstProgram
{
    class L9RandomNumber
    {
        static void Main(string[] args)
        {
            Random random = new Random();

            int num = random.Next(1, 7); // สุ่มตัวเลข 1-6

            Console.WriteLine(num);
            
            Console.ReadKey();
        }
    }  
}
