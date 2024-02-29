import java.util.Scanner;
/**
 * Abhishek Vijay
 * 3123939
 */
public class BillTip
{
    public static void main(String [] args){
        double BillAmount,Total;
        float TipAmount;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the bill amount: ");
        BillAmount = kb.nextDouble();
        System.out.println("Enter the tip percentage: ");
        TipAmount = kb.nextFloat();
        Total = (BillAmount*(TipAmount/100))+BillAmount;
        System.out.println("Total amount: "+Total);        
    }
}