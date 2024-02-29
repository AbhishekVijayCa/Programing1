import java.util.Scanner;
/**
 *Abhishek Vijay   
 *3123939
 */
public class AvarageWordLength
{
    public static void main(String[]args)
    {
        Scanner kb = new Scanner(System.in);
        Scanner kb1 = new Scanner(System.in);

        System.out.println("Enter the number of words: ");
        double wordCount = kb.nextDouble();
        
        System.out.println("Enter a list of words: ");
        String Words = kb1.nextLine();
        
        double space = 0;
        double Final;
        
        for(int i = 0; i < Words.length(); i++)
        {
            if(Words.charAt(i)==' ')
            {
                space++;   
            }
        }
        
        Final = (Words.length()-space)/wordCount;
        System.out.println("The avarage word length is " + Final);
        //test > shoot score goal stick puck win assist penalty ice hockey
    }
}