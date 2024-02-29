import java.util.ArrayList;
/**
 * 
 */
public class Program8
{
    public static void main(String[] args){
        Realtor r1 = new Realtor("Glengarry Glen Ross");

        House h1 = new House("4 Privet Drive", 300000);
        House h2 = new House("42 Wallaby Way", 700000);
        House h3 = new House();

        h3.setAddress("123 Sesame Street");
        h3.setPrice(400000);

        h1.setRealtor(r1);
        r1.addHouse(h1);

        listHouse(r1, h2);
        listHouse(r1, h3);

        System.out.println("Realtor: " + r1);
        System.out.println("Listings: ");

        for (House h : r1.getHouse()){
            System.out.println("\t" + h);
        }

    }

    public static void listHouse(Realtor r,House h){
        r.addHouse(h);        
    }
}