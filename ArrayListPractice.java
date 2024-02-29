import java.util.Scanner;
import java.util.ArrayList;
/**
 * Abhishek Vijay   
 * 3123939
 */
public class ArrayListPractice
{
    public static void main (String [] args){
        String line,words = "";
        int counter = 0;
        ArrayList <String> Aw = new ArrayList<>();

        System.out.println("Enter a list of words.");

        Scanner kb = new Scanner(System.in);
        line = kb.nextLine();

        Scanner kb2 = new Scanner(line);

        while(kb2.hasNext()){
            words = kb2.next();
            Aw.add(words);
        }
        System.out.println("a) ");
        System.out.println(Aw);

        for (int i = 0; i < Aw.size(); i++){
            System.out.print(Aw.get(i) + " ");
        }
        System.out.println();

        for (String a: Aw){
            System.out.print(a.toUpperCase()+ " ");  
        }
        System.out.println();

        for(String a: Aw){
            if(a.length()>3){
                counter++;
            }
        }
        System.out.println("b) " + counter); 

        System.out.print("c) "); 
        for (int j = Aw.size()-1; j > -1 ; j--){
            System.out.print(Aw.get(j) + " ");
        }

    }
}