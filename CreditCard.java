import java.util.ArrayList;
/**
 *Abhishek Vijay
 *312 3939
 */
public class CreditCard
{      
    private int limit, balance;
    private String cardHolder, number;
    public ArrayList <Transaction> transactions;

    public CreditCard(String cardHolder,String number,int limit){
        this.cardHolder = cardHolder;
        this.number = number;
        this.limit = limit;
        this.transactions = new ArrayList<>();
    }

    public String getCardHolder(){
        return cardHolder;
    }

    public void setCardHolder(String cardHolder){
        this.cardHolder = cardHolder;
    }

    public String getNumber(){
        return number;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public int getLimit(){
        return limit;   
    }

    public void setLimit(int limit){
        this.limit = limit;
    }

    public int getBalance(){
        return balance;   
    }

    public void setbalance(int balance){
        this.balance = balance;
    }

    public ArrayList<Transaction> getTransaction(){
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions){ 
        this.transactions = transactions;
    }

    public void addTransaction(Transaction trx){
        if(trx.getType()==("purchase")){
            
            if(balance + trx.getAmount()<=limit){
                balance = balance + trx.getAmount();
                transactions.add(trx);
            }else{
                trx.setType("declined");   
            }

        }else if(trx.getType()==("payment")){
            balance = balance + trx.getAmount();
            transactions.add(trx);
        }
    }

    public String toString(){
        return number + " " + cardHolder + " " + balance + " " + limit;
    }
}
