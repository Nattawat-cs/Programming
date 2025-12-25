#include <stdio.h>
#include <string.h>
#include <stdbool.h>

int main() {
   setbuf(stdout, NULL);

   // while loop = Continue some code WHILE the condition remains true
   //              Condition must be true for us to enter while loop

   //Ex.1
   int number = 0;

   while(number <= 0){
      printf("Enter the number greater than 0: ");
      scanf("%d", &number);
   }

   //Ex.2
   char name[50] = "";

   printf("Enter your name: ");
   fgets(name, sizeof(name), stdin);
   name[strlen(name) - 1] = '\0';

   while(strlen(name) == 0){
      printf("Name cannot be emtpy! Please enter your name: ");
      fgets(name, sizeof(name), stdin);
      name[strlen(name) - 1] = '\0';
   }

   printf("Hello %s", name);
   
   //Ex.3
   bool isRunning = true;
   char response = '\0';

   while(isRunning){
      printf("You are playing a game\n");
      printf("would you like to continue (Y = yes, N = no): ");
      scanf(" %c", &response);

      if(response != 'Y' && response != 'y'){
         isRunning = false;
      }    
   }
   printf("You exit the game\n");

   return 0;
}