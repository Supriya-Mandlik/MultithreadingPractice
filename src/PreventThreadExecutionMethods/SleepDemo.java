package PreventThreadExecutionMethods;

public class SleepDemo {
	
	public static void main(String[] args) throws Exception{
		
		for(int i=1 ; i<=5 ; i++) {
			
				Thread.sleep(1000);
				System.out.println(i);
				
			
			// throws is used because sleep method throws compile time exception
			
		}
		
	}

}
