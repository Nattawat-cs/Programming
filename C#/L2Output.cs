using System;

namespace MyfirstProgram
{
    class L2Output
    {
        static void Main(string[] args)
        {
            Console.Write("Hey!"); // Hey!Hello!
            Console.WriteLine("Hello!"); 

            //This is a comment

            /*
             * this
             * is
             * a 
             * multiline
             * comment
             */

            Console.WriteLine("\tBrocode"); //     Brocode
            Console.WriteLine("Bro\bcode"); // Bro code
            Console.WriteLine("Bro\ncode"); // Bro
                                            // code
            Console.ReadKey(); // จะซ่อนคำสั่งตแน Run
        }
    }
}