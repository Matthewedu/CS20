import java.util.Scanner;

/*

Program: Grade.java          Last Date of this Revision: March 1 2022

Purpose: Create a grade application that prompts the user for the percentage earned on a test or other graded work
and then display the corresponding letter grade.

Author: Matthew Pierson, 
School: CHHS
Course: Computer Programming 20
 

*/
public class Grade 
{

	public static void main(String[] args) 
	{
	
		Scanner input =new Scanner(System.in);
		
		System.out.print("Enter the percentage: ");	
		int p = input.nextInt();
		
		if (0<=p && p<60) 
		{
		System.out.println("The corresponding grade: F");
		}
		else if (60 <= p && p <= 69) 
		{
		System.out.println("The corresponding grade: D");	
		}
		else if (70 <= p && p <= 79) 
		{
		System.out.println("The corresponding grade: C");	
		}
		else if (80 <= p && p <= 89) 
		{
		System.out.println("The corresponding grade: B");	
		}
		else if (90 <= p && p <= 94) 
		{
		System.out.println("The corresponding grade: A");	
		} else if (95 <= p && p <= 100) 
		{
		System.out.println("The corresponding grade: A+");
		}
		else 
		{
			System.out.println("Invalid grade inputted");
		}
	

	}

}

/* Screen Dump

Enter the percentage: 67
The corresponding grade: D

Enter the percentage: 100
The corresponding grade: A+

Enter the percentage: 25
The corresponding grade: F
*/