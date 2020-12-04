//Grace Murphy
//Stars Square Program
import javax.swing.JOptionPane;

public class Lab1_2
{
	public static void main (String args[])
	{
		int num=Integer.parseInt(JOptionPane.showInputDialog("Enter an integer."));
		for (int i=1;i<=num; i++)
		{
			{
				for(int x=1; x<=num;x++)
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
