import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Abhishek Vijay   
 * 3123939
 */
public class ValidatePartID
{
    public static void main(String [] args)throws FileNotFoundException
    {
        boolean valid = true;
        String word;

        Scanner t = new Scanner(new File("Lab7.txt"));
        while(t.hasNext()){
            word = t.next();
            if(word.length()==4 || word.length()==5)
            {
                valid = true;
                for(int i=0; i<word.length() && valid == true;i++)
                {
                    if(!Character.isDigit(word.charAt(i))){
                        valid = false;   
                    }
                }
            }
            else{
                valid = false;
            }

            if(valid == true){
                System.out.println(word + "\tvalid");
            }else{
                System.out.println(word + "\tinvalid");
            }
        }
    }
}