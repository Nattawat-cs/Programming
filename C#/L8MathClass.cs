using System;

namespace MyfirstProgram
{
    class L8MathClass
    {
        static void Main(string[] args)
        {

            double x = 3;
            double y = 5;
            
            double a = Math.Pow(x, 2); // 9
            double b = Math.Sqrt(x); // 1.730508075...
            double c = Math.Abs(x); // 3
            double b = Math.Round(x); // ปัดขึ้น
            double e = Math.Ceiling(x); // ปัดลง
            double f = Math.Floor(x); // ปัดขึ้น
            double g = Math.Max(x, y); // 5
            double h = Math.Min(x, y); // 3
            
            Console.ReadKey();
        }
    }  
}
