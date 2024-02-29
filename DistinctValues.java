import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
/**
 * Abhishek Vijay
 * 3123939
 */
public class DistinctValues
{
    public static void main(String [] args){
        Random r = new Random();
        ArrayList <Integer> a = new ArrayList<>();
        int x, y = 0;
        System.out.print("Random numbers generated: ");
        for(int i = 0; i < 10; i++){
            x = r.nextInt(20+1);
            System.out.print(x + " ");
            if(!a.contains(x)){
                a.add(x);
                y++;
            }
        }

        System.out.println();
        System.out.println("Distinct Values: " + a);
        System.out.print("Number of values not added: ");
        System.out.print(10 - y);
        System.out.println(); // to run it over and over with out mixing with old tests
    }
}