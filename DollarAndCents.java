import java.util.Scanner;
/**
 * Abhishek Vijay
 * 3123939
 */
public class DollarAndCents
{
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);

        String in,s1="",s2="",dol="",cen="";
        int ds=0,dot=0;
        boolean zero = false;

        in = kb.nextLine();
        ds = in.indexOf("$");
        dot = in.indexOf(".");

        s1 = in.substring(0,ds);
        dol = in.substring(ds+1,dot);
        cen = in.substring(dot+1,dot+3);
        s2 = in.substring(dot+3);

        System.out.print(s1);
        if(in.charAt(ds+1) != '0' && in.charAt(ds+2) != '0')
        {
            System.out.print(dol + " dollars");
        }
        else if(in.charAt(ds+1) != '0' && in.charAt(ds+2) == '0')
        {
            System.out.print(dol + " dollars");
        }
        else if(in.charAt(ds+1) == '0' && in.charAt(ds+2) != '0')
        {
            dol = in.substring(ds+2,ds+3);
            System.out.print(dol + " dollars");
        }

        if(in.charAt(ds+1) == '0' && in.charAt(ds+2) == '0')
        {
            zero = true;
        }
        if(in.charAt(dot+1) == '0' && in.charAt(dot+2) =='0')
        {
            zero = true;
        }
        if(zero ==false)
        {
         System.out.print(" and ");   
        }

        if(in.charAt(dot+1) != '0' && in.charAt(dot+2) !='0')
        {            
            System.out.print(cen + " cents");
        }
        else if(in.charAt(dot+1) != '0' && in.charAt(dot+2) =='0'){
            System.out.print(cen + " cents");
        }
        else if(in.charAt(dot+1) == '0' && in.charAt(dot+2) !='0')
        {
            cen = in.substring(dot+2,dot+3); 
            System.out.print(cen + " cents");
        }

        System.out.println(s2);
    }
    //I will pay $40.95 for the book.
}