import java.util.Scanner;

/*

Program: GuessingGame.java          Last Date of this Revision: March 16 2022

Purpose:Ask the user to guess a number between 1 and 20, they input a number until its correct.

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
		int m=0;
		
		while (m==0) 
		{
		
			System.out.print("Enter a number between 1 and 20: ");
			int num =input.nextInt();
		
				if (rdm!=num) 
				{
					System.out.println("Try again");
				}
				else 
				{
					
					System.out.println("You Are Correct!");
					m=1;
				}
				
			
		}

		System.out.println("Thanks For Playing!");
		
	}

}
/* Screen Dump

Enter a number between 1 and 20: 1
Try again
Enter a number between 1 and 20: 2
Try again
Enter a number between 1 and 20: 3
Try again
Enter a number between 1 and 20: 4
Try again
Enter a number between 1 and 20: 5
Try again
Enter a number between 1 and 20: 6
Try again
Enter a number between 1 and 20: 7
Try again
Enter a number between 1 and 20: 8
Try again
Enter a number between 1 and 20: 9
Try again
Enter a number between 1 and 20: 10
Try again
Enter a number between 1 and 20: 11
You Are Correct!
Thanks For Playing!

*/