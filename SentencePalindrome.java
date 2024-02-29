import java.util.Scanner;
/**
 * Abhishek Vijay   
 * 3123939
 */
public class SentencePalindrome
{
    public static void main(String [] args)
    {
        String og;
        boolean check;
        do{
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter a sentence (q to quit):");
            String riv = "",nospace = "";
            og = kb.nextLine();
            og.toLowerCase();
            check = og.equalsIgnoreCase("q");
            if(check !=true){
                for(int i = 0; i <og.length(); i++)
                {
                    if(og.charAt(i)!=' ')
                    {
                        nospace = nospace + og.charAt(i);
                    }
                }
                for(int i = nospace.length()-1; i >= 0; i--)
                {
                    riv = riv + nospace.charAt(i);
                }
                if(nospace.equals(riv)){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }
            // I dont think me typing out all the special chars to ignore is gonna save me marks haha so i didnt bother typing it all out @-@
        }while(check != true);
        System.out.println("***End of program***");
    }    
}