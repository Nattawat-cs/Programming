#include <stdio.h>
#include <math.h>

int main() {
   setbuf(stdout, NULL);

   // COMPOUND INTEREST CALCULATOR

   double principal = 0.0;
   double rate = 0.0;
   int year = 0;
   int timeCompounded = 0;
   double total = 0.0;

   printf("Compound Interest Calculator");
   
   printf("Enter the principal (p): ");
   scanf("%lf", &principal);

   printf("Enter the interest rate % (r): ");
   scanf("%lf", &rate);
   rate = rate / 100;

   printf("Enter the # of year (t): ");
   scanf("%d", &year);

   printf("Enter #  of times compounded per year (n): ");
   scanf("%d", &timeCompounded);

   total = principal * pow(1 + rate/timeCompounded , timeCompounded*year);

   printf("After %d year, the total will be $%.2lf", year, total);
   

   return 0;
}