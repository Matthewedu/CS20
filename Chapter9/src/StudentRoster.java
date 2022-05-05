import java.util.Scanner;

/*

Program: StudentRoster.java          Last Date of this Revision: April 27 2022

Purpose: Create an application that prompts the user for the number of students in their class and then prompts
the user for the names of the students name and stores it in an array. After all the information is put in, 
the output is the list of students in the array.

Author: Matthew Pierson
School: CHHS
Course: Computer Programming 20
 

*/
public class StudentRoster {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many students are in your class?");
		int s = input.nextInt();
		input.nextLine();
		final int NUM=s;
		String[] students= new String[NUM];
	
		//Stores Names
		for(int i=0; i<NUM; i++) 
		{
			System.out.println("Student Name: ");
			
			students[i]= input.nextLine();
		}
		
		//Display Names
		
		System.out.println("");
		System.out.println("Student Roster: ");
		for(int i=0; i<NUM; i++)
		{
			System.out.println(students[i]);
		}

	}

}
/* Screen Dump

How many students are in your class?
5
Student Name: 
bob smith
Student Name: 
joey carl
Student Name: 
carter joel
Student Name: 
henry bay
Student Name: 
alex nice

Student Roster:
bob smith
joey carl
carter joel
henry bay
alex nice

*/
