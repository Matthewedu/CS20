import java.util.Scanner;

/*

Program: Digits.java          Last Date of this Revision: February 22 2022 

Purpose: Create an application to show the number in the places of a 3 digit number

Author: Matthew Pierson, 
School: CHHS
Course: Computer Programming 20
 

*/

public class Digits {

	public static void main(String[] args) 
	
	{
		
		int num; //user input
		int h; //hundreds place
		int t; //tens place
		int o; //ones place
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter a three-digit number:");
		num = input.nextInt();
		
		h = num/100;
		int result = num- (h*100);
		
		t = result/10;
		int result1 = result-(t*10);
		
		o = result1;
		
		System.out.println("Digit in Hundreds Place: " +h);
		System.out.println("Digit in Tens Place: " +t);
		System.out.println("Digit in Ones Place: " +o);
		
		

	}

}

/* Screen Dump

Enter a three-digit number:
305
Digit in Hundreds Place: 3
Digit in Tens Place: 0
Digit in Ones Place: 5

Enter a three-digit number:
634
Digit in Hundreds Place: 6
Digit in Tens Place: 3
Digit in Ones Place: 4

 
*/