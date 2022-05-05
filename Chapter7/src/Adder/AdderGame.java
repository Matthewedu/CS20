

/*

Program: AdderGame.java          Last Date of this Revision: April 25 2022

Purpose: Create an application where the user guesses the answer to an additon problem, 
awarding points for guessing it in the least amount of tries and minusing points if incorrect.
To end, type 999 to end the game and find total score. 

Author: Matthew Pierson
School: CHHS
Course: Computer Programming 20
 

*/

package Adder;
import java.util.Scanner;

public class AdderGame extends Score {  

    public static void main (String [] args) 
    {

    	int m=0; 
    
AdderGame link= new AdderGame();
    
  	Scanner input = new Scanner(System.in);
  	
  	System.out.println("Welcome to the Adder Game! You must add the 2 random integers to be awarded 3 points.");
  	System.out.println("If you get it wrong, you will lose one point! Enter 999 to quit playing!");
    while(m==0) {
    	
    	int a1= (int) (Math.random()*(20-1)) + 1;
        int a2= (int) (Math.random()*(20-1)) + 1;
    	int t=a1+a2;
    	
    	
    	System.out.print(a1 +"+"+a2);
    	System.out.print("=");
    	int num =input.nextInt();
    
    	if(num==t) {
    System.out.println("You are Correct!");
    link.Scores();
    
    	}else if(num==999) {
    m=1;
    	
    	}else {
    System.out.println("You are Incorrect! The correct answer is: "+ t);
    link.Scoreminus();
    	}
  
    }
    link.Total();
   }
}
/* Screen Dump

Welcome to the Adder Game! You must add the 2 random integers to be awarded 3 points.
If you get it wrong, you will lose one point! Enter 999 to quit playing!
18+1=19
You are Correct!
Points: 3
12+12=24
You are Correct!
Points: 6
3+8=9
You are Incorrect! The correct answer is: 11
Points: 5
8+13=999
Thanks For Playing! Total Points: 5


*/

