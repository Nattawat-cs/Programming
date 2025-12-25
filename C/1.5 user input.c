#include <stdio.h>
#include <string.h>

int main() {
   setbuf(stdout, NULL);

   int age = 0;
   float gpa = 0.0f;
   char grade = '\0';
   char name[30] = "";
   
   printf("Enter your age: ");
   scanf("%d", &age);

   printf("Enter your gpa: ");
   scanf("%f", &gpa);
   
   printf("Enter your grade: ");
   scanf(" %c", &grade);
   
   //จะไม่อ่านเว้นวรรค
   printf("Enter your first name: ");
   scanf("%s", name);
   
   //อ่านเว้นวรรคด้วย
   getchar(); //สามารถล้างข้อมูลอักขระบรทัดใหม่ได้
   printf("Enter your fullname: ");
   fgets(name, 30, stdin);   //fgets(variable, size fo var *(sizeof(var))*, stdin);
   //name[strlen(name) - 1] = '\0' คำสั่งนี้เอาไว้ใช้กรณีมันเว้นบรรทัดเองพอมีคำสั่งนี้จะจัดบรรทัดให้
   

   printf("%d\n", age);
   printf("%.2f\n", gpa);
   printf("%c\n", grade);
   printf("%s\n", name);
   return 0;
}