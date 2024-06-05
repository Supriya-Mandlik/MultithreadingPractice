package MultiThreadingDemo;

// How to create thread by using Thread Class

public class Test extends Thread    //1
{
	
	public void run()         //2
	{
		System.out.println("Thread Task...");
	}
	
	public static void main(String[] args)
	{
		Test t = new Test();   //3     Thread creation
		t.start();   // our thread is created and invoked     //4
		//t.run();    // simple method call by creating object
		//t.start();   // run time exception . once thread goes in dead state we can not alive it.
	}

}
