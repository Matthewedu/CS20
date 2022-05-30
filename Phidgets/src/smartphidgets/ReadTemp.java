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
	            System.out.println("Temperature (°F): " + temp + " °F" );
	            Thread.sleep(1000);
	        }
	}

}
