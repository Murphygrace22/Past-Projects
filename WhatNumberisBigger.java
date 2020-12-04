/**
 * Grace Murphy
 */
import javax.swing.JOptionPane;
public class Ques3
{
    public static void main (String [] args)
    { 
        String number1,
			number2,
			number3;

        int x,
			y,
			z;

        number1=JOptionPane.showInputDialog("Enter first number");
		number2=JOptionPane.showInputDialog("Enter second number");   
		number3=JOptionPane.showInputDialog("Enter third number");   

		x =Integer.parseInt(number1);
		y =Integer.parseInt(number2);
		z =Integer.parseInt(number3);



       if ( x > y && x > z )

         JOptionPane.showMessageDialog

         (null,"" + x + " is largest.");

      else if ( y > x && y > z )

        JOptionPane.showMessageDialog

         (null,"" + y + " is largest.");

      else if ( z > x && z > y )

         JOptionPane.showMessageDialog

         (null,"" + z + " is largest.");        
    }
}
