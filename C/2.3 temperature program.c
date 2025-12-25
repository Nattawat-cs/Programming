#include <stdio.h>

int main() {
   setbuf(stdout, NULL);

   // TEMPERATURE CONVERSION PROGRAM

   char choice = '\0';
   float fahrenheit = 0.0f;
   float celsius = 0.0f;

   printf("Temporature Conversion Programs\n");
   printf("C. Celsius to Fahrenheit\n");
   printf("F. Fahrenheit to celsius\n");
   printf("Is the temp in celsius (C) or Fahrenheit (F)?: ");
   scanf("%c", &choice);

   if(choice == 'C'){
      // Fahrenheit to celsius
      printf("Enter the temporature in celsius: ");
      scanf("%f", &celsius);
      fahrenheit = (celsius * 9/5) + 32; // C to F
      printf("%.1f Celsius is equal to %.1f Fahrenheit\n", celsius, fahrenheit); 
   }
   else if(choice == 'F'){
      // celsius to Fahrenheit
      printf("Enter the temporature in Fahrenheit: ");
      scanf("%f", &Fahrenheit);
      celsius = (fahrenheit - 32) * 5/9; // F to C
      printf("%.1f Fahrenheit is equal to %.1f Celsius\n", fahrenheit, celsius);
   }
   else{
      printf("Invalid choice! Please Enter (C) or (F)");
   }

   return 0;
}