import javax.swing.JOptionPane;
public class test2
{
    public static void main(String [] args)
    {
        String Sin = JOptionPane.showInputDialog("#");
        if(Sin.length()!=9){
         JOptionPane.showMessageDialog(null,"f");   
        }else if(Sin.charAt(0)=='0' || Sin.charAt(0)=='8'){
         JOptionPane.showMessageDialog(null,"nice");   
        }
    }
}
