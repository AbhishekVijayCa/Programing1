import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Abhishek Vijay
 * 3123939
 */
public class FormatPhoneNumber
{
    public static void main(String [] args)throws FileNotFoundException
    {
        Scanner t = new Scanner(new File("As2.txt"));
        String pn,save="",p1="",p2="",p3="";
        int count=0;
        while(t.hasNext()){
            pn = t.next();

            for(int i = 0; i < pn.length();i++)
            {
                if(Character.isDigit(pn.charAt(i)))
                {
                    count++;
                    save += pn.charAt(i);
                }
            }

            p1 = save.substring(0,3);
            p2 = save.substring(3,6);
            p3 = save.substring(6);

            if(count == 10){
                System.out.println("("+p1+")" + p2 + "-" + p3);
            }

            save = "";
            count =0;
        }
    }
}