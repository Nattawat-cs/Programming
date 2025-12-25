#include <stdio.h>
#include <math.h>

int main() {
   setbuf(stdout, NULL);
   
   int x = 9;
   float y = 3.14;
   float z = 45;

   //x = sqrt(x);   รากที่2
   //x = pow(x,2);  ยกกำลัง
   //y = round(y);  ปัดเศษลง
   //y = ceil(y);   ปัดเศษขึ้น
   //y = floor(y);  ปัดเศษลงเสมอ เช่น 3.99 ก้จะได้ 4.00
   //x = abs(x);    ค่าสัมบูรณ์ เช่น -3 จะได้ 3
   //y = log(y);    ค่า log
   //z = sin(z);    หาค่า sin
   //z = cos(z);    หาค่า cos
   //z = tan(z);    หาค่า tan

   printf("%d\n", x);
   printf("*******************\n");
   printf("%f\n", y);
   printf("*******************\n");
   printf("%f\n", z);
   return 0;
}