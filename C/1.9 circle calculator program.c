#include <stdio.h>
#include <math.h>

int main() {
   setbuf(stdout, NULL);
   
   double radius = 0.0;
   double area = 0.0;
   double surfaceArea = 0.0;
   double volume = 0.0;
   const double PI = 3.14159; //const คือเวลาตั้งแล้วจะไม่เปลี่ยนค่า
   
   printf("Enter the radius: ");
   scanf("%lf", &radius);

   area = PI * pow(radius , 2);
   surfaceArea = 4 * PI * pow(radius , 2);
   volume = (4.0 / 3.0) * PI * pow(radius , 3);

   printf("Area: %.2lf cm\n", area);
   printf("surfaceArea: %.2lf cm\n", surfaceArea);
   printf("volume: %.2lf cm\n", volume);

   return 0;
}