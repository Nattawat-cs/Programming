#include <stdio.h>

int main(){

    //arithmetic operators = + - * / % ++ --

    int x = 10;
    int y = 3;
    int z = 0;
    
    float y1 = 3;
    float v = 0;

    //z = x + y;
    //z = x - y;
    //z = x * y;
    //z = x / y;
    //v = x / y1; 0.66667
    //z = x % y;

    printf("%d\n", z);
    printf("***************\n");
    printf("%f\n", v);

    //prefix

    int A = 10;
    A++;

    int B = 10;
    B--;

    printf("%d\n", A);
    printf("%d\n", B);

    int K = 10;

    //augmented assignment operator
    
    //K+=3; => K = K + 3
    //K-=3; => K = K - 3
    //K*=3; => K = K * 3
    //K/=3; => K = K / 3
    //K%=3; => K = K % 3

    printf("%d\n", K);
    
    return 0;
}