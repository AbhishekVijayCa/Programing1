import java.util.ArrayList;
/**
 * Abhishek Vijay
 * 312 3939
 */
public class Statement
{
    public static void main (String args[]){

        // create cards and transactions and add to lists

        CreditCard cc1 = new CreditCard("Harry", "777", 100000);
        CreditCard cc2 = new CreditCard("Ron", "080", 100);
        CreditCard cc3 = new CreditCard("Hermione", "100", 1000);

        ArrayList<CreditCard> cards = new ArrayList<>(); 

        cards.add(cc1);
        cards.add(cc2);
        cards.add(cc3);

        ArrayList<Transaction> txns = new ArrayList<>();
        txns.add(new Transaction("Sep 1, 2018", cc1, "purchase", 1000, "Broomstix"));
        txns.add(new Transaction("Sep 1, 2018", cc1, "purchase", 100, "Flourish and Blotts"));        
        txns.add(new Transaction("Sep 1, 2018", cc3, "purchase", 100, "Flourish and Blotts")); 
        txns.add(new Transaction("Sep 1, 2018", cc2, "purchase",40, "Second-Hand Bookshop"));  
        txns.add(new Transaction("Sep 2, 2018", cc1, "purchase",100, "Ollivanders"));
        txns.add(new Transaction("Sep 2, 2018", cc2, "purchase",50, "Ollivanders"));
        txns.add(new Transaction("Sep 2, 2018", cc3, "purchase",80, "Ollivanders"));
        txns.add(new Transaction("Sep 3, 2018", cc3, "payment", 180));
        txns.add(new Transaction("Sep 3, 2018", cc2, "purchase",8, "HoneyDukes Express"));
        txns.add(new Transaction("Sep 3, 2018", cc1, "purchase",100, "HoneyDukes Express"));
        txns.add(new Transaction("Sep 4, 2018", cc1, "purchase",20, "Three Broomsticks"));
        txns.add(new Transaction("Sep 4, 2018", cc3, "purchase",20, "Three Broomsticks"));
        txns.add(new Transaction("Sep 4, 2018", cc2, "purchase",10, "Three Broomsticks"));
        txns.add(new Transaction("Sep 4, 2018", cc3, "purchase",10, "Three Broomsticks"));

        // association on credit card
        for (Transaction t : txns){
            CreditCard c = t.getCard();
            c.addTransaction(t);
        }

        System.out.println("CreditCards:");
        System.out.println();     

        for(CreditCard c: cards){
            System.out.println(c);
        }

        System.out.println();
        System.out.println("Transactions:");
        System.out.println();

        for(Transaction t: txns){
            System.out.println(t);
        }

        System.out.println();
        System.out.println("Statement per holder:");
        System.out.println();

        for(CreditCard c: cards){
            System.out.println();
            System.out.println("Card number: " + c.getNumber() + " Card holder: " + c.getCardHolder());
            for(Transaction t: c.getTransaction())
            {
                System.out.println(t);
            }
            System.out.println("Balance: $" + c.getBalance());
        }
    }
}