import java.util.Scanner;
/**
 *Abhishek Vijay
 *3123939
 */
public class CharacterCount
{
    //again no idea how it works but it does :^)
    public static void main(String [] args)
    {
        String line,c,word ="";
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a word and a character");
        line = kb.nextLine();

        Scanner kb1 = new Scanner(line);
        word = kb1.next();
        char ch = kb1.next().charAt(0);

        int count =0;

        count = countChars(count,word,ch);
        System.out.println("There are "+count+" "+ch +"'s "+" in "+word);
    }

    public static int countChars(int count,String word, char ch)
    {
        count=0;        
        for(int i = 0; i<word.length(); i++)
        {
            if(word.charAt(i)==ch)
            {
                count++;
            }
        }
        return count;
    }

}
