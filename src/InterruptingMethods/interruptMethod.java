package InterruptingMethods;

public class interruptMethod extends Thread
{
	@Override
   public void run() {
		
		System.out.println(Thread.currentThread().isInterrupted());  //isInterrupted()  //true
		
		try {
			
			for(int i=1 ; i<=5 ;i++) {
				System.out.println(i);
				Thread.sleep(1000);        // sleep()
			}
			
		} catch (Exception e) {
			System.out.println("Thread Interrupted");
		e.printStackTrace();
		}
	
   }
	
	public static void main(String[] args) {
		
		interruptMethod thread = new interruptMethod();
		thread.start();
		thread.interrupt();    // interrupt()
		
	}

}
