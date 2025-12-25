#include <stdio.h>

int main() {
   setbuf(stdout, NULL);

   // array = A fixed-size collection of elements of the same data type
   //         (Similar to a variable, but it holds more than 1 value)

   int numbers[] = {10, 20, 30, 40, 50};
   char grades[] = {'A', 'B', 'C', 'D', 'F'}; 
   char name[] = "Bro code";

   numbers[0] = 100;
 
   //Ex.1
   printf("%d", numbers[0]);
   printf("%c", grades[0]);
   printf("%c", name[0]);

   //##############################
   
   //find byte of Array or element
    
   printf("%d", sizeof(numbers));
   printf("%d", sizeof(numbers[0]));

   //Ex.2
   for(int i = 0; i < 5; i++){
      printf("%c\n", grades[i]);
   }

   //Find size of array

   int size = sizeof(numbers) / sizeof(numbers[0]);
   
   return 0;
}