#include <stdio.h>
#include <stdbool.h>

//Ex.1
int square(int num){
   int result = num * num;
   return result;
}

//Ex.2 
double cube(double num){
   return num * num * num;
}

//Ex.3
bool ageCheck(int age){

   if(age >= 18){
      return true;
   }
   else{
      return false;
   }
}

int main() {
   setbuf(stdout, NULL);

   //return = returns a value back to where you call a funcion

   //Ex.1
   int x = square(2);
   int y = square(3);
   int z = square(4);

   printf("%d\n", x);   
   printf("%d\n", y);   
   printf("%d\n", z);   

   //Ex.2
   double h = cube(3);

   printf("%lf", h);
 
   //Ex.3

   int age = 21;

   if(ageCheck(age)){
      printf("You are senior");
   }
   else{
      printf("You too young");
   }
 
   return 0;
}