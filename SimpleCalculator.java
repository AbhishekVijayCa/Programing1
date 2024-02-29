import java.util.Scanner;
/**
 * Abhishek Vijay
 * 3123939
 */
public class SimpleCalculator
{
    public static void main(String args[])
    {

        boolean check;
        String line,op,yn;
        double a,b;
        double sol=0.0;

        String yes = "y";
        String no = "n";

        do{
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter an expression: ");
            line = kb.nextLine();
            Scanner kb2 = new Scanner(line);
            a = kb2.nextDouble();
            op = kb2.next();
            b = kb2.nextDouble();

            switch(op){
                case "+": sol = a + b;
                break;
                case "-": sol = a - b;
                break;
                case "*": sol = a * b;
                break;
                case "/": sol = a / b;
                break;
                default: System.out.println("Error");
            }

            System.out.println("= " + sol);

            System.out.println("Perform an expression: y/n");
            yn = kb.next();

            check = yes.equalsIgnoreCase(yn);
        }while(check==true);   

        if(no.equalsIgnoreCase(yn)){
            System.out.println("*** End of program ***");
        }
    }
}