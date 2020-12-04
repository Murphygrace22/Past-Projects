//Grace Murphy 
//Savings for 366 Days 
import javax.swing.JOptionPane;

public class Lab1_3
{
	public static void main (String args[])
	{
		double savings=0;
		for(int i=1; i<=366; i++)
		{
			savings+=0.01*i;
		}
		JOptionPane.showMessageDialog
				(null, "Your total money on December 31, 2016 would be: " + savings);
	}
}