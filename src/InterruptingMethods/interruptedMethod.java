package InterruptingMethods;

public class interruptedMethod extends Thread 
{
	@Override
	public void run() 
	{
		System.out.println(Thread.currentThread().isInterrupted());   // true -> true
  System.out.println("A : "+Thread.interrupted());  // true -> convert into false and execute thread perfectly.
		
		try
		{
			for(int i=1 ; i<=5 ; i++) 
			{
			   System.out.println(i);
			   Thread.sleep(1000);
			  // System.out.println("B : "+Thread.interrupted());   // false
			}
			
		} catch (Exception e) 
		{
			System.out.println("Thread interrupted");
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) 
	{
		interruptedMethod thread = new interruptedMethod();
		thread.start();
		thread.interrupt();
		
	}

}
