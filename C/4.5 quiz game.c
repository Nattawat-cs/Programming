#include <stdio.h>
#include <ctype.h>

int main() {
   setbuf(stdout, NULL);

   // QUIZ GAME

   char questions[][100] = {"What is the largest planet in the solar system?",
                            "What is the hottest planet?",
                            "What planet has the most moon?",
                            "Is the Earth flat?"};

   char options[][100] = {"A. Jupiter\nB. Saturn\nC. Uranus\nD. Neptune",
                          "A. Mercury\nB. Venus\nC. Earth\nD. Mars",
                          "A. Earth\nB. Mars\nC. Jupiter\nD. saturn",
                          "A. Yes\nB. No\nC. Maybe\nD. Sometimes"};

   char answerKey[] = {'A', 'B', 'D', 'B'};

   printf("%s", questions[0]);
   printf("%s", options[0]);
   printf("%c", answerKey[0])

   //Ex.1

   char guess = '\0';
   int score = 0;

   printf("*** QUIZ GAME ***\n");

   for(int i = 0; i < 4; i++){
      printf("\n%s\n", questions[i]);
      printf("\n%s\n", options[i]);
      printf("Enter your choice: ");
      scanf(" %c", &guess);
      
      guess = toupper(guess);

      if(guess == answerKey[i]){
         printf("CORRECT!");
         score++;
      }
      else{
         printf("WRONG!");
      }

   }

   printf("\nYour score is %d out of %d points\n", score, 4);

   return 0;
}