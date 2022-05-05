package Adder;

public class Score 

{
	int score = 0;
	
	public void Scores() 
	{
		score=score+3;
		System.out.println("Points: "+score);
	}
	
	public void Scoreminus() 
	{
		 score--;
		 System.out.println("Points: "+score);
	}
	
	public void Total() 
	{
		System.out.println("Thanks For Playing! Total Points: "+score);
	}
}
	
	

