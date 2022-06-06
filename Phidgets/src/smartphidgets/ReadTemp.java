/*

Program: ReadTemp.java          Last Date of this Revision: May 26 2022

Purpose: Write a program that gets data from the temperature sensor.

Author: Matthew Pierson
School: CHHS
Course: Computer Programming 20
 

*/
package smartphidgets;
import com.phidget22.*;

public class ReadTemp {

	public static void main(String[] args) throws Exception{
		
		//Create
		TemperatureSensor temperatureSensor = new TemperatureSensor();

		//Open
		temperatureSensor.open(1000);
		
		//Use
		 while (true) {
	            System.out.println("Temperature (°C): " + temperatureSensor.getTemperature() + " °C" );
	            double temp = temperatureSensor.getTemperature();
	            temp= (temp*1.8)+32;
	            double round = Math.round(temp*100)/100;
	            
	            System.out.println("Temperature (°F): " + round + " °F" );
	            Thread.sleep(1000);
	        }
	}

}
