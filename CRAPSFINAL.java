import javax.swing.JOptionPane;
public class CRAPSFINAL
	{
        
    public static void main(String[] args) 
    {
    	boolean play = true;
    	boolean contRolling = true;
    	boolean newGame = true;
    	String playGame;
		String bet;
		String BA;
    	int playGame2;
		int bet2;
		int BA2;
		int bank=1000;
    	roll r1, r2, r3;
    	
		while(play)
    	{
    	while(newGame)
    	{
    		r1 = new roll();
    	
    		playGame = JOptionPane.showInputDialog("Do you want to Play? Press 1 for YES, Press 2 for NO");
    		playGame2 = Integer.parseInt(playGame);
    		if (playGame2 == 2)
    		{	
    			newGame = false;
    			break;
    		}
    		    		
    		bet = JOptionPane.showInputDialog("What is your bet? 1 for PASS, 2 for DONT PASS");
    		bet2 = Integer.parseInt(bet);
    		   		
    		BA = JOptionPane.showInputDialog("How much would you like to bet?");
    		BA2 = Integer.parseInt(BA);
    			
    			if(BA2>bank)
    			{
    				while (BA2>1000)
    				{
    					JOptionPane.showMessageDialog(null, "Bet amount is too high, please place lower bet");
    					BA = JOptionPane.showInputDialog("How much would you like to bet?");
    					BA2 = Integer.parseInt(BA);
    				}
    				
    			}   		    		
    		if(bet2==1)

    		{
    		
    			if((r1.getRoll()==7)||(r1.getRoll()==11))
    			{
    				bank = bank+BA2;
    				JOptionPane.showMessageDialog
    					(null, "You win! The dice amount were " + r1.getRoll());
    				JOptionPane.showMessageDialog
    					(null, "Your bank amount is now " +bank+"");    					
    			}
    			
    			if((r1.getRoll()==2)||(r1.getRoll()==12)||(r1.getRoll()==3))
    			{
    				bank = bank-BA2;
    				JOptionPane.showMessageDialog
    					(null, "You lose. The dice amount were " + r1.getRoll());
    				JOptionPane.showMessageDialog
    					(null, "Your bank is now " +bank+"");
    					  					
    				if(bank<=0)
    				{
    					JOptionPane.showMessageDialog
    					(null, "Game Over");
    					break;
    				}
    			}
    			else
    			{
    				if((r1.getRoll()==4)||(r1.getRoll()==5)||(r1.getRoll()==6)||(r1.getRoll()==8)||(r1.getRoll()==9)||(r1.getRoll()==10))
    				{
    					JOptionPane.showMessageDialog
    						(null, "The roll was not a 2, 3, 7, 11, or 12.\n The dice show " + r1.getRoll()+ ".\n We will roll again.");
    					contRolling = true;
    					r2 = new roll();
    					while(contRolling == true)
    					{
    						r2.reroll();
    						if(r1.getRoll()==r2.getRoll())
    						{
    							
    							bank = bank + BA2;
    							   							
    							JOptionPane.showMessageDialog
    								(null, "You win! The dice amount were " + r2.getRoll());
    							JOptionPane.showMessageDialog
    								(null, "Your bank is now " +bank+"");
    				   					
    							contRolling = false;
    						}
    						else if(r2.getRoll()==7)
    						{
    							bank = bank - BA2;
    							JOptionPane.showMessageDialog
    								(null, "You lose. The dice amount were " + r2.getRoll());
    							JOptionPane.showMessageDialog
    								(null, "Your bank is now " +bank+"");
    							if(bank<=0)
    							{	
    								JOptionPane.showMessageDialog
    									(null, "Game Over!");
    								newGame = false;
    							}
    							contRolling = false;
    						}
    					}
    				}
    				
    			}    			
    		}
    		if (bet2==2)
			{
    			if((r1.getRoll()==7)||(r1.getRoll()==11))
    			{
    				bank = bank-BA2;
    				
    				JOptionPane.showMessageDialog
    					(null, "You lose. The dice amount were " + r1.getRoll());
    				JOptionPane.showMessageDialog
    					(null, "Your bank is now " +bank+"");
    					
    				if(bank<=0)
    				{
    					JOptionPane.showMessageDialog
    						(null, "Game Over!");
    					newGame = false;
    				}
    			}
    			
    			if((r1.getRoll()==2)||(r1.getRoll()==12)||(r1.getRoll()==3))
    			{
    				bank = bank+BA2;
    				JOptionPane.showMessageDialog
    					(null, "You win! The dice amount were " + r1.getRoll());
    				JOptionPane.showMessageDialog
    					(null, "Your bank is now " +bank+"");
    			}
    			else
    			{
    				if((r1.getRoll()==4)||(r1.getRoll()==5)||(r1.getRoll()==6)||(r1.getRoll()==8)||(r1.getRoll()==9)||(r1.getRoll()==10))
    				{
    					JOptionPane.showMessageDialog
    					(null, "The roll was not a 2, 3, 7, 11, or 12.\n The dice show " + r1.getRoll()+ ".\n We will roll again.");
    					contRolling = true;
    					r3 = new roll();
    					while(contRolling == true)
    					{
    						r3.reroll();
    						if(r1.getRoll()==r3.getRoll())
    						{
    							
    							bank = bank - BA2;
    							  							
    							JOptionPane.showMessageDialog
    								(null, "You lose. The dice amount were " + r3.getRoll());
    							JOptionPane.showMessageDialog
    								(null, "Your bank is now " +bank+"");
								
    							contRolling = false;
    						}
    						else if(r3.getRoll()==7)
    						{
    							bank = bank + BA2;
    							JOptionPane.showMessageDialog
    								(null, "You win! The dice amount were " + r3.getRoll());
    							JOptionPane.showMessageDialog
    								(null, "Your bank is now " +bank+"");
    							if(bank<=0)
    							{	
    								JOptionPane.showMessageDialog
    									(null, "Game Over!");
    								newGame = false;
    							}
    							contRolling = false;
    						}
    					}
    				}
    			}   			
    		}   		
    	}
    	play=false;
    	} 
    }   
    public static class roll
    {
    
    	int dice1=1 + (int)(Math.random()*6);
    	int dice2=1 + (int)(Math.random()*6);
    	
    	public int getRoll()
    	{
    		return (dice1+dice2);
    	}
    	
    	public int getD1()
    	{
    		return (dice1);
    	}
    	
    	public int getD2()
    	{
    		return (dice2);
    	}
    	
    	public void reroll()
    	{
    		dice1=1 + (int)(Math.random()*6);
    	    dice2=1 + (int)(Math.random()*6);	
    	}
    }  
}