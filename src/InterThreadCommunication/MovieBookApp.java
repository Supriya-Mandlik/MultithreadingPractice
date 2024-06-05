package InterThreadCommunication;

class TotalEarnings extends Thread
{
	int total=0;
	
	@Override
	public void run() 
	{
		synchronized(this) 
		{
			for(int i=1 ; i<=10 ; i++)
			{
				total = total+100;
			}
			this.notify(); // it will notify other threads which are in paused or waiting state.
		}
	}
}

public class MovieBookApp 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		TotalEarnings te =new TotalEarnings();
		te.start();
		
	//	System.out.println("Total Earnings : "+te.total+" Rs");  // total earnings 0 rs
		
		synchronized(te)
		{
			te.wait();  // here main thread goes in waiting state and release lock for another thread.
			System.out.println("Total Earnings : "+te.total+" Rs");   // total earnings 1000 rs
			/* main thread gets notification and it acquire lock again and execute total earnings */
		}
		
	}

}
