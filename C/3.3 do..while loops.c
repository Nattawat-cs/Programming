#include <stdio.h>

int main() {
   setbuf(stdout, NULL);

   int number = 1;
   
   do{ //จะทำคำสั่งนี้ก่อนไม่ว่ามันจะจริงหรือเท็จ
      printf("Enter the number greater than 0: ");
      scanf("%d", &number);
   }while(number <= 0);


   return 0;
}