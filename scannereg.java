import java.util.Scanner;
public class scannereg
{
    public static void main(String [] args ){
        double a,b,h,area;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a");
        a=kb.nextDouble();
        System.out.println("Enter b");
        b=kb.nextDouble();
        System.out.println("Enter h");
        h=kb.nextDouble();
        area = ((a+b)/2)*h;
        System.out.println("the area is " + area);
        
    }
}
