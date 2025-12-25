#include <stdio.h>

int result = 0; // GLOBAL SCOPE (head to debug)

//Ex.1
int add(int x, int y){
   int result = x + y;
   return result;
}

int main() {
   setbuf(stdout, NULL);

   // variable scope = Refers to where a variable is recognized and accessible.
   //                  Variables can share the same name if
   //                  they're in different scope {}

   //Ex.1
   int result = add(5, 4);

   printf("%d", result);
   return 0;
}