package ThreadPrioritiesDemo;

public class Test extends Thread
{
	
	@Override
	public void run() {
		System.out.println("Child Thread");
		System.out.println("Child Thread Priority : "+Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main Thread old Priority : "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("Main Thread new Priority : "+Thread.currentThread().getPriority());
		
		Test t = new Test();
		//t.setPriority(3);  // we can set priority 
		t.start();
		
	}

}
