import java.util.ArrayList;
/**
 * Abhishek Vijay   
 * 312 3939
 */
public class Transaction
{
    private int amount, txNumber;
    private String date, merchant, type;
    private static int lastTx = 1000;

    private CreditCard card;

    public Transaction(String date, CreditCard card, String type, int amount){
        this.date = date;
        this.card = card;
        this.type = type;       
        
        this.txNumber = nextTx();
    }

    public Transaction(String date, CreditCard card, String type, int amount, String merchant){
        this.date = date;
        this.card = card;
        this.type = type;        
        this.amount = amount;        
        this.merchant = merchant;
        this.txNumber = nextTx();
    }

    public String getDate(){
        return date;   
    }

    public void setDate(String date){
        this.date = date;
    }

    public String getMerchant(){
        return merchant;   
    }

    public void setMerchant(String merchant){
        this.merchant = merchant;
    }

    public String getType(){
        return type;   
    }

    public void setType(String type){
        this.type = type;
    }

    public int getAmount(){
        return amount;   
    }

    public void setAmount(int amount){
        this.amount = amount;   
    }

    public CreditCard getCard(){
        return card;
    }

    public void setCard(CreditCard card){
        this.card = card;
    }

    public int getTxNumber(){
        return txNumber;   
    }

    public void setTxNumber(){
        this.txNumber = txNumber;
    }

    private int nextTx(){
        return ++lastTx;   
    }

    public String toString(){
        return txNumber + "\t" + date + "\t" + card.getNumber() + "\t" + type + "\t" + amount + "\t" + merchant;
    }
}
