package MultiThreadingDemo;

// How to create Thread using Runnable Interface

public class Demo implements Runnable  //1
{

	@Override
	public void run()     //2
	{
		System.out.println("Thread Task 2 ...");
	}
	
	public static void main(String[] args)
	{
		Demo d = new Demo();      //3
		Thread th = new Thread(d);   //4
		th.start();      //5
	}

}
