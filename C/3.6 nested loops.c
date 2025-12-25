#include <stdio.h>

int main() {
   setbuf(stdout, NULL);
   
   //Ex.1
   for(int i = 1; i < 4; i++){
      for(int j = 1; j <= 10; j++){
         printf("%d ", j);
      }
      printf("\n");
   }
   
   //Ex.2
   for(int i = 2; i <= 12; i++){
      printf("*************\n");
      for(int j = 1; j <= 12; j++){
         printf("%d x %d = %d\n", i, j, i*j);
      }
   }

   //Ex.3
   int row = 0;
   int colum = 0;
   char symbol = '\0';

   printf("Enter the # of rows: ");
   scanf("%d", &row);

   printf("Enter the # of colums: ");
   scanf("%d", &colum);

   printf("Enter a symbol to use: ");
   scanf(" %c", &symbol);
 
   for(int i = 1; i <= row; i++){
      for(int j = 1; j <= colum; j++){
         printf("%c", symbol);
      }
      printf("\n");
   }
 
   return 0;
}