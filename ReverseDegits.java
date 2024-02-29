import java.util.Scanner;
/**
 * Abhishek Vijay
 * 3123939
 */
public class ReverseDegits
{
    public static void main(String []args)
    {
        Scanner kb = new Scanner(System.in);     
        int x;
        System.out.println("Enter a positive integer");   
        x = kb.nextInt();
        System.out.print("The number in reverse is "); 
        while(x>0){
            int y = x %10;
            System.out.print(y);
            x = x/10;            
        }      
        System.out.print(".");
    }
}