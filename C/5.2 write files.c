#include <stdio.h>

int main() {
   setbuf(stdout, NULL);

   // WRITE A FILE

   FILE *pFile = fopen("C:\\Users\\HP\\Desktop\\output.txt", "w");
   
   char text[] = "BOOTY BOOTY BOOTY\nROCKIN EVERWHERE!";

   if(pFile == NULL){
      printf("Error opening file\n");
      return 1;
   }

   fprintf(pFile, "%s", text);

   printf("File was written successfully!\n");

   fclose(pFile);

   return 0;
}