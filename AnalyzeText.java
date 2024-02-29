import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * Abhishek Vijay
 * 312 3939
 */
public class AnalyzeText
{
    public static void main(String [] args)throws FileNotFoundException
    {      
        String x = "",w =" ",word;
        int k,u;

        Scanner t = new Scanner(new File("A3Q1.txt"));

        ArrayList <String> words = new ArrayList<>();
        ArrayList <Integer> frequencies = new ArrayList<>();
        ArrayList <String> hyp = new ArrayList<>();
        // I still have no idea what I'm doing  @-@ 

        while(t.hasNext()){
            x = t.next();
            x = x.toLowerCase();
            x = x.replaceAll("[^a-zA-Z]+-'", " ");
            if(!words.contains(x)){//adding unique words
                words.add(x);
                frequencies.add(1);
            }else{//increasing the count of non unique words
                k = frequencies.get(words.indexOf(x))+1;
                frequencies.set(words.indexOf(x),k);
            }
        }

        System.out.println("A. Top 10 words:");
        System.out.println("Word\tFrequency");
        for(int i=0; i<10; i++){
            int h = 0;
            for(int r=0; r<frequencies.size(); r++){
                if(h<frequencies.get(r)){//stores largest value of array 
                    h = frequencies.get(r);
                    w = words.get(r);                                       
                }
            }
            u = frequencies.indexOf(h);
            frequencies.remove(u);
            words.remove(u);
            //removes the highest value from arraylist (x10)
            System.out.println(w +"\t"+ h);
        }

        System.out.println();
        System.out.println("B. Hyphenated words:");
        for(String s: words){//didnt re-add the removed words from top ten frequency because they dont contain "-"
            if(s.contains("-")){
                hyp.add(s);//added "-" words to new array 
            }
        }

        Collections.sort(hyp);
        for(String q: hyp){
            System.out.println(q);
        }
    }
}