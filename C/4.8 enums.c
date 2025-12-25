#include <stdio.h>

void connecStatus(Status status);

//Ex.1
enum Day{
   SUNDAY = 1, MONDAY = 2, TUESDAY = 3, WEDNESDAY = 4, THURDAY = 5, FRIDAY = 6, SATRUDAY = 7
};

//Ex.2
typedef enum{
   SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURDAY, FRIDAY, SATRUDAY
}Day;

//Ex.3

typedef enum{
   SUCCESS, FAILURE, PENDING
}Status;

int main() {
   setbuf(stdout, NULL);

   // enum = A user-defined data type that consists
   //        of a set of named integer constants.
   //        Benefit: Replaces numbers with readable names

   // SUNDAY = 0;
   // MONDAY = 1;
   // TUESDAY = 2;
   
   //Ex.1
   enum Day today = SUNDAY;

   printf("%d", today);

   //Ex.2
   Day today = MONDAY;

   if(today == SUNDAY || today == SATRUDAY){
      printf("It's the weekend");
   }
   else{
      printf("It's a weekday");
   }
   
   //Ex.3

   Status status = SUCCESS;

   connecStatus(status);

   return 0;
}

void connecStatus(Status status){

   switch(status){
      case SUCCESS: printf("Connection was successfull\n"); break;
      case FAILURE: printf("Could not connect\n"); break;
      case PENDING: printf("Connectiong...."); break;
   }

}