package oddoreven;

import java.util.Scanner;

/**
 *
 * @author Cesar
 */
public class OddorEven{
    static int checkNumber(int move)
    {
        if (move%2==0)
        {
            //0 is Even
            return 0;
        }
        else
        {
            //1 is odd
            return 1;
        }
    }
    public static void main(String[] args) {
        int compMove;
        int userMove;
        int compOutcome;
        int compScore=0;
        int userScore=0;
        int endGame=1;
        int compSavedMoves[] = new int[100];
        int userSavedMoves[] = new int[100];
        int arrayCounter = 0;
        int numGames =0;
        while (endGame!=0)
        {
            compMove = (int)(Math.random()*10);
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to Guess if its Odd or Even, is the number Odd or Even? (Enter 1 for ODD, Eneter 0 for EVEN");
            userMove = input.nextInt();
            compSavedMoves[arrayCounter] = compMove;
            userSavedMoves[arrayCounter] = userMove;
            arrayCounter++;
            compOutcome = checkNumber(compMove);
            if (compOutcome==userMove)
            {
                System.out.println("You guessed it right! The number was " + compMove + ". Do you want to play again? Enter 1 for YES, 0 for NO");
                endGame = input.nextInt();
                userScore++;
            }
            else
            {
                System.out.println("You guessed wrong! The number was " + compMove + ". Do you want to play again? Enter 1 for YES, 0 for NO");
                endGame = input.nextInt();
                compScore++;
            }
            numGames++;
        }
        System.out.println("RESULTS:");
        System.out.println("You played " + numGames + " games in total. You won " + userScore + ". The computer won " + compScore + ".");
        if (userScore>compScore)
        {
            System.out.println("You are the WINNER! :D");
        }
        else if (compScore>userScore)
        {
            System.out.println("You are the the LOSER! :(");
        }
        else 
        {
            System.out.println("You and the computer tied!");
        }
        for (int i=0; i<numGames; i++)
        {
            System.out.println("On game " + (i+1) + " you entered " + userSavedMoves[i] + ". The computer entered " + compSavedMoves[i]);
        }
}
}
