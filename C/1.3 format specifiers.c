#include <stdio.h>

int main() {
   
   //Format specifier = Special tokens that begin with a % symbol,
   //                   followed by a character that specifies the data
   //                   and optional modifiers (width, precision, flags).
   //                   Thay control how data is displayed or inthrpreter.

   int age = 25;
   float price = 19.99;
   double pi = 3.1415926535;
   char currency = '$';
   char name[] = "Bro code";

   printf("%d\n", age);
   printf("%f\n", price);
   printf("%lf\n", pi);
   printf("%c\n", currency);
   printf("%s\n", name);
   printf("***********************\n");

   // width

   int num1 = 1;
   int num2 = 10;
   int num3 = -100; //

   printf("%3d\n", num1);
   printf("%3d\n", num2);
   printf("%3d\n", num3);
   printf("*************\n");

   printf("%-3d\n", num1);
   printf("%-3d\n", num2);
   printf("%-3d\n", num3);
   printf("***************\n");

   printf("%03d\n", num1);
   printf("%03d\n", num2);
   printf("%03d\n", num3);
   printf("****************\n");

   printf("%+d\n", num1);
   printf("%+d\n", num2);
   printf("%+d\n", num3);
   printf("****************\n");

   //precision

   float price1 = 19.99;
   float price2 = 1.50;
   float price3 = -100.00;

   printf("%f\n", price1);
   printf("%f\n", price2);
   printf("%f\n", price3);
   printf("*******************\n");

   printf("%.1f\n", price1);
   printf("%.1f\n", price2);
   printf("%.1f\n", price3);
   printf("********************\n");

   printf("%.2f\n", price1);
   printf("%.2f\n", price2);
   printf("%.2f\n", price3);
   printf("*********************\n");

   //width precision flags

   float price4 = 19.99;
   float price5 = 1.50;
   float price6 = -100.00;

   printf("%7.2f\n", price4);
   printf("%7.2f\n", price5);
   printf("%7.2f\n", price6);
   printf("**********************\n");

   
   return 0;
}