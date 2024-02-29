import java.util.Scanner;
/**
 * 
 */
public class Guessinggame
{
    public static void main ( String [] args)
    {
        Scanner kb = new Scanner(System.in);
        int answer = 0;
        System.out.println("Guess a number from 1-10");
        int guess = kb.nextInt();
        while(answer != guess){
            System.out.println("Try again. Guess a number from 1-10: ");
            guess = kb.nextInt();
        }
        System.out.println("correct!");
    }
}
