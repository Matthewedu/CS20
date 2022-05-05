import java.util.Scanner;
/*

Program: Squares.java          Last Date of this Revision: April 27 2022

Purpose: Ask the user for a size of an array and put the
square of the index into the element(ex. 3rd element has
an index of 2 stores the number 4).

Author: Matthew Pierson
School: CHHS
Course: Computer Programming 20
 

*/
public class Squares {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How big of an array do you want?");
		int array = input.nextInt();
		input.nextLine();
		final int NUM=array;
		int[] numbers= new int [array];
		//Stores Squares
			for(int i=0; i<NUM;i++) 
				{
					numbers[i]= i*i;
				}
		//Display Squares
		System.out.println("Squares: ");
			for(int i=0;i<NUM;i++) 
				{
					System.out.println(numbers[i]);
				}
		
	}

}
/* Screen Dump

How big of an array do you want?
5
Squares: 
0
1
4
9
16

*/