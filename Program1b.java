import java.util.ArrayList;
import java.util.Scanner;
public class Program1b{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        String find = "Tom", replace = "Harry";
        String line = "Ginny Tom Ron Hermione Fred George Tom Neville Tom Seamus";
        Scanner s = new Scanner(line);
        while (s.hasNext()){
            String token = s.next();
            names.add(token);
        }

        while (names.contains(find)){
            int i = names.indexOf(find);
            names.set(i, replace);
        }

        for (String q: names) 
            System.out.print(q + " ");
    }
}