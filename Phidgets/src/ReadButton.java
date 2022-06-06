/*

Program: ReadButton.java          Last Date of this Revision: May 24 2022

Purpose: Read if the red button is pressed.

Author: Matthew Pierson
School: CHHS
Course: Computer Programming 20
 

*/import com.phidget22.*;

public class ReadButton {

	public static void main(String[] args) throws Exception
	{
		//Create
		DigitalInput redButton = new DigitalInput();
		
		//Address
		redButton.setHubPort(0);
		redButton.setIsHubPortDevice(true);
		
		//Open
		redButton.open(1000);
		
		int score=0;
		//Use
		 while(true){
	            
	            Thread.sleep(180);
			 if(redButton.getState()){
				 System.out.println("Button State: " + redButton.getState());
				 score++;
				 System.out.println(score);
			 } 
	        }
			
		

	}

}
