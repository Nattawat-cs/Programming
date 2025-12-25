#include <stdio.h>

int main() {
   setbuf(stdout, NULL);
   
   //Ex.1
   int score[5] = {0};

   printf("Enter a score: ");
   scanf("%d", &score[0]);

   for(int i = 0; i < 5; i++){
      printf("%d ", score[i]);
   }

   //Ex.2
   int score[5] = {0};

   for(int i = 0; i < 5; i++){
      printf("Enter a score: ");
      scanf("%d", &score[i]);
   }
   
   for(int i = 0; i < 5; i++){
      printf("%d ", score[i]);
   }
   
   return 0;
}