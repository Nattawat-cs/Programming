using System;

namespace MyfirstProgram
{
    class L5Typecasting
    {
        static void Main(string[] args)
        {
            // type casting = Converting a value to a different data type
            //                Useful when we accept user input (string)
            //                Different data types can do different things

            //Ex.1
            double a = 3.14;
            int b = Convert.ToInt32(a); 

            Console.WriteLine(b); // 3
            Console.WriteLine(b.GetType()); // System.Int32

            //Ex.2
            int c = 321;
            double d = Convert.ToDouble() + 0.1;            

            Console.WriteLine(d); // 321.1
            Console.WriteLine(d.GetType()); // System.Double

            //Ex.3
            int e = 123;
            String f = Convert.ToString(e);

            Console.WriteLine(f); // 123
            Console.WriteLine(f.GetType()); // System.String

            //Ex.4
            String g = "$";
            char h = Convert.ToChar(g);

            Console.WriteLine(h); // $
            Console.WriteLine(h.GetType()); // System.Char

            //Ex.5
            String i = "true";
            bool j = Convert.ToBoolean(i);

            Console.WriteLine(j); // true
            Console.WriteLine(j.GetType()); // System.Boolean


            Console.ReadKey();
        }
    }  
}
