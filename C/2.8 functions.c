#include <stdio.h>
#include <string.h>

//Ex.1
void happyBirthday(){
   printf("\nHappy birthday to you!");
   printf("\nHappy birthday to you!");
   printf("\nHappy birthday dear [name]!");
   printf("\nHappy birthday to you!");
   printf("\nYou are [age] years old!\n");
}

//Ex.2
void happyBirthday1(char name[], int age){
   printf("\nHappy birthday to you!");
   printf("\nHappy birthday to you!");
   printf("\nHappy birthday dear %s!", name);
   printf("\nHappy birthday to you!");
   printf("\nYou are %d years old!\n", age);
}

//Ex.3
void happyBirthday1(char name1[], int age1){
   printf("\nHappy birthday to you!");
   printf("\nHappy birthday to you!");
   printf("\nHappy birthday dear %s!", name1);
   printf("\nHappy birthday to you!");
   printf("\nYou are %d years old!\n", age1);
}

int main() {
   setbuf(stdout, NULL);

   // function = A reusable section of code that can be invoked "called"
   //            Arguments can be sent to a function so that it can use them

   //Ex.1
   happyBirthday(); //เวลาเรียกอย่าลืมวงเล็บหลังชื่อ
 
   //Ex.2
   char name[] = "Tle";
   int age = 25;
   
   happyBirthday1(name, age);

   //Ex.3
   char name1[50] = "";
   int age1 = 0;
   
   printf("Enter your name: ");
   fgets(name1, sizeof(name1), stdin);
   name1[strlen(name1) - 1] = '\0';
   
   printf("Enter your age: ");
   scanf("%d", &age1);

   happyBirthday1(name1, age1);
   return 0;
}