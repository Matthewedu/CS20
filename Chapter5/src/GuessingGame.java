import java.util.Scanner;

/*

Program: GuessingGame.java          Last Date of this Revision: March 15 2022

Purpose: Ask the user to guess a number between 1 and 20, they input a number til its correct.

Author: Matthew Pierson, 
School: CHHS
Course: Computer Programming 20
 

*/
public class GuessingGame 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int rdm = (int) (Math.random()*(20-1)) + 1;
		
		System.out.println("Enter a number between 1 and 20: ");
		int num =input.nextInt();

		while (rdm != num && rdm!= num1) {
			System.out.print("You are Incorrect");
			
			System.out.println("Enter a number between 1 and 20: ");
			int num1 =input.nextInt();
			
			
			
		}
		
		System.out.println("You are correct!");
	}

}
