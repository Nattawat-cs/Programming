using System;

namespace MyfirstProgram
{
    class N2CalculatorProgram
    {
        static void Main(string[] args)
        {
            do{
                double num1 = 0;
                double num2 = 0;
                double result = 0;

                Console.WriteLine("--------------------");
                Console.WriteLine("Calculator Program");
                Console.WriteLine("--------------------");

                Console.WriteLine("Enter Number 1: ");   
                num1 = Convert.ToDouble(Console.ReadLine());

                Console.WriteLine("Enter Number 2: ");
                num2 = Convert.ToDouble(Console.ReadLine());

                Console.WriteLine("Enter an option: ");
                Console.WriteLine("\t+ : Add");
                Console.WriteLine("\t- : Subtract");
                Console.WriteLine("\t* : Multiple");
                Console.WriteLine("\t/ : Divide");

                switch (Console.ReadLine())
                {
                    case "+":
                        result = num1 + num2;
                        Console.WriteLine("Your result: {num1} + {num2} = " + result);
                    case "-":
                        result = num1 - num2;
                        Console.WriteLine("Your result: {num1} - {num2} = " + result);
                    case "*":
                        result = num1 * num2;
                        Console.WriteLine("Your result: {num1} * {num2} = " + result);
                    case "/":
                        result = num1 / num2;
                        Console.WriteLine("Your result: {num1} / {num2} = " + result);
                }
                
                Console.WriteLine("Would you like to continue? (Y = yes / N = no)")

            }while (Console.ReadLineLine().ToUpper() == "Y");

            Console.ReadKey();
        }
    }  
}
