#include <stdio.h>
#include <stdbool.h>

int main() {
   setbuf(stdout, NULL);
   
   // logical operators = Used to combine or modify boolean expressions.

   // && = AND
   // || = OR
   // ! = NOT

   //Ex.1 use AND
   int temp = 0;

   if(temp > 0 && temp < 30){
      printf("The temporature is GOOD\n");
   }
   else{
      printf("The temporature is BAD\n");
   }

   //Ex.2 use OR
   int temp1 = 0;

   if(temp1 <= 0 || temp1 >=30){
      printf("The temporature is BAD\n");
   }
   else{
      printf("The temporature is GOOD\n");
   }
   
   //Ex.3 use NOT
   bool isSunny = true;

   if(!isSunny){
      printf("It is CLOUDY outside\n");
   }
   else{
      printf("It is SUNNY outside\n");
   }

   return 0;
}