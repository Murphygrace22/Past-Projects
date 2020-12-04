/**
 * Grace Murphy
 */
import javax.swing.JOptionPane;
public class Ques2
{
    public static void main (String [] args)
    { 
		 String number1,
			    number2;
		 int num1,
			 num2;

		number1=JOptionPane.showInputDialog("Enter first number");
		number2=JOptionPane.showInputDialog("Enter second number");  
		
		num1 =Integer.parseInt(number1);
		num2 =Integer.parseInt(number2);

if (num1 > num2)
	{
		JOptionPane.showMessageDialog
		(null, "" + num1 + " is greater than " + num2 + "");
	}
	
	else if (num1 < num2)
	{ 
		JOptionPane.showMessageDialog
		(null, "" + num1 + " is less than " + num2 + "");
	}

if (num1 <= num2)
	{ 
		JOptionPane.showMessageDialog
		(null, "" + num1 + " is less than or equal to " + num2 + "");
	}
	else if (num1 >= num2)
	{ 
		JOptionPane.showMessageDialog
		(null, "" + num1 + " is greater than or equal to " + num2 + "");
	}
 if (num1 == num2)
	{ 
		JOptionPane.showMessageDialog
		(null, "" + num1 + " is equal to " + num2 + "");
	}
	else if (num1 != num2)
	{ 
		JOptionPane.showMessageDialog
		(null, "" + num1 + " is not equal to " + num2 + "");
	}
	System.exit(0);
	}
}


	 