package ThreadCasesCase2;

// Performing single task from multiple threads

public class Test extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Task 1");
	}
	
	public static void main(String[] args)
	{
		Test thread1 = new Test();
		thread1.start();
		
		Test thread2 = new Test();
		thread2.start();
		
		Test thread3 = new Test();
		thread3.start();
		
	}

}
