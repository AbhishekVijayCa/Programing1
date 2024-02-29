import java.util.Scanner;
import java.util.Random;
/**
 * Abhishek Vijay
 * 3123939
 */
public class RockPaperScissors
{
    public static void main(String [] args)
    {
        System.out.println("Let's play!");
        
        Random rand = new Random();
        
        String x = "",y = "";
        boolean end = false;
        int pc = 0,pl = 0,r;
        
        Scanner kb = new Scanner(System.in);
        while(end == false)
        {
            System.out.println("Rock, paper, scissors");
            y = kb.next().toLowerCase();
            r = rand.nextInt(3);

            if(r==0){
                x = "rock";   
            } 
            else if(r==1){
                x = "paper";   
            }
            else if(r==2){
                x = "scissors";
            }

            System.out.println("<" + x + ">");

            if(y.equals(x)){
                System.out.println("Tie!");
            }
            else if(y.equals("paper")){
                if(x.equals("rock")) 
                {pl++;} 
                else
                {pc++;}     
                System.out.println("Score: " + pl + "-" + pc);
            }
            else if (y.equals("rock")){
                if(x.equals("scissors")) 
                {pl++;} 
                else
                {pc++;}
                System.out.println("Score: " + pl + "-" + pc);
            }
            else if (y.equals("scissors")){
                if(x.equals("paper"))

                {pl++;}
                else
                {pc++;}
                System.out.println("Score: " + pl + "-" + pc);
            }
            else{
                System.out.println("Invalid, please try again");
            }

            if(pc == 3 || pl == 3){
                end = true;
            }
        }

        displayWinner(pl,pc);
    }

    public static void displayWinner(int pl,int pc){
        if(pl == 3){
            System.out.println("You Win!");   
        }else if(pc == 3){
            System.out.println("PC Wins!");
        } 
    }
}