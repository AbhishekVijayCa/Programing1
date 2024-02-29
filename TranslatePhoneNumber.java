import java.util.Scanner;
/**
 * Abhishek Vijay
 * 3123939
 */
public class TranslatePhoneNumber
{
    public static void main(String [] args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a list of phonewords to translate: ");
        String exit = "exit";
        String pw,x;

        do{
            pw = kb.nextLine();
            pw = pw.toUpperCase();// made it case insensitive to caps, simply remove line to make it case sensitive :)
            if(pw.equalsIgnoreCase(exit)==false){
                for(int i = 0; i<pw.length(); i++)
                {
                    if(pw.charAt(i)=='A' || pw.charAt(i)=='B' || pw.charAt(i)=='C'){
                        System.out.print(2);         
                    }else if(pw.charAt(i)=='D' || pw.charAt(i)=='E' || pw.charAt(i)=='F'){
                        System.out.print(3);        
                    }else if(pw.charAt(i)=='G' || pw.charAt(i)=='H' || pw.charAt(i)=='I'){
                        System.out.print(4);        
                    }else if(pw.charAt(i)=='J' || pw.charAt(i)=='K' || pw.charAt(i)=='L'){
                        System.out.print(5);        
                    }else if(pw.charAt(i)=='M' || pw.charAt(i)=='N' || pw.charAt(i)=='O'){
                        System.out.print(6);        
                    }else if(pw.charAt(i)=='P' || pw.charAt(i)=='Q' || pw.charAt(i)=='R' || pw.charAt(i)=='S'){
                        System.out.print(7);        
                    }else if(pw.charAt(i)=='T' || pw.charAt(i)=='U' || pw.charAt(i)=='V'){
                        System.out.print(8);        
                    }else if(pw.charAt(i)=='W' || pw.charAt(i)=='X' || pw.charAt(i)=='Y' || pw.charAt(i)=='Z'){
                        System.out.print(9);        
                    }else {
                        System.out.print(pw.charAt(i));
                    }
                }
                System.out.println("");
            }
        }while(pw.equalsIgnoreCase(exit)==false);
        System.out.print("***End of Program***"); 
    }
}