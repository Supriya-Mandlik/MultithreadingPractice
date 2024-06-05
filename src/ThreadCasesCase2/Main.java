package ThreadCasesCase2;

class Test2 extends Thread
{
	@Override
	public void run() {
		System.out.println("Task 1");
	}
}

public class Main {
	
	public static void main(String[] args) 
	{
		Test2 thread1 = new Test2();
		thread1.start();
		
		Test2 thread2 = new Test2();
		thread2.start();
		
		Test2 thread3 = new Test2();
		thread3.start();
		
		Test2 thread4 = new Test2();
		thread4.start();
	}

}
