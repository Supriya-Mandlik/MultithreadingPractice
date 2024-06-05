package PreventThreadExecutionMethods;

public class SleepDemo2 extends Thread 
{
	@Override
	public void run() {
		
		try {
			
			for(int i=1 ; i<=5 ; i++) {
				System.out.println(i+" : "+Thread.currentThread().getName());
				Thread.sleep(1000);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		SleepDemo2 sd1 = new SleepDemo2();
		sd1.start();
		//sd1.run();
		
		SleepDemo2 sd2 = new SleepDemo2();
		sd2.start();
		//sd2.run();
		
		/* if here we use run() method inplace of start() method then run() method will not act as 
		thread , it will act as a simple method */
		// multiple threads executes at same time
		
	}
	
}
