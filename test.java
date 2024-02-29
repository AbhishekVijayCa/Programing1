import java.util.Scanner;
public class test
{
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);
        String k = kb.next();
        for(int i=0;i<k.length();i++)
        {
            if(k.charAt(i)=='e'){
               System.out.print(3);         
            }else{
                System.out.print(k.charAt(i));
            }
        }
        

    }
}