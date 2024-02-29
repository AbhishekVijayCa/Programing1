import java.util.Scanner;
public class HelloWorld
{
    public static void main(String[] args)
    {
        String message = "Hello World";
        System.out.println(message);
        String s = "wizzard";
        String sr = "";
        for(int i =s.length()-1;i>=0; i--){
            sr = sr+s.charAt(i);   
        }
        System.out.println(sr);
    }
}
