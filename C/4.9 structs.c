#include <stdio.h>
#include <string.h>
#include <stdbool.h>

struct Student{
   char name[50];
   int age;
   float gpa;
   bool isFullTime;   
};

void printStudent(struct Student student);

int main() {
   setbuf(stdout, NULL);

   // struct = A custom container that holds multiple
   //          pieces of related information.
   //          Similar to Objects in other languages

   struct Student student1 = {"Spongeboob", 30, 2.5, true};
   struct Student student2 = {0}; // clear

   strcpy(student1.name, "Sandy");
   student1.age = 27;
   student1.gpa = 4.0;
   student1.isFullTime = true;

   //Ex.1	 
   printf("%s\n", student1.name);  
   printf("%d\n", student1.age);  
   printf("%.2f\n", student1.gpa);  
   printf("%s\n", (student1.isFullTime) ? "Yes" : "No");  

   //Ex2
   printStudent(student1);

   return 0;
}

void printStudent(struct Student student){
   printf("%s\n", student.name);
   printf("%d\n", student.age);
   printf("%.2f\n", student.gpa);
   printf("%s\n", (student.isFullTime) ? "Yes" : "No");
}