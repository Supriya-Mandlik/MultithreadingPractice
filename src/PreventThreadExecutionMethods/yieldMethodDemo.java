package PreventThreadExecutionMethods;

public class yieldMethodDemo extends Thread
{
	@Override
	public void run() {
		
		//Thread.yield();  // if you want to stop this current thread i.e. thread-0
		
		for(int i=1 ; i<=5 ; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
	
	public static void main(String[] args) {
		
		yieldMethodDemo thread = new yieldMethodDemo();
		thread.start();
		
Thread.yield();  // if you want to stop main thread and provide chance to other threads for execution
		/* output may be different everytime because output depends on thread schedular 
		 * whether it accepts or ignore the hint */
		
		for(int i=1 ; i<=5 ; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
		
	}

}
