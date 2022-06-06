/*

Program: Themostat.java          Last Date of this Revision: May 31 2022

Purpose: Create a program that acts like a thermostat where you input a temperature
then turn on an LED whether its in a range of temperature.

Author: Matthew Pierson
School: CHHS
Course: Computer Programming 20
 

*/
package smartphidgets;
import java.util.Scanner;

import com.phidget22.*;


public class Themostat {

	
	public static void main(String[] args) throws Exception 
	{
		Scanner input = new Scanner(System.in);
		
		//Create
		TemperatureSensor temperatureSensor = new TemperatureSensor();
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
	    temperatureSensor.open(1000);
	    
	    //Use
	    System.out.println("Pick a temperature for your home (21°C+)");
	    double tempinput = input.nextDouble();
	    
	    double printTemp = 10;
	    
	    double temp = temperatureSensor.getTemperature();
	    
	    while (true) 
	    {
	    	
	    	Thread.sleep(200);
	    	
	    	if(greenButton.getState()) 
	    	{
	    		//System.out.println("green");
	    		tempinput++;
	    	}else if (redButton.getState()) 
	    	{
	    		//System.out.println("red");
	    		tempinput--;
	    	}
	    	
	    	
	    	if(tempinput-2 <temp && temp<tempinput+2) 
	    	{
	    		greenLED.setState(true);
	    		redLED.setState(false);
	    	}else 
	    	{
	    		greenLED.setState(false);
	    		redLED.setState(true);
	    	}
	    	
	    	//Display
	    	if(printTemp >= 10)
	    	{
	    		System.out.print("Set Temperature: "+ tempinput + "°C ");
		    	System.out.println("Actual Temperature: " + temp +"°C");
		    	printTemp = 0;
	    	}
	    	
	    	printTemp = printTemp + 0.2;
	    	
	    }

	}

}
