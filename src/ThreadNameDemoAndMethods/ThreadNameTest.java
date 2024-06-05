package ThreadNameDemoAndMethods;

public class ThreadNameTest extends Thread 
{
	public void run() 
	{
		System.out.println("Thread Task is Executed by : "+Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive()); 
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hello is Printed by : "+Thread.currentThread().getName());
		
		ThreadNameTest t = new ThreadNameTest();
		t.setName("deepak");     // setting name for thread here if we have multiple threads
		//System.out.println(t.getName());  // here also we can get the name of thread 
		t.start(); 
		
		ThreadNameTest t2 = new ThreadNameTest();
		t2.setName("kajal");
		t2.start();
		
System.out.println(Thread.currentThread().isAlive()); // to check whether the thread is alive or dead
		
	}

}
