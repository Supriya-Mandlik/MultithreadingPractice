package ThreadNameDemoAndMethods;

public class ThreadNameDemo extends Thread {
	
	public void run() {
		
		Thread.currentThread().setName("Vishal");  // setting thread name
		
		System.out.println("Thread Task Executed by : " +Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) {  // Main is a thread created by JVM
		
		System.out.println("Hello");
		
	//  System.out.println(10/0);   // Exception in thread "Main"
		
	   System.out.println("Thread Name Executed by : "+Thread.currentThread().getName());  // get thread Name
		
	   Thread.currentThread().setName("Deepak");  // change/set Thread Name
		
	   System.out.println("New Thread Name Executed by : "+Thread.currentThread().getName());
		
     //  System.out.println(10/0);   // Exception in thread "Deepak"
	   
	   ThreadNameDemo t = new ThreadNameDemo();
	   t.start();
	   
	   // bydefault thread names starts with Thread-0
	   
	
	}

}      
