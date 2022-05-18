
public class Reverse {

	public static void main(String[] args) {
		
		final int num_elements = 11;
		int[] numbers = new int [num_elements];
		
		//store numbers
		for(int i=0; i<num_elements; i++) 
		{
			numbers[i]= i;
			
		}
		//display numbers 12345
		System.out.println("Countdown");
		
		for(int i=num_elements-1; i>=0; i--) 
		{
			System.out.println(numbers[i]);
		}
	}

}
