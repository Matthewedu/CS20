/*

Program: ReadTempHum.java          Last Date of this Revision: May 26 2022

Purpose: Write a program that gets temperature and humdidity data.

Author: Matthew Pierson
School: CHHS
Course: Computer Programming 20
 

*/
package smartphidgets;
import com.phidget22.*;
public class ReadTempHum {

	public static void main(String[] args)throws Exception 
	{
		
		//Create
		HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();
	
        //Open
        humiditySensor.open(1000);
        temperatureSensor.open(1000);
        
         
        
        //Use
        while(true)
        {
            //System.out.println("Humidity: " + humiditySensor.getHumidity() +" %RH, Temperature: " + temperatureSensor.getTemperature() + " °C" );
            Thread.sleep(1000);
            double humid = humiditySensor.getHumidity();
            double temp = temperatureSensor.getTemperature();
            //humid levels
            if(humid<30) 
            {
            	System.out.println("Humidity is Too Low");
            }else 
            {
            	System.out.println(humid);
            }
            //temp
            if(temp<21) 
            {
            	System.out.println("Temperature Is Too Cold");
            }else 
            {
            	System.out.println(temp + " °C");
            }
           
        }
	}

}
