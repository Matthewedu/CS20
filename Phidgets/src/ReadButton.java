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
		
		int score=0;
		//Use
		 while(true){
	            
	            Thread.sleep(50);
			 if(redButton.getState()){
				 System.out.println("Button State: " + redButton.getState());
				 score++;
				 System.out.println(score);
			 } 
	        }
			
		

	}

}
