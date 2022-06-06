/*

Program: ButtonandLED.java          Last Date of this Revision: May 24 2022

Purpose: Make the red (and green) LED turn on when pressed by its coresponding buttons.

Author: Matthew Pierson
School: CHHS
Course: Computer Programming 20
 

*/
import com.phidget22.*;

public class ButtonandLED {

	public static void main(String[] args) throws Exception{
		//Create
		 DigitalInput redButton = new DigitalInput();
	     DigitalOutput redLED = new DigitalOutput();
	     DigitalInput greenButton = new DigitalInput();
	     DigitalOutput greenLED = new DigitalOutput();
	     
	     //Address
	     redButton.setHubPort(0);
	     redButton.setIsHubPortDevice(true);
	     redLED.setHubPort(1);
	     redLED.setIsHubPortDevice(true);
	     greenButton.setHubPort(5);
	     greenButton.setIsHubPortDevice(true);
	     greenLED.setHubPort(4);
	     greenLED.setIsHubPortDevice(true);
	     
	     //Open
	     redButton.open(1000);
	     redLED.open(1000);
	     greenButton.open(1000);
	     greenLED.open(1000);
	     
	     //Use
	     while(true){

	            if( redButton.getState()){
	                redLED.setState(true);
	            } else {
	                redLED.setState(false);
	            }

	            if(greenButton.getState()){
	                greenLED.setState(true);
	            } else {
	                greenLED.setState(false);
	            }

	            Thread.sleep(150);
	        }
	     

	}

}
