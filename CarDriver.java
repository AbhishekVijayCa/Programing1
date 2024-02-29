/**
 *Abhishek Vijay
 *3123939
 */
public class CarDriver
{   
    public static void main(String[] args){
        String dmake,dmodel;
        int dyear;

        Car c1 = new Car();
        Car c2 = new Car("Volkswagen","Golf",2008);

        c1.setMake("Honda");
        c1.setModel("Civic");
        c1.setYear(2012);

        dmake = c2.getMake();
        dmodel = c2.getModel();
        dyear = c2.getYear();

        System.out.println("Car 1");
        System.out.println(c1);
        
        System.out.println();
        
        System.out.println("Car 2");
        System.out.println("Make: " + dmake);
        System.out.println("Model: " + dmodel);
        System.out.println("Year: " + dyear);
    }
}