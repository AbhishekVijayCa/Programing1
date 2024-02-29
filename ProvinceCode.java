import java.util.Scanner;
/** 
 * ACS-1903
 * for Lab6 Q1\
 * Abhishek Vijay  
 * 3123939
 */
public class ProvinceCode{
    // not sure how but some how it works
    public static void main(String[] args){
        String code = getCodeFromUser();
        String result = getProvinceName(code);
        displayResult(code,result);
    }

    public static String getCodeFromUser(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the province code:");
        String code = kb.next().toUpperCase();
        return code;
    }

    public static String getProvinceName(String code)
    {
        String province="";
        switch(code){
            case "BC": province = "British Columbia";
            break;
            case "SK": province = "Saskatchewan";
            break;
            case "AB": province = "Alberta";
            break;
            case "MB": province = "Manitoba";
            break;
            case "ON": province = "Ontario";
            break;
            default: province = "unknown";
        }
        return province;
    }

    public static String displayResult(String code, String result)
    {
        if (!result.equals("unknown"))
            System.out.println("The code " +code+ " stands for " + result);
        else 
            System.out.println("The code " +code+ " is not in the list");
        return result;
    }
}
