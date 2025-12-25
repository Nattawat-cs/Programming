#include <stdio.h>
#include <windows.h> // Windows
#include <unistd.h>  // Linux/Mac

int main() {
   setbuf(stdout, NULL);

   // for loop = Repeat some code a limited # of times
   //            for(Initialization; Condition; Update)

   //Ex.1
   for(int i = 0; i < 10; i++){
      printf("%d\n", i);
   }

   //Ex.2
   for(int i = 0; i <= 10; i+=2){
      printf("%d\n", i);
   }

   //Ex.3
   for(int i = 10; i >= 1; i--){
      Sleep(1000);
      printf("%d\n", i);
   }

   printf("Happy New Years!");
   
   return 0;
}