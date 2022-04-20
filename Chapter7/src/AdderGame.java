import java.util.Scanner;

/*

Program: AdderGame.java          Last Date of this Revision: April 19 2022

Purpose: Create an application where the user guesses the answer to an additon problem, 
awarding points for guessing it in the least amount of tries and minusing points if incorrect.
To end, type 99 to end the game ad find total score.

Author: Matthew Pierson, 
School: CHHS
Course: Computer Programming 20
 

*/
public class AdderGame {
	
	 static int score=0;
	
	public static void Scoring() {
		
		score++;
		System.out.println(" Score: "+score);
	}
	 
	
	
    public static void main (String [] args){
    
    	int m=0; 
    
  	Scanner input = new Scanner(System.in);
  	
  	
    while(m==0) {
    	
    	int a1= (int) (Math.random()*(20-1)) + 1;
        int a2= (int) (Math.random()*(20-1)) + 1;
    	int t=a1+a2;
    	
    	System.out.print(a1 +"+"+a2);
    	System.out.print("=");
    	int num =input.nextInt();
    
    	if(num==t) {
    System.out.println("You are Correct!");
    Scoring();
    
    	}else if(num==99) {
    m=1;
    	
    	}else {
    System.out.println("You are Incorrect!");
    	}
    
    	
    }
    System.out.println("Thanks For Playing! Total Score: ");
   }
}