#include <stdio.h>

typedef int Number;
typedef char String[50];

int main() {
   setbuf(stdout, NULL);

   // typedef = reserved keyword gives an existing datatype a "nickname"
   //           Helps simplify complex types and improves code readability

   //           typedef existing_type new_name;
   
   //Ex.1
   Number x = 3;
   Number y = 4;
   Number z = x + y;

   printf("%d", z);   

   //Ex.2 
   String name = "Bro code";

   printf("%s", name);
   
   return 0;
}