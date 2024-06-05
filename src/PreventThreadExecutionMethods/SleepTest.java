package PreventThreadExecutionMethods;

public class SleepTest extends Thread
{
	@Override
	public void run() 
	{
		for(int i=1 ; i<=10 ; i++) {
			
			try {      // try catch block is used because sleep method throws compile time exception
				
				Thread.sleep(1000);
				System.out.println(i);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	
	}
	
	public static void main(String[] args) 
	{
		SleepTest st = new SleepTest();
		st.start();
			
	}

}
