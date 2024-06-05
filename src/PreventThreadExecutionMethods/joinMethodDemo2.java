package PreventThreadExecutionMethods;

public class joinMethodDemo2 extends Thread
{
	static Thread mainThreadReference;  // reference for main method/thread
	
	@Override
	public void run() {

      try {
    	  
    	  mainThreadReference.join(); // join() method throws InterruptedException
    	  /* here child thread will wait to complete task of main thread .when main thread complete
  		 * its task then child thread join it and complete its task 
  		 */ 
			
			for(int i=1 ; i<=5 ; i++) {
				System.out.println("Child Thread : "+i);
				Thread.sleep(1000);
			}
			
		} catch (Exception e) {
		e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		
		 mainThreadReference = Thread.currentThread();
		
		joinMethodDemo2 thread = new joinMethodDemo2();
		thread.start();
		
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
