import java.util.Scanner;

/*

Program: Mathtutor.java          Last Date of this Revision: March 4 2022

Purpose: Randomly generate 2 numbers as well as the operator and ask the user to 
figure out the mathematical equation answer.

Author: Matthew Pierson, 
School: CHHS
Course: Computer Programming 20
 

*/
public class Mathtutor 
{

	public static void main(String[] args) 
	{
	
		Scanner input =new Scanner(System.in);
		
		int num1, num2, op1, op2, op3, op4, opr, ans;
		
		num1 = (int) (10*Math.random()+1);
		num2 = (int) (10*Math.random()+1);
		opr = (int)  (4*Math.random()+1);
		op1 = num1+num2;
		op2 = num1-num2;
		op3 = num1*num2;
		op4 = num1/num2;
		
		if(opr==1) 
		{
			System.out.print(+num1);
			System.out.print("+"+num2);
			System.out.print("= ");
			ans = input.nextInt();
				if (ans==op1) 
				{
					System.out.println("You are Correct!");
				}
				else 
				{
					System.out.println("You are Incorrect!");
				}
			
		} 
		else if (opr==2)
		{
			System.out.print(+num1);
			System.out.print("-"+num2);
			System.out.print("= ");
			ans = input.nextInt();
				if (ans==op2) 
				{
					System.out.println("You are Correct!");
				}
				else 
				{
					System.out.println("You are Incorrect!");
				}
		}
		else if(opr==3) 
		{
			System.out.print(+num1);
			System.out.print("*"+num2);
			System.out.print("= ");
			ans = input.nextInt();
				if (ans==op3) 
				{
					System.out.println("You are Correct!");
				}
				else 
				{
					System.out.println("You are Incorrect!");
				}
		}else 
		{
			System.out.print(+num1);
			System.out.print("/"+num2);
			System.out.print("= ");
			ans = input.nextInt();
				if (ans==op4) 
				{
					System.out.println("You are Correct!");
				}
				else 
				{
					System.out.println("You are Incorrect!");
				}
		}
		
		

	}

}

/* Screen Dump

2+7= 9
You are Correct!

3*1= 27
You are Incorrect!

*/