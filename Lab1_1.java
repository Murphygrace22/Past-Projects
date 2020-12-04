//Grace Murphy 
//Gpa average 
import javax.swing.JOptionPane;

public class Lab1_1
{
	public static void main (String args[])
	{
		double[] finalScore=new double[5];
		int x=1;
		int QP=0;
		int total=0; 
		double gpa=0.0;
		for(int i=0; i<finalScore.length; i++)
        {
			finalScore[i]=Double.parseDouble(JOptionPane.showInputDialog("Enter your final grade for course " + x));
			x++;
		System.out.println(finalScore[i]);
		
        }
        String [] letterGrades=new String[5];
		for(int a=0; a<finalScore.length; a++)
		{
			if (finalScore[a]>=90)
			{
				QP=12;
			}
            else if (finalScore[a]>=80)
            {
				QP=9;
            }
			else if (finalScore[a]>=70)
			{
				QP=6;
			}
			else if (finalScore[a]>=60)
			{
				QP=3;
			}
			else if (finalScore[a]<=59)
			{
				QP=0;
			}
			
		total=total+QP;

		}
		gpa = total/15;

		JOptionPane.showMessageDialog
			(null, "Your semester GPA is: " + gpa);
	}
}