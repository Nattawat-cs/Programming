#include <stdio.h>
#include <string.h>

int main() {
   

   char Noun[50] = "";
   char Verb[50] = "";
   char Adjective1[50] = "";
   char Adjective2[50] = "";
   char Adjective3[50] = "";
   
   printf("Enter an adjective (description): ");
   fgets(Adjective1, sizeof(Adjective1), stdin);
   Adjective1[strlen(Adjective1) - 1] = '\0';
   
   printf("Enter a noun (animal or person): ");
   fgets(Noun, sizeof(Noun), stdin);   
   Noun[strlen(Noun) - 1] = '\0';
   
   printf("Enter an adjective (description): ");
   fgets(Adjective2, sizeof(Adjective2), stdin);
   Adjective2[strlen(Adjective2) - 1] = '\0';

   printf("Enter a verb (ending w/ -ing): ");
   fgets(verb, sizeof(verb), stdin);
   Verb[strlen(Verb) - 1] = '\0';
   
   printf("Enter an adjective (description): ");
   fgets(Adjective3, sizeof(Adjective3), stdin);
   Adjective3[strlen(Adjective3) - 1] = '\0';

   printf("\nToday I went to a %s zoo.\n", Adjective1);
   printf("In an exhibit, I saw a %s.\n", Noun);
   printf("%s was %s and %s!\n", noun, Adjective2, verb);
   printf("I was %s!\n", Adjective3);

   return 0;
}