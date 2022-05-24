/*

Program: BlinkLED.java          Last Date of this Revision: May 24 2022

Purpose: Make the red(and green) LED blink.

Author: Matthew Pierson
School: CHHS
Course: Computer Programming 20
 

*/

//Add Phidgets Library
import com.phidget22.*;

public class BlinkLED {
    //Handle Exceptions | 
    public static void main(String[] args) throws Exception{

        //Create 
        DigitalOutput redLED = new DigitalOutput();

        //Address (4 is for green LED)
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        //Open 
        redLED.open(1000);

        //Use your Phidgets 
        while(true){
        	redLED.setState(true);
            Thread.sleep(1000);
            redLED.setState(false);
            Thread.sleep(1000);
        }
    }
}
  