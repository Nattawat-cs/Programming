#include <stdio.h>
#include <stdbool.h>

int main() {
   
   //variable = A reuseable container for a value.
   //           Behaves as if it were the value it contains.
   
   // int = whole numbers (4 bytes in modern systems)
   // float = single-precision decimal number (4 bytes)
   // double = double-precision decimal number (4 bytes)
   // char = single character (1 bytes)
   // char[] = array of characters (size varies)
   // bool = true or false (1 byte, requires <stdbool.h>)

   //Example code

   //int = integer
   int age = 25;
   int year = 2025;
   int quantity = 1;

   printf("You are %d years old\n", age);
   printf("The year is %d\n", year);
   printf("You have ordered %d x item\n", quantity);
   printf("**********************************\n");
   
   //float = floating point
   float gpa = 2.5;
   float price = 19.99;
   float temperature = -10.1;

   printf("Your gpa is %f\n", gpa);
   printf("The price is $%f\n", price);
   printf("The temperature is %f\n", temperature);
   printf("***********************************\n");

   //double
   double pi = 3.1459265358979;
   double e = 2.7182818284590;

   printf("The value of pi is %.14lf\n", pi);
   printf("The value of e is %.14lf\n", e);
   printf("***********************************\n");

   //char = character
   char grade = 'A';
   char symbol = '!';
   char currency = '$';

   printf("Your grade is %c\n", grade);
   printf("Your favorite symbol is %c\n", symbol);
   printf("The currency is %c\n", currency);
   printf("***********************************\n");

   //string
   char name[] = "Bro Code";
   char food[] = "pizza";
   char email[] = "fake123@gmail.com";

   printf("Hello %s\n", name);
   printf("Your favorite food is %s\n", food);
   printf("Your email is %s\n", email);
   printf("************************************\n");

   //bool = boolean You Need to Annoc Header program is #include <stdbool.h>  True = 1 , False = 0;
   bool IsOnline = true;

   printf("%d\n", IsOnline);

   if (IsOnline){
      printf("You are ONLINE");
   }
   else{
      printf("You are OFFLINE");
   }

   return 0;
}