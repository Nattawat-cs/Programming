using System;

namespace MyfirstProgram
{
    class M2StringMethod
    {
        static void Main(string[] args)
        {
            String fullName = "Bro Code";
            String phoneNumber = "123-456-7890";
            
            //Ex.1
            fullName = fullName.ToUpper();
            Console.WriteLine(fullName); // BRO CODE
            fullName = fullName.ToLower();
            Console.WriteLine(fullName); // bro code

            //Ex.2
            phoneNumber = phoneNumber.Replace("-", "/");
            Console.WriteLine(phoneNumber); // 123/456/7890

            //Ex.3
            String Username = fullName.Insert(0, "@");
            Console.WriteLine(Username); // @Bro Code

            //Ex.4
            Console.WriteLine(fullName.length); // 8

            //Ex.5
            String firstName = fullName.Substring(0, 3);
            Console.WriteLine(firstName); // Bro

            //Ex.6
            String lastName = fullName.Substring(4, 4);
            Console.WriteLine(lastNameName); // Cod

            Console.ReadKey();
        }
    }  
}
