/*

Program: Closing.java          Last Date of this Revision: June 6 2022

Purpose: Learn how to close a phidget.

Author: Matthew Pierson
School: CHHS
Course: Computer Programming 20
 

*/
package Advanced;
import com.phidget22.*;

public class Closing {

	public static void main(String[] args) throws Exception{
		//Create
		TemperatureSensor temperatureSensor = new TemperatureSensor();
		
		//Open
		temperatureSensor.open(1000);
		
		//Use
		System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
		
		//Close
		temperatureSensor.close();

	}

}
