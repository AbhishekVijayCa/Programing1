import java.util.Scanner;
/**
 *Abhishek Vijay
 *3123939
 */
public class ProvinceCodeog
{
    public static void main(String []args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the province code");
        String Code = kb.next();
        String Full;
        // :)
        switch(Code.toUpperCase()){
            case "BC": Full = "British Columbia";
            break;
            case "AB": Full = "Alberta";
            break;
            case "MB": Full = "Manitoba";
            break;
            case "ON": Full = "Ontario";
            break;
            case "QC": Full = "Quebuec";
            break;
            default: Full = "The province is not on the list";
        }
        System.out.println("The Province is "+ Full);
    }
}