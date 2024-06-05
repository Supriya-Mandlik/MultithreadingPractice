package ThreadCasesCase1;

//  performing single task from single thread

class Demo extends Thread
{
	
	public void run() 
	{
		System.out.println("Task 1");
	}
	
}

public class Main {
	
	public static void main(String[] args) 
	{
		
		Demo thread1 = new Demo();
		thread1.start();
		
	}

}
