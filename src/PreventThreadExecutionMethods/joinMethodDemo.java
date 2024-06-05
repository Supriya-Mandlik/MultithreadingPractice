package PreventThreadExecutionMethods;

public class joinMethodDemo extends Thread
{
	@Override
	public void run() {
		try {
			
			for(int i=1 ; i<=5 ; i++) {
				System.out.println("Child Thread : "+i);
				Thread.sleep(1000);
			}
			
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		
		joinMethodDemo thread = new joinMethodDemo();
		thread.start();
		
		thread.join();  
		/* here main thread will wait to complete task of child thread .when child thread complete
		 * its task then main thread join it and complete its task 
		 */
		
      try {
			
			for(int i=1 ; i<=5 ; i++) {
				System.out.println("Main Thread : "+i);
				Thread.sleep(1000);
			}
			
		} catch (Exception e) {
		e.printStackTrace();
		}
			
	}

}
