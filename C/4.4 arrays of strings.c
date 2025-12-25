#include <stdio.h>
#include <string.h>

int main() {
   setbuf(stdout, NULL);

   // Array of Strings

   char fruit[][10] = {"Apple", "Banana", "Coconut"};

   char fruit[][10] = {
      {'A', 'p', 'p', 'l', 'e', '\0', '\0', '\0', '\0'},
      {'B', 'a', 'n', 'a', 'n', 'a', '\0', '\0', '\0', '\0'},
      {'C', 'o', 'c', 'o', 'n', 'u', 't', '\0', '\0', '\0'}
   };
   
   //Ex.1 

   for(int i =  0; i < 3; i++){
      printf("%s\n", fruit[i]);
   }

   //Ex.2
   fruit[0][0] = 'e';
   fruit[0][4] = 'A';

   // EXERCISE
   char name[3][25] = {0}; // [rows][characters]

   for(int i = 0; i < 3; i++){
      printf("Enter a name");
      fgets(name[i], sizeof(name[i], stdin));
      name[i][strlen(name[i]) - 1] = '\0';

   }

   for(int i = 0; i < 3; i++){
      printf("%s ", name[i]);
   }

   return 0;
}