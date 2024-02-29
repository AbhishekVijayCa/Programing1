/**
 *Abhishek Vijay
 *3123939
 */
public class Car
{
    private String make,model;
    private int year;

    public Car(){
        make = "N/A";
        model = "N/A";
        year = 0;
    }

    public Car(String m,String n,int y){
        make = m;
        model = n;
        year = y;
    }

    //getters

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    //setters

    public void setMake(String m){
        make = m;
    }

    public void setModel(String n){
        model = n;
    }

    public void setYear(int y){
        year = y;
    }

    public String toString(){
        return make + " " + model + " " + year;
    }
}