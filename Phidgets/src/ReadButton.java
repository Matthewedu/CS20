import com.phidget22.*;

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
		
		//Use
		 while(true){
	            //System.out.println("Button State: " + redButton.getState());
	            Thread.sleep(250);
			 if( redButton.getState()){
				 System.out.println("Button State: " + redButton.getState());
			 } 
	        }
			
		

	}

}
