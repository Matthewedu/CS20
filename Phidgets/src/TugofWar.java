import com.phidget22.*;
public class TugofWar {

	public static void main(String[] args) throws Exception {
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
	     
	     int scorered=0;
	     int scoregreen=0;
	     int i=0;
	     //Use
	     while(i==0)
	     {
	    	 Thread.sleep(185);
			 if(redButton.getState())
			 {
				 System.out.println("red");
				 scorered++;
			 }else if(greenButton.getState()) 
			 {
				System.out.println("green");
				scoregreen++; 
			 } 
			 
			 
			 if(scorered==10 && scoregreen<10) 
			 {
				 System.out.println("Red Wins");
				 redLED.setState(true);
				 greenLED.setState(true);
		         Thread.sleep(1000);
		         redLED.setState(false);
		         greenLED.setState(false);
		         Thread.sleep(1000);
		         
		         redLED.setState(true);
		         Thread.sleep(500);
		         redLED.setState(false);
		         Thread.sleep(500);
		         redLED.setState(true);
		         Thread.sleep(500);
		         redLED.setState(false);
		         Thread.sleep(500);
		         redLED.setState(true);
		         Thread.sleep(500);
		         redLED.setState(false);
		         Thread.sleep(500);
		         redLED.setState(true);
		         Thread.sleep(500);
		         redLED.setState(false);
		         Thread.sleep(500);
		         redLED.setState(true);
		         Thread.sleep(500);
		         redLED.setState(false);
		         Thread.sleep(500);
		         i=1;
				 
				 
			 }else if(scoregreen==10 && scorered<10) 
			 {
				 System.out.println("Green Wins");
				 redLED.setState(true);
				 greenLED.setState(true);
		         Thread.sleep(1000);
		         redLED.setState(false);
		         greenLED.setState(false);
		         Thread.sleep(1000);
		         
		         greenLED.setState(true);
		         Thread.sleep(500);
		         greenLED.setState(false);
		         Thread.sleep(500);
		         greenLED.setState(true);
		         Thread.sleep(500);
		         greenLED.setState(false);
		         Thread.sleep(500);
		         greenLED.setState(true);
		         Thread.sleep(500);
		         greenLED.setState(false);
		         Thread.sleep(500);
		         greenLED.setState(true);
		         Thread.sleep(500);
		         greenLED.setState(false);
		         Thread.sleep(500);
		         greenLED.setState(true);
		         Thread.sleep(500);
		         greenLED.setState(false);
		         Thread.sleep(500);
		         i=1;
		  
			 } 
	            
	     }
	}

}
