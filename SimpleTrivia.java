import javax.swing.JOptionPane;
/**
 * Abhishek Vijay
 * 3123939
 */
public class SimpleTrivia
{
    public static void main(String []args){
        String City = JOptionPane.showInputDialog("What is the capital of Manitoba? ");
        String Answer = "Winnipeg";
        boolean check = Answer.equalsIgnoreCase(City.trim());        
        JOptionPane.showMessageDialog(null,check);
    }
}