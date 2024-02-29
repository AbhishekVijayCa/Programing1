import java.util.ArrayList;
/**
 *
 */
public class Realtor
{   
    private String name;
    private ArrayList<House> h = new ArrayList();
    public Realtor()
    {
        name = "N/A";
    }

    public Realtor(String name){
        this.name = name;
    }

    public String getName(){
        return name;   
    }

    public void setname(String name){
        this.name = name;
    }

    public ArrayList<House> getHouse(){
        return h;   
    }

    public void setHouse(ArrayList<House> h){
        this.h = h;
    }

    public void addHouse(House home){
        h.add(home);
    }

    public String toString(){
        return name;   
    }
}