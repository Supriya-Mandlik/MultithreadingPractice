package PreventThreadExecutionMethods;

class Medical extends Thread
{
	@Override
	public void run() {
		try {
			
			System.out.println("Medical Starts");
			Thread.sleep(3000);
			System.out.println("Medical Completed");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class TestDriver extends Thread
{
	@Override
	public void run() {
		try {
			
			System.out.println("Test Drive Starts");
			Thread.sleep(5000);
			System.out.println("Test Drive Completed");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class OfficerSign extends Thread
{
	@Override
	public void run() {
		try {
			System.out.println("Officer takes the file");
			Thread.sleep(3000);
			System.out.println("Officer Works Completed");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class joinLicenceDemo 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		Medical m = new Medical();
		m.start();
		
		m.join();
		
		TestDriver t = new TestDriver();
		t.start();
		
		t.join();
		
		OfficerSign o = new OfficerSign();
		o.start();
		
	}

}
