import java.util.Scanner;

/*
Program: Change.java          Last Date of this Revision: February 15 2022

Purpose: Create an application that prompts the user to input an amount less than $1.00 and the output will be how many quarters, dimes, nickels, 
and pennies make up that amount

Author: Matthew Pierson, 
School: CHHS
Course: Computer Programming 20
 

*/
public class Change 
{

	public static void main(String[] args) 
	{
		
		int a; //user amount
		int q; //quarters
		int d; //dimes
		int n; //nickels
		int p; //pennies
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter a Dollar Amount In Cents:");
		a = input.nextInt();
		
		q = a/25;
		int result = a-(25*q);
		
		d = result/10;
		int result1 = result-(10*d);
		
		n = result1/5;
		int result2 = result1-(5*n);
		
		p = result2;
		
		
		System.out.println("Minimum Number of Coins:");
		System.out.println("Quarters: "+q);
		System.out.println("Dimes: "+d);
		System.out.println("Nickels: "+n);
		System.out.println("Pennies: "+p);
		
		
		

	}

}

/* Screen Dump

Enter a Dollar Amount In Cents:
121
Minimum Number of Coins:
Quarters: 4
Dimes: 2
Nickels: 0
Pennies: 1

Enter a Dollar Amount In Cents:
167
Minimum Number of Coins:
Quarters: 6
Dimes: 1
Nickels: 1
Pennies: 2
 
*/