import java.util.Scanner;
import java.util.Random;
/**
 * Abhishek Vijay
 * 3123939
 */
public class DiceGameSim
{
    public static void main(String []args)
    {
        Random r1 = new Random();
        Random r2 = new Random();
        int p1,p2,wp1 = 0,wp2 = 0,t = 0;
        for(int i=0; i<100;i++)
        {
            p1 = r1.nextInt(6)+1;
            p2 = r2.nextInt(6)+1;
            if(p1>p2)
            {
                wp1++;
            }else if(p2>p1)
            {
                wp2++;
            }else if(p1==p2){
                t++;
            }
        }
        System.out.println("Number of rounds won:");
        System.out.println("Player1: "+ wp1);
        System.out.println("Player2: "+ wp2);
        System.out.println("("+ t + " ties)");
        System.out.println("");//the one blank row in example
        if(wp1>wp2){
            System.out.println("Player1 is the overall winner!");
        }else if(wp2>wp1){
            System.out.println("Player2 is the overall winner!");
        }else if(wp1==wp2){
            System.out.println("Its a tie!");
        }
    }
}