#include <stdio.h>
#include <stdbool.h>

int main() {
   setbuf(stdout, NULL);

   // ternary operator ? = shorthand for if-else statements

   // (condition) ? value_if_true : value_if_false;

   //Ex.1
   int x = 5;
   int y = 6;
   int max = (x > y) ? x : y;

   printf("%d", max);

   //Ex.2
   bool isOnline = true;

   printf("%s", (isOnline) ? "onine" : "offline");

   //Ex.3
   int number = 8;

   printf("%d is %s", number, (number % 2 == 0) ? "Even" : "odd");
   
   //Ex.4
   int age = 18;

   printf("%s", (age > 18) ? "Adult" : "child");

   //Ex.5
   int hours = 12;
   int minutes = 30;
   char *meridium = (hours < 12) ? "AM" : "PM";

   printf("%02d:%02d %s", hours, minutes, meridium);

   return 0;
}