package ThreadCasesCase1;

// performing single task from single thread

public class Test extends Thread
{
	public void run() 
	{
		System.out.println("Task 1");
	}
	
	public static void main(String[] args) 
	{
		Test thread1 = new Test();
		thread1.start();
	}
	
}
