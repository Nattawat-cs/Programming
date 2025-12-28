using System;

namespace MyfirstProgram
{
    class L7ArithmaticOperators
    {
        static void Main(string[] args)
        {
            int friends = 5;

            friends = friends + 2; // 7
            friends += 2; // 7
            friends++; // 6

            friends = friends - 1; // 4
            friends -= 1; // 4
            friends--; // 4

            friends = friends * 2; // 10
            friends *= 2; // 10

            friends = friends / 2; // 2.5 ต้องประเภทข้อมูลเดียวกันถึงจะแสดงได้ถ้าเป็นจนเต็มจะไม่ใช่ทศนิยม
            friends /= 2; // 2.5

            int remainder = friends % 3; // 1

            Console.WriteLine(friends);

            Console.ReadKey();
        }
    }  
}
