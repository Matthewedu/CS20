package smartphidgets;
import com.phidget22.*;
public class HotorCold {

	public static void main(String[] args) throws Exception 
	{
	
		//Create
		TemperatureSensor temperatureSensor = new TemperatureSensor();
		DigitalOutput redLED = new DigitalOutput();
		DigitalOutput greenLED = new DigitalOutput();
		
		//Address
		redLED.setHubPort(1);
	    redLED.setIsHubPortDevice(true);
	    greenLED.setHubPort(4);
	    greenLED.setIsHubPortDevice(true);
	    
	    //Open
	    redLED.open(1000);
	    temperatureSensor.open(1000);
	    greenLED.open(1000);
	    
	    
	    
	    //Use
	    while (true) 
	    {
	    	Thread.sleep(1000);
	    	double temp = temperatureSensor.getTemperature();
	    	
	    	if(20<temp && temp<24) 
	    	{
	    		greenLED.setState(true);
	    		redLED.setState(false);
	    		System.out.println(temp+ " °C");
	    	}else 
	    	{
	    		greenLED.setState(false);
	    		redLED.setState(true);
	    		System.out.println(temp+ " °C");
	    	}
	    	
	    }
	    	
	    	
	}

}
