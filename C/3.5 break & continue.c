#include <stdio.h>

int main() {
   setbuf(stdout, NULL);

   // break = Break out of a loop (STOP)
   // continue = Skip current cycle of a loop (SKIP)

   //Ex.1
   for(int i = 0; i <= 10; i++){
      
      if(i == 4){
         break;
      }

      printf("%d", i);
   }

   //Ex.2
   for(int i = 0; i <= 10; i++){
      
      if(i == 4){
         continue;
      }

      printf("%d", i);
   }

   return 0;
}