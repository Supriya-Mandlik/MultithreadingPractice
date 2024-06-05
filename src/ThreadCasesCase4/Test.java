package ThreadCasesCase4;

//performing multiple task from multiple threads

class MyThread1 extends Thread
{
	@Override
	public void run() {
		System.out.println("Task 1- Playing Video");
	}
}

class MyThread2 extends Thread
{
	@Override
	public void run() {
		System.out.println("Task 2 - Playing Audio");
	}
}

class MyThread3 extends Thread
{
	@Override
	public void run() {
		System.out.println("Task 3 - Progress Bar is Executing");
	}
	
}

class MyThread4 extends Thread
{
	@Override
	public void run() {
		System.out.println("Task 4 - Timer is Executing");
	}
}

public class Test 
{
	public static void main(String[] args) 
	{
		MyThread1 thread1 = new MyThread1();
		thread1.start();
		
		MyThread2 thread2 = new MyThread2();
		thread2.start();
		
		MyThread3 thread3 = new MyThread3();
		thread3.start();
		
		MyThread4 thread4 = new MyThread4();
		thread4.start();
		
	}

}
