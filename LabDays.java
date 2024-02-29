import javax.swing.JOptionPane;
/**
 *Abhishek Vijay
 *3123939
 */
public class LabDays
{
 public static void main (String [] args)
 {
     String Q1 = JOptionPane.showInputDialog("Are you currently enrolled in ACS-1903? (yes/no)");     
     String Y = "yes";
     String N = "no";         
     boolean Check1y = Y.equalsIgnoreCase(Q1.trim());
     boolean Check1n = N.equalsIgnoreCase(Q1.trim());    
     if(Check1y==true){
         String Q2 = JOptionPane.showInputDialog("Are you in the -003 section? (yes/no)");
         boolean Check2y = Y.equalsIgnoreCase(Q2.trim());
         boolean Check2n = N.equalsIgnoreCase(Q2.trim());
         if(Check2y==true){
             JOptionPane.showMessageDialog(null,"Your lab is this Friday");
            }
            else if(Check2n==true){
                JOptionPane.showMessageDialog(null,"Your lab is on Tuesday or Thursday");
            }
        }
        else if(Check1n==true){
         JOptionPane.showMessageDialog(null,"Ok. End of Program");
        }
    }
}