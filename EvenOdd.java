/**
 * Grace Murphy 
 */
import javax.swing.JOptionPane;
public class ExtraCredit
{
    public static void main (String [] args)
    {

    String number1;
    int num1;

    number1=JOptionPane.showInputDialog("Enter a number");
    num1=Integer.parseInt(number1);

    if (num1 % 2 == 0 )

        JOptionPane.showMessageDialog
        (null, "Number is even");
    else 
        JOptionPane.showMessageDialog
        (null, "Number is odd");

    System.exit(0);
}
}
