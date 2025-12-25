#include <stdio.h>
#include <stdbool.h>
#include <string.h>

int main() {
   setbuf(stdout, NULL);

   // if statement = Do some code if a condition is true.
   //                if condition is false, don't do it.
   
   //Ex.1
   int age = 0;

   printf("Enter your age: ");
   scanf("%d", &age);

   if(age >= 18){
      printf("You are an adult");
   }
   else if(age >= 65){
      printf("You are a senior");
   }
   else if(age < 0){
      printf("You haven't been born yet");
   }
   else if(age == 0){ // == is comparision
      printf("You are a newborn");
   }
   else{
      printf("You are a child");
   }

   //Ex.2
   bool isStudent = true;

   if(isStudent){
      printf("You are a student");
   }
   else{
      printf("You are NOT a student");
   }

   //Ex.3
   char name[50];

   printf("Enter you name: ");
   fgets(name, sizeof(name), stdin);

   if(strlen(name) == 0){
      printf("You did not enter your name");
   }
   else{
      printf("Hello %s", name);
   }
    
   return 0;
}