import java.util.Scanner;
/*

Program: DigitSum.java          Last Date of this Revision: March 15 2022

Purpose: Create a DigitsSum application that prompts the user for a non-negative integer and then displays the sum of the digits.

Author: Matthew Pierson, 
School: CHHS
Course: Computer Programming 20
 

*/
public class DigitSum 
{
	

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int Input;
		Input = input.nextInt();
		int Sum = 0;
		int Digit = 0;
		
		while (Input > 0) 
		{
			
		Digit = Input % 10;
		Sum = Sum + Digit;
		Input = Input / 10;
	
		
	}
		System.out.println("Sum of Digits: "+Sum);  
}
}
/* Screen Dump

Enter a positive integer: 322
Sum of Digits: 7

Enter a positive integer: 3127
Sum of Digits: 13


*/