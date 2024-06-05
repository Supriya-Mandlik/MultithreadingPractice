package DaemonThreadDemo;

public class Test extends Thread
{
	public void run() 
	{
		
        System.out.println(Thread.currentThread().isDaemon());// checking if current thread is daemon thread or not  
		System.out.println("Daemon Thread");
		
	/*	if (Thread.currentThread().isDaemon()) {
			
			System.out.println("Daemon Thread");
			
		} else {
			
			System.out.println("Child Thread");

		} */
		
	}
	
	public static void main(String[] args)
	{
		
		System.out.println("Main Thread");
		
		Test t = new Test();
		t.setDaemon(true);      // creating Daemon Thread
		t.start();
		
	}

}
