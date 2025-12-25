#include <stdio.h>

//Ex.2
void birthday(int age);

//Ex.3
void birthday1(int* age);

int main() {
   setbuf(stdout, NULL);

   // pointer = A variable that stores the memory address of another variable.
   //           Benefit: They help avoid wasting memory by allowing you to pass
   //           the address of a large data structure instead of copying the entire data.

   int age = 25;
   int *pAge = &age;

   //Ex.1
   printf("%p\n", &age);
   printf("%p\n", pAge);

   //Ex.2
   birthday(age);

   printf("You are %d years old", age)

   //Ex.3
   birthday1(pAge);

   printf("You are %d years old", age)

   return 0;
}

//Ex.2
void birthday(int age){
   // pass by value
   age++;
}

void birthday(int* age){
   // pass by reference
   (*age)++;
}