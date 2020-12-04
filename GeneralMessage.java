/**
 * Grace Murphy
 */
import javax.swing.JOptionPane;
public class Ques1
{
    public static void main (String [] args)
    {
        String name;
		String message1;
		String message2;
       
		name=JOptionPane.showInputDialog("Enter your name");
		message1 = "Welcome to CS130";
		message2= "Have a great semester";

	 JOptionPane.showMessageDialog

               (null, "My name is " + name + " \n " + message1 + " \n " + message2 + "");


        System.exit(0);
}
}
