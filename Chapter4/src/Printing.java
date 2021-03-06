import java.util.Scanner;

/*

Program: Printing.java          Last Date of this Revision: March 1 2022

Purpose: Create an application that prompts the user for the number of copies to print and then displays the 
price per copy and the total price for the job.

Author: Matthew Pierson
School: CHHS
Course: Computer Programming 20
 

*/
public class Printing 
{

	public static void main(String[] args) 
	{
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of copies to be printed: ");
		double copy= input.nextDouble();
		
		if (0<= copy && copy <= 99) 
		{

			System.out.println("Price per copy: $0.30");
			double price = copy*0.30;
			 double price1 = Math.round(price * 100.0) / 100.0;
			System.out.println("Total cost is: $"+ price1);
			
		}
		else if(100<=copy && copy<=499)
		{
			
			System.out.println("Price per copy: $0.28");
			double price = copy*0.28;
			double price1 = Math.round(price * 100.0) / 100.0;
			System.out.println("Total cost is: $"+ price1);
			
		}
		else if(500<=copy && copy<=749)
		{
			
			System.out.println("Price per copy: $0.27");
			double price = copy*0.27;
			double price1 = Math.round(price * 100.0) / 100.0;
			System.out.println("Total cost is: $"+ price1);
			
		}
		else if(750<=copy && copy<=1000)
		{
			
			System.out.println("Price per copy: $0.26");
			double price = copy*0.26;
			double price1 = Math.round(price * 100.0) / 100.0;
			System.out.println("Total cost is: $"+ price1);
			
		}
		else 
		{
				
			System.out.println("Price per copy: $0.25");
			double price = copy*0.25;
			double price1 = Math.round(price * 100.0) / 100.0;
			System.out.println("Total cost is: $"+ price1);
				
		}

	}

}

/* Screen Dump

Enter the number of copies to be printed: 750
Price per copy: $0.26
Total cost is: $195.0

Enter the number of copies to be printed: 51
Price per copy: $0.30
Total cost is: $15.3

*/