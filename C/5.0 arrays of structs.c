#include <stdio.h>

typedef struct{
   char Model[50];
   int year;
   int price;
}Car;

int main() {
   setbuf(stdout, NULL);

   // array of structs = Array where each element contains a struct {}
   //                    Helps organize and groups together related data

   Car cars[] = {{"Mustang", 2025, 32000},
                 {"Corvette", 2026, 68000},
                 {"Challenger", 2024, 29000}};

   int number = sizeof(cars) / sizeof(cars[0]);

   for(int i = 0; i < number; i++){
      printf("%s %d $%d\n", cars[i].Model, cars[i].year, cars[i].price);
   }
   return 0;
}