import java.util.ArrayList;
/**
 * Create an ArrayList from an array of strings
 */
public class BasicOperationsOnArrayList
{
    public static void main(String[] args){
        // new, empty ArrayList of people
        ArrayList<String> people=new ArrayList();
        // add some names 
        people.add("Joe");
        people.add("Jasper");
        people.add("Dick");
        people.add("Abigail");
        // remove a name
        people.remove("Dick");
        // display the names in people
        for (String p: people)
            System.out.print(p+"  ");
    }
}
