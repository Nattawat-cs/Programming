#include <stdio.h>

int main() {
   setbuf(stdout, NULL);

   // switch = An alternative to using many if-else statement
   //          More efficient w/ fixed integer values
   
   //Ex.1
   int DayOfWeek = 0;

   switch(DayOfWeek){
      case 1:
         printf("It is Monday");
         break;
      case 2:
         printf("It is Tuesday");
         break;
      case 3:
         printf("It is Wenesday");
         break;
      case 4:
         printf("It is Thursday");
         break;
      case 5:
         printf("It is Friday");
         break;
      case 6:
         printf("It is Saturday");
         break;
      case 7:
         printf("It is Sunday");
         break;
      default:
         printf("Please only enter a number (1-7)");
   }

   // ถ้าไม่มีคำสั่ง break จะไม่หยุดการทำงานจนกว่าจะเจอคำสั่ง break หรือ จบโปรแกรม 
   // เช่น DayOfWeek = 5  
   // คำสั่งแสดงผลเป็น It is FridayIt is  SaturdayIt is Sunday
   
   //Ex.

   char DayOfWeek = '\0';
  
   switch(DayOfWeek){
      case 'M':
         printf("It is Monday");
         break;
      case 'T':
         printf("It is Tuesday");
         break;
      case 'W':
         printf("It is Wenesday");
         break;
      case 'R':
         printf("It is Thursday");
         break;
      case 'F':
         printf("It is Friday");
         break;
      case 'S':
         printf("It is Saturday");
         break;
      case 'U':
         printf("It is Sunday");
         break;
      default:
         printf("Please only enter a Day");
   }  
   return 0;
}