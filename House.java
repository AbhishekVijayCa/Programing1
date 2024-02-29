
/**
 *
 */
public class House
{
    private String address;
    private int price;
    private Realtor r;
    public House(){
        address = "unknown";
        price = 0;
    }

    public House(String address, int price){
        this.address = address;
        this.price = price;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public int getPrice(){
        return price;   
    }

    public void setPrice(int price){
        this.price = price;
    }
    
    public Realtor getRealtor(){
        return r;
    }
    
    public void setRealtor(Realtor r){
        this.r = r;
    }
    
    public String toString(){
        return address + " " + price;
    }
}