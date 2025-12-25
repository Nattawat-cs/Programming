#include <stdio.h>
#include <stdbool.h>

int main() {
   setbuf(stdout, NULL);

   float price = 10.00;
   bool isStudent = true; // 10% Discount
   bool isSenior = true; // 20% Discount

   // student = $9
   // senior = $8
   // student + senior = $7

   if(isStudent){
      if(isSenior){
         printf("You get a student discount of 10 Persent\n");
         printf("You get a student discount of 20 Persent\n");
         price *= 0.7;
      }
      else{
         printf("You get a student discount of 10 Persent\n");
         price *= 0.9;
      }
   }
   else{
      if(isSenior){
         printf("You get a student discount of 20 Persent\n");
         price *= 0.8;
      }
   }
   
   printf("The price of a ticket is: $%.2f\n", price);
   return 0;
}