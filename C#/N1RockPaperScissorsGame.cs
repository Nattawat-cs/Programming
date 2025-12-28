using System;

namespace MyfirstProgram
{
    class N1RockPaperScissorsGame
    {
        static void Main(string[] args)
        {
            Random random = new Random();
            bool playAgain = true;
            String player;
            String computer;
            String answer;

            while(playAgain)
            {
                player = "";
                computer = "";
                answer = "";

                while(player != "ROCK" && player != "PAPER" && player != "SCISSORS")
                {
                    Console.WriteLine("Enter ROCK, PAPER, SCISSORS: ");
                    player = Console.ReadLine();
                    player = player.ToUpper();
                }

                switch (random.next(1, 4))
                {
                    case 1:
                        computer = "ROCK";
                        break;
                    case 2:
                        computer = "PAPER";
                        break;
                    case 3:
                        computer = "SCISSORS";
                        break;
                }

                Console.WriteLine("Player: " + player);
                Console.WriteLine("Computer: " + computer);

                switch (player)
                {
                    case "ROCK":
                        if (computer = "ROCK")
                        {
                            Console.WriteLine("It's a draw!");
                        }
                        else if (computer = "PAPER")
                        {
                            Console.WriteLine("You Lose!");
                        }
                        else
                        {
                            Console.WriteLine("You Win!");
                        }
                        break;
                    case "PAPER":
                        if (computer = "PAPER")
                        {
                            Console.WriteLine("It's a draw!");
                        }
                        else if (computer = "ROCK")
                        {
                            Console.WriteLine("You Win!");
                        }
                        else
                        {
                            Console.WriteLine("You Lose!");
                        }
                    case "SCISSORS":
                        if (computer = "ROCK")
                        {
                            Console.WriteLine("You Lose!");
                        }
                        else if (computer = "PAPER")
                        {
                            Console.WriteLine("You Win!");
                        }
                        else
                        {
                            Console.WriteLine("It's a draw!");
                        }
                }

                Console.WriteLine("Would you like to play again (Y/N)");
                answer = Console.WriteLine();
                answer = ToUpper();

                if (answer == "Y")
                {
                    playAgain = true;
                }
                else
                {
                    playAgain = false;
                }
                
            }

            Console.WriteLine("Thank for playing!");

            Console.ReadKey();
        }
    }  
}
